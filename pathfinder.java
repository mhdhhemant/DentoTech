import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class pathfinder extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	static pathfinder dialog;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			dialog = new pathfinder();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	Connection connection;
	public pathfinder() {
	
		connection=sqliteconnection.dbconnector();
        Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	setIconImage(Imgh);
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		setBounds(100, 100, 567, 340);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-450/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-300/2 );
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblSelectYouPath = new JLabel("Select path for Backup...");
		lblSelectYouPath.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSelectYouPath.setBounds(12, 38, 378, 29);
		contentPanel.add(lblSelectYouPath);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setText("C:\\ProgramData\\DentoTech");
		textField.setBounds(12, 70, 393, 30);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				
				@SuppressWarnings("unused")
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT files", "txt","PNG","png","exe");
				//chooser.setFileFilter(filter);
				chooser.setFileSelectionMode(1);
			  chooser.setCurrentDirectory(new File("E:\\"));
				int returnVal = chooser.showSaveDialog(getParent());
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					textField.setText(chooser.getSelectedFile().getPath()+"");
				 ///  System.out.println("You chose to open this file: " +
				    //    chooser.getSelectedFile().getPath()+"");
			}
				
				}
		});
		btnBrowse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBrowse.setBounds(417, 69, 120, 33);
		contentPanel.add(btnBrowse);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection conn = null;
				wait wail=new wait();
				
				try{
					Class.forName("org.sqlite.JDBC");
					conn =DriverManager.getConnection("jdbc:sqlite:"+textField.getText()+"\\empoyee.sqlite"); 
				    
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e);
					
					}
				int j=0;
		 		String k[]=new String [11];
		 		try{	
		 		String query="select * from sqlite_master where type='table'";	
				PreparedStatement pst=connection.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
		        String gh="";
		        while(rs.next())
		        {	
		        gh=rs.getString("sql");
		          if((gh==null||gh.equals("CREATE TABLE sqlite_sequence(name,seq)"))){
		         
		          }
		          else{
		        	  k[j]=gh;
		        
		        	  j=j+1;  
		          }
		        }

			    pst.close();
			    rs.close();
			    
			   }
			catch(Exception e)
			{e.printStackTrace();
		   JOptionPane.showMessageDialog(null, e);				
			}

               for(int i=0;i<11;i++){
        	try{	
    	    String query=  k[i];  	
		    PreparedStatement pst=conn.prepareStatement(query);
            pst.execute();
            pst.close();	        
	         }
	          catch(Exception e)
	         { e.printStackTrace();}
	        }

    	try{	String query="select * from alergies ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("alergi");
          
        	try{
        		
        		String query1 ="insert into alergies (alergi) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}
        
    	
    	try{	String query="select * from complaint ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("comlaint");
          
        	try{
        		
        		String query1 ="insert into complaint (comlaint) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}

    	try{	String query="select * from health_alert ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("health_alert");
          
        	try{
        		
        		String query1 ="insert into health_alert (health_alert) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}

    	try{	String query="select * from on_examination ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("examination");
          
        	try{
        		
        		String query1 ="insert into on_examination (examination) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}
    	try{	String query="select * from prescription ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("prescription");
          
        	try{
        		
        		String query1 ="insert into prescription (prescription,dosage,instruction) values(?,?,?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
                pst1.setString(2, rs.getString("dosage"));
                pst1.setString(3, rs.getString("instruction"));
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}

    	try{	String query="select * from rx_advise ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("advise");
          
        	try{
        		
        		String query1 ="insert into rx_advise (advise) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}
    	try{	String query="select * from work_done ";	
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
       String kl="";
        while(rs.next())
        {	kl= rs.getString("work_done");
          
        	try{
        		
        		String query1 ="insert into work_done (work_done) values(?)";
           		PreparedStatement pst1=conn.prepareStatement(query1);
                pst1.setString(1, kl);
        		pst1.execute();
        		pst1.close();
                        	
        	}
        		 catch(Exception e){
        			// e.printStackTrace();
        		 JOptionPane.showMessageDialog(null, e);
        		 }
        	                	 
            }

	    pst.close();
	    rs.close();
	   
	   }
	catch(Exception e)
	{e.printStackTrace();
   JOptionPane.showMessageDialog(null, e);				
	}
    	try{
    		
    		String query1 ="insert into empollyee (id) values(?)";
       		PreparedStatement pst1=conn.prepareStatement(query1);
            pst1.setString(1,"1");
    		pst1.execute();
    		pst1.close();
                    	
    	}
    		 catch(Exception e){
    			// e.printStackTrace();
    		 JOptionPane.showMessageDialog(null, e);
    		 }
    	                	 
        
    	        wail.dispose();
     	        dialog.dispose();
				String s[]={};
				userdata.main(s);
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNext.setBounds(412, 232, 97, 30);
		contentPanel.add(btnNext);
	
	}
	
	 }
