import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class BalanceSheet extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static BalanceSheet frame;
	static Connection connection=null;
	private JTable table;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
					 catch (Exception e) {  }
				    					 
					frame = new BalanceSheet();
					
				  } catch (Exception e) {
				    e.printStackTrace();
			}
		}
		});
	}

	
	public BalanceSheet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	     setBounds(0, 0,1364 ,728);  
		 setMinimumSize(new Dimension(1100, 720));
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
		
		JMenuItem mntmExit = new JMenuItem("Back              ");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i=JOptionPane.showConfirmDialog(null, "You are going to main page");
					if(i==0){
						
					frame.dispose();
					Activity_1.main(null);
				
					}
			}
		});
		mnFile.add(mntmExit);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 103, 954, 570);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try
		{
			String query="select Regn,Name,contact,Address,balance_amount from Record where balance_amount>0";
			PreparedStatement ps=connection.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			ps.close();
			rs.close();
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.LIGHT_GRAY, null, null));
		panel.setBounds(1083, 11, 269, 662);
		getContentPane().add(panel);
		
		Image img2=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
		JLabel label = new JLabel();
		label.setBounds(9, 13, 247, 200);
		label.setIcon(new ImageIcon(img2));
		panel.add(label);
		
		JLabel label_1 = new JLabel("DentoTech");
		label_1.setFont(new Font("Dialog", Font.BOLD, 35));
		label_1.setBounds(9, 213, 218, 49);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Support :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(9, 265, 67, 20);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("<html>  <a href=\"\">www.mtbtechnologies.com</a></html>");
		label_3.setToolTipText("click for support");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(35, 289, 198, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Report  :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(9, 323, 67, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("<html>  <a href=\"\">report@mtbtechnologies.com</a></html>");
		label_5.setToolTipText("feel free  for Report Bug or Ecnhacement  click here");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(35, 343, 215, 20);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Contact :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(9, 401, 67, 20);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("+91-96672-60088");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(74, 401, 244, 20);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("+91-96800-40088");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(74, 434, 244, 20);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Support :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(9, 265, 67, 20);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("<html>  <a href=\"\">www.mtbtechnologies.com</a></html>");
		label_10.setToolTipText("click for support");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_10.setBounds(35, 289, 198, 20);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Report  :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(9, 322, 67, 20);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("<html>  <a href=\"\">report@mtbtechnologies.com</a></html>");
		label_12.setToolTipText("feel free  for Report Bug or Enhacement  click here");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(35, 343, 215, 20);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Contact :");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_13.setBounds(9, 401, 67, 20);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("+91-96672-60088");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_14.setBounds(74, 401, 244, 20);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("+91-96800-40088");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_15.setBounds(74, 434, 244, 20);
		panel.add(label_15);
		
		JLabel lblBalanceSheetOf = new JLabel("Balance Sheet of patient who have some balance to be paid to us ");
		lblBalanceSheetOf.setForeground(new Color(255, 255, 255));
		lblBalanceSheetOf.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblBalanceSheetOf.setOpaque(true);
		lblBalanceSheetOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalanceSheetOf.setBackground(new Color(0, 139, 139));
		lblBalanceSheetOf.setBounds(168, 43, 607, 53);
		getContentPane().add(lblBalanceSheetOf);
	}
}
