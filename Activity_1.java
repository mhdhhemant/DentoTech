import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;
import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.oracle.webservices.internal.api.databinding.Databinding;

import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

public class Activity_1 extends JFrame implements CellEditorListener{
 
	private static final long serialVersionUID = 1L;
	static boolean checkeditpicforupdate=false;
	static byte[] b;
	byte[] xray;
	static int wd=0;
	static int tt=0;
	double ttFees=0,wdfees=0;
	Calendar cal=new GregorianCalendar();
	int firstcount=0, day,month,year,secondcount=0,thirdcount=0,fourthcount=0,sixthcount=0;
	@SuppressWarnings("rawtypes")
	DefaultListModel DLM = new DefaultListModel();
	private JLabel listlabel1;
	private JPanel contentPane;
	private JTextField textField;
	JTable table_image;
	FileInputStream fileInputStream;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField Reg;
	private JTextField Name;
	private JTextField Date;
	private JTextField Age;
	private JTextField Address;
	private JTextField City;
	private JTextField Contact;
	private JTextField Doctor;
	private JCheckBox al;
	@SuppressWarnings("rawtypes")
	private static JTable list;
	private  JPanel panel_5 ;
	private JPanel panel_4;
	private JCheckBox cb;
	@SuppressWarnings("rawtypes")
	private JComboBox Gender;
	private JTextArea textArea;
	private JButton Edit;
	private JButton btnNewPateint;
	int checkup=0;
	int checkcompplain=0;
	private JButton btnDelete;
	private JLabel listlabel;
	@SuppressWarnings("rawtypes")
	private JList list_1,list_3;
	@SuppressWarnings("rawtypes")
	private JList list_2;
	private JLabel chlabel;
	private JLabel lblJdkfj;
	private JScrollPane scrollPane;
	private JPanel panel_6;
	private JScrollPane scrollPane_3;
	private static JTable table;
	private JPanel panel_8;
	private JPanel panel_9;
    private JButton btnNewVisits;
    private JButton btnNewVisits_1;
    private JTabbedPane tabbedPane;
	private JButton btnDeleteVisits;
    private JButton btnNewButton_2;
    private JButton btnEditVisits;
    JList image_list;
    private JList list_4;
    private JLabel label_3 ;
    private  JPanel panel_14 ;
    private JLabel label_4;
	private JLabel label_2;
    private JLabel label_1 ;
    private JPanel panel_15;
    private JPanel panel_17;
    private  JList list_6;
    private  JLabel label_5;
    private JLabel label_6;
    private JPanel panel_18 ;
    private JScrollPane scrollPane_10;
    private JList list_7;
    private JLabel label_7;
    private JTextPane textPane;
    private     JList list_8;
    private JLabel label_8;
    private JLabel label_9 ;
    private JPanel panel_12; 
    private JList list_9;
    private JPanel panel_20;
    private JPanel panel_21;
   
    private  JLabel lblNoPlan;
    private JCheckBox chckbxAcc;
    private   JButton button;
    private JButton button_1;
    private JTextArea textArea_1;
    private JPanel panel_22;
    private JList list_11;
    private JLabel label_11;
    private static JTable table_1;
	private static JTable table_2;
	private JPanel panel_16;
	private JScrollPane scrollPane_9;
	private JList list_5;
	private static JTable table_3;
	private JScrollPane scrollPane_11;
	private JPanel panel_19;
	public static String s_no,s_name,s_table;
	private JScrollPane scrollPane_13;
	private JPopupMenu popupMenu;
	private JPopupMenu popupMenu_1;
	private static JMenuItem mntmEdit;
	private JMenuItem mntmNewMenuItem;
	private static JMenuItem mntmEdit_1 ;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel label_10;
	JLabel xray_label;
	private static JTable table_4;
	private JScrollPane scrollPane_16;
	private JTextField textField_2;
	private JScrollPane scrollPane_18;
	private static  JMenuItem mntmEdit_2;
    private JMenuItem mntmDelete;
    private JPopupMenu popupMenu_2;
    private JPopupMenu popupMenu_3;
    private static JMenuItem mntmEdit_3;
    private JMenuItem mntmDelete_1;
    private static  JMenuItem mntmEdit_4;
    private  JMenuItem mntmDelete_2;
    private JPopupMenu popupMenu_4;
	private JLabel lblNewLabel_9;
	private JLabel lblWwwmtbtechnologiescom;
	private JLabel lblContact;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel lblReportBg;
	private JLabel lblreportmtbtechnologiescom;
	private JScrollPane scrollPane_17;
	private JLabel lblNewLabel_11;
	private JMenuItem mntmBackup,mntmBalance;
	private JMenuItem mntmMergeBackup;
	private JMenuItem mntmRestore;
	private JLabel showPic;
    private static Activity_1 frame;
    private JPanel image_panel;
	private JTextField getting_xray;
	private JScrollPane scrollPane_19;
	private JScrollPane scrollPane_20;
	private JScrollPane scrollPane_21;
	private JButton amount;
	private static JButton addAmount;
	private JSeparator separator_3;
	public static JTable fees_table;
	private JScrollPane scrollPane_22;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					try {
						 try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
						 catch (Exception e) {  }
					    					 
						frame = new Activity_1();
						
					  } catch (Exception e) {
					    e.printStackTrace();
				}
			}
		});
	}

	
		static Connection connection=null;
		String heleth1[]=new String[120];
		int h=0;
		String alergi1[]=new String[70];
		int a=0;
		String alergies[]={"Amoxycillin","B-Complex","Calcium","Cefadroxyl","Cefdinir 300 mg","Chlorohexidine","Diclofenac Sodium","Eklot",
    		"lbuprofen","Ketorolac","Lignocain","Ofloxacin + Ornidazole","Pantoprazole","Paracetamol","Piroxicam","Potassium Nitrate",
    		"Serratiopeptidase","Stannous Fluoride","Tramadol"};
        
		String healthalert[]={"AIDS","Alcoholism","Anaemia(iron deficiency)","Anemia during pregnancy","Anemia folic-acid deficiency","anemia Hemolytic",
 		   "Anemia Pernicious","Angima Pectoris","Anxiety","Aplastic Anemia","Arthritis Rheumatoid", "Asthma", "Atherosclerosis","Bell s palsy",
 		   "Bronchitis Chronic","Bronchitis-Acute","Bruxism","Canker Sores(Aphthous Ulcers)","Cardiac Arrest","Cardiomythopathy","Cellulitis(Erysipelas)",
 		   "Cerebral palsy","Cirrhosis of liver","Common Cold","Congestive Heart Failure","Cushings Syndrome","Denyaration","Depression",
 		   "Diabetes Insipidus","Diabetes Insulin dependent(type I)","Diabetes Non-insulin Dependent","Diarrhea Accute","Diphteria",
 		   "Downs Sysndrome(Mogolism)","Drug hypersensitivity","Dysentery","Emphysema","Endocarditis(Bacterial Endocarditis)",
 		   "Epilepsy (Seizure disorder)","Epistaxis(Nose Bleed)","Fainting(Syncope)","Gangrene","Gastirtis","Gastric Ulcer","Gingivitis","Gonorrhea",
 		   "Gout","Hey fever","Heart attack(Myecardial infartion)","Hemiplegia","Hemophilia","Hepastitis(Acute Viral)","Herpes Genital",
 		   "Hodgkings Disease","Hyperparathyrodism","Hyperthyrodism","Hypoglycemia of diabetes","Hypoglycimia functional","Hypoparathrodism",
 		   "Hypothernia","imuno deficiency disease","Irritable Bowel Sydrome","Kidney failure Acute","Kidney Stones","Kindeny failure Chronic",
 		   "Laryngitis","Leukemia Acute","LeuKemia Chronic","Leukoplakia","lichen Planus","Liver Cancer","Lung Abscess","Lymphoma Non-hodgkings",
 		   "Maleria","measles (Rubeala)","Meningitis Bacterial","Menopause","Menstrual cramps","Migrane (Headach)",
 		   "Moniliasis","Mouth or Tongue Cancer","Multiple Myeloma","Multiple Scrlerosis","Mumps","Myocarditis","Nasal Polyps",
 		   "Nephrosis (Nephrotic Syndrome)","Neutropenia (Agranulocytosis)","Oral Thrush","Osteoarthritis","Osteomyelitis","Osteoporosis",
 		   "Ostosclerosis","Pagets Disease of Bone","Parkinsons disease","Peptic Ulcer","Pericariditis Acute","Pleurisy","Polycythemia",
 		   "Prostatitis","pulmonary Edema","Pulmonary Hypertension","Purpura Allergic","Rabies","Radiation Sickness","Reiters Syndrome",
 		   "Reyes Syndrome","Rheumatic Fever","Salivary-Duct Stone","Scabies","Shingles(Herpes Zoster)","Sinusitis(Sinus infection)",
 		   "Skin Cancer(Basal Cell)","Skin Cancer(Squamousl Cell)","Syphilis","T M J dislocation","Tendinitis","Tetanus","Thalassemia",
 		   "Thrombosis and Embolus","Thyroid Tumor","Tic Douloureux(Trigeminal Neuralgia)","Tonsillitis","Transient Ischemic-Attack",
 		   "Trench Mouth","Tuberculosis","Typhoid Fever","Vitamin C Deficiency","Vitamin D Deficiency","Vitiligo"};
			
		String listonexamination[]={
				"Abrasion","Abscess","Attrition","Bruxism","Calculus","Class 1 comp.buccal","Class 1","Class 1 comp.ling/palatal",
				"Class 1 Compound Buckcle Filling Present","Class 1 Compound LP Filling Present ","Class 1 Filling Present","Class 2-MOD","Class 2-DO","Class 2-MO",
				"Class 2 DO Filling Present","Clas 2 MO Filling Present ","Class 2 MOD Filling Present","Class 3 D","Clas 3 D Filling Present",
				"Class 3 M","Class 3 M Filling Present","Class 4 D","Class 4 D Filling Present","Class 4 M","Class 4 M Filling Present","Class 5","Class 5 Filling Present",
				"Class 6","Class 6 Filling Present","Cross bite","Crowding","Deep bite","Diastema","Discoloured tooth","Edentulus mouth","Enlarged lymph node","Erosion","Eupulis[gum polyp]",
				"Fc Present","Fracture","Gingival enlargement","Gingival recession","Grade one mobility","Grade three mobility","Grade two mobility",
				"Halitosis","Hypocalcified tooth/teeth","Impaction/Wisdom Tooth ","Leakage Present ","Leucoplakia","Mesiodens","Missing tooth","Open bite ",
				"Over retained tooth","Pain on percussion ","Pathological migration ","Pericoronitis","Plaque","Poor perio","Pulp Polyp","Root piece ",
				"Stains","Supernumerary","Trauma from occlusion","Trismus partial/total"
				};
		String listRxadvised[]={"Bite Plate","Bleaching","Cast Core","core Post","Fillings","FPD (Bridge)","Full Crown","Full Mouth Rehabilitation",
				"Gingival Curettage","Implant","Inlay","Laminate","Ortho","Prophylaxis","Root Canal Treatment ","Smile Design","Scalling"
		};
		
		String listworkdone[]={
				"Bite Plate","Bridge Cementation","Bridge Cutting Done ","Bridge Impression Taken ","Cast Core ","Cautery","Cavity Filling Done ",
				"Cavity Prepared","Check Up Done","Complete Denture","Core Buildup","Extraction Done ","Fc Cementation","FC Cutting Done ",
				"Fc Impression Taken","FC With Ceramic Facing ","Final Impression","Flap Surgery Done","Implant ","Impression Taken For Bleaching",
				"Inlay","lopa Taken","Jaw Relation","Laminate Done","LCD","Metal Trial","Miscellaneous","Model Impression Taken","OPG Taken",
				"Ortho","Partial Denture","Pit & Fissure Sealant [FS Done]","Polishing","Primary Impression","Prophylaxis Done",
				"RC Dressing","RC Filling Done","RC Open","Screw Post","Smile Design","Splinting Done","Surgical Extraction","Sutures given",
				"Sutures Removed","Total Extraction Done ","Try In","UCD","Scalling"
		};
		
		String listprescrition[]={
			"[Custom Text]","[Gastric Patients]","[Non gastric Patients]","Ampoxin-250mg","Brufen 400mg","Calcium Sandoz","Calpol 650mg","Cefadroxyl-250mg",
			"Clohex Plus Mouthwash","Dolonex-DT","Droxyl-500mg","E-Klot 500mg","Flexon -MR","Fogum Ointment","Hexidine Mouthwash","Hexigel Ointment",
			"Ketorol -DT","Lyser -5mg","Lyser fort","Lytix -20mg","Mox -500mg","Mucopain Ointment","Ordent","Pan -D","Periex Mouthwash","RA Thermoseal Paste",
			"Sefdin -300 mg","Senquel AD Mouthwash","Sentim -SF Gel","Sentim Paste","Stiffnil Kid","Tramadol inj","Ultracet","Vizylac","Voveran -D",
			"Voveran inj","Vyrumol 650","Zenflox OZ"	
		};
		private JTextField complaint_search,onexam_search,rx_search,wd_search,prs_search;
		private JLabel label,onexam_searchlabel,treatmentlabel,wdlabel,prslabel;
		
		
		public void Backupalert(){
			
			JFileChooser chooser = new JFileChooser();
		    chooser.setCurrentDirectory(new java.io.File("C:\\"));
		    chooser.setDialogTitle(" Select Backup Directory");
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    chooser.setAcceptAllFileFilterUsed(false);
		    if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) { 	
		    Path file=Paths.get(	System.getProperty("user.dir")+"\\empoyee.sqlite");
		   	Path target=Paths.get(chooser.getSelectedFile()+"\\empoyee.sqlite");
		   	if(Files.exists(target,LinkOption.NOFOLLOW_LINKS))			   				
		   	{	
				 int i=JOptionPane.showConfirmDialog(null,"There is alerady have Backup at this location if you want overwrite the Backup,click yes,othervise change the directory...", "Select an option",JOptionPane.YES_NO_OPTION);
					if(i==0){
				
		   		try {
		   				Files.copy(file,target,StandardCopyOption.REPLACE_EXISTING);
		   			}
		   		catch (IOException e1) {
		   				
		   				
		   			}
		   			JOptionPane.showMessageDialog(null, "Backup sucessfully");
					}
					else{
						
					}
		   	}
		   	else{
		   		 try {
			   		   Files.copy(file,target,StandardCopyOption.COPY_ATTRIBUTES);
			   		 } catch (IOException e1) {
			   				// TODO Auto-generated catch block
			   				
			   		 }
			   			JOptionPane.showMessageDialog(null, "Backup sucessfully");
			   				
		   			}
 			    }	
		}
		
		public static String[] printbutton1( ){
			String [] detail=new String [10];
			try{
				
				DefaultTableModel m=(DefaultTableModel)list.getModel();
	   			int row=list.getSelectedRow();
	  			String Regn= m.getValueAt(row,0).toString();
				
				String query="select * from   Record where Regn='"+Regn+"';";
				PreparedStatement pst=connection.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{ 
				   detail[0]=rs.getString("name");
				   detail[1]=rs.getString("Age");
				   detail[2]=rs.getString("Address");
				   detail[3]=rs.getString("contact");
				   detail[4]=rs.getString("Health");
				   detail[5]=rs.getString("alergies");
				   detail[6]=rs.getString("gender");
				   //byte[] b=rs.getBytes("pic");
				}
				pst.close();
				rs.close();
		    }
			catch(Exception e){ }

			return detail;
		}
		
		public static byte[] printXray()
		{
			byte[] h=b;
			return h;
		}
		
		public static String[] printbutton2()
		{

			int tablerow=table.getRowCount();
			String [] tablevalueslenghth=new String[3*tablerow];
			for(int i=0;i<tablerow*3;i++){
			tablevalueslenghth[i]=	(String) table.getValueAt(i/3, 1);
			tablevalueslenghth[i+1] =(String) table.getValueAt(i/3, 2);
			tablevalueslenghth[i+2]=	(String) table.getValueAt(i/3, 4);
			i=i+2;
			}    
			return tablevalueslenghth;
		}
		
		public static String[] printbutton3()
		{
			int tablerow1=table_1.getRowCount();
			String [] table_1valueslenghth=new String[3*tablerow1];
			for(int i=0;i<tablerow1*3;i++){
				table_1valueslenghth[i]=	(String) table_1.getValueAt(i/3, 1);
				table_1valueslenghth[i+1] =(String) table_1.getValueAt(i/3, 2);
				table_1valueslenghth[i+2]=	(String) table_1.getValueAt(i/3, 4);
				i=i+2;
			}
			return table_1valueslenghth;
		}
		
		public static String[] printbutton4()
		{
			int tablerow2=table_4.getRowCount();
			String [] table_2valueslenghth=new String[3*tablerow2];
			for(int i=0;i<tablerow2*3;i++)
			{
				table_2valueslenghth[i]=	(String) table_4.getValueAt(i/3, 1);
				table_2valueslenghth[i+1] =(String) table_4.getValueAt(i/3, 2);
				table_2valueslenghth[i+2]=	(String) table_4.getValueAt(i/3, 4);
				i=i+2;
			}
			return	table_2valueslenghth;
		}
		
		public static String[] printbutton5()
		{
			int tablerow3=table_2.getRowCount();
			String [] table_3valueslenghth=new String[3*tablerow3];
			for(int i=0;i<tablerow3*3;i++){
		    	table_3valueslenghth[i]=	(String) table_2.getValueAt(i/3, 1);
		    	table_3valueslenghth[i+1] =(String) table_2.getValueAt(i/3, 2);
		    	table_3valueslenghth[i+2]=	(String) table_2.getValueAt(i/3, 4);
		    	i=i+2;
			}
			return	table_3valueslenghth;
		}
		
		public static String[] printbutton6()
		{
			int tablerow4=table_3.getRowCount();
			String [] table_4valueslenghth=new String[3*tablerow4];
			for(int i=0;i<tablerow4*3;i++)
			{
				table_4valueslenghth[i]=	(String) table_3.getValueAt(i/3, 1);
				if((String) table_3.getValueAt(i/3, 2)==null)
				{
					table_4valueslenghth[i+1] =" ";
				}
				else
				{
					table_4valueslenghth[i+1] =(String) table_3.getValueAt(i/3, 2);	
    	
				}
				if((String) table_3.getValueAt(i/3, 3)==null)
				{
					table_4valueslenghth[i+2]="  ";
				}
				else
				{
    		   		table_4valueslenghth[i+2]=	(String) table_3.getValueAt(i/3, 3);
				}
				i=i+2;
			}
			return table_4valueslenghth;
		}

		public void balaceTable(String s_name,String s_no)
		{
			String s_table;
			
			
		}
		///function  jo kam me lene va
	    public  void showhistory()
	    {
	 		
	 		btnDeleteVisits.setEnabled(true);
	 		btnEditVisits.setEnabled(true);
	 			
	 		try
	 		{
	 			if(list_2.getSelectedIndex()!=-1||list_5.getSelectedIndex()!=-1||list_6.getSelectedIndex()!=-1||list_8.getSelectedIndex()!=-1||list_11.getSelectedIndex()!=-1||image_list.getSelectedIndex()!=-1)
	 			{
	 				int row=list_2.getSelectedIndex();   		   
	 				String Name_= (list_2.getModel().getElementAt(row)).toString();
	 				table.setModel(new DefaultTableModel(
	  					new Object[][] {},
	  					new String[] { "Sr.No", "Teeth.No", "Complaints", "Date", "Comments"}
	  				));
	 				
	 				table_1.setModel(new DefaultTableModel( 
	 	 		    	new Object[][] {},
	 	 		    	new String[] { "Sr.No", "Teeth No.", "Findings", "Date", "Comments", "Mtrl Used"}
	 	 		    ));
	  			
	 				table_2.setModel(new DefaultTableModel(
	     		    	new Object[][] {},
	     		    	new String[] { "Sr.No", "Teeth No", "Work Done", "Date", "Fee ", "Comments", "Mtrl Used" }
	     		    ));
	 				table_3.setModel(new DefaultTableModel(
	  			    	new Object[][] {
	  			    	},
	  			    	new String[] {
	  			    			" ", "Prescription", "Dosage", "Instruction", "Visit Date", ""
	  			    	}
	  			    ));
	 				table_4.setModel(new DefaultTableModel(
	  			    	new Object[][] {
	  			    	},
	  			    	new String[] {
	  			    		"Sr.No", "Teeth No.", "Treatment Advised", "Date", "Fee"
	  			    	}
	  			    ));
	 				table_image.setModel(new DefaultTableModel( 
		 	 		    	new Object[][] {},
		 	 		    	new String[] { "Image"}
		 	 		    ));

			  		DefaultTableModel model = (DefaultTableModel) table.getModel();
			  		DefaultTableModel model1 = (DefaultTableModel) table_1.getModel();
			  		DefaultTableModel model2 = (DefaultTableModel) table_2.getModel();
			  		DefaultTableModel model3 = (DefaultTableModel) table_3.getModel();
			  		DefaultTableModel model4 = (DefaultTableModel) table_4.getModel();
			  		DefaultTableModel model5 = (DefaultTableModel) table_image.getModel();
	  		
			  		String query1="select  * from  xray_image where history='"+Name_+"';";
			        PreparedStatement pst1=connection.prepareStatement(query1);
		            ResultSet rs1=pst1.executeQuery();
	  		
		            while(rs1.next())
		            {
		            	b=rs1.getBytes("image");
		            	Vector<Object> newRow = new Vector<Object>();
		            	BufferedImage img=ImageIO.read(new ByteArrayInputStream(b));
		            	ImageIcon icon=new ImageIcon(img);
		                newRow.addElement(icon); 
		            	model5.addRow(newRow);
		            }
		  		
		  			String query="select  * from  complaints where history='"+Name_+"';";
			        PreparedStatement pst=connection.prepareStatement(query);
		            ResultSet rs=pst.executeQuery();
		
	         
	    		
			        while(rs.next())
			        {	
			        	/*b=rs.getBytes("image");
			        	ByteArrayInputStream in = new ByteArrayInputStream(b);
			        	BufferedImage img = ImageIO.read(in);
			        	Image dimg = img.getScaledInstance(xray_label.getWidth(), xray_label.getHeight(),Image.SCALE_SMOOTH);
			        	ImageIcon imageIcon = new ImageIcon(dimg);
			        	xray_label.setIcon(new ImageIcon(ImageIO.read(img).getScaledInstance(xray_label.getWidth(), xray_label.getHeight(), Image.SCALE_SMOOTH)));
			        	xray_label.setIcon(imageIcon);*/
			        	
			            String strArray[]= rs.getString("complaint").split(":");          
		                //print elements of String array
		                for(int i=0; i <strArray.length&strArray.length!=1; i++)
		                {	
		                	String data[]={strArray[i],strArray[i+1],strArray[i+2],strArray[i+3],strArray[i+4]};
		                	i=i+4;
		                	model.addRow(data);
		                }
		                
		                String strArray1[]= rs.getString("on_examination").split(":");
			            //print elements of String array
		                for(int i=0; i <strArray1.length&strArray1.length!=1; i++)
		                {
		                   	String data[]={strArray1[i],strArray1[i+1],strArray1[i+2],strArray1[i+3],strArray1[i+4],strArray1[i+5]};
		                	i=i+5;
		                	model1.addRow(data);         
		                }
		                
		                String strArray2[]= rs.getString("work_done").split(":");
			            //print elements of String array
		                for(int i=0; i <strArray2.length&strArray2.length!=1; i++)
		                {
		                  	String data[]={strArray2[i],strArray2[i+1],strArray2[i+2],strArray2[i+3],strArray2[i+4],strArray2[i+5],strArray2[i+6]};
		                	i=i+6;
		                	model2.addRow(data);
		                }
			        
		                String strArray3[]= rs.getString("prescription").split(":");
		                //print elements of String array
		                for(int i=0; i <strArray3.length&strArray3.length!=1; i++)
		                {
	                	   	String data[]={strArray3[i],strArray3[i+1],strArray3[i+2],strArray3[i+3],strArray3[i+4]};
	                	   	i=i+4;
	                	   	model3.addRow(data);
	                	}
	                
		                String strArray4[]= rs.getString("rxadvised").split(":");
		                //print elements of String array
		                for(int i=0; i <strArray4.length&strArray4.length!=1; i++)
		                {
	                	  	String data[]={strArray4[i],strArray4[i+1],strArray4[i+2],strArray4[i+3],strArray4[i+4]};
	                	  	i=i+4;
	                	  	model4.addRow(data);
	                	}
	                
			        }
		            pst.close();
		            rs.close();
	 			}
	 		}
	 		catch(Exception e){	e.printStackTrace();}
	 		
		}
	    
	    public String ShowRegn(String n)
	    {
	    	String re = null;
	    	try{
		
	    String query="select * from   Record where Regn='"+n+"';";
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{ 
			re= rs.getString("Regn");
		}
		pst.close();
		rs.close();
	  }
		catch(Exception e){
			
		}
	return re;
  }
		
	    public void Refreshlist(){
    	          try{
    	        	     int i=0;
    	        	  
    	        	     try{    
    	        			
    	        			    String query="Select Regn From Record ";
    	        		        PreparedStatement pst=connection.prepareStatement(query);
    	        		        ResultSet rs=pst.executeQuery();

    	        		        while(rs.next())
    	        		        {		  
    	        		        	i=i+1;;
    	        		        }
    	        		      
    	        		        pst.close();
    	        		        rs.close();
    	        		  }
                     catch(Exception e){
                    	
                          }
    	        	 
			         btnNewVisits.setEnabled(false);
			         tabbedPane.setEnabledAt(1, false);
		           

			        String query="select Regn,Name,contact,Address,city from   Record ;";
			        PreparedStatement pst=connection.prepareStatement(query);
			        ResultSet rs=pst.executeQuery();
			        
			        list.setModel(DbUtils.resultSetToTableModel(rs));
			      			        
			        pst.close();
			        rs.close();

		        }
    	
		      catch(Exception e){
			           
			           e.printStackTrace();
		            }
              }
   
	    public void Refreshcomplaintlist(String regnvalue){
	    	try{
        	     panel_8.setVisible(false);
	     	  	 panel_9.setVisible(true);
	     	     panel_16.setVisible(true);
	     	     panel_14.setVisible(false);
	     	     panel_15.setVisible(false);
	     	     panel_17.setVisible(true);
	     	     panel_19.setVisible(true);
	     	     panel_18.setVisible(false);
	     	     panel_22.setVisible(true);
	     	     panel_20.setVisible(false);
	     	  	 list_1.setEnabled(false);
	     	  	 list_3.setEnabled(false);
	     	  	 list_4.setEnabled(false);
	     	  	 list_7.setEnabled(false);
	     	  	 list_9.setEnabled(false);
	     		 btnDeleteVisits.setEnabled(false);
	     		 btnNewButton_2.setEnabled(false);
	     		 btnEditVisits.setEnabled(false);
	     		 btnNewVisits_1.setEnabled(true);
	     		 
	     			
	     		Cursor hr = new Cursor(Cursor.DEFAULT_CURSOR);
				lblJdkfj.setCursor(hr);
				label_1.setCursor(hr);
				label_2.setCursor(hr);
				label_9.setCursor(hr);
	     	  	chlabel.setText("Complaint History...");
	     	  	label_4.setText(" History...");
	     	  	label_5.setText("History...");
	     	  	label_8.setText("History...");
	     	  	label_11.setText("History...");
	     	  	
	     	    
	     		 table.setModel(new DefaultTableModel(
	     			new Object[][] {
	     				
	     			},
	     			new String[] {
	     				"Sr.No", "Teeth.No", "Complaints", "Date", "Comments"
	     			}
            	     		));
	     		table_1.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    		
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No.", "Findings", "Date", "Comments", "Mtrl Used"
	     		    	}
	     		    ));
	     		  table_2.setModel(new DefaultTableModel(
	     			    	new Object[][] {
	     			    	},
	     			    	new String[] {
	     			    		"Sr.No", "Teeth No", "Work Done", "Date", "Fee ", "Comments", "Mtrl Used"
	     			    	}
	     			    ));
	     		 table_3.setModel(new DefaultTableModel(
		  			    	new Object[][] {
		  			    	},
		  			    	new String[] {
		  			    		" ", "Prescription", "Dosage", "Instruction", "Visit Date", ""
		  			    	}
		  			    ));
		  				  
	     		table_4.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No.", "Treatment Advised", "Date", "Fee"
	     		    	}
	     		    ));
	     		
	     		table_image.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Image"
	     		    	}
	     		    ));

      	     DefaultListModel DLM=new DefaultListModel();
	       

	        String query="select * from  complaints where Regn='"+regnvalue+"' ;";
	        PreparedStatement pst=connection.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
	
	        while(rs.next())
	        {		  
	        	DLM.addElement(rs.getString("history"));
	        	list_2.setModel(DLM);
	        	list_5.setModel(DLM);
	        	list_6.setModel(DLM);
	        	list_8.setModel(DLM);
	        	list_11.setModel(DLM);
	        	image_list.setModel(DLM);
	        }
	            list_2.setModel(DLM);
	    	    list_5.setModel(DLM);
	    	    list_6.setModel(DLM);
	    	    list_8.setModel(DLM);
	    	    list_11.setModel(DLM);
	    	    image_list.setModel(DLM);
	        pst.close();
	        rs.close();

      }

    catch(Exception e){
	           
          }
    }

	    public void Showrecord( String n){
    	
		try{
			if(n==" "){
				textArea.setText("  Select Record You Want to show ");
				showPic.setIcon(null);
			}
			else{
			Edit.setEnabled(true);
			amount.setEnabled(true);
	        btnDelete.setEnabled(true);
	        btnNewVisits.setEnabled(true);
	        btnNewVisits_1.setEnabled(true);
	        tabbedPane.setEnabledAt(1, true);
			textArea.setText("");
			String query="select * from   Record where Regn='"+n+"';";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{ 
				Font font=new Font("Miriam Fixed", Font.BOLD, 17);
			    Font font2=new Font("Kartika", Font.BOLD, 45);
			 
			    textArea.append("\n Reg.no             : ");
				textArea.append(rs.getString("regn"));
				textArea.append("\n Date               :   "+rs.getString("Date"));
				textArea.append("\n\n Patient Name   : "+rs.getString("name")+ " "+rs.getString("Age")+" "+" "+rs.getString("gender"));
				textArea.append("\n\n\n Address   : "+rs.getString("Address"));
				textArea.append("\n\n City   : "+rs.getString("city"));
				textArea.append("\n Contact  : "+rs.getString("contact"));
				textArea.append("\n\n\n Health Alert :"+rs.getString("Health"));
				textArea.append("\n Alergies : "+rs.getString("alergies"));
				textArea.append("\n\n\n  Doctor "+rs.getString("doctor"));
				textPane.setText("Health Alert :"+rs.getString("Health")+"\n"+"Alergies :"+rs.getString("alergies"));
				//int w=showPic.getBounds().width;
		        //int h=showPic.getBounds().height;
		
				//showPic.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(rs.getBytes("pic"))));
			}
			pst.close();
			rs.close();
	        }
		}
		
		catch(Exception e){
			
		}
		
      }
		    
	    public void Refreshpanel_3(String hal,String alergi){
    
    	
	    	Calendar cal=new GregorianCalendar();
	    	int day=cal.get(Calendar.DAY_OF_MONTH);
	    	int month=cal.get(Calendar.MONTH)+1;
	    	int year=cal.get(Calendar.YEAR);
             	    	

	    	panel_3 = new JPanel();
	    	panel_3.removeAll();
	    	panel_3.setVisible(true);
	    	panel_3.setBounds(0, 0, 845, 614);
	    	panel.add(panel_3);
        
	        panel_3.setBackground(UIManager.getColor("Panel.background"));
	        panel_3.setLayout(null);
	        
	        JLabel lblNewLabel_1 = new JLabel("Reg.No");
	        lblNewLabel_1.setFont(new Font("Kartika", Font.PLAIN, 14));
	        lblNewLabel_1.setBounds(12, 32, 67, 16);
	        panel_3.add(lblNewLabel_1);
	        
	        Reg = new JTextField();
	        Reg.setEditable(true);
	        Reg.setBackground(Color.WHITE);
	        Reg.setAutoscrolls(false);
	        Reg.setDisabledTextColor(Color.WHITE);
	        Reg.setOpaque(false);
	        Reg.setMaximumSize(new Dimension(100, 100));
	        Reg.setBounds(91, 28, 116, 22);
	        Reg.setColumns(10);
	        panel_3.add(Reg);
	        Reg.setEditable(false); 
        
	        try
	        {    
	        	int i=0;
	        	String query="Select Regn From Record ";
	        	PreparedStatement pst=connection.prepareStatement(query);
	        	ResultSet rs=pst.executeQuery();

		        while(rs.next())
		        {		  
		        	i= rs.getInt("Regn");
		        }
		        Reg.setText(""+(i+1));
       
		        pst.close();
		        rs.close();

	        }

	        catch(Exception e)
	        {
	        	
	        }

       
      
        JLabel lblNewLabel_2 = new JLabel("Patient Name");
        lblNewLabel_2.setFont(new Font("Kartika", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(12, 64, 104, 16);
        panel_3.add(lblNewLabel_2);
        
        Name = new JTextField();
        Name.setBounds(118, 64, 301, 19);
        panel_3.add(Name);
        Name.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Date :");
        lblNewLabel_3.setFont(new Font("Kartika", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(285, 32, 56, 16);
        panel_3.add(lblNewLabel_3);
        
        Date = new JTextField();
        Date.setBackground(Color.WHITE);
        Date.setEditable(false);
        Date.setBounds(353, 28, 116, 22);
        panel_3.add(Date);
        Date.setColumns(10);
        
        JLabel lblGender = new JLabel("Gender :");
        lblGender.setFont(new Font("Kartika", Font.PLAIN, 14));
        lblGender.setBounds(12, 101, 67, 16);
        panel_3.add(lblGender);
        
        Gender = new JComboBox();
        Gender.setModel(new DefaultComboBoxModel(new String[] {"  Male", "  Female"}));
        Gender.setBounds(81, 99, 117, 24);
        panel_3.add(Gender);
        
        JLabel lblNewLabel_4 = new JLabel("Age :");
        lblNewLabel_4.setFont(new Font("Kartika", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(285, 101, 56, 16);
        panel_3.add(lblNewLabel_4);
        
        Age = new JTextField();
        Age.setBounds(331, 98, 48, 22);
        panel_3.add(Age);
        Age.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("Address :");
        lblNewLabel_5.setFont(new Font("Kartika", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(12, 165, 77, 16);
        panel_3.add(lblNewLabel_5);
        
        scrollPane_13 = new JScrollPane();
        scrollPane_13.setBounds(81, 161, 391, 64);
        panel_3.add(scrollPane_13);
        
        Address = new JTextField();
        scrollPane_13.setViewportView(Address);
        Address.setAutoscrolls(true);
        Address.setColumns(10);
        
        JLabel lblNewLabel_6 = new JLabel("City  :");
        lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(33, 249, 56, 16);
        panel_3.add(lblNewLabel_6);
        
        City = new JTextField();
        City.setBounds(81, 247, 116, 22);
        panel_3.add(City);
        City.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("Contact  :");
        lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(264, 249, 77, 16);
        panel_3.add(lblNewLabel_7);
        
        Contact = new JTextField();
        Contact.setBounds(356, 247, 116, 22);
        panel_3.add(Contact);
        Contact.setColumns(10);
        
        JLabel lblDoctor = new JLabel(" Doctor  :");
        lblDoctor.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblDoctor.setBounds(22, 308, 77, 20);
        panel_3.add(lblDoctor);
        
        Doctor = new JTextField();
        Doctor.setText(login.usename());
        Doctor.setBounds(102, 308, 201, 22);
        panel_3.add(Doctor);
        Doctor.setColumns(10);
        
        JTabbedPane tabbedPane_1_1 = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
        tabbedPane_1_1.setBounds(22, 340, 271, 277);
        panel_3.add(tabbedPane_1_1);
       
        JScrollPane scrollPane_1_1 = new JScrollPane();
        tabbedPane_1_1.addTab("Health Alert", null, scrollPane_1_1, null);
        
         panel_4 = new JPanel();
         panel_4.setToolTipText("for fast use (up/down key+Page up/down key)");
         panel_4.addMouseListener(new MouseAdapter() {
         	@Override
         	public void mouseClicked(MouseEvent arg0) {
         		
         	}
         });
         scrollPane_1_1.areFocusTraversalKeysSet(0);
         scrollPane_1_1.setViewportView(panel_4);
         // scrollPane_1_1.scrollRectToVisible(new Rectangle());
         panel_4.setLayout(new MigLayout("", "[grow]", "[][][][]"));
         scrollPane_1_1.getVerticalScrollBar().setValue(10);;
         JScrollPane scrollPane_2_1 = new JScrollPane();
         tabbedPane_1_1.addTab("Alergies", null, scrollPane_2_1, null);
         
         panel_5 = new JPanel();
         panel_5.setToolTipText("for fast use (up/down key+Page up/down key)");
         scrollPane_2_1.setViewportView(panel_5);
         panel_5.setLayout(new MigLayout("", "[][][]", "[][]"));
         
         
          
         JButton btnNewButton = new JButton("Save");
         btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
           btnNewButton.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent arg0) {
           		if(Name.getText().equals("")||Name.getText()==null){
               		JOptionPane.showMessageDialog(null,"Enter the patient Name");
               	}
               	else{
           		if(checkup ==1){
           		try{  
           			
           		String gal=" ";
           		for(int i=0;i<h;i++){
           	
           			gal+=heleth1[i];
           			if(i!=(h-1) & heleth1[i]!=" "){
           				gal+=" , ";
           			}
           		}
           		
            		h=0;
           	
           		
           String alg=" ";
           	   
           		for(int i=0;i<a;i++){
   	     			
   	     			alg+=alergi1[i];
   	     			if(i!=(a-1) & alergi1[i]!=" "){
   	     				alg+=" , ";
   	     			}
   	     		}
   	     		a=0;
   	     		/*if(checkeditpicforupdate=true){
   		  			String query="update Record set name='"+Name.getText()+"',Age='"+Age.getText()+"',Address='"+Address.getText()+"',Gender='"+(String)Gender.getSelectedItem()+"',city='"+City.getText()+"',contact='"+Contact.getText()+"',Doctor='"+Doctor.getText()+"',Date='"+Date.getText()+"',health='"+gal+"',alergies='"+alg+"',pic=? where Regn="+Reg.getText()+";";
   		  			//System.out.println(query);
   		  			PreparedStatement pst=connection.prepareStatement(query);

   	           		FileInputStream fileInputStream=new FileInputStream(picDir.getText());
   	           		byte b[]=new byte[fileInputStream.available()];
   	           		fileInputStream.read(b);
   	           		fileInputStream.close();
   	           		pst.setBytes(1,b);
   	                pst.execute();
 		  		   
		  			 JOptionPane.showMessageDialog(null,"Data updated");
		  			 pst.close();
	     	
   	           		
   	     		}*/
   		  			String query="update Record set name='"+Name.getText()+"',Age='"+Age.getText()+"',Address='"+Address.getText()+"',Gender='"+(String)Gender.getSelectedItem()+"',city='"+City.getText()+"',contact='"+Contact.getText()+"',Doctor='"+Doctor.getText()+"',Date='"+Date.getText()+"',health='"+gal+"',alergies='"+alg+"' where Regn="+Reg.getText()+";";
   		  			//System.out.println(query);
   		  			PreparedStatement pst=connection.prepareStatement(query);

   	           		pst.execute();
   		  		   
   		  			 JOptionPane.showMessageDialog(null,"Data updated");
   		  			 pst.close();
   	     		
   	     		checkeditpicforupdate=false;
   		  		}
   		  		catch(Exception e)
   		  		{
   	               				
   		  		}
   		  		
   		  		Refreshlist();
   		  		
           		panel_3.setVisible(false);
           		panel_2.setVisible(true) ;
           	    list.setEnabled(true);
           	    
           		Showrecord(Reg.getText());
           	    //list.setSelectedValue(Name.getText(), true);
           	    
           			    
   		 }
           		
           		else{
           			
           	
           	try{	
           		String query ="insert into Record (Regn ,name,Age,Gender,Address,city,Contact,Doctor,Date,Health,alergies) values(   ?,?,?,?,?,?,?,?,?,?,?)";
           		PreparedStatement pst=connection.prepareStatement(query);
           		
           		pst.setString(1, Reg.getText());
           		pst.setString(2,Name.getText() );
           		pst.setString(3, Age.getText()); 
           		pst.setString(5, Address.getText());
           		pst.setString(4, (String)Gender.getSelectedItem());
           		pst.setString(6, City.getText());
           		pst.setString(7, Contact.getText());
           		pst.setString(8, Doctor.getText());
           		pst.setString(9, Date.getText());
           		
           		/*String hm;
           		//JOptionPane.showMessageDialog(null, hm);
           		if(picDir.getText().isEmpty()||picDir.getText()==null||picDir.getText().equals("")||picDir.getText().equals(null))
           		{
        	   		//FileInputStream fileInputStream=new FileInputStream(picDir.getText());
	        	   	//JOptionPane.showMessageDialog(null, "Error");
           			//b=new byte[0];
	      			//fileInputStream.read(b);
	      			//fileInputStream.close();
	      			pst.setNull(12, java.sql.Types.BLOB);
           		}
           		else 
           		{	
           			FileInputStream fileInputStream=new FileInputStream(picDir.getText());
           		
           			b=new byte[fileInputStream.available()];
           			fileInputStream.read(b);
           			fileInputStream.close();
           			pst.setBytes(12, b);
           		}*/
           		String gal=" ";
           		for(int i=0;i<h;i++){
           			
           			gal+=heleth1[i];
           			if(i!=(h-1) & heleth1[i]!=" "){
           				gal+=" , ";
           			}
           		}
           		h=0;
           		pst.setString(10, gal);
           		
           		//heleth=heleth.replaceAll(heleth, " ");	
           		
           		gal=" ";
           	   
           		for(int i=0;i<a;i++){
   	     			
   	     			gal+=alergi1[i];
   	     			if(i!=(a-1) & alergi1[i]!=" "){
   	     				gal+=" , ";
   	     			}
   	     		}
   	     		a=0;
   	     		
           		pst.setString(11, gal);
           		
           		//aler=aler.replaceAll(aler, " ");
           		
           		pst.execute();
           	    pst.close();
           		JOptionPane.showMessageDialog(null,"Data Saved");
           		
           		Refreshlist();
           		panel_3.setVisible(false);
           		panel_2.setVisible(true) ;
           	    list.setEnabled(true);
           	    
           		Showrecord(Contact.getText());
           	    //list.setSelectedValue(Name.getText(), true);
           	    tabbedPane.setEnabledAt(1, false);
           	    //list. getSelectionModel().setSelectionInterval(list.getComponentCount(), list.getComponentCount()); 
           		}
           
           	catch(Exception e)
           	{
           		
           	}
           	}               
         	}
           	}
           });
           btnNewButton.setBounds(484, 514, 138, 48);
           panel_3.add(btnNewButton);
           
          JButton btnNewButton_1 = new JButton("Back");
          
           btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
           btnNewButton_1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent arg0) {
           	    
           		list.setEnabled(true);
           		panel_2.setVisible(true);
           		panel_3.setVisible(false);
           		
           	}
           });
           btnNewButton_1.setBounds(665, 513, 138, 49);
           panel_3.add(btnNewButton_1);
           
            
   	    Date.setText(day+" / "+month+" / "+year  );
   	    
   	    JSeparator separator_1 = new JSeparator();
   	    separator_1.setBounds(12, 139, 617, 2);
   	    panel_3.add(separator_1);
   	    
   	    JSeparator separator_2 = new JSeparator();
   	    separator_2.setBounds(12, 285, 645, 3);
   	    panel_3.add(separator_2);
   	    
   	    JButton refreshPanelButton = new JButton("Click 2 Refresh ");
   	    refreshPanelButton.setFont(new Font("Verdana", Font.BOLD, 17));
   	    refreshPanelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Refreshlist();
				
			}
		});
   	    
   	    refreshPanelButton.setBounds(484, 394, 319, 64);
   	    panel_3.add(refreshPanelButton);

			try{    
				
				String query="Select *  From alergies ";
			     PreparedStatement pst=connection.prepareStatement(query);
			      ResultSet rs=pst.executeQuery();
                String koi="";
                int i=0;
			        while(rs.next())
			        {		  
			    koi=rs.getString("alergi");
			    i=rs.getInt("id");
	 	    	ItemListener itemListener=new ItemListener() {

 	    		@Override
 	    		public void itemStateChanged( ItemEvent ie) {
 	    		JCheckBox al=(JCheckBox ) ie.getItem();
 	    		if(  al.isSelected())
 	    		{   

 	    			//aler+='"'+al.getText()+'"'+",";
                    alergi1[a]=al.getText();
                    a=a+1;
 	    		}
 	    		else
 	    		{

 	    			//aler=aler.replaceAll('"'+al.getText()+'"'+",","");
 	    			

   	    		   for(int j=0;j<=a;j++){
   	    			   if(al.getText() ==alergi1[j]){
   	    				 alergi1[j]=" ";
   	    			   }
   	    		   }
  	    	
 	    		}
 	      }
 	    
 	    	    };


 	    al = new JCheckBox  (koi);
 	    al.setFont(new Font("Verdana", Font.PLAIN, 14));
 	    al.addItemListener(itemListener);    
 	     if( alergi.contains(koi)){
 	    	
 	         al.setSelected(true);
 	         
 			}
 		
 	    panel_5.add(al , "cell 0 "+(i-1)+"");   
 	 		
			        }
			         pst.close();
			        rs.close();
			}
			catch(Exception e){
				
	}
  	    
try{    
				
		   	 String query="Select *  From health_alert ";
		      PreparedStatement pst=connection.prepareStatement(query);
		      ResultSet rs=pst.executeQuery();
                String koi="";
                int i=0;
			        while(rs.next())
			        {		  
			    koi=rs.getString("health_alert");
			    i=rs.getInt("id");
	 	     	    	ItemListener itemListener1=new ItemListener() {

 	    		/* (non-Javadoc)
 	    		 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
 	    		 */
 	    		@Override
 	    		public void itemStateChanged(ItemEvent ie) {
 	    		JCheckBox cb=(JCheckBox ) ie.getItem();
 	    		if(  cb.isSelected())
 	    		{  			 
 	    		
 	    			//	heleth+= '"'+cb.getText()+'"'+",";
 	    		   
 	    			heleth1[h]=cb.getText();
 	    		    h=h+1;
 	    		}
 	    		else
 	    		{
 	    			
 	    			//heleth=heleth.replaceAll('"'+cb.getText()+'"'+",", "");
 	    	
  	    		   for(int j=0;j<=h;j++){
  	    			   if(cb.getText() ==heleth1[j]){
  	    				 heleth1[j]=" ";
  	    			   }
  	    		   }
 	    		}
 	    		}
 	    	};
 	    		cb= new JCheckBox  (koi);
 	    	       
 	    		cb.addItemListener(itemListener1);  
 	    		if( hal.contains(koi))
	    			{
                  cb.setSelected(true);   	    		
	                  
	    			}
 	    		cb.setFont(new Font("Verdana", Font.PLAIN, 14));    
 	    		panel_4.add(cb , "cell 0 "+(i-1)+"");
			        }
			         pst.close();
			        rs.close();
			}
			catch(Exception e){
				
	}
}
	    static  public void exposeframe()
	    {
	    	frame.dispose();    	
	    }
	    public Activity_1() 
	    {
    	 
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 setExtendedState(JFrame.MAXIMIZED_BOTH);
	     Rectangle size = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	     setBounds(0, 0, screenSize.width, screenSize.height);  
		 setMinimumSize(new Dimension(700, 700));
		 setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
	     setVisible(true);
         addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) {}
			public void windowIconified(WindowEvent arg0) {}
			public void windowDeiconified(WindowEvent arg0) {}
			public void windowDeactivated(WindowEvent arg0) {}
			public void windowClosed(WindowEvent arg0) {}
			public void windowActivated(WindowEvent arg0) {}
			public void windowClosing(WindowEvent e) 
			{
				int i=JOptionPane.showConfirmDialog(null, "Save Data before closing ,Are you  want to close.");
				if(i==0)
				{
					frame.dispose();
					System.exit(0);
				}
			}	
         });
        
    	Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	setIconImage(Imgh);
    	setTitle("DentoTech");
    	
		connection=sqliteconnection.dbconnector();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit              ");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i=JOptionPane.showConfirmDialog(null, "Save Data before closing ,Are you  want to close.");
					if(i==0){
						
					frame.dispose();
					System.exit(0);
				
					}
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnTool = new JMenu("Tool");
		menuBar.add(mnTool);
		
		mntmBackup = new JMenuItem("Backup           ");
		mntmBackup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//for backup of database
				JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new java.io.File("C:\\"));
			    chooser.setDialogTitle(" Select Backup Directory");
			   
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    // disable the "All files" option.
			    chooser.setAcceptAllFileFilterUsed(false);
			    if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) { 
			    /*  System.out.println("getCurrentDirectory(): " 
			         +  chooser.getCurrentDirectory());
			      System.out.println("getSelectedFile() : " 
			         +  chooser.getSelectedFile()+"empoyeee.sqlite")	*/
			  //  Retrive installation Location	
			    	
			    Path file=Paths.get(	System.getProperty("user.dir")+"\\empoyee.sqlite");
			    
			  //  Path target=Paths.get(chooser.getSelectedFile()+"\\empoyee.sqlite");
			    Path target1=Paths.get(chooser.getSelectedFile()+"\\Backup_DentoTech");
			      Path target=Paths.get(target1+"\\empoyee.sqlite");	
			      	
			    			
			   	
			   	if(Files.exists(target,LinkOption.NOFOLLOW_LINKS))			   				
			   	{	
					 int i=JOptionPane.showConfirmDialog(null,"There is alerady have Backup at this location if you want overwrite the Backup,click yes,othervise change the directory...", "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
						if(i==0){
					
							  try {
									Formatter n=new Formatter(target1+"\\Backup_Discription.txt");
								    n.format("Last Overwrite date is "+LocalDate.now()+"." , "");
								    n.flush();
								    n.close();
							      } catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
			   		try {
			   				Files.copy(file,target,StandardCopyOption.REPLACE_EXISTING);
			   			}
			   		catch (IOException e1) {
			   				// TODO Auto-generated catch block
			   			
			   			}
			   			JOptionPane.showMessageDialog(null, "Backup sucessfully");
						}
						else{
							Backupalert();
						}
			   	}
			   	else{
			   	  
			   		try {
			   		 	Files.createDirectory(target1);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			   		try {
				   		Formatter n=new Formatter(target1+"\\Backup_Discription.txt");
						    n.format(" backup Created date is "+LocalDate.now()+"." , "");
						    n.flush();
						    n.close();
					      } catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			   		 try {
				   		   Files.copy(file,target,StandardCopyOption.COPY_ATTRIBUTES);
				   		  
				   		 } catch (IOException e1) {
				   				
				   		 }
				   			JOptionPane.showMessageDialog(null, "Backup sucessfully");
				   				
			   			}
     			    }
							

			}
		});
		
		mnTool.add(mntmBackup);
		JMenu mnRestore = new JMenu("Restore                 ");
		mnTool.add(mnRestore);
		
		JMenuItem mntmMergeBackupWith = new JMenuItem("merge Backup with running data");
		mntmMergeBackupWith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//for retriving backup of database
				JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new java.io.File("C:\\"));
			    chooser.setDialogTitle(" Select Backup_DentoTech floder");
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    // disable the "All files" option.
			    chooser.setAcceptAllFileFilterUsed(false);
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			    Path target1=Paths.get(System.getProperty("user.dir")+"\\empoyee.sqlite");
			    Path target=Paths.get(chooser.getSelectedFile()+"\\empoyee.sqlite");
			    if(!chooser.getSelectedFile().getName().equals("Backup_DentoTech")){
					JOptionPane.showMessageDialog(null, "it is not Backup folder ,choose Backup_DentoTech folder");
				}
				else if(Files.notExists(target)){
					JOptionPane.showMessageDialog(null, "your Backup folder will be missing some file");
				}
				else if(Files.exists(target1,LinkOption.NOFOLLOW_LINKS))			   				
			   	{	
					try {
						if(Files.size(target)<300968){
							JOptionPane.showMessageDialog(null, "Backup file missing or cruppeted");
									
						}
						else{
						 int i=JOptionPane.showConfirmDialog(null,"Are you sure to merge Backup. it only merge patient Records \nit will cause duplicates Record which you alerady have..make sure", "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
							if(i==0){
								Connection conn = null;
									try{
									Class.forName("org.sqlite.JDBC");
									conn =DriverManager.getConnection("jdbc:sqlite:"+chooser.getSelectedFile()+"\\empoyee.sqlite"); 
								    
									}
									catch(Exception e)
									{
										
									
									}
								int reglast=0;
								
								try{    
									
									String query="Select Regn From Record ";
								        PreparedStatement pst=connection.prepareStatement(query);
								      ResultSet rs=pst.executeQuery();

								        while(rs.next())
								        {		  
								        	reglast= rs.getInt("Regn");
								        }
								        pst.close();
								        rs.close();
								  }
								catch(Exception e){
								        }

								int lastreg=reglast;
								try{
									String query="select * from Record ";	
								PreparedStatement pst=conn.prepareStatement(query);
								ResultSet rs=pst.executeQuery();
						        while(rs.next())
						        {	
					             	try{	
					           		String query1 ="insert into Record (Regn ,name,Age,Gender,Address,city,Contact,Doctor,Date,Health,alergies) values(   ?,?,?,?,?,?,?,?,?,?,?)";
					           		PreparedStatement pst1=connection.prepareStatement(query1);
					           		pst1.setString(1,(Integer.parseInt(rs.getString("Regn"))+reglast)+"");
					           		pst1.setString(2,rs.getString("name"));
					           		pst1.setString(3, rs.getString("Age")); 
					           		pst1.setString(5, rs.getString("Address"));
					           		pst1.setString(4, rs.getString("Gender"));
					           		pst1.setString(6, rs.getString("city"));
					           		pst1.setString(7, rs.getString("Contact"));
					           		pst1.setString(8, rs.getString("Doctor"));
					           		pst1.setString(9, rs.getString("Date"));
					           		pst1.setString(10, rs.getString("Health"));
					           		pst1.setString(11, rs.getString("alergies"));
					           		pst1.execute();
					           	    pst1.close();
					           	}
						        		 catch(Exception e){
						        		 }
						            }
							    pst.close();
							    rs.close();
							   
							   }
							catch(Exception e)
							{}
							try{	String query="select * from complaints ";	
								PreparedStatement pst=conn.prepareStatement(query);
								ResultSet rs=pst.executeQuery();
						    
						        while(rs.next())
						        {	
						        	try{
						        		
						        		String query1 ="insert into complaints (comlaint,history,Regn,on_examination,work_done,prescription,rxadvised) values(?,?,?,?,?,?,?)";
						           		PreparedStatement pst1=connection.prepareStatement(query1);
						                pst1.setString(1,rs.getString("complaint"));
						                pst1.setString(2,rs.getString("history"));
						                pst1.setString(3,(Integer.parseInt(rs.getString("Regn"))+lastreg)+"");
						                pst1.setString(4,rs.getString("on_examination"));
						                pst1.setString(5,rs.getString("work_done"));
						                pst1.setString(6,rs.getString("prescription"));
						                pst1.setString(7,rs.getString("rxadvised"));
						        		pst1.execute();
						        		pst1.close();
						                        	
						        	}
						        		 catch(Exception e){
						        			// e.printStackTrace();
						        		 
						        		 }
						        	                	 
						            }

							    pst.close();
							    rs.close();
							   
							   }
							catch(Exception e)
							{e.printStackTrace();
						   			
							}


								try{
						   		   JOptionPane.showMessageDialog(null, "Merge at "+Files.getLastModifiedTime(target)+" sucessfully");
						   		   frame.dispose();
						   		   Activity_1.main(null);
						   		   		}
						   		   		catch(Exception e11){
						   		   			e11.printStackTrace();
						   		   		}

						}
							}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			   	}
			  
			  }
			    }
		});
		mnRestore.add(mntmMergeBackupWith);
		
		JMenuItem mntmRestoreBackup = new JMenuItem("Restore Backup");
		mntmRestoreBackup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//for retriving backup of database
				JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new java.io.File("C:\\"));
			    chooser.setDialogTitle(" Select Backup_DentoTech floder");
			   
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    // disable the "All files" option.
			    chooser.setAcceptAllFileFilterUsed(false);
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
			    Path target1=Paths.get(System.getProperty("user.dir")+"\\empoyee.sqlite");
			    Path target=Paths.get(chooser.getSelectedFile()+"\\empoyee.sqlite");
			  if(!chooser.getSelectedFile().getName().equals("Backup_DentoTech")){
					JOptionPane.showMessageDialog(null, "it is not Backup folder ,choose Backup_DentoTech folder");
				}
				else if(Files.notExists(target)){
					JOptionPane.showMessageDialog(null, "your Backup folder will be missing some file");
				}
				else if(Files.exists(target1,LinkOption.NOFOLLOW_LINKS))			   				
			   	{	
					try {
						if(Files.size(target)<500968){
							JOptionPane.showMessageDialog(null, "Backup file missing or cruppeted");
									
						}
						else{
						 int i=JOptionPane.showConfirmDialog(null,"Are you sure to restore at Backup this will cause your current data lost ", "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
							if(i==0){
								try {
										connection.close();
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									
								}
						   		try {
						   			   Files.copy(target,target1,StandardCopyOption.REPLACE_EXISTING);
						   			}
						   		catch (IOException e1) {
						   				// TODO Auto-generated catch block
						   				JOptionPane.showMessageDialog(null, e1);
						   				
						   			}
						   		   		try{
						   		   JOptionPane.showMessageDialog(null, "Restore at "+Files.getLastModifiedTime(target)+" sucessfully");
						   		   frame.dispose();
						   		   Activity_1.main(null);
						   		   		}
						   		   		catch(Exception e11){
						   		   			
						   		   		}

						}
							}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			   	}
			    }				
			}
		});

		mnRestore.add(mntmRestoreBackup);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		setContentPane(contentPane);
		
		JMenu mnBalance = new JMenu("Balance Sheet");
		menuBar.add(mnBalance);
		
		mntmBalance = new JMenuItem("Sheet           ");
		mntmBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				BalanceSheet.main(null);
			}
		});
		mnBalance.add(mntmBalance);
		
		textField = new JTextField();
		textField.setBounds(176, 79, 231, 32);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				DefaultTableModel m=(DefaultTableModel) list.getModel();
				String search=textField.getText().toString();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(m);
				list.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
	             	
				}
			   
		   });
		contentPane.setLayout(null);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quick Search :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(14, 76, 157, 34);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
	    tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	    tabbedPane.setBounds(442, 0, 864, 656);
	    
		tabbedPane.setFont(new Font("Verdana", Font.PLAIN, 17));
		contentPane.add(tabbedPane);
		
		 panel = new JPanel();
		 tabbedPane.addTab("                   General              ", null, panel, null);
		 panel.setLayout(null);
	                                       
	                    		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("                    Visits                        ", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(7, 3, 843, 580);
		tabbedPane_1.setFont(new Font("Kartika", Font.BOLD, 16));
		panel_1.add(tabbedPane_1);
		
		image_panel = new JPanel();
		tabbedPane_1.addTab("X-Ray Image", null, image_panel, null);
		image_panel.setLayout(null);
		
		getting_xray = new JTextField();
		getting_xray.setColumns(10);
		getting_xray.setBounds(10, 11, 557, 26);
		image_panel.add(getting_xray);
		
		JButton browse_button = new JButton("Browse image of X-Ray");
		
		browse_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser chooser = new JFileChooser();
			    chooser.setDialogTitle(" Select Picture");
			    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			    chooser.setAcceptAllFileFilterUsed(false);
			    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
			    { 
					    getting_xray.setText(chooser.getSelectedFile()+"");
					    File file=chooser.getSelectedFile();
					    try
					    {
					    	xray_label.setIcon(new ImageIcon(ImageIO.read(file).getScaledInstance(xray_label.getWidth(), xray_label.getHeight(), Image.SCALE_SMOOTH)));
						} catch (Exception e1) {e1.printStackTrace();}
				       
				}
					
			
			}
		});
		browse_button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		browse_button.setBounds(10, 355, 190, 38);
		image_panel.add(browse_button);
		
		
		JButton btnSaveImage = new JButton("Save Image");
		btnSaveImage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSaveImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				try
				{
					File f=new File(getting_xray.getText());
					
					/*b=new byte[fileInputStream.available()];
		   			fileInputStream.read(b);
		   			fileInputStream.close();*/
		   			
              		day=cal.get(Calendar.DAY_OF_MONTH);
    			   	month=cal.get(Calendar.MONTH)+1;
    			   	year=cal.get(Calendar.YEAR);
    			   	
    			   	Object rows []=new Object[2];
    			    rows[0]=f.getAbsoluteFile();
    				rows[1]=f.getName();
					DefaultTableModel model = (DefaultTableModel) table_image.getModel();
					sixthcount=table_image.getRowCount();
				         		
                    model.addRow(rows);
                    table_image.getSelectionModel().setSelectionInterval(sixthcount, sixthcount);
                    table_image.scrollRectToVisible(new Rectangle(table.getCellRect(sixthcount, 0, true)));
                    if(sixthcount>0)
                    {
                    	btnNewButton_2.setEnabled(true);
                    }
		   			xray_label.setIcon(null);
		   			getting_xray.setText("");
				} catch (Exception e1) { e1.printStackTrace(); }
           	}
		});
		btnSaveImage.setBounds(222, 355, 166, 38);
		image_panel.add(btnSaveImage);
		
		JButton btnCancelImage = new JButton("Cancel");
		btnCancelImage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				xray_label.setIcon(null);
       			getting_xray.setText("");
			}
		});
		btnCancelImage.setBounds(409, 355, 156, 38);
		image_panel.add(btnCancelImage);
		
		scrollPane_19 = new JScrollPane();
		scrollPane_19.setBounds(10, 48, 557, 291);
		image_panel.add(scrollPane_19);
		
		xray_label = new JLabel("");
		scrollPane_19.setViewportView(xray_label);
		xray_label.setOpaque(true);
		xray_label.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		xray_label.setBackground(Color.LIGHT_GRAY);
		
		scrollPane_21 = new JScrollPane();
		scrollPane_21.setBounds(600, 48, 215, 458);
		image_panel.add(scrollPane_21);
		
		image_list = new JList();
		image_list.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent avt)
		 	{
		 		int row=image_list.getSelectedIndex();
		 		if(image_list.getSelectedIndex()!=-1){
		 		String Name_= (image_list.getModel().getElementAt(row)).toString();
		 		list_2.setSelectedValue(Name_, true);
		 		list_5.setSelectedValue(Name_, true);
		 		list_6.setSelectedValue(Name_, true);
		 		list_8.setSelectedValue(Name_, true);
		 		list_11.setSelectedValue(Name_, true);
		 		showhistory();
		 		}
		 	}
		 });
		scrollPane_21.setViewportView(image_list);
		
		JLabel lblLoadedImage = new JLabel("History Visits");
		lblLoadedImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoadedImage.setForeground(new Color(255, 255, 255));
		lblLoadedImage.setOpaque(true);
		lblLoadedImage.setBackground(new Color(147, 112, 219));
		lblLoadedImage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLoadedImage.setBounds(639, 11, 131, 32);
		image_panel.add(lblLoadedImage);
		
		scrollPane_20 = new JScrollPane();
		scrollPane_20.setBounds(10, 403, 583, 103);
		image_panel.add(scrollPane_20);
		
		table_image = new JTable();
		scrollPane_20.setViewportView(table_image);
		table_image.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_image.setDragEnabled(false);
		
		table_image.setModel(new DefaultTableModel
		(
			new Object[][] {},
			new String[] {"Image"}
		));
		
		table_image.addMouseListener(new MouseAdapter() {
			@Override                                        
			public void mouseClicked(MouseEvent arg0) 
			{
				/*int row=table_image.getSelectedRow();
				JOptionPane.showMessageDialog(null, row);
				String info; 
				info= table_image.getValueAt(row, 0).toString();
				byte[] bytes=info.getBytes();
				JOptionPane.showMessageDialog(null, bytes);
	        	ImageIcon imageIcon = new ImageIcon(bytes);
	        	xray_label.setIcon(new ImageIcon(imageIcon.getScaledInstance(xray_label.getWidth(), xray_label.getHeight(), Image.SCALE_SMOOTH)));
	        	xray_label.setIcon(imageIcon);*/
	        	
				/*ByteArrayInputStream in = new ByteArrayInputStream(bytes);
				JOptionPane.showMessageDialog(null, in);
				
				
				File img=null;
				try {
					img = ImageIO.read(in);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	Image dimg = img.getScaledInstance(xray_label.getWidth(), xray_label.getHeight(),Image.SCALE_SMOOTH);
	        	ImageIcon imageIcon = new ImageIcon(dimg);
	        	xray_label.setIcon(new ImageIcon(ImageIO.read(img).getScaledInstance(xray_label.getWidth(), xray_label.getHeight(), Image.SCALE_SMOOTH)));
	        	xray_label.setIcon(imageIcon);*/
			}
		});
		
		final JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("   Complaints", null, panel_7, null);
		panel_7.setLayout(null);
		
		lblJdkfj = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/mm.PNG")).getImage();
		
		
		lblJdkfj.setIcon(new ImageIcon(img1));
		lblJdkfj.setBounds(5, 5, 592, 396);
		panel_7.add(lblJdkfj,"wrap,pushx,growx");
		lblJdkfj.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				day=cal.get(Calendar.DAY_OF_MONTH);
			   	month=cal.get(Calendar.MONTH)+1;
			   	year=cal.get(Calendar.YEAR);
					if(!list_1.isSelectionEmpty()&list_1.isEnabled())
					{
						btnNewButton_2.setEnabled(true);
						
						int j=0;
						int row=list_1.getSelectedIndex();
		   		   
						String Name_= (list_1.getModel().getElementAt(row)).toString(); 
	  			

						if(e.getX()>=26&e.getX()<=306)
						{
							int x=26;
			                int z=x+45;
				            if(e.getY()>=35&e.getY()<=200)
				            {
				            	String[] data=new String[5];						
			                    for(int i=18;i>10;i--)
			                    {
			                    	if(e.getX()>=x&e.getX()<=z&e.getY()>=35&e.getY()<200)	
			                    	{
			                    		firstcount= table.getRowCount();
                                        if(i<=15&e.getY()<107)
                                        {
                                        	data[0]=""+(firstcount+1);
		                                    if(i==15)
		                                    data[1]="1E";
		                                    if(i==14)
			                                data[1]="1D";
		                                    if(i==13)
			                                data[1]="1C";
		                                    if(i==12)
			                                data[1]="1B";
		                                    if(i==11)
			                                data[1]="1A";
		                                    data[2]=Name_;
		                                    data[3]=day+"/"+month+"/"+year;
		                                    data[4]="";
                                        }   
                                        else
                                        {
                                        	    data[0]=""+(firstcount+1);
		                                        data[1]=""+i;
		                                        data[2]=Name_;
		                                        data[3]=day+"/"+month+"/"+year;
		                                        data[4]="";
		                                       
                                        }      

			                            DefaultTableModel model = (DefaultTableModel) table.getModel();
                                        model.addRow(data);
                                        table.getSelectionModel().setSelectionInterval(firstcount, firstcount);
                                        table.scrollRectToVisible(new Rectangle(table.getCellRect(firstcount, 0, true)));
                                        break;
			                    	}
			                        if(i>=14)
			                        {
			                        	x+=40;
			                            z=x+40;
			                        }
			                        if(i==13)
			                        {
			                        	x+=30;
			                            z=x+30;
									}
			                        if(i<13)
			                        {
			                        	x+=26;
			                            z=x+26;
									}
			                                  
			                    }
			            }
				
				
				if(e.getY()>=201&e.getY()<=365)
				{
					
					String []data=new String[5];
						for(int i=48;i>40;i--)
						{
							if(e.getX()>=x&e.getX()<=z&e.getY()>=201&e.getY()<365)	{
								
								firstcount= table.getRowCount();
                          	  
								if(i<=45&e.getY()>295){
                              	  
									  
                                    data[0]=""+(firstcount+1);
                                    if(i==45)
                                    data[1]="4E";
                                    if(i==44)
                                        data[1]="4D";
                                    if(i==43)
                                        data[1]="4C";
                                    if(i==42)
                                        data[1]="4B";
                                    if(i==41)
                                        data[1]="4A";
                            
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                   }
                              else{
                            	    data[0]=""+(firstcount+1);
                                    data[1]=""+i;
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                   
                              }      
                
                                     

                                     DefaultTableModel model = (DefaultTableModel) table.getModel();

                                     model.addRow(data);
                                     table.getSelectionModel().setSelectionInterval(firstcount, firstcount);
                                     table.scrollRectToVisible(new Rectangle(table.getCellRect(firstcount, 0, true)));
                                    
								
								break;
							}
							if(i>=44){
						  
								x+=40;
								z=x+40;
							}
					 
							if(i==43){
							x+=30;
							z=x+30;
									
							}
							if(i<43){
							x+=26;
							z=x+26;
									
							}

					 }
			}
	}
				
			
			if(e.getX()>=307&e.getX()<=580){
				int x=580;
			    int z=x-40;
				if(e.getY()>=35&e.getY()<=200){

					String [] data=new String[5];
			 for(int i=28;i>20;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=35&e.getY()<200)	{
				
						  firstcount= table.getRowCount();
                    	  
						  if(i<=25&e.getY()<107){
                        	  
							  
                              data[0]=""+(firstcount+1);
                              if(i==25)
                              data[1]="2E";
                              if(i==24)
                                  data[1]="2D";
                              if(i==23)
                                  data[1]="2C";
                              if(i==22)
                                  data[1]="2B";
                              if(i==21)
                                  data[1]="2A";
                      
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             }
                        else{
                      	    data[0]=""+(firstcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             
                        }      
        
                             

                             DefaultTableModel model = (DefaultTableModel) table.getModel();

                             model.addRow(data);

                             table.getSelectionModel().setSelectionInterval(firstcount, firstcount);
                             table.scrollRectToVisible(new Rectangle(table.getCellRect(firstcount, 0, true)));
                            
						  //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			
						  break;
		      }
					  if(i>=24){
						  
							x-=38;
							z=x-38;
						}
					 
						if(i==23){
							x-=28;
							z=x-28;
									
						}
						if(i<23){
							x-=25;
							z=x-25
									;
						}

			}
			 }
				
				
				if(e.getY()>=201&e.getY()<=365){
					
			 for(int i=38;i>30;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=201&e.getY()<365)	{
						  String [] data=new String[5];
						  firstcount= table.getRowCount();
                    	  
						  if(i<=35&e.getY()>295){
                        	  
							  
                              data[0]=""+(firstcount+1);
                              if(i==35)
                              data[1]="3E";
                              if(i==34)
                                  data[1]="3D";
                              if(i==33)
                                  data[1]="3C";
                              if(i==32)
                                  data[1]="3B";
                              if(i==31)
                                  data[1]="3A";
                       
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             }
                        else{
                      	    data[0]=""+(firstcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             
                        }      

                            
                             

                             DefaultTableModel model = (DefaultTableModel) table.getModel();

                             model.addRow(data);
                             table.getSelectionModel().setSelectionInterval(firstcount, firstcount);
                             table.scrollRectToVisible(new Rectangle(table.getCellRect(firstcount, 0, true)));
                            
				//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
				break;
		      }
					  if(i>=35){
						  
							x-=40;
							z=x-30;
						}
					 
						if(i==34){
							x-=30;
							z=x-30;
									
						}
						if(i<34){
							x-=26;
							z=x-26;
						}

			}}
				
			}	}

         
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(5, 408, 823, 111);
		panel_7.add(scrollPane_1);
		
		table = new JTable();
		table.setUpdateSelectionOnSort(true);
		table.setToolTipText("Right clik for edit and Delete Selected  a cell");
	 	
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int row=table.getSelectedRow();
			}
		});
		
		popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
	  
		
		mntmEdit = new JMenuItem("Edit");
		popupMenu.add(mntmEdit);
		mntmEdit.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String info[]=new String[100]; 
				info[0]=table.getValueAt(table.getSelectedRow(), 0).toString();
				info[1]= (String) table.getValueAt(table.getSelectedRow(), 1);
				info[2]= (String) table.getValueAt(table.getSelectedRow(), 4);
				edittables.main(info); 
				btnNewButton_2.setEnabled(true);
			}
		});
		
		mntmNewMenuItem = new JMenuItem("Delete");
		popupMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int row=table.getSelectedRow();
    	          model.removeRow(row);
    	          for(int i=0;i<table.getRowCount();i++){
  			
                  table.setValueAt(i+1, i, 0); 
  					     					
  				}	
              table.setModel(model);
              btnNewButton_2.setEnabled(true);
			}
		});
		
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setDragEnabled(false);
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Sr.No", "Teeth.No", "Complaints", "Date", "Comments"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(43);
		table.getColumnModel().getColumn(0).setMinWidth(42);
		table.getColumnModel().getColumn(0).setMaxWidth(43);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setMinWidth(99);
		table.getColumnModel().getColumn(1).setMaxWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(160);
		table.getColumnModel().getColumn(2).setMinWidth(159);
		table.getColumnModel().getColumn(2).setMaxWidth(160);
		table.getColumnModel().getColumn(3).setMinWidth(75);
		table.getColumnModel().getColumn(3).setMaxWidth(75);
	

		
	    CellEditorListener ChangeNotification = new CellEditorListener() {
        public void editingCanceled(ChangeEvent e) {
            System.out.println("The user canceled editing.");
        }

        public void editingStopped(ChangeEvent e) {
            System.out.println("The user stopped editing successfully.");
        }
    };
    

		
		panel_8 = new JPanel();
		panel_8.setVisible(false);
		
		panel_9 = new JPanel();
		panel_9.setBounds(605, 5, 229, 396);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 35, 217, 361);
		panel_9.add(scrollPane_2);
		
		list_2 = new JList();
		list_2.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent avt)
		 	{
		 		int row=list_2.getSelectedIndex();
		 		if(list_2.getSelectedIndex()!=-1){
		 		String Name_= (list_2.getModel().getElementAt(row)).toString();
		 		list_5.setSelectedValue(Name_, true);
		 		list_6.setSelectedValue(Name_, true);
		 		list_8.setSelectedValue(Name_, true);
		 		list_11.setSelectedValue(Name_, true);
		 		image_list.setSelectedValue(Name_, true);
		 		showhistory();
		 		}
		 	}
		 });
		scrollPane_2.setViewportView(list_2);
		
		chlabel = new JLabel("");
		chlabel.setBounds(12, 7, 205, 17);
		panel_9.add(chlabel);
		
		panel_8.setBounds(605, 5, 232, 396);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 90, 211, 306);
		panel_8.add(scrollPane_3);
        int allcomplaintno=0;
        try{
	       	     String query="Select *  From complaint ";
			     PreparedStatement pst=connection.prepareStatement(query);
			     ResultSet rs=pst.executeQuery();
	             while(rs.next())
	             {
	             	allcomplaintno=allcomplaintno+1;	 
	             }
           
	            rs.close();
	            ResultSet rs1=pst.executeQuery();
	            String allcomplaint[]=new String[allcomplaintno];
	            allcomplaintno=0;
	            while(rs.next())
	            {
	            	allcomplaint[allcomplaintno]=rs.getString("comlaint");
	           		allcomplaintno=allcomplaintno+1;
	            }
	            list_1 = new JList(allcomplaint);
	            pst.close();
	            rs.close();
        }
        catch(Exception e)
        {
			
        }
		 
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) 
			{
				list_1 = (JList)evt.getSource();
		        if (evt.getClickCount() == 2) 
		        {
		              	if(list_1.isEnabled())
		              	{
		        
		              		int row=list_1.getSelectedIndex();
				   		   
		             		String Name_= (list_1.getModel().getElementAt(row)).toString(); 
		              		listlabel.setText(Name_);
		              		
		              		String[] data=new String[5];
		              		day=cal.get(Calendar.DAY_OF_MONTH);
		    			   	month=cal.get(Calendar.MONTH)+1;
		    			   	year=cal.get(Calendar.YEAR);
							
							DefaultTableModel model = (DefaultTableModel) table.getModel();
							firstcount=table.getRowCount();
							data[0]=""+(firstcount+1);
                            data[1]="All Teeth";
                            data[2]=Name_;
                            data[3]=day+"/"+month+"/"+year;
                            data[4]="";
		              		
		              		
		              		
                            model.addRow(data);
                            table.getSelectionModel().setSelectionInterval(firstcount, firstcount);
                            table.scrollRectToVisible(new Rectangle(table.getCellRect(firstcount, 0, true)));
                            	
                            if(!list_1.isSelectionEmpty()&list_1.isEnabled())
            	    		{
            					btnNewButton_2.setEnabled(true);
            	    		}
		              		
						}
		        }
		        else
		        {
		        		if(list_1.isEnabled())
		        		{
							Cursor hr = new Cursor(Cursor.CROSSHAIR_CURSOR);
							lblJdkfj.setCursor(hr);
							int row=list_1.getSelectedIndex();
		   		   
							String Name_= (list_1.getModel().getElementAt(row)).toString(); 
							listlabel.setText(Name_);
						}
				}
			}
		});
		scrollPane_3.setViewportView(list_1);
		list_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			
	    listlabel = new JLabel("");
	    listlabel.setBounds(10, 0, 210, 26);
	    panel_8.add(listlabel);
	    listlabel.setFont(new Font("Kartika", Font.BOLD, 15));
	    
	    complaint_search = new JTextField();
	    complaint_search.setColumns(10);
	    complaint_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				if(complaint_search.getText().equals(null)||complaint_search.getText().equals(""))
				{
					try
					{
		            	DefaultListModel DLM=new DefaultListModel();
						String query="select * from   complaint ;";
						PreparedStatement pst=connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				
						while(rs.next())
						{
					      DLM.addElement(rs.getString("comlaint"));
					      list_1.setModel(DLM);
				        }
					      list_1.setModel(DLM);
					      pst.close();
						  rs.close();
					}
					
					catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					 }		 						
						
				}
				else
				{
				
					try{
	    	            int i=0;
	    	        	     try
	    	        	     {    
	    	        			
	    	        			    String query="Select * From complaint ";
	    	        		        PreparedStatement pst=connection.prepareStatement(query);
	    	        		        ResultSet rs=pst.executeQuery();

	    	        		        while(rs.next())
	    	        		        {		  
	    	        		        	i=i+1;;
	    	        		        }
	    	        		      
	    	        		        pst.close();
	    	        		        rs.close();
	    	        		       }
	                              catch(Exception e){
	                    	          JOptionPane.showMessageDialog(null, e);
	                          }
	    	        	 
	    	        	      DefaultListModel DLM=new DefaultListModel();
				      
	    	        	      String query="select * from   complaint ;";
	    	        	      PreparedStatement pst=connection.prepareStatement(query);
	    	        	      ResultSet rs=pst.executeQuery();
	           
	            
	    	        	      String next[]=new String[i];
	    	        	      i=0;  
	    	        	      while(rs.next())
	    	        	      {	 
	    	        	    	  next[i]=rs.getString("comlaint");
	    	        	    	  if(rs.getString("comlaint").contains(complaint_search.getText()))
	    	        	    	  {
	    	        	    	  DLM.addElement(next[i]);
	    	        	    	  i=i+1;
	    	        	    	  }
	    	        	      }
				        
	    	        	      list_1.setModel(DLM);
				        
				        pst.close();
				        rs.close();

			        }
	    	
			      catch(Exception e){
				           JOptionPane.showMessageDialog(null, e);
				           e.printStackTrace();
			            }
	             	
				}
			   }
		   });
	    complaint_search.setBounds(12, 63, 150, 27);
	    panel_8.add(complaint_search);
	    
	    label = new JLabel("Search complaint below");
	    label.setHorizontalAlignment(SwingConstants.CENTER);
	    label.setBounds(12, 37, 150, 27);
	    panel_8.add(label);
	    
	    JButton addComplaints = new JButton("New button");
	    addComplaints.setBounds(172, 53, 50, 37);
	    Image imgplus=new ImageIcon(this.getClass().getResource("/plus.png")).getImage();
		addComplaints.setIcon(new ImageIcon(imgplus));
		addComplaints.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String k[]={};
	     		CustomComplaints.main(k);
	     		int i=0;
	     		DefaultListModel dm=new DefaultListModel();
	     		try{
	     			 connection=DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
		       	     String query="Select *  From complaint ";
				     PreparedStatement pst=connection.prepareStatement(query);
				     ResultSet rs=pst.executeQuery();
		             
		     			while (rs.next())
		     			{
		     				dm.addElement(rs.getString("comlaint"));
		     			}
		     			
		     				list_1.setModel(dm);
	           
		            /*rs.close();
		            ResultSet rs1=pst.executeQuery();
		            String allcomplaint[]=new String[i];
		            i=0;
		            while(rs.next())
		            {
		            	allcomplaint[i]=rs.getString("comlaint");
		           		i=i+1;
		            }*/
		            
		            pst.close();
		            rs.close();
	        }
	        catch(Exception ei)
	        {
				JOptionPane.showMessageDialog(null, ei);
	        }
	     		
			}
			
		});
		
	    panel_8.add(addComplaints);
	    
	    JPanel panel_10 = new JPanel();
	    tabbedPane_1.addTab(" On Examination", null, panel_10, null);
	    
	    label_1 = new JLabel("");
	    label_1.addMouseListener(new MouseAdapter() {
	    	   	
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		day=cal.get(Calendar.DAY_OF_MONTH);
			   	month=cal.get(Calendar.MONTH)+1;
			   	year=cal.get(Calendar.YEAR);
	    		if(!list_3.isSelectionEmpty()&list_3.isEnabled())
	    		{
					btnNewButton_2.setEnabled(true);
		
				int j=0;
				int row=list_3.getSelectedIndex();
		   		   
	  			String Name_= (list_3.getModel().getElementAt(row)).toString();
	  			
	  			
				if(e.getX()>=26&e.getX()<=306){
					
				               int x=26;
			                   int z=x+45;
				            if(e.getY()>=35&e.getY()<=200)
				            {
						String data[]=new String[6];
			                                  for(int i=18;i>10;i--)
			                                  {
			                                	  if(e.getX()>=x&e.getX()<=z&e.getY()>=35&e.getY()<200)	{
			    
			                                		  
			                
			                                		  secondcount= table_1.getRowCount();
			                                	  
			                                          if(i<=15&e.getY()<107){
					                                	  
					                                        data[0]=""+(secondcount+1);
					                                        if(i==15)
					                                        data[1]="1E";
					                                        if(i==14)
						                                        data[1]="1D";
					                                        if(i==13)
						                                        data[1]="1C";
					                                        if(i==12)
						                                        data[1]="1B";
					                                        if(i==11)
						                                        data[1]="1A";
					                                      
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                        data[5]="";
					                                       }
			                                          else{
			                                        	    data[0]=""+(secondcount+1);
					                                        data[1]=""+i;
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                       data[5]="";
			                                          }      
   
			                                         

			                                         DefaultTableModel model = (DefaultTableModel) table_1.getModel();

			                                         model.addRow(data);

			                                         //table.getSelectionModel().setSelectionInterval(k, k);
			                                         table.scrollRectToVisible(new Rectangle(table_1.getCellRect(secondcount, 0, true)));
			                                         //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			                                		  break;
			                                		  
			                                	  }
			                                	  if(i>=14){
						  
			                                		  x+=40;
			                                		  z=x+40;
			                                	  }
					 
			                                	  if(i==13){
			                                		  x+=30;
			                                		  z=x+30;
									
			                                	  }
			                                	  if(i<13){
			                                		  x+=26;
			                                		  z=x+26;
									
			                                	  }

			                                 }
			            }
				
				
				if(e.getY()>=201&e.getY()<=365)
				{
					String data[]=new String[6];
						for(int i=48;i>40;i--)
						{
							if(e.getX()>=x&e.getX()<=z&e.getY()>=201&e.getY()<365)	{
								
								secondcount= table_1.getRowCount();
                          	  
			                    if(i<=45&e.getY()>295){
                              	  
                                    data[0]=""+(secondcount+1);
                                    if(i==45)
                                    data[1]="4E";
                                    if(i==44)
                                        data[1]="4D";
                                    if(i==43)
                                        data[1]="4C";
                                    if(i==42)
                                        data[1]="4B";
                                    if(i==41)
                                        data[1]="4A";
                                  
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                    data[5]="";
                                   }
                              else{
                            	    data[0]=""+(secondcount+1);
                                    data[1]=""+i;
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                   data[5]="";
                              }      
   

                                     DefaultTableModel model = (DefaultTableModel) table_1.getModel();

                                     model.addRow(data);
                                     table_1.getSelectionModel().setSelectionInterval(secondcount, secondcount);
                                     table_1.scrollRectToVisible(new Rectangle(table_1.getCellRect(secondcount, 0, true)));
                                    
								//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
								break;
							}
							if(i>=44){
						  
								x+=40;
								z=x+40;
							}
					 
							if(i==43){
							x+=30;
							z=x+30;
									
							}
							if(i<43){
							x+=26;
							z=x+26;
									
							}

					 }
			}
	}
				
			
			if(e.getX()>=307&e.getX()<=580){
				int x=580;
			    int z=x-40;
				if(e.getY()>=35&e.getY()<=200){
			String data[]=new String[6];			
			 for(int i=28;i>20;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=35&e.getY()<200)	{
				
						  secondcount= table_1.getRowCount();
                    	  
		                    if(i<=25&e.getY()<107){
                            	  
                                data[0]=""+(secondcount+1);
                                if(i==25)
                                data[1]="2E";
                                if(i==24)
                                    data[1]="2D";
                                if(i==23)
                                    data[1]="2C";
                                if(i==22)
                                    data[1]="2B";
                                if(i==21)
                                    data[1]="2A";
                              
                                data[2]=Name_;
                                data[3]=day+"/"+month+"/"+year;
                                data[4]="";
                                data[5]="";
                               }
                          else{
                        	    data[0]=""+(secondcount+1);
                                data[1]=""+i;
                                data[2]=Name_;
                                data[3]=day+"/"+month+"/"+year;
                                data[4]="";
                               data[5]="";
                          }      
                           
                             

                             DefaultTableModel model = (DefaultTableModel) table_1.getModel();

                             model.addRow(data);

                             table_1.getSelectionModel().setSelectionInterval(secondcount, secondcount);
                             table_1.scrollRectToVisible(new Rectangle(table_1.getCellRect(secondcount, 0, true)));
                            
						  //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			
						  break;
		      }
					  if(i>=24){
						  
							x-=38;
							z=x-38;
						}
					 
						if(i==23){
							x-=28;
							z=x-28;
									
						}
						if(i<23){
							x-=25;
							z=x-25
									;
						}

			}
			 }
				
				
				if(e.getY()>=201&e.getY()<=365){
					String data[]=new String[6];
			 for(int i=38;i>30;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=201&e.getY()<365)	{
						  
						  secondcount= table_1.getRowCount();
                    	  
		                    if(i<=35&e.getY()>295){
                            	  
                                data[0]=""+(secondcount+1);
                                if(i==35)
                                data[1]="3E";
                                if(i==34)
                                    data[1]="3D";
                                if(i==33)
                                    data[1]="3C";
                                if(i==32)
                                    data[1]="3B";
                                if(i==31)
                                    data[1]="3A";
                              
                                data[2]=Name_;
                                data[3]=day+"/"+month+"/"+year;
                                data[4]="";
                                data[5]="";
                               }
                          else{
                        	    data[0]=""+(secondcount+1);
                                data[1]=""+i;
                                data[2]=Name_;
                                data[3]=day+"/"+month+"/"+year;
                                data[4]="";
                               data[5]="";
                          }      

                             

                             DefaultTableModel model = (DefaultTableModel) table_1.getModel();

                             model.addRow(data);
                             table_1.getSelectionModel().setSelectionInterval(secondcount, secondcount);
                             table_1.scrollRectToVisible(new Rectangle(table_1.getCellRect(secondcount, 0, true)));
                            
				//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
				break;
		      }
					  if(i>=35){
						  
							x-=40;
							z=x-30;
						}
					 
						if(i==34){
							x-=30;
							z=x-30;
									
						}
						if(i<34){
							x-=26;
							z=x-26
							;
						}

			}}
				
			}	}

         
			}

	    	
	    });
	    
	    label_1.setIcon(new ImageIcon(img1));
	    
	    panel_16 = new JPanel();
	    panel_16.setVisible(false);
	    panel_16.setLayout(null);
	    
	    scrollPane_9 = new JScrollPane();
	    scrollPane_9.setBounds(12, 34, 217, 362);
	    panel_16.add(scrollPane_9);
	    
	    list_5 = new JList();
	    list_5.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent arg0) {
	     		
		 		int row=list_5.getSelectedIndex();
		 		String Name_= (list_5.getModel().getElementAt(row)).toString();
		 		list_2.setSelectedValue(Name_, true);
		 		list_8.setSelectedValue(Name_, true);
		 		list_6.setSelectedValue(Name_, true);
		 		list_11.setSelectedValue(Name_, true);
		 		image_list.setSelectedValue(Name_, true);
		 		showhistory();
	     	}
	     			         	
	     });
	    scrollPane_9.setViewportView(list_5);
	    
	    label_4 = new JLabel("");
	    label_4.setBounds(12, 5, 217, 25);
	    panel_16.add(label_4);
	    
	    panel_14 = new JPanel();
	    panel_14.setLayout(null);
	    
	    JScrollPane scrollPane_4 = new JScrollPane();
	    scrollPane_4.setBounds(12, 90, 211, 306);
	    panel_14.add(scrollPane_4);
	    
	    onexam_search = new JTextField();
	    onexam_search.setColumns(10);
	    onexam_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				if(onexam_search.getText().equals(null)||onexam_search.getText().equals(""))
				{
					try
					{
		            	DefaultListModel DLM=new DefaultListModel();
						String query="select * from   on_examination ;";
						PreparedStatement pst=connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				
						while(rs.next())
						{
					      DLM.addElement(rs.getString("examination"));
					      list_3.setModel(DLM);
				        }
					      list_3.setModel(DLM);
					      pst.close();
						  rs.close();
					}
					
					catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					 }		 						
						
				}
				else
				{
				
					try{
	    	            int i=0;
	    	        	     try
	    	        	     {    
	    	        			
	    	        			    String query="Select * From on_examination ";
	    	        		        PreparedStatement pst=connection.prepareStatement(query);
	    	        		        ResultSet rs=pst.executeQuery();

	    	        		        while(rs.next())
	    	        		        {		  
	    	        		        	i=i+1;;
	    	        		        }
	    	        		      
	    	        		        pst.close();
	    	        		        rs.close();
	    	        		       }
	                              catch(Exception e){
	                    	          JOptionPane.showMessageDialog(null, e);
	                          }
	    	        	 
	    	        	      DefaultListModel DLM=new DefaultListModel();
				      
	    	        	      String query="select * from   on_examination ;";
	    	        	      PreparedStatement pst=connection.prepareStatement(query);
	    	        	      ResultSet rs=pst.executeQuery();
	           
	            
	    	        	      String next[]=new String[i];
	    	        	      i=0;  
	    	        	      while(rs.next())
	    	        	      {	 
	    	        	    	  next[i]=rs.getString("examination");
	    	        	    	  if(rs.getString("examination").contains(onexam_search.getText()))
	    	        	    	  {
	    	        	    	  DLM.addElement(next[i]);
	    	        	    	  i=i+1;
	    	        	    	  }
	    	        	      }
				        
	    	        	      list_3.setModel(DLM);
				        
				        pst.close();
				        rs.close();

			        }
	    	
			      catch(Exception e){
				           JOptionPane.showMessageDialog(null, e);
				           e.printStackTrace();
			            }
	             	
				}
			   }
		   });
	    onexam_search.setBounds(12, 63, 150, 27);
	    panel_14.add(onexam_search);
	    
	    onexam_searchlabel = new JLabel("Search Examination below");
	    onexam_searchlabel.setHorizontalAlignment(SwingConstants.CENTER);
	    onexam_searchlabel.setBounds(12, 37, 150, 27);
	    panel_14.add(onexam_searchlabel);
	    
	    JButton addOnExam = new JButton("New button");
	    addOnExam.setBounds(172, 53, 50, 37);
	    Image imgplus1=new ImageIcon(this.getClass().getResource("/plus.png")).getImage();
	    addOnExam.setIcon(new ImageIcon(imgplus1));
	    addOnExam.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String k[]={};
	     		CustomOnExam.main(k);
	     		int i=0;
	     		DefaultListModel dm=new DefaultListModel();
	     		try{
	     			 connection=DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
		       	     String query="Select *  From on_examination ";
				     PreparedStatement pst=connection.prepareStatement(query);
				     ResultSet rs=pst.executeQuery();
		             
		     			while (rs.next())
		     			{
		     				dm.addElement(rs.getString("examination"));
		     			}
		     			
		     			list_3.setModel(dm);
	           		            
		            pst.close();
		            rs.close();
	        }
	        catch(Exception ei)
	        {
				JOptionPane.showMessageDialog(null, ei);
	        }
	     		
			}
			
		});
		
	    panel_14.add(addOnExam);
	    int allexaminationno=0;
        try{
       	      String query="Select *  From on_examination ";
		      PreparedStatement pst=connection.prepareStatement(query);
		      ResultSet rs=pst.executeQuery();
              while(rs.next())
              {
            	  allexaminationno=allexaminationno+1;	 
    	      }
           
              rs.close();
              ResultSet rs1=pst.executeQuery();
              String allexamination[]=new String[allexaminationno];
              allexaminationno=0;
              while(rs.next())
              {
            	  	allexamination[allexaminationno]=rs.getString("examination");
           			allexaminationno=allexaminationno+1;
              }
              list_3 = new JList(allexamination);
              pst.close();
              rs.close();
        }
        catch(Exception e)
        {
        	
        }
	
	   
	     list_3.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent evt) {
	     		list_3 = (JList)evt.getSource();
		        if (evt.getClickCount() == 2) 
		        {
		              	if(list_3.isEnabled())
		              	{
		        
		              		int row=list_3.getSelectedIndex();
				   		   
		              		String Name_= (list_3.getModel().getElementAt(row)).toString(); 
		              		listlabel1.setText(Name_);
		              		
		              		String[] data=new String[5];
		              		day=cal.get(Calendar.DAY_OF_MONTH);
		    			   	month=cal.get(Calendar.MONTH)+1;
		    			   	year=cal.get(Calendar.YEAR);
							
							DefaultTableModel model = (DefaultTableModel) table_1.getModel();
							secondcount=table_1.getRowCount();
							data[0]=""+(secondcount+1);
                            data[1]="All Teeth";
                            data[2]=Name_;
                            data[3]=day+"/"+month+"/"+year;
                            data[4]="";
		              		
                            
		              		
                            model.addRow(data);
                            table_1.getSelectionModel().setSelectionInterval(secondcount, secondcount);
                            table_1.scrollRectToVisible(new Rectangle(table_1.getCellRect(secondcount, 0, true)));
                            
                            if(!list_3.isSelectionEmpty()&list_3.isEnabled())
            	    		{
            					btnNewButton_2.setEnabled(true);
            	    		}
						}
		        }
		        else
		        {
		        	if(list_3.isEnabled())
		        	{
		        		Cursor hr = new Cursor(Cursor.CROSSHAIR_CURSOR);
		        		label_1.setCursor(hr);
		        		//JOptionPane.showMessageDialog(null, hr);
		        		int row=list_3.getSelectedIndex();
			   		    String Name_= (list_3.getModel().getElementAt(row)).toString(); 
			   		    listlabel1.setText(Name_);
					}	 			
				}
	     	}
	     });
	     scrollPane_4.setViewportView(list_3);
	     list_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	     
	      listlabel1 = new JLabel("");
	      listlabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
	      listlabel1.setBounds(10, 0, 211, 26);
	      panel_14.add(listlabel1);
	    
	    JScrollPane scrollPane_5 = new JScrollPane();
	    scrollPane_5.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    	}
	    });
	    
	    table_1 = new JTable();
	    table_1.setUpdateSelectionOnSort(true);
	    table_1.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		
	    	},
	    	new String[] {
	    		"Sr.No", "Teeth No.", "Findings", "Date", "Comments", "Mtrl Used"
	    	}
	    ));
	    table_1.getColumnModel().getColumn(0).setPreferredWidth(40);
	    table_1.getColumnModel().getColumn(0).setMinWidth(40);
	    table_1.getColumnModel().getColumn(0).setMaxWidth(40);
	    table_1.getColumnModel().getColumn(1).setPreferredWidth(105);
	    table_1.getColumnModel().getColumn(1).setMinWidth(105);
	    table_1.getColumnModel().getColumn(1).setMaxWidth(105);
	    table_1.getColumnModel().getColumn(2).setPreferredWidth(210);
	    table_1.getColumnModel().getColumn(2).setMinWidth(210);
	    table_1.getColumnModel().getColumn(2).setMaxWidth(210);
	    table_1.getColumnModel().getColumn(3).setPreferredWidth(120);
	    table_1.getColumnModel().getColumn(3).setMinWidth(120);
	    table_1.getColumnModel().getColumn(3).setMaxWidth(120);
	    table_1.getColumnModel().getColumn(4).setPreferredWidth(250);
	    table_1.getColumnModel().getColumn(4).setMinWidth(250);
	    table_1.getColumnModel().getColumn(4).setMaxWidth(250);
	    table_1.getColumnModel().getColumn(5).setMinWidth(55);
	    table_1.getColumnModel().getColumn(5).setMaxWidth(75);
	    
	    popupMenu_1 = new JPopupMenu();
	    addPopup(table_1, popupMenu_1);
	    
	    mntmEdit_1 = new JMenuItem("Edit");
	    mntmEdit_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
					String info[]=new String[100];  //creates an array to store  variable values. You can increase the size when needed
					info[0]=table_1.getValueAt(table_1.getSelectedRow(), 0).toString();
					info[1]= (String) table_1.getValueAt(table_1.getSelectedRow(), 1);
					info[2]= (String) table_1.getValueAt(table_1.getSelectedRow(), 4);
					info[3]=  (String) table_1.getValueAt(table_1.getSelectedRow(), 5);
					
					//; // call Frame2. Here we create an object of a Frame2. We are passing info as arguments to main function.
			      	//	this.setVisible(false); // hiding this form
					edittable_1.main(info); 
					btnNewButton_2.setEnabled(true);
	    		}
	    });
	    popupMenu_1.add(mntmEdit_1);
	    
	    mntmNewMenuItem_1 = new JMenuItem("Delete");
	    mntmNewMenuItem_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
			        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
	                int row=table_1.getSelectedRow();
	    	          model.removeRow(row);
	    	          for(int i=0;i<table_1.getRowCount();i++){
	  			
	                  table_1.setValueAt(i+1, i, 0); 
	    	          }}
	    	}
	    );
	    popupMenu_1.add(mntmNewMenuItem_1);
	    scrollPane_5.setViewportView(table_1);
	    GroupLayout gl_panel_10 = new GroupLayout(panel_10);
	    gl_panel_10.setHorizontalGroup(
	    	gl_panel_10.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_10.createSequentialGroup()
	    			.addGap(5)
	    			.addComponent(label_1)
	    			.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
	    		.addGroup(gl_panel_10.createSequentialGroup()
	    			.addGap(15)
	    			.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 813, GroupLayout.PREFERRED_SIZE))
	    );
	    gl_panel_10.setVerticalGroup(
	    	gl_panel_10.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_10.createSequentialGroup()
	    			.addGap(5)
	    			.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
	    				.addComponent(label_1)
	    				.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
	    			.addGap(9)
	    			.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
	    );
	    panel_10.setLayout(gl_panel_10);
	   
	    
	    JPanel panel_11 = new JPanel();
	    tabbedPane_1.addTab("   Tt Advised  ", null, panel_11, null);
	    panel_11.setLayout(null);
	    
	    label_9 = new JLabel("");
	    label_9.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		

	    		day=cal.get(Calendar.DAY_OF_MONTH);
			   	month=cal.get(Calendar.MONTH)+1;
			   	year=cal.get(Calendar.YEAR);
				if(!list_9.isSelectionEmpty()&list_9.isEnabled()){
					btnNewButton_2.setEnabled(true);
				thirdcount=0;
				int j=0;
				int row=list_9.getSelectedIndex();
		   		   
	  			String Name_= (list_9.getModel().getElementAt(row)).toString(); 
	  			
//				System.out.println(e.getX()+","+e.getY());
				if(e.getX()>=26&e.getX()<=306){
					
				               int x=26;
			                   int z=x+45;
				            if(e.getY()>=35&e.getY()<=200)
				            {
						String data[]=new String[5];
			                                  for(int i=18;i>10;i--)
			                                  {
			                                	  if(e.getX()>=x&e.getX()<=z&e.getY()>=35&e.getY()<200)	{
			                              /*  		  new AbstractTableModel() {
		FF	                                			    public String getColumnName(int col) {
			                                			        return columnNames[col].toString();
			                                			    }
			                                			    public int getRowCount() { return rowData.length; }
			                                			    public int getColumnCount() { return columnNames.length; }
			                                			    public Object getValueAt(int row, int col) {
			                                			        return rowData[row][col];
			                                			    }
			                                			    public boolean isCellEditable(int row, int col)
			                                			        { return true; }
			                                			    public void setValueAt(Object value, int row, int col) {
			                                			        rowData[row][col] = value;
			                                			        fireTableCellUpdated(row, col);
			                                			    }
			  */
			                                		  
			                
			                                		  thirdcount= table_4.getRowCount();
			                                	  
			                                          if(i<=15&e.getY()<107){
					                                	  
					                                        data[0]=""+(thirdcount+1);
					                                        if(i==15)
					                                        data[1]="1E";
					                                        if(i==14)
						                                        data[1]="1D";
					                                        if(i==13)
						                                        data[1]="1C";
					                                        if(i==12)
						                                        data[1]="1B";
					                                        if(i==11)
						                                        data[1]="1A";
					                                      
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                        
					                                       }
			                                          else{
			                                        	    data[0]=""+(thirdcount+1);
					                                        data[1]=""+i;
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                       
			                                          }      
 
			                                         

			                                         DefaultTableModel model = (DefaultTableModel) table_4.getModel();

			                                         model.addRow(data);

			                                         table_4.getSelectionModel().setSelectionInterval(thirdcount, thirdcount);
			                                         table_4.scrollRectToVisible(new Rectangle(table_4.getCellRect(thirdcount, 0, true)));
			                                         //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			                                		  break;
			                                		  
			                                	  }
			                                	  if(i>=14){
						  
			                                		  x+=40;
			                                		  z=x+40;
			                                	  }
					 
			                                	  if(i==13){
			                                		  x+=30;
			                                		  z=x+30;
									
			                                	  }
			                                	  if(i<13){
			                                		  x+=26;
			                                		  z=x+26;
									
			                                	  }

			                                 }
			            }
				
				
				if(e.getY()>=201&e.getY()<=365)
				{
					String data[]=new String[5];
						for(int i=48;i>40;i--)
						{
							if(e.getX()>=x&e.getX()<=z&e.getY()>=201&e.getY()<365)	{
								
								thirdcount= table_4.getRowCount();
                         	  
                                if(i<=45&e.getY()>295){
                              	  
                                    data[0]=""+(thirdcount+1);
                                    if(i==45)
                                    data[1]="4E";
                                    if(i==44)
                                        data[1]="4D";
                                    if(i==43)
                                        data[1]="4C";
                                    if(i==42)
                                        data[1]="4B";
                                    if(i==41)
                                        data[1]="4A";
                                  
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                    
                                   }
                              else{
                            	    data[0]=""+(thirdcount+1);
                                    data[1]=""+i;
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                   
                              }      

                                    

                                    DefaultTableModel model = (DefaultTableModel) table_4.getModel();

                                    model.addRow(data);
                                    table_4.getSelectionModel().setSelectionInterval(thirdcount, thirdcount);
                                    table_4.scrollRectToVisible(new Rectangle(table_4.getCellRect(thirdcount, 0, true)));
                                   
								//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
								break;
							}
							if(i>=44){
						  
								x+=40;
								z=x+40;
							}
					 
							if(i==43){
							x+=30;
							z=x+30;
									
							}
							if(i<43){
							x+=26;
							z=x+26;
									
							}

					 }
			}
	}
				
			
			if(e.getX()>=307&e.getX()<=580){
				int x=580;
			    int z=x-40;
				if(e.getY()>=35&e.getY()<=200){
			String []data=new String[5];		
			 for(int i=28;i>20;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=35&e.getY()<200)	{
				
						  thirdcount= table_4.getRowCount();
                   	  
                          if(i<=25&e.getY()<107){
                        	  
                              data[0]=""+(thirdcount+1);
                              if(i==25)
                              data[1]="2E";
                              if(i==24)
                                  data[1]="2D";
                              if(i==23)
                                  data[1]="2C";
                              if(i==22)
                                  data[1]="2B";
                              if(i==21)
                                  data[1]="2A";
                            
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
 //                             data[5]="";
                             }
                        else{
                      	    data[0]=""+(thirdcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
   //                          data[5]="";
                        }      

                            

                            DefaultTableModel model = (DefaultTableModel) table_4.getModel();

                            model.addRow(data);

                            table_4.getSelectionModel().setSelectionInterval(thirdcount, thirdcount);
                            table_4.scrollRectToVisible(new Rectangle(table_4.getCellRect(thirdcount, 0, true)));
                           
						  //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			
						  break;
		      }
					  if(i>=24){
						  
							x-=38;
							z=x-38;
						}
					 
						if(i==23){
							x-=28;
							z=x-28;
									
						}
						if(i<23){
							x-=25;
							z=x-25
									;
						}

			}
			 }
				
				
				if(e.getY()>=201&e.getY()<=365){
					String data[]=new String[5];
			 for(int i=38;i>30;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=201&e.getY()<365)	{
						  
						  thirdcount= table_4.getRowCount();
                   	  
                          if(i<=35&e.getY()>295){
                        	  
                              data[0]=""+(thirdcount+1);
                              if(i==35)
                              data[1]="3E";
                              if(i==34)
                                  data[1]="3D";
                              if(i==33)
                                  data[1]="3C";
                              if(i==32)
                                  data[1]="3B";
                              if(i==31)
                                  data[1]="3A";
                            
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
     //                         data[5]="";
                             }
                        else{
                      	    data[0]=""+(thirdcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
       //                      data[5]="";
                        }      

                            

                            DefaultTableModel model = (DefaultTableModel) table_4.getModel();

                            model.addRow(data);
                            table_4.getSelectionModel().setSelectionInterval(thirdcount, thirdcount);
                            table_4.scrollRectToVisible(new Rectangle(table_4.getCellRect(thirdcount, 0, true)));
                           
				//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
				break;
		      }
					  if(i>=35){
						  
							x-=40;
							z=x-30;
						}
					 
						if(i==34){
							x-=30;
							z=x-30;
									
						}
						if(i<34){
							x-=26;
							z=x-26
									;
						}

			}}
				
			}	}

        
			}

	    		
	    		
	    	
	    });
	    label_9.setIcon(new ImageIcon(img1));
	    label_9.setBounds(5, 5, 600, 396);
	    panel_11.add(label_9);
	    
	    panel_22 = new JPanel();
	    panel_22.setBounds(605, 5, 229, 396);
	    panel_11.add(panel_22);
	    panel_22.setLayout(null);
	    
	    JScrollPane scrollPane_8 = new JScrollPane();
	    scrollPane_8.setBounds(12, 34, 217, 362);
	    panel_22.add(scrollPane_8);
	    int alladviseno=0;
	    	    

        try{
       	      String query="Select *  From rx_advise ";
		      PreparedStatement pst=connection.prepareStatement(query);
		      ResultSet rs=pst.executeQuery();
              while(rs.next())
              {
            	  alladviseno=alladviseno+1;	 
              }
           
              rs.close();
              ResultSet rs1=pst.executeQuery();
              String alladvise[]=new String[alladviseno];
              alladviseno=0;
              while(rs.next())
              {
            	  alladvise[alladviseno]=rs.getString("advise");
            	  alladviseno=alladviseno+1;
              }
	          list_11 = new JList(alladvise);
	          pst.close();
	          rs.close();
          }
        catch(Exception e)
        {
		    
        }
	    list_11.addMouseListener(new MouseAdapter() {
	    
	    	public void mouseClicked(MouseEvent arg0) {

		 		int row=list_11.getSelectedIndex();
		 		if(list_11.getSelectedIndex()!=-1){
		 		String Name_= (list_11.getModel().getElementAt(row)).toString();
		 		list_5.setSelectedValue(Name_, true);
		 		list_6.setSelectedValue(Name_, true);
		 		list_8.setSelectedValue(Name_, true);
		 		list_2.setSelectedValue(Name_, true);
		 		image_list.setSelectedValue(Name_, true);
		 		showhistory();
		 		}
	    	}
	    });
	    scrollPane_8.setViewportView(list_11);
	    
	    label_11 = new JLabel("");
	    label_11.setBounds(12, 14, 205, 17);
	    panel_22.add(label_11);
	    
	    panel_20 = new JPanel();
	    panel_20.setBounds(605, 5, 229, 396);
	    panel_11.add(panel_20);
	    panel_20.setLayout(null);
	    
	    JScrollPane scrollPane_14 = new JScrollPane();
	    scrollPane_14.setBounds(12, 90, 211, 306);
	    panel_20.add(scrollPane_14);
	     
	     
	    rx_search = new JTextField();
	    rx_search.setColumns(10);
	    rx_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				if(rx_search.getText().equals(null)||rx_search.getText().equals(""))
				{
					try
					{
		            	DefaultListModel DLM=new DefaultListModel();
						String query="select * from   rx_advise ;";
						PreparedStatement pst=connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				
						while(rs.next())
						{
					      DLM.addElement(rs.getString("advise"));
					      list_9.setModel(DLM);
				        }
					      list_9.setModel(DLM);
					      pst.close();
						  rs.close();
					}
					
					catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					 }		 						
						
				}
				else
				{
				
					try{
	    	            int i=0;
	    	        	     try
	    	        	     {    
	    	        			
	    	        			    String query="Select * From rx_advise ";
	    	        		        PreparedStatement pst=connection.prepareStatement(query);
	    	        		        ResultSet rs=pst.executeQuery();

	    	        		        while(rs.next())
	    	        		        {		  
	    	        		        	i=i+1;;
	    	        		        }
	    	        		      
	    	        		        pst.close();
	    	        		        rs.close();
	    	        		       }
	                              catch(Exception e){
	                    	          JOptionPane.showMessageDialog(null, e);
	                          }
	    	        	 
	    	        	      DefaultListModel DLM=new DefaultListModel();
				      
	    	        	      String query="select * from   rx_advise ;";
	    	        	      PreparedStatement pst=connection.prepareStatement(query);
	    	        	      ResultSet rs=pst.executeQuery();
	           
	            
	    	        	      String next[]=new String[i];
	    	        	      i=0;  
	    	        	      while(rs.next())
	    	        	      {	 
	    	        	    	  next[i]=rs.getString("advise");
	    	        	    	  if(rs.getString("advise").contains(rx_search.getText()))
	    	        	    	  {
	    	        	    	  DLM.addElement(next[i]);
	    	        	    	  i=i+1;
	    	        	    	  }
	    	        	      }
				        
	    	        	      list_9.setModel(DLM);
				        
				        pst.close();
				        rs.close();

			        }
	    	
			      catch(Exception e){
				           JOptionPane.showMessageDialog(null, e);
				           e.printStackTrace();
			            }
	             	
				}
			   }
		   });
	    rx_search.setBounds(12, 63, 150, 27);
	    panel_20.add(rx_search);
	    
	    treatmentlabel = new JLabel("Search Treatment below");
	    treatmentlabel.setHorizontalAlignment(SwingConstants.CENTER);
	    treatmentlabel.setBounds(12, 37, 150, 27);
	    panel_20.add(treatmentlabel);
	    
	    JButton addTt= new JButton("New button");
	    addTt.setBounds(172, 53, 50, 37);
	    Image imgplus2=new ImageIcon(this.getClass().getResource("/plus.png")).getImage();
	    addTt.setIcon(new ImageIcon(imgplus2));
	    addTt.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String k[]={};
	     		CustomTreatment.main(k);
	     		int i=0;
	     		DefaultListModel dm=new DefaultListModel();
	     		try{
	     			 connection=DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
		       	     String query="Select *  From rx_advise ";
				     PreparedStatement pst=connection.prepareStatement(query);
				     ResultSet rs=pst.executeQuery();
		             
		     			while (rs.next())
		     			{
		     				dm.addElement(rs.getString("advise"));
		     			}
		     			
		     			list_9.setModel(dm);
	           		            
		            pst.close();
		            rs.close();
	        }
	        catch(Exception ei)
	        {
				JOptionPane.showMessageDialog(null, ei);
	        }
	     		
			}
			
		});
		
	    panel_20.add(addTt);

	    
	    
	    list_9 = new JList(listRxadvised);
	    list_9.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent evt) {
	     		list_9 = (JList)evt.getSource();
		        if (evt.getClickCount() == 2) 
		        {
		              	if(list_9.isEnabled())
		              	{
		        
		              		int row=list_9.getSelectedIndex();
			  		   
		              		String Name_= (list_9.getModel().getElementAt(row)).toString(); 
		              		label_10.setText(Name_);
		              		
		              		String[] data=new String[5];
		              		day=cal.get(Calendar.DAY_OF_MONTH);
		    			   	month=cal.get(Calendar.MONTH)+1;
		    			   	year=cal.get(Calendar.YEAR);
							
							DefaultTableModel model = (DefaultTableModel) table_4.getModel();
							thirdcount=table_4.getRowCount();
							data[0]=""+(thirdcount+1);
                            data[1]="All Teeth";
                            data[2]=Name_;
                            data[3]=day+"/"+month+"/"+year;
                            data[4]="";
		              		
		              		
		              		
                            model.addRow(data);
                            table_4.getSelectionModel().setSelectionInterval(thirdcount, thirdcount);
                            table_4.scrollRectToVisible(new Rectangle(table_4.getCellRect(thirdcount, 0, true)));
                            
                            if(!list_9.isSelectionEmpty()&list_9.isEnabled())
            	    		{
            					btnNewButton_2.setEnabled(true);
            	    		}
		              		
						}
		        }
		        else
		        {

	     		
	     		
	     		if(list_9.isEnabled()){
					Cursor hr = new Cursor(Cursor.CROSSHAIR_CURSOR);
					label_9.setCursor(hr);
					int row=list_9.getSelectedIndex();
			   		   
		  			String Name_= (list_9.getModel().getElementAt(row)).toString(); 
		  			 label_10.setText(Name_);
	     		}
	     	}}
	     });
	    list_9.setFont(new Font("Kartika", Font.BOLD, 14));
	    scrollPane_14.setViewportView(list_9);
	    
	    label_10 = new JLabel("Drag these on Chart");
	    label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_10.setBounds(10, 0, 210, 26);
	    panel_20.add(label_10);
	    
	    JScrollPane scrollPane_15 = new JScrollPane();
	    scrollPane_15.setBounds(15, 408, 813, 124);
	    panel_11.add(scrollPane_15);
	    
	    table_4 = new JTable();
	    table_4.setUpdateSelectionOnSort(true);
	    table_4.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Sr.No", "Teeth No.", "Treatment Advised", "Date", "Fee"
	    	}
	    ));
	    table_4.getColumnModel().getColumn(0).setPreferredWidth(50);
	    table_4.getColumnModel().getColumn(0).setMinWidth(50);
	    table_4.getColumnModel().getColumn(0).setMaxWidth(50);
	    table_4.getColumnModel().getColumn(1).setPreferredWidth(150);
	    table_4.getColumnModel().getColumn(1).setMinWidth(150);
	    table_4.getColumnModel().getColumn(1).setMaxWidth(150);
	    table_4.getColumnModel().getColumn(2).setPreferredWidth(350);
	    table_4.getColumnModel().getColumn(2).setMinWidth(350);
	    table_4.getColumnModel().getColumn(2).setMaxWidth(350);
	    table_4.getColumnModel().getColumn(3).setPreferredWidth(140);
	    table_4.getColumnModel().getColumn(3).setMinWidth(140);
	    table_4.getColumnModel().getColumn(3).setMaxWidth(140);
	    table_4.getColumnModel().getColumn(4).setPreferredWidth(120);
	    table_4.getColumnModel().getColumn(4).setMinWidth(120);
	    table_4.getColumnModel().getColumn(4).setMaxWidth(120);
	    
	    popupMenu_4 = new JPopupMenu();
	    addPopup(table_4, popupMenu_4);
	    mntmEdit_4 = new JMenuItem("edit");
	    mntmEdit_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		String info[]=new String[100];  //creates an array to store  variable values. You can increase the size when needed
				info[0]=table_4.getValueAt(table_4.getSelectedRow(), 0).toString();
				info[1]= (String) table_4.getValueAt(table_4.getSelectedRow(), 1);
				info[2]= (String) table_4.getValueAt(table_4.getSelectedRow(), 2);
				
				info[3]= (String) table_4.getValueAt(table_4.getSelectedRow(), 4);
		
				//; // call Frame2. Here we create an object of a Frame2. We are passing info as arguments to main function.
		      	//	this.setVisible(false); // hiding this form
				edittable_4.main(info); 
				btnNewButton_2.setEnabled(true);
				}
		});

		
	    popupMenu_4.add(mntmEdit_4);
	    
	    mntmDelete_2 = new JMenuItem("delete");
	    mntmDelete_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	            DefaultTableModel model = (DefaultTableModel) table_4.getModel();
                int row=table_4.getSelectedRow();
    	          model.removeRow(row);
    	          for(int i=0;i<table_4.getRowCount();i++){
  			
                  table_4.setValueAt(i+1, i, 0); 
  					     					
  				}	
              table_4.setModel(model);
              btnNewButton_2.setEnabled(true);
	    
	    	}
	    });
	    popupMenu_4.add(mntmDelete_2);
	    scrollPane_15.setViewportView(table_4);
	  	panel_12 = new JPanel();
	    tabbedPane_1.addTab("   Work Done   ", null, panel_12, null);
	    panel_12.setLayout(null);
	   
	    label_2 = new JLabel("");
	    label_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
				if(!list_4.isSelectionEmpty()&list_4.isEnabled()){
					btnNewButton_2.setEnabled(true);
				fourthcount=0;
				int j=0;
				int row=list_4.getSelectedIndex();
		   		   
	  			String Name_= (list_4.getModel().getElementAt(row)).toString(); 
	  			
//				System.out.println(e.getX()+","+e.getY());
				if(e.getX()>=26&e.getX()<=306){
					
				               int x=26;
			                   int z=x+45;
				            if(e.getY()>=35&e.getY()<=200)
				            {
					String data[]=new String[6];	
			                                  for(int i=18;i>10;i--)
			                                  {
			                                	  if(e.getX()>=x&e.getX()<=z&e.getY()>=35&e.getY()<200)	{
			                         			                
			                                		  fourthcount= table_2.getRowCount();
			                                	  
			                                          if(i<=15&e.getY()<107){
					                                	  
					                                        data[0]=""+(fourthcount+1);
					                                        if(i==15)
					                                        data[1]="1E";
					                                        if(i==14)
						                                        data[1]="1D";
					                                        if(i==13)
						                                        data[1]="1C";
					                                        if(i==12)
						                                        data[1]="1B";
					                                        if(i==11)
						                                        data[1]="1A";
					                                      
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                        data[5]="";
					                                       }
			                                          else{
			                                        	    data[0]=""+(fourthcount+1);
					                                        data[1]=""+i;
					                                        data[2]=Name_;
					                                        data[3]=day+"/"+month+"/"+year;
					                                        data[4]="";
					                                       data[5]="";
			                                          }      
                                   

			                                         DefaultTableModel model = (DefaultTableModel) table_2.getModel();

			                                         model.addRow(data);

			                                         table_2.getSelectionModel().setSelectionInterval(fourthcount, fourthcount);
			                                         table_2.scrollRectToVisible(new Rectangle(table_2.getCellRect(fourthcount, 0, true)));
			                                         //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			                                		  break;
			                                		  
			                                	  }
			                                	  if(i>=14){
						  
			                                		  x+=40;
			                                		  z=x+40;
			                                	  }
					 
			                                	  if(i==13){
			                                		  x+=30;
			                                		  z=x+30;
									
			                                	  }
			                                	  if(i<13){
			                                		  x+=26;
			                                		  z=x+26;
									
			                                	  }

			                                 }
			            }
				
				
				if(e.getY()>=201&e.getY()<=365)
				{
					String data[]=new String[6];
						for(int i=48;i>40;i--)
						{
							if(e.getX()>=x&e.getX()<=z&e.getY()>=201&e.getY()<365)	{
								
								fourthcount= table_2.getRowCount();
                          	  
                                if(i<=45&e.getY()>295){
                              	  
                                    data[0]=""+(fourthcount+1);
                                    if(i==45)
                                    data[1]="4E";
                                    if(i==44)
                                        data[1]="4D";
                                    if(i==43)
                                        data[1]="4C";
                                    if(i==42)
                                        data[1]="4B";
                                    if(i==41)
                                        data[1]="4A";
                                  
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                    data[5]="";
                                   }
                              else{
                            	    data[0]=""+(fourthcount+1);
                                    data[1]=""+i;
                                    data[2]=Name_;
                                    data[3]=day+"/"+month+"/"+year;
                                    data[4]="";
                                   data[5]="";
                              }      

                                     

                                     DefaultTableModel model = (DefaultTableModel) table_2.getModel();

                                     model.addRow(data);
                                     table_2.getSelectionModel().setSelectionInterval(fourthcount, fourthcount);
                                     table_2.scrollRectToVisible(new Rectangle(table_2.getCellRect(fourthcount, 0, true)));
                                    
								//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
								break;
							}
							if(i>=44){
						  
								x+=40;
								z=x+40;
							}
					 
							if(i==43){
							x+=30;
							z=x+30;
									
							}
							if(i<43){
							x+=26;
							z=x+26;
									
							}

					 }
			}
	}
				
			
			if(e.getX()>=307&e.getX()<=580){
				int x=580;
			    int z=x-40;
				if(e.getY()>=35&e.getY()<=200){
						String data[]=new String[6];
			 for(int i=28;i>20;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=35&e.getY()<200)	{
				
						  fourthcount= table_2.getRowCount();
                    	  
                          if(i<=25&e.getY()<107){
                        	  
                              data[0]=""+(fourthcount+1);
                              if(i==25)
                              data[1]="2E";
                              if(i==24)
                                  data[1]="2D";
                              if(i==23)
                                  data[1]="2C";
                              if(i==22)
                                  data[1]="2B";
                              if(i==21)
                                  data[1]="2A";
                            
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                              data[5]="";
                             }
                        else{
                      	    data[0]=""+(fourthcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             data[5]="";
                        }      
   
                             

                             DefaultTableModel model = (DefaultTableModel) table_2.getModel();

                             model.addRow(data);

                             table_2.getSelectionModel().setSelectionInterval(fourthcount, fourthcount);
                             table_2.scrollRectToVisible(new Rectangle(table_2.getCellRect(fourthcount, 0, true)));
                            
						  //System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
			
						  break;
		      }
					  if(i>=24){
						  
							x-=38;
							z=x-38;
						}
					 
						if(i==23){
							x-=28;
							z=x-28;
									
						}
						if(i<23){
							x-=25;
							z=x-25
									;
						}

			}
			 }
				
				
				if(e.getY()>=201&e.getY()<=365){
					String data[]=new String[6];
			 for(int i=38;i>30;i--){
					  if(e.getX()>=z&e.getX()<=x&e.getY()>=201&e.getY()<365)	{
						  
						  fourthcount= table_2.getRowCount();
                    	  
                          if(i<=35&e.getY()>295){
                        	  
                              data[0]=""+(fourthcount+1);
                              if(i==35)
                              data[1]="3E";
                              if(i==34)
                                  data[1]="3D";
                              if(i==33)
                                  data[1]="3C";
                              if(i==32)
                                  data[1]="3B";
                              if(i==31)
                                  data[1]="3A";
                            
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                              data[5]="";
                             }
                        else{
                      	    data[0]=""+(fourthcount+1);
                              data[1]=""+i;
                              data[2]=Name_;
                              data[3]=day+"/"+month+"/"+year;
                              data[4]="";
                             data[5]="";
                        }      

                             

                             DefaultTableModel model = (DefaultTableModel) table_2.getModel();

                             model.addRow(data);
                             table_2.getSelectionModel().setSelectionInterval(fourthcount, fourthcount);
                             table_2.scrollRectToVisible(new Rectangle(table_2.getCellRect(fourthcount, 0, true)));
                            
				//System.out.println("Mouse Clicked i= "+i+"  "+e.getX()+","+e.getY());
				break;
		      }
					  if(i>=35){
						  
							x-=40;
							z=x-30;
						}
					 
						if(i==34){
							x-=30;
							z=x-30;
									
						}
						if(i<34){
							x-=26;
							z=x-26
									;
						}

			}}
				
			}	}


	    	}
	    });
	    label_2.setIcon(new ImageIcon(img1));
	    label_2.setBounds(5, 5, 600, 396);
	    panel_12.add(label_2);
	    
	    panel_17 = new JPanel();
	    panel_17.setBounds(605, 5, 229, 396);
	    panel_12.add(panel_17);
	    panel_17.setLayout(null);
	    
	     list_6 = new JList();
	     list_6.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent arg0) {
	     		
		 		int row=list_6.getSelectedIndex();
		 		String Name_= (list_6.getModel().getElementAt(row)).toString();
		 		list_5.setSelectedValue(Name_, true);
		 		list_2.setSelectedValue(Name_, true);
		 		list_8.setSelectedValue(Name_, true);
		 		list_11.setSelectedValue(Name_, true);
		 		image_list.setSelectedValue(Name_, true);
		 		showhistory();
	     	}
	     });
	    list_6.setBounds(12, 34, 217, 362);
	    panel_17.add(list_6);
	    
	    label_5 = new JLabel("");
	    label_5.setBounds(12, 7, 217, 20);
	    panel_17.add(label_5);
	    
	    panel_15 = new JPanel();
	    panel_15.setVisible(false);
	    panel_15.setBounds(605, 5, 229, 396);
	    panel_12.add(panel_15);
	    panel_15.setLayout(null);
	    
	    JScrollPane scrollPane_6 = new JScrollPane();
	    scrollPane_6.setBounds(12, 90, 211, 306);
	    panel_15.add(scrollPane_6);
	    
	    wd_search = new JTextField();
	    wd_search.setColumns(10);
	    wd_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				if(wd_search.getText().equals(null)||wd_search.getText().equals(""))
				{
					try
					{
		            	DefaultListModel DLM=new DefaultListModel();
						String query="select * from   work_done ;";
						PreparedStatement pst=connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				
						while(rs.next())
						{
					      DLM.addElement(rs.getString("work_done"));
					      list_4.setModel(DLM);
				        }
					      list_4.setModel(DLM);
					      pst.close();
						  rs.close();
					}
					
					catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					 }		 						
						
				}
				else
				{
				
					try{
	    	            int i=0;
	    	        	     try
	    	        	     {    
	    	        			
	    	        			    String query="Select * From work_done ";
	    	        		        PreparedStatement pst=connection.prepareStatement(query);
	    	        		        ResultSet rs=pst.executeQuery();

	    	        		        while(rs.next())
	    	        		        {		  
	    	        		        	i=i+1;;
	    	        		        }
	    	        		      
	    	        		        pst.close();
	    	        		        rs.close();
	    	        		       }
	                              catch(Exception e){
	                    	          JOptionPane.showMessageDialog(null, e);
	                          }
	    	        	 
	    	        	      DefaultListModel DLM=new DefaultListModel();
				      
	    	        	      String query="select * from   work_done ;";
	    	        	      PreparedStatement pst=connection.prepareStatement(query);
	    	        	      ResultSet rs=pst.executeQuery();
	           
	            
	    	        	      String next[]=new String[i];
	    	        	      i=0;  
	    	        	      while(rs.next())
	    	        	      {	 
	    	        	    	  next[i]=rs.getString("work_done");
	    	        	    	  if(rs.getString("work_done").contains(wd_search.getText()))
	    	        	    	  {
	    	        	    	  DLM.addElement(next[i]);
	    	        	    	  i=i+1;
	    	        	    	  }
	    	        	      }
				        
	    	        	      list_4.setModel(DLM);
				        
				        pst.close();
				        rs.close();

			        }
	    	
			      catch(Exception e){
				           JOptionPane.showMessageDialog(null, e);
				           e.printStackTrace();
			            }
	             	
				}
			   }
		   });
	    wd_search.setBounds(12, 63, 150, 27);
	    panel_15.add(wd_search);
	    
	    
	    JButton addwd= new JButton("New button");
	    addwd.setBounds(172, 53, 50, 37);
	    Image imgplus4=new ImageIcon(this.getClass().getResource("/plus.png")).getImage();
	    addwd.setIcon(new ImageIcon(imgplus4));
	    addwd.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String k[]={};
	     		CustomWorkDone.main(k);
	     		int i=0;
	     		DefaultListModel dm=new DefaultListModel();
	     		try{
	     			 connection=DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
		       	     String query="Select *  From work_done ";
				     PreparedStatement pst=connection.prepareStatement(query);
				     ResultSet rs=pst.executeQuery();
		             
		     			while (rs.next())
		     			{
		     				dm.addElement(rs.getString("work_done"));
		     			}
		     			
		     			list_4.setModel(dm);
	           		            
		            pst.close();
		            rs.close();
	        }
	        catch(Exception ei)
	        {
				JOptionPane.showMessageDialog(null, ei);
	        }
	     		
			}
			
		});
		
	    panel_15.add(addwd);

	    
	    wdlabel = new JLabel("Search Work Done below");
	    wdlabel.setHorizontalAlignment(SwingConstants.CENTER);
	    wdlabel.setBounds(12, 37, 150, 27);
	    panel_15.add(wdlabel);

	    
	    
	    
	    int allworkdoneno=0;
        try{
       	      String query="Select *  From work_done ";
		      PreparedStatement pst=connection.prepareStatement(query);
		      ResultSet rs=pst.executeQuery();
              while(rs.next()){
           	  allworkdoneno=allworkdoneno+1;	 
        
    	      }
           
            rs.close();
            ResultSet rs1=pst.executeQuery();
            String allworkdone[]=new String[allworkdoneno];
            allworkdoneno=0;
            while(rs.next()){
           	allworkdone[allworkdoneno]=rs.getString("work_done");
           			 allworkdoneno=allworkdoneno+1;
        
    	   }
            list_4 = new JList(allworkdone);
            pst.close();
            rs.close();
          }
      catch(Exception e){
	     
 }
	     list_4 = new JList(listworkdone);
	     list_4.setFont(new Font("Tahoma", Font.BOLD, 14));
	     list_4.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent evt) {
	     		if(list_4.isEnabled()){
	     			list_4 = (JList)evt.getSource();
			        if (evt.getClickCount() == 2) 
			        {
			              	if(list_4.isEnabled())
			              	{
			        
			              		int row=list_4.getSelectedIndex();
					   		   
			              		String Name_= (list_4.getModel().getElementAt(row)).toString(); 
			              		label_3.setText(Name_);
			              		
			              		String[] data=new String[5];
			              		day=cal.get(Calendar.DAY_OF_MONTH);
			    			   	month=cal.get(Calendar.MONTH)+1;
			    			   	year=cal.get(Calendar.YEAR);
								
								DefaultTableModel model = (DefaultTableModel) table_2.getModel();
								fourthcount=table_2.getRowCount();
								data[0]=""+(fourthcount+1);
	                            data[1]="All Teeth";
	                            data[2]=Name_;
	                            data[3]=day+"/"+month+"/"+year;
	                            data[4]="";
			              		
			              		
			              		
	                            model.addRow(data);
	                            table_2.getSelectionModel().setSelectionInterval(fourthcount, fourthcount);
	                            table_2.scrollRectToVisible(new Rectangle(table_2.getCellRect(fourthcount, 0, true)));

	                            if(!list_4.isSelectionEmpty()&list_4.isEnabled())
	            	    		{
	            					btnNewButton_2.setEnabled(true);
	            	    		}
							}
			        }
			        else
			        {


	     			
					Cursor hr = new Cursor(Cursor.CROSSHAIR_CURSOR);
					label_2.setCursor(hr);
					int row=list_4.getSelectedIndex();
			   		   
		  			String Name_= (list_4.getModel().getElementAt(row)).toString(); 
		  			 label_3.setText(Name_);
					}	 
	     		}
	     	}
	     });
	     scrollPane_6.setViewportView(list_4);
	     
	      label_3 = new JLabel("");
	      label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
	      label_3.setBounds(10, 0, 210, 26);
	      panel_15.add(label_3);
	    
	    JScrollPane scrollPane_7 = new JScrollPane();
	    scrollPane_7.setBounds(5, 408, 823, 120);
	    panel_12.add(scrollPane_7);
	    
	    table_2 = new JTable();
	    table_2.setUpdateSelectionOnSort(true);
	    table_2.setBackground(Color.WHITE);
	    table_2.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Sr.No", "Teeth No", "Work Done", "Date", "Fee ", "Comments", "Mtrl Used"
	    	}
	    ));
	    table_2.getColumnModel().getColumn(0).setPreferredWidth(34);
	    table_2.getColumnModel().getColumn(0).setMinWidth(34);
	    table_2.getColumnModel().getColumn(0).setMaxWidth(34);
	    table_2.getColumnModel().getColumn(1).setMinWidth(75);
	    table_2.getColumnModel().getColumn(1).setMaxWidth(75);
	    table_2.getColumnModel().getColumn(2).setPreferredWidth(215);
	    table_2.getColumnModel().getColumn(2).setMinWidth(215);
	    table_2.getColumnModel().getColumn(2).setMaxWidth(215);
	    table_2.getColumnModel().getColumn(3).setPreferredWidth(88);
	    table_2.getColumnModel().getColumn(3).setMinWidth(88);
	    table_2.getColumnModel().getColumn(3).setMaxWidth(88);
	    table_2.getColumnModel().getColumn(4).setPreferredWidth(111);
	    table_2.getColumnModel().getColumn(4).setMinWidth(111);
	    table_2.getColumnModel().getColumn(4).setMaxWidth(111);
	    table_2.getColumnModel().getColumn(5).setPreferredWidth(206);
	    table_2.getColumnModel().getColumn(5).setMinWidth(206);
	    table_2.getColumnModel().getColumn(5).setMaxWidth(206);
	    table_2.getColumnModel().getColumn(6).setMinWidth(75);
	    table_2.getColumnModel().getColumn(6).setMaxWidth(75);
	    
	    popupMenu_2 = new JPopupMenu();
	    addPopup(table_2, popupMenu_2);
	    
	     mntmEdit_2 = new JMenuItem("Edit");
	     mntmEdit_2.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent arg0) {

				String info[]=new String[100];  //creates an array to store  variable values. You can increase the size when needed
				info[0]=table_2.getValueAt(table_2.getSelectedRow(), 0).toString();
				info[1]= (String) table_2.getValueAt(table_2.getSelectedRow(), 1);
				info[2]= (String) table_2.getValueAt(table_2.getSelectedRow(), 4);
				info[3]= (String) table_2.getValueAt(table_2.getSelectedRow(), 5);
				info[4]= (String) table_2.getValueAt(table_2.getSelectedRow(), 6);
				//; // call Frame2. Here we create an object of a Frame2. We are passing info as arguments to main function.
		      	//	this.setVisible(false); // hiding this form
				edittable_2.main(info); 
				btnNewButton_2.setEnabled(true);
	     	}  	
	     });
	    popupMenu_2.add(mntmEdit_2);
	    
	     mntmDelete = new JMenuItem("Delete");
	     mntmDelete.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table_2.getModel();
                int row=table_2.getSelectedRow();
    	          model.removeRow(row);
    	          for(int i=0;i<table_2.getRowCount();i++){
  			
                  table_2.setValueAt(i+1, i, 0); 
  					     					
  				}	
              table_2.setModel(model);
              btnNewButton_2.setEnabled(true);
			}
			     	
	     });
	    popupMenu_2.add(mntmDelete);
	    scrollPane_7.setViewportView(table_2);
	    
	    JPanel panel_13 = new JPanel();
	    tabbedPane_1.addTab("   Rx Advised   ", null, panel_13, null);
	    panel_13.setLayout(null);
	    
	    label_6 = new JLabel("");
	    label_6.setIcon(new ImageIcon(img1));
	    label_6.setBounds(5, 5, 600, 396);
	    panel_13.add(label_6);
	    
	    panel_19 = new JPanel();
	    panel_19.setBounds(605, 5, 229, 396);
	    panel_13.add(panel_19);
	    panel_19.setLayout(null);
	    
	    JScrollPane scrollPane_12 = new JScrollPane();
	    scrollPane_12.setBounds(12, 34, 217, 362);
	    panel_19.add(scrollPane_12);
	
	     list_8 = new JList();
	     list_8.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent arg0) {
	     		
	     		int row=list_8.getSelectedIndex();
		 		String Name_= (list_8.getModel().getElementAt(row)).toString();
		 		list_5.setSelectedValue(Name_, true);
		 		list_6.setSelectedValue(Name_, true);
		 		list_2.setSelectedValue(Name_, true);
		 		list_11.setSelectedValue(Name_, true);
		 		image_list.setSelectedValue(Name_, true);
		 		showhistory();
	     		
	     	}
	     });
	    scrollPane_12.setViewportView(list_8);
	    
		    label_8 = new JLabel("");
		    label_8.setBounds(12, 1, 217, 27);
		    panel_19.add(label_8);
	    
	        panel_18 = new JPanel();
	        panel_18.setBounds(605, 5, 229, 396);
	        panel_13.add(panel_18);
	        panel_18.setLayout(null);
	        
	        scrollPane_10 = new JScrollPane();
	        scrollPane_10.setBounds(12, 90, 211, 306);
	        panel_18.add(scrollPane_10);
	         
	        prs_search = new JTextField();
	 	    prs_search.setColumns(10);
	 	    prs_search.addKeyListener(new KeyAdapter() {
	 			@Override
	 			public void keyReleased(KeyEvent arg0) {
	 				
	 				
	 				if(prs_search.getText().equals(null)||prs_search.getText().equals(""))
	 				{
	 					try
	 					{
	 		            	DefaultListModel DLM=new DefaultListModel();
	 						String query="select * from   prescription ;";
	 						PreparedStatement pst=connection.prepareStatement(query);
	 						ResultSet rs=pst.executeQuery();
	 						
	 						//table.setModel(DbUtils.resultSetToTableModel(rs));
	 				
	 						while(rs.next())
	 						{
	 					      DLM.addElement(rs.getString("prescription"));
	 					      list_7.setModel(DLM);
	 				        }
	 					      list_7.setModel(DLM);
	 					      pst.close();
	 						  rs.close();
	 					}
	 					
	 					catch(Exception e){
	 						JOptionPane.showMessageDialog(null, e);
	 					 }		 						
	 						
	 				}
	 				else
	 				{
	 				
	 					try{
	 	    	            int i=0;
	 	    	        	     try
	 	    	        	     {    
	 	    	        			
	 	    	        			    String query="Select * From prescription ";
	 	    	        		        PreparedStatement pst=connection.prepareStatement(query);
	 	    	        		        ResultSet rs=pst.executeQuery();

	 	    	        		        while(rs.next())
	 	    	        		        {		  
	 	    	        		        	i=i+1;
	 	    	        		        }
	 	    	        		      
	 	    	        		        pst.close();
	 	    	        		        rs.close();
	 	    	        		       }
	 	                              catch(Exception e){
	 	                    	          JOptionPane.showMessageDialog(null, e);
	 	                          }
	 	    	        	 
	 	    	        	      DefaultListModel DLM=new DefaultListModel();
	 				      
	 	    	        	      String query="select * from   prescription ;";
	 	    	        	      PreparedStatement pst=connection.prepareStatement(query);
	 	    	        	      ResultSet rs=pst.executeQuery();
	 	           
	 	            
	 	    	        	      String next[]=new String[i];
	 	    	        	      i=0;  
	 	    	        	      while(rs.next())
	 	    	        	      {	 
	 	    	        	    	  next[i]=rs.getString("prescription");
	 	    	        	    	  if(rs.getString("prescription").contains(prs_search.getText()))
	 	    	        	    	  {
	 	    	        	    	  DLM.addElement(next[i]);
	 	    	        	    	  i=i+1;
	 	    	        	    	  }
	 	    	        	      }
	 				        
	 	    	        	      list_7.setModel(DLM);
	 				        
	 				        pst.close();
	 				        rs.close();

	 			        }
	 	    	
	 			      catch(Exception e){
	 				           JOptionPane.showMessageDialog(null, e);
	 				           e.printStackTrace();
	 			            }
	 	             	
	 				}
	 			   }
	 		   });
	 	   	prs_search.setBounds(12, 63, 150, 27);
	 	    panel_18.add(prs_search);
	 	    
	 	    
	 	    JButton addprs= new JButton("New button");
	 	    addprs.setBounds(172, 53, 50, 37);
		    Image imgplus3=new ImageIcon(this.getClass().getResource("/plus.png")).getImage();
		    addprs.setIcon(new ImageIcon(imgplus3));
		    addprs.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String k[]={};
		     		costemprecription.main(k);
		     		int i=0;
		     		DefaultListModel dm=new DefaultListModel();
		     		try{
		     			 connection=DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
			       	     String query="Select *  From prescription ";
					     PreparedStatement pst=connection.prepareStatement(query);
					     ResultSet rs=pst.executeQuery();
			             
			     			while (rs.next())
			     			{
			     				dm.addElement(rs.getString("prescription"));
			     			}
			     			
			     			list_7.setModel(dm);
		           		            
			            pst.close();
			            rs.close();
		        }
		        catch(Exception ei)
		        {
					JOptionPane.showMessageDialog(null, ei);
		        }
		     		
				}
				
			});
			
		    panel_18.add(addprs);

		    
		    
	 	    prslabel = new JLabel("Search Prescription below");
	 	    prslabel.setHorizontalAlignment(SwingConstants.CENTER);
	 	    prslabel.setBounds(12, 37, 150, 27);
	 	    panel_18.add(prslabel);
	         
	         
	         
	         int allprecriptionno=0;
	         
	         try{
	        	 String query="Select *  From prescription ";
			      PreparedStatement pst=connection.prepareStatement(query);
			      ResultSet rs=pst.executeQuery();
                 while(rs.next())
                 {
                	 allprecriptionno=allprecriptionno+1;	 
	             }
                 rs.close();
                 ResultSet rs1=pst.executeQuery();
                 String allprescription[]=new String[allprecriptionno];
                 
                 allprecriptionno=0;
                 while(rs.next()){
                	 allprescription[allprecriptionno]=rs.getString("prescription");
                	 allprecriptionno=allprecriptionno+1;
	             }
                 list_7 = new JList(allprescription);
                 pst.close();
                 rs1.close();
                }
            catch(Exception e){
     	        JOptionPane.showMessageDialog(null,e);
     	        e.printStackTrace();
              }
	         
	          list_7.addMouseListener(new MouseAdapter() {
	        	  public void mouseClicked(MouseEvent arg0) {
	          		
	          		day=cal.get(Calendar.DAY_OF_MONTH);
	          	   	month=cal.get(Calendar.MONTH)+1;
	          	   	year=cal.get(Calendar.YEAR);
	          		

	          		
	          		if(list_7.isEnabled()&!list_7.isSelectionEmpty()){
					int row=list_7.getSelectedIndex();
			     	String Name_= (list_7.getModel().getElementAt(row)).toString();
			     	if(Name_=="[Custom Text]"||row==0){
			     		String k[]={};
			     		costemprecription.main(k);
			     	}
			     	else{
		  			label_7.setText(Name_);
					btnNewButton_2.setEnabled(true);
					int k;
					String dosages = null;
					   String instruction = null;
					   
					   try{
				        	 String query="Select *  From prescription where prescription='"+Name_+"' ";
						     PreparedStatement pst=connection.prepareStatement(query);
						     ResultSet rs=pst.executeQuery();
			                 while(rs.next()){
			                	 dosages=rs.getString("dosage");
			                	 instruction=rs.getString("instruction");
				              }
			                 rs.close();
			                 pst.close();
			                 rs.close();
			              }
			           catch(Exception e){
			     	     JOptionPane.showMessageDialog(null,e);
			     	     e.printStackTrace();
			            }
             		  k= table_3.getRowCount();				                                	  
                     String[] data={ " ",Name_,dosages,instruction,day+"/"+month+"/"+year,""  };				                                        				                                         
                     DefaultTableModel model = (DefaultTableModel) table_3.getModel();
                     model.addRow(data);
                     table_3.getSelectionModel().setSelectionInterval(k, k);
                     table_3.scrollRectToVisible(new Rectangle(table_3.getCellRect(k, 0, true)));

					}	 
	          		}
	          	}
	          });
	          list_7.setFont(new Font("Tahoma", Font.BOLD, 14));
	          scrollPane_10.setViewportView(list_7);
	          
	          label_7 = new JLabel("");
	          label_7.setBounds(10, 0, 210, 26);
	          panel_18.add(label_7);
	    
	    scrollPane_11 = new JScrollPane();
	    scrollPane_11.setBounds(5, 405, 673, 127);
	    panel_13.add(scrollPane_11);
	    
	    
	    table_3 = new JTable();
	    table.setUpdateSelectionOnSort(true);
	    scrollPane_11.setViewportView(table_3);
	    table_3.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		" ", "Prescription", "Dosage", "Instruction", "Visit Date", ""
	    	}
	    ));
	    table_3.getColumnModel().getColumn(0).setPreferredWidth(26);
	    table_3.getColumnModel().getColumn(0).setMinWidth(26);
	    table_3.getColumnModel().getColumn(0).setMaxWidth(26);
	    table_3.getColumnModel().getColumn(1).setPreferredWidth(145);
	    table_3.getColumnModel().getColumn(1).setMinWidth(145);
	    table_3.getColumnModel().getColumn(1).setMaxWidth(145);
	    table_3.getColumnModel().getColumn(2).setPreferredWidth(120);
	    table_3.getColumnModel().getColumn(2).setMinWidth(120);
	    table_3.getColumnModel().getColumn(2).setMaxWidth(120);
	    table_3.getColumnModel().getColumn(3).setPreferredWidth(152);
	    table_3.getColumnModel().getColumn(3).setMinWidth(152);
	    table_3.getColumnModel().getColumn(3).setMaxWidth(152);
	    table_3.getColumnModel().getColumn(4).setPreferredWidth(135);
	    table_3.getColumnModel().getColumn(4).setMinWidth(135);
	    table_3.getColumnModel().getColumn(4).setMaxWidth(135);
	    table_3.getColumnModel().getColumn(5).setMinWidth(75);
	    table_3.getColumnModel().getColumn(5).setMaxWidth(75);
	    
	    popupMenu_3 = new JPopupMenu();
	    addPopup(table_3, popupMenu_3);
	    
	    mntmEdit_3 = new JMenuItem("Edit");
	    mntmEdit_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String info[]=new String[100];  //creates an array to store  variable values. You can increase the size when needed
				info[0]=table_3.getValueAt(table_3.getSelectedRow(), 1).toString();
				info[1]= (String) table_3.getValueAt(table_3.getSelectedRow(), 2);
				info[2]= (String) table_3.getValueAt(table_3.getSelectedRow(), 3);
				info[3]= (String) table_3.getValueAt(table_3.getSelectedRow(), 4);
				//; // call Frame2. Here we create an object of a Frame2. We are passing info as arguments to main function.
		      	//	this.setVisible(false); // hiding this form

				edittable_3.main(info); 
				btnNewButton_2.setEnabled(true);
	    	}
	    });
	    popupMenu_3.add(mntmEdit_3);
	    
	    mntmDelete_1 = new JMenuItem("Delete");
	    mntmDelete_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	            DefaultTableModel model = (DefaultTableModel) table_3.getModel();
                int row=table_3.getSelectedRow();
    	          model.removeRow(row);
    	          for(int i=0;i<table_3.getRowCount();i++){
  			
                  table_3.setValueAt(i+1, i, 0); 
  					     					
  				}	
              table_3.setModel(model);
              btnNewButton_2.setEnabled(true);
		
	    	}
	    });
	    popupMenu_3.add(mntmDelete_1);
	  
	     textPane = new JTextPane();
	     textPane.setEditable(false);
	     textPane.setFont(new Font("Tahoma", Font.BOLD, 14));
	    textPane.setBounds(690, 405, 138, 127);
	    panel_13.add(textPane);
		
	    btnNewButton_2 = new JButton("Save Visit");
	    
	    btnNewButton_2.setBounds(285, 584, 105, 30);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.getSelectedRow()<0){
	           		JOptionPane.showMessageDialog(null,"select a patient record before");
	           	}
	           	else{	
				table.setUpdateSelectionOnSort(true);
				
				String complaintvalues="";
				String on_examination="";
				String work_done="";
				String prescription="";
		        String rxadvice="";		
		        
		    
		        String xray[]=new String [table_image.getRowCount()];
		     	
		     	for(int i=0;i<table_image.getRowCount();i++)
		     	{							
		     		xray[i]=table_image.getValueAt(i, 0)+"";	
		     	}
		        
		     	for(int i=0;i<table.getRowCount();i++)
		     	{
					for(int j=0;j<5;j++)
					{	    
					    	if(j==4&table.getModel().getValueAt(i,j)=="")
					    	{
					    		complaintvalues+=" :";
					    		
					    	}
					    	else
					    	{
						    	complaintvalues+=table.getModel().getValueAt(i,j);

					    		complaintvalues+=":";	
					    	}
						
					}
					
				}
		        
		        
		     	
		     			     	
		     	for(int i=0;i<table_1.getRowCount();i++){
							for(int j=0;j<6;j++){

							    
							    	if((j==5||j==4)&table_1.getModel().getValueAt(i,j)==""){
							    		on_examination+=" :";
							    	}
							    	else{
								    	on_examination+=table_1.getModel().getValueAt(i,j);

								    	on_examination+=":";	
							    	}
								
							}
							
						}	
				
		     	for(int i=0;i<table_2.getRowCount();i++){
							for(int j=0;j<7;j++){
									
								
							    	if((j==6||j==5||j==4)&table_2.getModel().getValueAt(i,j)==""){
							    		
							    		work_done+=" :";
							    	}
							    	else{
							    		work_done+=table_2.getModel().getValueAt(i,j);
							    		
							    		work_done+=":";	
							    	}
								
							}
							
						}	
				
		    	for(int i=0;i<table_3.getRowCount();i++){
					for(int j=0;j<5;j++){

						
					    	if((j==2||j==3||j==4)&table_3.getModel().getValueAt(i,j)==""){
					    		prescription+=" :";
					    	}
					    	else{
					    		prescription+=table_3.getModel().getValueAt(i,j);

					    		prescription+=":";	
					    	}
						
				
					}
					
				}	
		
		    	for(int i=0;i<table_4.getRowCount();i++){
							for(int j=0;j<5;j++){
									
									
							    	if((j==4)&table_4.getModel().getValueAt(i,j)==""){
							    		
							    		rxadvice+=" :";
							    	}
							    	else{
							    		rxadvice+=table_4.getModel().getValueAt(i,j);
							    		
							    		rxadvice+=":";	
							    	}
								
							}
							
						}	
 
		   		
		    	
				int row=list.getSelectedRow();
		   		
				DefaultTableModel md=(DefaultTableModel)list.getModel();
	  			String Regn= md.getValueAt(row,0).toString(); 
		   		
              
				String regnvalue=ShowRegn(Regn);
				
				 Calendar cal=new GregorianCalendar();

					int day=cal.get(Calendar.DAY_OF_MONTH);
				   	int month=cal.get(Calendar.MONTH);
				   	int year=cal.get(Calendar.YEAR);
					int hour=cal.get(Calendar.HOUR);
					int min=cal.get(Calendar.MINUTE);
					int sec=cal.get(Calendar.SECOND);

				
			try{
				if(checkcompplain==1){
					int row1=list_2.getSelectedIndex();
			  	    String Name_2= (list_2.getModel().getElementAt(row1)).toString(); 
					
					String query="update complaints set prescription='"+prescription+"',on_examination='"+on_examination+"',work_done='"+work_done+"',complaint ='"+complaintvalues+"',rxadvised='"+rxadvice+"',history ='"+day+"/"+month+"/"+year+"  "+hour+":"+min+":"+sec+"'where Regn='"+regnvalue+"' and history='"+Name_2+"';";
		  			PreparedStatement pst=connection.prepareStatement(query);
					pst.execute();
					
					for(String intl:xray)
	    	     	{
	    	     		pst=connection.prepareStatement("update xray_image set Regn= ?, history= ? ,imageName= ? ,image= ? where Regn='"+regnvalue+"' and history='"+Name_2+"';");
	    	     		FileInputStream fileInputStream = new FileInputStream(intl);
	    	     		byte[] b3=new byte[fileInputStream.available()];
			   			fileInputStream.read(b3);
			   			fileInputStream.close();
			   			pst.setString(1, regnvalue);
		   	     		pst.setString(2, day+"/"+month+"/"+year+"  "+hour+":"+min+":"+sec);
			   			pst.setString(3, intl);
		    			 pst.setBytes(4, b3);
		    			pst.execute();
	    			}
					
    		  		
    		  		pst.close();
		  			JOptionPane.showMessageDialog(null,"Complaint update");
		  			 
		  			Refreshcomplaintlist(regnvalue);
		   	     	list.setEnabled(true);
		   	     	
		  		}
		  	
				else{
				String query ="insert into complaints (Regn ,complaint,history,on_examination,work_done,prescription,rxadvised) values( ?,?,?,?,?,?,?)";
   	     		PreparedStatement pst=connection.prepareStatement(query);
   	     		
   	     		pst.setString(1, regnvalue);
   	     		
     	     	pst.setString(2, complaintvalues);
     	     	pst.setString(3, day+"/"+month+"/"+year+"  "+hour+":"+min+":"+sec);
   	     		pst.setString(4,on_examination );
   	     	    pst.setString(5, work_done);
   	         	pst.setString(6,prescription);
   	            pst.setString(7,rxadvice);
    	     	pst.execute();
    	     	for(String intl:xray)
    	     	{
    	     		pst=connection.prepareStatement("insert into xray_image (Regn,history,imageName,image) values(?,?,?,?);");
    	     		FileInputStream fileInputStream = new FileInputStream(intl);
    	     		byte[] b3=new byte[fileInputStream.available()];
		   			fileInputStream.read(b3);
		   			fileInputStream.close();
		   			pst.setString(1, regnvalue);
	   	     		pst.setString(2, day+"/"+month+"/"+year+"  "+hour+":"+min+":"+sec);
		   			pst.setString(3,intl);
	    			pst.setBytes(4, b3);
	    			pst.execute();
    			}
    			pst.close();	
    			
    			b=null;
   	     		JOptionPane.showMessageDialog(null,"Complaints Saved");
   	     	
   	     	  	
   	     	     Refreshcomplaintlist(regnvalue);
   	     	     
   	     	     list.setEnabled(true);
   	     	     
   	     	     
   	     		}
			}

   	     	catch(Exception e)
   	     	{
   	     		JOptionPane.showMessageDialog(null, "Hello"+e);
   	     		e.printStackTrace();
   	     	}
   	     	              

			}
				JOptionPane.showMessageDialog(null,tt+" "+wd);
			}			
			
			
			
		});
		
		btnNewButton_2.setFont(new Font("Kartika", Font.BOLD, 15));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancel Visit");
		
		btnNewButton_3.setBounds(558, 584, 118, 30);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				DefaultTableModel model = (DefaultTableModel) table_image.getModel();
				model.setRowCount(0);
				
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0); 
				
				DefaultTableModel model2 = (DefaultTableModel) table_1.getModel();
				model2.setRowCount(0);
				
				DefaultTableModel model3 = (DefaultTableModel) table_2.getModel();
				model3.setRowCount(0);
				
				DefaultTableModel model4 = (DefaultTableModel) table_3.getModel();
				model4.setRowCount(0);
				
				DefaultTableModel model5 = (DefaultTableModel) table_4.getModel();
				model5.setRowCount(0);
				
				b=null;
				
				tabbedPane.setSelectedIndex(0);
				list.setEnabled(true);
			
				 int  row1=list.getSelectedRow();
				 if(row1>0)
				 {
					 DefaultTableModel md=(DefaultTableModel)list.getModel();
					 String Regn=md.getValueAt(row1,0).toString();
						  			
					 
					 Refreshcomplaintlist(Regn);
				 }	
				btnNewVisits_1.setEnabled(true);
			}
		});
		btnNewButton_3.setFont(new Font("Kartika", Font.BOLD, 14));
		panel_1.add(btnNewButton_3);
		
		 btnNewVisits_1 = new JButton("New Visits");
		 
		 btnNewVisits_1.setBounds(27, 584, 105, 30);
		 btnNewVisits_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkcompplain=0;
				 panel_8.setVisible(true);
	     	  	 panel_9.setVisible(false);
				 panel_16.setVisible(false);
	     	  	 panel_14.setVisible(true);
	     	  	 panel_15.setVisible(true);
	     	  	 panel_17.setVisible(false);
	     	  	 panel_18.setVisible(true);
	     	  	 panel_19.setVisible(false);
	     	  	 panel_20.setVisible(true);
	     	  	 panel_22.setVisible(false);

	     
	     	  	 list_1.setEnabled(true);
	     	  	 list_3.setEnabled(true);
	     	  	 list_4.setEnabled(true);
	     	  	 list_7.setEnabled(true);
	     	  	 list_9.setEnabled(true);
	     	  	 btnNewVisits_1.setEnabled(false);
	     	  	 btnDeleteVisits.setEnabled(false);
	     	  	 btnEditVisits.setEnabled(false);
	     	  	listlabel.setText("Dragg...this");
	     	    listlabel1.setText("Drag this and drop on chart");
	     	    label_3.setText("Drag this and drop on chart");
	     	   label_7.setText("Drag this and drop on chart");
	     	  label_10.setText("Drag this and drop on chart");
	   
	     	   
	      
	  	
	     	   table_1.setModel(new DefaultTableModel(
	    		    	new Object[][] {
	    		    		
	    		    	},
	    		    	new String[] {
	    		    		"Sr.No", "Teeth No.", "Findings", "Date", "Comments", "Mtrl Used"
	    		    	}
	    		    ));	     	

	     	    table.setModel(new DefaultTableModel(
	     			new Object[][] {
	     				
	     			},
	     			new String[] {
	     				"Sr.No", "Teeth.No", "Complaints", "Date", "Comments"
	     			}
            	     		));
	     	   table_2.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No", "Work Done", "Date", "Fee ", "Comments", "Mtrl Used"
	     		    	}
	     		    ));
	     			     	   
	     		 table_3.setModel(new DefaultTableModel(
		  			    	new Object[][] {
		  			    	},
		  			    	new String[] {
		  			    		" ", "Prescription", "Dosage", "Instruction", "Visit Date", ""
		  			    	}
		  			    ));
	     		table_4.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No.", "Treatment Advised", "Date", "Fee"
	     		    	}
	     		    ));	
			}
		});
		panel_1.add(btnNewVisits_1);
		
		 btnDeleteVisits = new JButton("Delete Visits");
		
		 btnDeleteVisits.setBounds(156, 584, 105, 30);
		btnDeleteVisits.setEnabled(false);
		btnDeleteVisits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.getSelectedRow()<0){
	           		JOptionPane.showMessageDialog(null,"select a patient record before");
	           	}
	           	else{	
				try{
				   int row=list_2.getSelectedIndex();   		   
	  			    String Name_= (list_2.getModel().getElementAt(row)).toString();
	  		        int  row1=list.getSelectedRow();
	  		        DefaultTableModel md=(DefaultTableModel) list.getModel();
	  		        String Regn=md.getValueAt(row1,0).toString();
                    String regnvalues=ShowRegn(Regn);	  	
                    
	  		        String query="DELETE FROM complaints WHERE history='"+Name_+"' and regn='"+regnvalues+"';";
		            PreparedStatement pst=connection.prepareStatement(query);
	                pst.execute(); 
	                pst.close();
	                
	                String query1="DELETE FROM xray_image WHERE history='"+Name_+"' and regn='"+regnvalues+"';";
		            PreparedStatement pst1=connection.prepareStatement(query1);
	                pst1.execute(); 
	                pst1.close();
		       
		           Refreshcomplaintlist(regnvalues);
	  			

	 	   	}
	 		catch(Exception e){
	 			JOptionPane.showMessageDialog(null, e);
	 		}

	           	}
			}
		});
		panel_1.add(btnDeleteVisits);
		
		 btnEditVisits = new JButton("Edit Visits");
		 
		 btnEditVisits.setBounds(418, 584, 118, 30);
		btnEditVisits.setEnabled(false);
		btnEditVisits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.getSelectedRow()<0){
	           		JOptionPane.showMessageDialog(null,"select a patient record before");
	           	}
	           	else{	
			   panel_9.setVisible(false);
               panel_8.setVisible(true);
               panel_16.setVisible(false);
               panel_14.setVisible(true);
               panel_15.setVisible(true);
               panel_17.setVisible(false);
               panel_18.setVisible(true);
               panel_19.setVisible(false);
               panel_20.setVisible(true);
               panel_22.setVisible(false);
               list_1.setEnabled(true);
               list_3.setEnabled(true);
               list_4.setEnabled(true);
               list_7.setEnabled(true);
               list_9.setEnabled(true);
               btnEditVisits.setEnabled(false);
             //  mntmEdit.setVisible(true);
       		   //mntmNewMenuItem.setVisible(true);
       		   //mntmNewMenuItem_1.setVisible(true);
       		   //mntmEdit_1.setVisible(true);
       		   //mntmEdit_2.setVisible(true); 	  
		  	   //mntmDelete.setVisible(true);
		  	   //popupMenu_3.setVisible(true);
		  	   //popupMenu.setVisible(true);
		  	   //popupMenu_1.setVisible(true);
		  	   //popupMenu_1.setVisible(true);
		  	   //mntmEdit_3.setVisible(true);
		  	   //mntmDelete_1.setVisible(true);
		  	   
		 		
	  	    	showhistory();
               checkcompplain=1;         
               btnNewButton_2.setEnabled(true);
			}}
		});
		panel_1.add(btnEditVisits);
		final javax.print.attribute.HashPrintRequestAttributeSet att = new javax.print.attribute.HashPrintRequestAttributeSet();
		
		JButton button_2 = new JButton("");
		button_2.setBounds(734, 584, 87, 30);
		button_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) 
		{
				if(list.getSelectedRow()<0)
				{
	           		JOptionPane.showMessageDialog(null,"select a patient record before");
	           	}
	           	else
	           	{	
	           		String [] detail=new String [10];
	           		try{
	           		
	           			int row=list.getSelectedRow();
		  		        DefaultTableModel md=(DefaultTableModel) list.getModel();
		  		        String Regn=md.getValueAt(row,0).toString();
	                    //String regnvalues=ShowRegn(Regn);
			   	
			   		
		  			//String Name_= (((DefaultListModel) list.getModel()).getElementAt(row)).toString();
					
					String query="select * from   Record where Regn='"+Regn+"';";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					
					while(rs.next())
					{ 
					   detail[0]=rs.getString("name");
					   detail[1]=rs.getString("Age");
					   detail[2]=rs.getString("Address");
					   detail[3]=rs.getString("contact");
					   detail[4]=rs.getString("Health");
					   detail[5]=rs.getString("alergies");
					   detail[6]=rs.getString("gender");
					}
					pst.close();
					rs.close();
			    }
				
				
				catch(Exception e){ 	}
				
				byte[] h=b;
		
				int tablerow=table.getRowCount();
				String [] tablevalueslenghth=new String[3*tablerow];
			    for(int i=0;i<tablerow*3;i++)
			    {
			    	tablevalueslenghth[i]=	(String) table.getValueAt(i/3, 1);
			    	tablevalueslenghth[i+1] =(String) table.getValueAt(i/3, 2);
			    	tablevalueslenghth[i+2]=	(String) table.getValueAt(i/3, 4);
			    	i=i+2;
			    }
			    
				int tablerow1=table_1.getRowCount();
				String [] table_1valueslenghth=new String[3*tablerow1];
			    for(int i=0;i<tablerow1*3;i++)
			    {
			    	table_1valueslenghth[i]=	(String) table_1.getValueAt(i/3, 1);
			    	table_1valueslenghth[i+1] = (String) table_1.getValueAt(i/3, 2);
			    	table_1valueslenghth[i+2]=	(String) table_1.getValueAt(i/3, 4);
			    	i=i+2;
			    }
			
				int tablerow2=table_4.getRowCount();
				String [] table_2valueslenghth=new String[3*tablerow2];
			    for(int i=0;i<tablerow2*3;i++)
			    {
			    	table_2valueslenghth[i]=(String) table_4.getValueAt(i/3, 1);
			    	table_2valueslenghth[i+1]=(String) table_4.getValueAt(i/3, 2);
			    	table_2valueslenghth[i+2]=(String) table_4.getValueAt(i/3, 4);
			    	i=i+2;
			    }
			
				int tablerow3=table_2.getRowCount();
				String [] table_3valueslenghth=new String[3*tablerow3];
			    for(int i=0;i<tablerow3*3;i++)
			    {
			    	table_3valueslenghth[i]=	(String) table_2.getValueAt(i/3, 1);
			    	table_3valueslenghth[i+1] =(String) table_2.getValueAt(i/3, 2);
			    	table_3valueslenghth[i+2]=	(String) table_2.getValueAt(i/3, 4);
			    	i=i+2;
			    }
			
				int tablerow4=table_3.getRowCount();
				String [] table_4valueslenghth=new String[3*tablerow4];
			    for(int i=0;i<tablerow4*3;i++){
			    	table_4valueslenghth[i]=(String) table_3.getValueAt(i/3, 1);
			    	if((String) table_3.getValueAt(i/3, 2)==null)
			    	{
			    		table_4valueslenghth[i+1] =" ";
			    		
			    	}
			    	else
			    	{
			    		table_4valueslenghth[i+1] =(String) table_3.getValueAt(i/3, 2);	
			    	
			    	}
			        if((String) table_3.getValueAt(i/3, 3)==null)
			        {
			    		table_4valueslenghth[i+2]="  ";
			        }
			    	else{
			    		
			    		table_4valueslenghth[i+2]=	(String) table_3.getValueAt(i/3, 3);
			    	}
			    	
			    	
			    	i=i+2;
			    	
			    	
			    	
			}
			    demo.main(null);
			
			}
		}	
		});
		button_2.setToolTipText("print");
		Image img123=new ImageIcon(this.getClass().getResource("/p27.png")).getImage();
		button_2.setIcon(new ImageIcon(img123));
		panel_1.add(button_2);
		
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Panel.background"));
		panel_2.setBounds(0, 0, 859, 614);
		panel.add(panel_2);
		panel_2.setFocusTraversalPolicyProvider(true);
		panel_2.setLayout(null);
		 
		 panel_6 = new JPanel();
		 panel_6.setBackground(new Color(255, 255, 255));
		 panel_6.setBounds(10, 105, 493, 498);
		 panel_6.setBorder(new TitledBorder(null, " Patient Record", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		 panel_2.add(panel_6);
		 panel_6.setLayout(null);
		 
		 scrollPane_18 = new JScrollPane();
		 scrollPane_18.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
		 scrollPane_18.setBounds(10, 24, 473, 463);
		 panel_6.add(scrollPane_18);
		 
		 textArea = new JTextArea();
		 scrollPane_18.setViewportView(textArea);
		 textArea.setEditable(false);
		 textArea.setTabSize(0);
		 textArea.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		 textArea.setLineWrap(true);
		 textArea.setText(" \n Select Record You Want to show ");
		 showPic = new JLabel("");
		 showPic.setSize(new Dimension(100, 100));
		 scrollPane_18.setColumnHeaderView(showPic);
		 showPic.setIcon(null);
		
		 btnNewPateint = new JButton("New pateint");
		 btnNewPateint.setFont(new Font("Tahoma", Font.BOLD, 15));
		 btnNewPateint.setBounds(24, 11, 152, 35);
		 panel_2.add(btnNewPateint);
		 
	    Edit = new JButton("Edit");
	    Edit.setFont(new Font("Tahoma", Font.BOLD, 15));
	    Edit.setBounds(186, 11, 152, 35);
		Edit.setEnabled(false);
		Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		    if(list.getSelectedRow()<0){
		    	JOptionPane.showMessageDialog(null, "Please select patient name before");
		    }
		    else{
				checkup =1;
		 		panel_2.setVisible(false);
                panel_3.removeAll();
                list.setEnabled(false);
                try{
	  				checkeditpicforupdate=false;
	  			    int row=list.getSelectedRow();
	  			    
	  			    DefaultTableModel m1=(DefaultTableModel) list.getModel();
		  			String Regn= m1.getValueAt(row,0).toString();
		  		
	  				String query="select * from   Record where Regn='"+Regn+"';";
	  				PreparedStatement pst=connection.prepareStatement(query);
	  				ResultSet rs=pst.executeQuery();
	  				
	  				while(rs.next())
	  				{  	
	  					 
                    
                      String he=rs.getString("health");
                      String el =rs.getString("alergies");
                      Refreshpanel_3(he,el);
                        Reg.setText(rs.getString("Regn"));
		  	    		Name.setText(rs.getString("name"));
		  	    		Age.setText(rs.getString("age")); 
		  	    	    Address.setText(rs.getString("address"));
		  	    		Gender.setSelectedItem((Object)rs.getString("Gender"));
		  	    		City.setText(rs.getString("city"));
		  	    		Contact.setText(rs.getString("contact"));
		  	    		Doctor.setText(rs.getString("doctor"));
		  	    		Date.setText(rs.getString("date"));
		  	    		//label_108.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(rs.getBytes("pic"))));
                
		  	    		//heleth=heleth.replaceAll(heleth, " ");	
		  	    	
		  	    		//aler=aler.replaceAll(aler, " ");
                     
	  				}
	  				pst.close();
	  				rs.close();
	  			}
	  			catch(Exception e){
	  				
	  			}
	  		
	  	    }
	  			
	  	    
			}  	  	
		 });
		 panel_2.add(Edit);
		 JButton Clear = new JButton("Clear");
		 Clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		 Clear.setBounds(270, 57, 193, 35);
		 Clear.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		textArea.setText("  Select Record You Want to show ");
		 		Edit.setEnabled(false);
		        btnDelete.setEnabled(false);
		        btnNewVisits.setEnabled(false);
		        btnNewVisits_1.setEnabled(false);
		        Refreshlist();
		 	}
		 });
		 panel_2.add(Clear);
		 
		  btnNewVisits = new JButton("New Visits");
		  btnNewVisits.setFont(new Font("Tahoma", Font.BOLD, 15));
		  btnNewVisits.setBounds(60, 57, 193, 35);
		  btnNewVisits.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  		 if(list.getSelectedRow()<0){
				    	JOptionPane.showMessageDialog(null, "Please select patient name before");
				    }
				    else{
					
		  		checkcompplain=0;
		  		tabbedPane.setSelectedIndex(1);
		  		 panel_8.setVisible(true);
	     	  	 panel_9.setVisible(false);
	     	  	 panel_16.setVisible(false);
	     	  	 panel_14.setVisible(true);
	     	  	 panel_17.setVisible(false);
	     	  	 panel_15.setVisible(true);
	     	  	 panel_18.setVisible(true);
	     	  	 panel_19.setVisible(false);
	     	  	 panel_20.setVisible(true);
	     	  	 panel_22.setVisible(false);
	     	  	 
	     	  	/// list.setEnabled(true);
	     	  	 list_1.setEnabled(true);
	     	  	 list_3.setEnabled(true);
	     	  	 list_4.setEnabled(true);
	     	     list_7.setEnabled(true);
	     	     list_9.setEnabled(true);
	     	     
	     	  	 tabbedPane.setEnabledAt(1, true);
	     	  	 btnNewVisits_1.setEnabled(false);
		         btnNewButton_2.setEnabled(false);
		         
		 	    
		     	   
		     	   
		        mntmEdit.setVisible(true);
			  	  mntmNewMenuItem.setVisible(true);
			  	  mntmNewMenuItem_1.setVisible(true);
			  	  mntmEdit_1.setVisible(true);
			  	  mntmEdit_2.setVisible(true); 	  
			  	  mntmDelete.setVisible(true);
			  	  mntmEdit_3.setVisible(true);
			  	  mntmDelete_1.setVisible(true);
			  	
			  	popupMenu_3.setVisible(true);
		  		popupMenu_2.setVisible(true);
		  	   	
		  	
		  		popupMenu_1.setVisible(true);
		  	   	popupMenu.setVisible(true);
			    
		 	    
		 	    
                
	     	  	listlabel.setText("Dragg...this");
                listlabel1.setText("Drag this and drop on chart");

                label_3.setText("Drag this and drop on chart");
                label_7.setText("Drag this and drop on chart");
                label_10.setText("Drag this and drop on chart");
	     		 table.setModel(new DefaultTableModel(
	     			new Object[][] {
	     				
	     			},
	     			new String[] {
	     				"Sr.No", "Teeth.No", "Complaints", "Date", "Comments"
	     			}
            	     		));
	
	     		table_1.setModel(new DefaultTableModel(
		 		    	new Object[][] {
		 		    		
		 		    	},
		 		    	new String[] {
		 		    		"Sr.No", "Teeth No.", "Findings", "Date", "Comments", "Mtrl Used"
		 		    	}
		 		    ));
	     		table_2.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No", "Work Done", "Date", "Fee ", "Comments", "Mtrl Used"
	     		    	}
	     		    ));
	     		 table_3.setModel(new DefaultTableModel(
		  			    	new Object[][] {
		  			    	},
		  			    	new String[] {
		  			    		" ", "Prescription", "Dosage", "Instruction", "Visit Date", ""
		  			    	}
		  			    ));
			    
	     		table_4.setModel(new DefaultTableModel(
	     		    	new Object[][] {
	     		    	},
	     		    	new String[] {
	     		    		"Sr.No", "Teeth No.", "Treatment Advised", "Date", "Fee"
	     		    	}
	     		    ));
		  	     }
		  	}
		  	
		  });
		  
		 btnNewVisits.setEnabled(false);
		 panel_2.add(btnNewVisits);
		 
		 amount = new JButton("Amount");
		 amount.setEnabled(false);
		 amount.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String h[]={"h"};
		 		edittable_5.main(h);
		 	}
		 });
		 amount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 amount.setBounds(532, 20, 132, 40);
		 panel_2.add(amount);
		 
		 addAmount = new JButton("Add Amount");
		 addAmount.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String h[]={"h"};
		 		edittable_6.main(h);
		 		
		 	}
		 });
		 addAmount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 addAmount.setBounds(688, 20, 149, 40);
		 panel_2.add(addAmount);
		 
		  btnDelete = new JButton("Delete");
		  btnDelete.setBounds(348, 11, 152, 35);
		  panel_2.add(btnDelete);
		  btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		  btnDelete.setEnabled(false);
		  
		  separator_3 = new JSeparator();
		  separator_3.setOrientation(SwingConstants.VERTICAL);
		  separator_3.setBounds(513, 26, 2, 603);
		  panel_2.add(separator_3);
		  
		  JPanel panel_24 = new JPanel();
		  panel_24.setBackground(new Color(255, 255, 255));
		  panel_24.setLayout(null);
		  panel_24.setBorder(new TitledBorder(null, " Patient Fees Record", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		  panel_24.setBounds(524, 105, 313, 498);
		  panel_2.add(panel_24);
		  
		  scrollPane_22 = new JScrollPane();
		  scrollPane_22.setBounds(10, 26, 293, 466);
		  panel_24.add(scrollPane_22);
		  
		  fees_table = new JTable();
		  fees_table.setModel(new DefaultTableModel(
					new Object[][] {
						
					},
					new String[] {
						 "Date","Amount","Status"
					}
				));
		  scrollPane_22.setViewportView(fees_table);
	  
		  		  
		  btnDelete.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  		 if(list.getSelectedRow()<0){
				    	JOptionPane.showMessageDialog(null, "Please select patient name before");
				    }
				 else{
					
		  		int action =JOptionPane.showConfirmDialog(null,"Do you really want to Delete the Data...",  "Warning",JOptionPane.YES_NO_OPTION);
		   		if(action==0){
		   		try{
		   			 int row=list.getSelectedRow();
		   			 DefaultTableModel tb=(DefaultTableModel) list.getModel();
		   			 
			  	    String Regn= tb.getValueAt(row,0).toString();
			  		String regnvalues=ShowRegn(Regn);
		   			String query="DELETE FROM Record WHERE Regn='"+Regn+"';";
		   			PreparedStatement pst=connection.prepareStatement(query);
		   		
		   		    pst.execute();
		   		    String query2="DELETE FROM complaints WHERE Regn='"+regnvalues+"';";
		   			PreparedStatement pst1=connection.prepareStatement(query2);
		   		
		   		    pst1.execute();
		   		
		   			JOptionPane.showMessageDialog(null,"Data Deleted");
		   		    pst.close();
		   			
		   		    Edit.setEnabled(false);
		   		    btnDelete.setEnabled(false);
		   		    Showrecord(" ");
		   		    
		   		   }
		   		catch(Exception e)
		   		{
	               			
		   		}
		   		Refreshlist();
		   			  		
		   		 }
		   }
		  	}		 
		  	});
	 
  		   scrollPane = new JScrollPane();
  		   scrollPane.setFont(new Font("Verdana", Font.PLAIN, 12));
  		   scrollPane.setBounds(14, 119, 393, 554);
  		   scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
		   contentPane.add(scrollPane);
		  
		   list =  new JTable();
		   list.setBorder(null);
		   list.setAutoscrolls(true);
		   scrollPane.setViewportView(list);
		   list.addMouseListener(new MouseAdapter() 
		   {
			   	@Override
			   	public void mouseClicked(MouseEvent arg0) 
			   	{
			   		if(list.isEnabled())
			   		{
				   		DefaultTableModel m=(DefaultTableModel)list.getModel();
			   			int row=list.getSelectedRow();
				   		
				   		if(row!=-1){
			  			String Regn= m.getValueAt(row,0).toString();
			  			
			  			String Name= m.getValueAt(row,1).toString();
			  			
			  			
			  	
			  			//String regnvalues=ShowRegn(Regn);
				   		Refreshcomplaintlist(Regn);
				   		
				   		Showrecord(Regn);
			  			s_no=Regn;
			  			s_name=Name;
			  			s_name=s_name.replaceAll(" ", "");
			  			s_table=s_name+s_no;
			  			
			  			fees_table.setModel(new DefaultTableModel(
								new Object[][] {
									
								},
								new String[] {
									 "Date","Amount","Status"
								}
							));
			  			
			  			try
			  			{
			  				String query="CREATE  TABLE  IF NOT EXISTS "+s_table+" (date DATETIME, total_amount DOUBLE, paid_amount DOUBLE, balance_amount DOUBLE,status TEXT)";
			  				PreparedStatement pst=connection.prepareStatement(query);
			  				pst.executeUpdate();
			  				
			  			}
			  			catch(Exception e1)
			  			{
			  				JOptionPane.showMessageDialog(null, "Table Not Created !"+ e1);
			  			}
			  			
			  			String date1=null,date2=null,date3=null;
							
			  			String i=null,status=null;
			  			Object rows1 []=new Object[3];
			  		   	DefaultTableModel model = (DefaultTableModel) fees_table.getModel();       		
			  		    
			  			try
			  			{
			  				String query="select * from "+s_table+"";
			  				PreparedStatement pst=connection.prepareStatement(query);
			  				ResultSet rs=pst.executeQuery();
			  				
			  				while(rs.next())
			  				{
			  					date1=rs.getString("date");
			  					status=rs.getString("status");
			  					if(rs.getString("total_amount")!=null)
			  					{	i=rs.getString("total_amount");
			  					}
			  					if(rs.getString("paid_amount")!=null)
			  					{	i=rs.getString("paid_amount");
			  					}
			  					if(rs.getString("balance_amount")!=null)
			  					{	i=rs.getString("balance_amount");
			  					}
			  				   model.addRow(new String[]{date1,i,status});  
			  				}
			  				pst.close();
			  				rs.close();
			  			}
			  			catch(Exception h)
			  			{
			  					
				  		}
			  		    fees_table.setModel(model);
			  			
			  		}
			  			
				   		
			   		}
			   		}
			/**
		   	 * @author Honeey
		   	 */

		   });
		   list.setFont(new Font("Kartika", Font.PLAIN, 15));
		   //list.setVisible(10);
		 
		 btnNewPateint.addActionListener(new ActionListener() {

		 	 public void actionPerformed(ActionEvent arg0) {
		 		          checkup =0;
		 		          list.setEnabled(false);
		 		          panel_2.setVisible(false);
		 		          Edit.setEnabled(false);
		 		          btnDelete.setEnabled(false);
		 		       
		 	    		  Refreshpanel_3("ee","dd");
		 	    		
                            	    	
             }
        });
 	  	 
 	 		
		Refreshpanel_3("ee","d");
		panel_3.setVisible(false);
		Refreshlist();
		
		panel_9.setVisible(false);
		panel_8.setVisible(true);
		 tabbedPane.setEnabledAt(1, false);
		 
		 JLabel lblAllPatientDetails = new JLabel("All Patient Details :");
		 lblAllPatientDetails.setForeground(new Color(255, 255, 255));
		 lblAllPatientDetails.setHorizontalAlignment(SwingConstants.CENTER);
		 lblAllPatientDetails.setOpaque(true);
		 lblAllPatientDetails.setBackground(new Color(0, 139, 139));
		 lblAllPatientDetails.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		 lblAllPatientDetails.setBounds(33, 30, 374, 42);
		 contentPane.add(lblAllPatientDetails);
		 Image img2=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
			 
			}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
		
			public void mousePressed(MouseEvent e) {
				
				if (e.isPopupTrigger()) {
					
					
				}
			}
			public void mouseReleased(MouseEvent e) {
		
				
				if (e.isPopupTrigger()&table.getSelectedRow()>=0&table.getSelectedColumn()>=0) {
					showMenu(e);
		
				}
				if (e.isPopupTrigger()&table_1.getSelectedRow()>=0&table_1.getSelectedColumn()>=0) {
					showMenuTable_1(e);
		
				}
				if (e.isPopupTrigger()&table_2.getSelectedRow()>=0&table_2.getSelectedColumn()>=0) {
					showMenuTable_2(e);
		
				}
				if (e.isPopupTrigger()&table_3.getSelectedRow()>=0&table_3.getSelectedColumn()>=0) {
					showMenuTable_3(e);
		
				}
				if (e.isPopupTrigger()&table_4.getSelectedRow()>=0&table_4.getSelectedColumn()>=0) {
					showMenuTable_4(e);
		
				}		
		
			}
			
			private void showMenu(MouseEvent e) {
				if(table.getSelectedColumn()==4){
					mntmEdit.setEnabled(true);
				popup.show(e.getComponent(), e.getX(), e.getY());
				}
				else{
					mntmEdit.setEnabled(false);
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			private void showMenuTable_1(MouseEvent e) {
				if(table_1.getSelectedColumn()>=4){
					 mntmEdit_1 .setEnabled(true);
				popup.show(e.getComponent(), e.getX(), e.getY());
				}
				else{
					 mntmEdit_1.setEnabled(false);
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			private void showMenuTable_2(MouseEvent e) {
				if(table_2.getSelectedColumn()>=4){
					 mntmEdit_2 .setEnabled(true);
				popup.show(e.getComponent(), e.getX(), e.getY());
				}
				else{
					 mntmEdit_2.setEnabled(false);
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			private void showMenuTable_3(MouseEvent e) {
				if(table_3.getSelectedColumn()==2||table_3.getSelectedColumn()==3){
					 mntmEdit_3 .setEnabled(true);
				popup.show(e.getComponent(), e.getX(), e.getY());
				}
				else{
					 mntmEdit_3.setEnabled(false);
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			private void showMenuTable_4(MouseEvent e) {
				
			     mntmEdit_4 .setEnabled(true);
				popup.show(e.getComponent(), e.getX(), e.getY());
				
				
			}
		});
	}
	@Override
	public void editingCanceled(ChangeEvent e) {
	
		System.out.print("Editcanceled");
	}
	@Override
	public void editingStopped(ChangeEvent e) {
		System.out.print("EditStop");
	
	}
	public static void Refreshcell(String infocomment)
	{
      table.setValueAt(infocomment, table.getSelectedRow(), 4);		
	}
	
	public static void feesTable(String date,String fees,String status){        
        double balance=0,total_amount=0;
        
        try
        {
        	String query="select total_amount from "+s_table+"";
        	PreparedStatement pst=connection.prepareStatement(query);
        	ResultSet rs=pst.executeQuery();
        	while(rs.next())
        	{
        		total_amount=rs.getDouble("total_amount");
        	}
        	pst.close();
        	rs.close();
        	
        	
        }
        catch(Exception e)
        {
        	
        }
        
        try
        {
        	String query="select balance_amount from "+s_table+"";
        	PreparedStatement pst=connection.prepareStatement(query);
        	ResultSet rs=pst.executeQuery();
        	while(rs.next())
        	{
        		balance=rs.getDouble("balance_amount");
        	}
        	pst.close();
        	rs.close();
        	
        	
        }
        catch(Exception e)
        {
        	
        }
        
        
        
        Object rows []=new Object[3];
	   	rows[0]=date;
	   	double fee=Double.parseDouble(fees);
	   	fee=fee+balance+total_amount;
	   	rows[1]=fee;
	   	rows[2]=status;
	   	DefaultTableModel model = (DefaultTableModel) fees_table.getModel();       		
        model.addRow(rows);
        
        
        
        try
        {
  				
				String query="insert into "+s_table+" (date,total_amount,status) values (?,?,?)";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, date);
				pst.setDouble(2, fee);
				pst.setString(3, status);
				pst.execute();
				
				
				addAmount.setEnabled(true);
        }
        catch(Exception eh)
        {
        	
        }
	}
	
	public static void feesPaidTable(String date,String fees,String status){
		double total_amount=0,balance_amount=0,remainingFees=0;
		
		try
        {
        	String query="select total_amount from "+s_table+"";
        	PreparedStatement pst=connection.prepareStatement(query);
        	ResultSet rs=pst.executeQuery();
        	while(rs.next())
        	{
        		total_amount=rs.getDouble("total_amount");
        	}
        	pst.close();
        	rs.close();
        	
        	
        }
        catch(Exception e)
        {
        	
        }
        
        try
        { 
        	String query="select balance_amount from "+s_table+"";
        	PreparedStatement pst=connection.prepareStatement(query);
        	ResultSet rs=pst.executeQuery();
        	while(rs.next())
        	{
        		balance_amount=rs.getDouble("balance_amount");
        	}
        	pst.close();
        	rs.close();
        	
        	
        }
        catch(Exception e)
        {
        	
        }
        Object rows []=new Object[3];
	   	rows[0]=date;
	   	rows[1]=fees;
		rows[2]=status;
	   	DefaultTableModel model = (DefaultTableModel) fees_table.getModel();       		
        model.addRow(rows);
        try
        {
  		  		
				String query="insert into "+s_table+" (date,paid_amount,status) values (?,?,?)";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, date);
				pst.setDouble(2, Double.parseDouble(fees));
				pst.setString(3, status);
				pst.execute();
				
        }
        catch(Exception eh)
        {
        	
        }
        if(balance_amount==0.0)
        {
        	remainingFees=total_amount-Double.parseDouble(fees);
        }
        else
        {
        	remainingFees=balance_amount-Double.parseDouble(fees);
        }
        
        
        rows[0]=date;
	   	rows[1]=remainingFees;
		rows[2]="Balancing Amount";
		model.addRow(rows);
		
		try
        {
        		
				String query="insert into "+s_table+" (date,balance_amount,status) values (?,?,?)";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, date);
				pst.setDouble(2, remainingFees);
				pst.setString(3, (String) rows[2]);
				pst.execute();
				
		
        }
        catch(Exception eh)
        {
        	
        }
		
		
		try
        {
        		
				String query="update  Record set balance_amount=? where Regn="+s_no+"";
				PreparedStatement pst=connection.prepareStatement(query);
				
				pst.setDouble(1, remainingFees);
				
				pst.execute();
				
		
        }
        catch(Exception eh)
        {
        	
        }
	}
	
	
	
	public static void Refreshcelltable_1(String infocomment,String infomtrl){
		
	      table_1.setValueAt(infocomment, table_1.getSelectedRow(), 4);	
	      table_1.setValueAt(infomtrl, table_1.getSelectedRow(), 5);
		}
	public static void Refreshcelltable_2(String infocomment,String infomtrl,String feeinfo){
		
			//wd=wd+Integer.parseInt(feeinfo);
	      table_2.setValueAt(infocomment, table_2.getSelectedRow(), 5);	
	      table_2.setValueAt(infomtrl, table_2.getSelectedRow(), 6);
	      table_2.setValueAt(feeinfo, table_2.getSelectedRow(), 4);
		}
	public static void Refreshcelltable_3(String infodosage,String infoinstruction){
		
	      table_3.setValueAt(infodosage, table_3.getSelectedRow(), 2);	
	      table_3.setValueAt(infoinstruction, table_3.getSelectedRow(), 3);
	      
		}
	public static void Refreshcelltable_4(String infotreatement,String infofee){
		
		 // tt=tt+Integer.parseInt(infofee);
	      table_4.setValueAt(infotreatement, table_4.getSelectedRow(), 2);	
	      table_4.setValueAt(infofee, table_4.getSelectedRow(), 4);
	      
		}
	public static void Refreshaddtable_3(String prescriptio,String dosageinfo,String instructioninfo){

		 Calendar cal=new GregorianCalendar();
			int day=cal.get(Calendar.DAY_OF_MONTH);
		   	int month=cal.get(Calendar.MONTH);
		   	month=month+1;
		   	int year=cal.get(Calendar.YEAR);

		DefaultTableModel model = (DefaultTableModel) table_3.getModel();
        
		  String[] data={ " ",prescriptio,dosageinfo,instructioninfo,day+"/"+month+"/"+year,""  };
	      model.addRow(data);
	}
}

