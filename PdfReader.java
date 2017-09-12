 import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;


class Starter extends JFrame implements ActionListener{
 Rectangle rect;
 PDFPage page;
 Image img;
 int adjx=0;
 int adjy=0;
 JLabel lblimg;
 PDFFile pdf;
 File f;
 int pageNum=1;
 int numPages;
 JTextField txtPNum;
 JButton btnext;
 JButton btpre;
 JButton btin;
 JButton btout;
 JButton btcapture;
 JButton btprint;
 JPanel panel;
 
 
 public Starter(String title){
  
  Container cont=getContentPane(); //get container of the JFrame
  cont.setLayout(new BorderLayout()); //apply border layout to the container
  //Show File menu
  JMenuBar mainmenu=new JMenuBar();
  JMenu menu=new JMenu("File");
  JMenuItem mopen=new JMenuItem("Open...");
  mopen.setMnemonic(KeyEvent.VK_O);
  mopen.addActionListener(this);
  JMenuItem mexit=new JMenuItem("Exit");
  mexit.setMnemonic(KeyEvent.VK_X);
  mexit.addActionListener(this);
  menu.add(mopen);
  menu.add(mexit);
  mainmenu.add(menu); 
     setJMenuBar(mainmenu);
     //show buttons, labels, and a text box 
  panel=new JPanel();
  JButton btnext=new JButton(">");
  JButton btpre=new JButton("<");
  JButton btin=new JButton("+");
  JButton btout=new JButton("-");
  txtPNum=new JTextField();
  txtPNum.addKeyListener(new KeyA());
  JLabel lblPNum=new JLabel("Page:");
  lblPNum.setHorizontalAlignment(JLabel.CENTER);
  btcapture=new JButton("Capture");
  btprint=new JButton("Print");  
  btnext.addActionListener(this);
  btpre.addActionListener(this);
  btin.addActionListener(this);
  btout.addActionListener(this);  
  btcapture.addActionListener(this);
  btprint.addActionListener(this);
  panel.setLayout(new GridLayout(1,6));
  panel.setBackground(Color.BLACK);
  panel.add(btnext);
  panel.add(btpre);
  panel.add(btin);
  panel.add(btout);
  panel.add(lblPNum);
  panel.add(txtPNum);
  panel.add(btcapture);
  panel.add(btprint);
  applyComponentStyles();  
  cont.add(panel,BorderLayout.NORTH);
  lblimg=new JLabel();
  lblimg.setHorizontalAlignment(JLabel.CENTER);
  JScrollPane jscroll=new JScrollPane(lblimg);   
  cont.add(jscroll,BorderLayout.CENTER); 
  setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
  setTitle(title); //set the title of the JFrame
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closable JFrame
  setVisible(true);
  setIconImage(getToolkit().getImage("pdfviewicon.png"));
  panel.setVisible(false); 
   }
 
 public void getFile(String filename){
  //read pdf file and place its data in PDFFile object for later use
    try{
     f=new File(filename); //create file object
     RandomAccessFile raf=new RandomAccessFile(f,"r"); //open the file for reading
     FileChannel pc=raf.getChannel(); //get the file channel
     ByteBuffer buffer=pc.map(FileChannel.MapMode.READ_ONLY, 0, pc.size()); //store file data in the memory
     pdf=new PDFFile(buffer);//place the file data in memory in PDFFile object
     numPages=pdf.getNumPages(); //get the number of pages of the pdf document
     raf.close();//close reader     
     moveFist(); //show the first page 
    
     
     }catch(IOException e){System.out.println("Error in open the file");System.exit(-1);}
    
 }
 
 //apply background, text colors, and font to components
 public void applyComponentStyles(){
  Component[] coms=panel.getComponents();
  for(Component c:coms){
   c.setBackground(Color.BLACK);
   c.setForeground(Color.WHITE);
   c.setFont(new Font("Arial",Font.BOLD,15));
   
  }
 }
 
 
 //do an action when a button or menu item is selected
 public void actionPerformed(ActionEvent e){
  
    
     if(e.getActionCommand().equals("+"))
      doZoomin();
     else if(e.getActionCommand().equals("-"))
      doZoomout();
     else if(e.getActionCommand().equals(">"))
      moveNext();
     else if(e.getActionCommand().equals("<"))
      movePrevious();
     else if(e.getActionCommand().equals("Capture"))
      capturePage(img);
     else if(e.getActionCommand().equals("Print"))
      print();
     
     else if(e.getActionCommand().equals("Open..."))
      selectPDF();
     else if(e.getActionCommand().equals("Exit"))
      System.exit(0);
     
    }

 public void print(){
  Desktop dt=Desktop.getDesktop();
  try{
   dt.print(f);
  }catch(IOException ie){}
 }
 //display the pdf page as an image on the JLabel lblimg
 public void showImage(){
  int w=rect.width+adjx;
        int h=rect.height+adjy;
        img = page.getImage(
                w,h, //width & height
                rect, // clip rect
                null, // null for the ImageObserver
                true, // fill background with white
                true  // block until drawing is done
                );
        lblimg.setIcon(new ImageIcon(img));
        txtPNum.setText(page.getPageNumber()+"");
     
 }
 //increase the image page size
 public void doZoomin(){
  adjx+=40;
  adjy+=30;  
        showImage();
        repaint();
 }
 //decrease the image page size
 public void doZoomout(){
  adjx-=40;
  adjy-=30;  
        showImage();
        repaint();
 }
 //move to first page
 public void moveFist(){
  pageNum=1;
  displayPage(pageNum);
  
 }
 //move to next page
 public void moveNext(){
  if(pageNum<numPages){
   pageNum+=1;
   displayPage(pageNum);
  }
  
 }
 //move to previous page
 public void movePrevious(){
  if(pageNum>0){
   pageNum-=1;
   displayPage(pageNum);
  }
 }
 //goto a page
 public void gotoPage(int num){
  if(num>=0 && num<=numPages){
   displayPage(num);
   pageNum=num; //update pageNum to the current page
  }
  
 }
 //get the page and show it
 public void displayPage(int n){
   page=pdf.getPage(n); //get the current page
   //get the width and height of the page
   rect = new Rectangle(0,0,(int)page.getBBox().getWidth(),(int)page.getBBox().getHeight());
   showImage(); //show the page
   
  }
 //The createBufferedImageFromImage method is able to generate a buffered image from an input image
  public void capturePage(Image image)
   { 
   int width=image.getWidth(null);
   int height= image.getHeight(null);
    BufferedImage dest = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
     Graphics2D g2 = dest.createGraphics();
     g2.drawImage(image, 0, 0,width, height, null);
     g2.dispose();
     try{
      
     ImageIO.write(dest, "png", new File("pdfpage"+pageNum+".png"));
     
     }catch(IOException ie){}
     
   }
 
 class KeyA extends KeyAdapter{
  public void keyReleased(KeyEvent ke){
   char c = ke.getKeyChar();
   int intkey=(int)c;
   if(!(intkey>=48 && intkey<=57 || intkey==8))
    {
    ke.consume(); //hide the unwanted key
 
    }
   else
    if(!txtPNum.getText().equals("")){
     gotoPage(Integer.parseInt(txtPNum.getText()));
    }
  }
 }
 
 public void selectPDF(){

  JFileChooser chooser = new JFileChooser();
  FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF","pdf");
  chooser.setFileFilter(filter);
  chooser.setMultiSelectionEnabled(false);
  int returnVal = chooser.showOpenDialog(null);
  if(returnVal == JFileChooser.APPROVE_OPTION) {
  File file=chooser.getSelectedFile();
    getFile(file.toString());
    panel.setVisible(true);
    }
  
      
 }
}


public class PdfReader {
 public static void main(String[] args){
	 try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  new Starter("PDF Reader");
 }
 
 
}
