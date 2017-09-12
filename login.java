import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPasswordField;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import javax.swing.border.LineBorder;
public class login  
{

	private JFrame frmDentotech;
	static welcome wel;
	static String firstlabel="";
	
	private static String serialkey[]={ "83-763-626-34-766-51-864",
			"46-475-350-27-008-76-104",
			"49-288-410-84-373-46-294",
			"19-863-910-40-923-76-600",
		    "03-240-169-47-929-14-617",
		    "83-031-942-77-084-25-277",
		    "82-745-822-34-964-62-149",
		    "73-044-390-43-650-18-424",
		    "83-985-311-44-448-41-065",
		   "06-945-724-36-788-89-560",
		   "61-619-878-99-369-44-775",
		   "73-700-211-61-154-48-538",
		   "03-395-620-22-758-48-990",
		   "97-175-532-53-471-97-174",
		   "66-924-113-15-430-71-117",
		   "10-929-924-75-278-61-610",
		   "40-881-293-69-159-01-517",
		   "39-811-548-35-221-70-996",
		   "78-809-606-28-920-06-973",
		   "11-391-952-21-157-46-065",
		   "26-155-087-62-984-71-554",
		   "99-056-048-11-412-40-235",
		   "45-667-263-95-957-99-847",
		   "08-201-385-05-080-83-484",
		   "92-869-168-79-322-98-580",
		   "44-655-132-62-176-44-382",
		   "67-456-097-32-585-60-487",
		   "14-078-305-72-490-40-438",
		   "37-397-603-78-582-45-187",
		   "22-503-335-70-361-73-503",
		   "55-767-721-02-076-17-128",
		   "19-798-131-10-452-25-578",
		   "28-355-814-20-556-18-143",
		   "27-333-468-78-737-35-385",
		   "00-217-708-15-788-16-807",
		   "62-321-142-47-774-50-509",
		   "52-922-866-78-385-62-298",
		   "59-930-875-98-981-07-119",
		   "18-796-874-49-209-80-745",
		   "73-332-744-78-401-17-641",
		   "53-126-119-50-675-81-764",
		   "20-566-099-93-320-16-658",
		   "00-459-763-79-700-72-160",
		   "44-663-410-28-244-24-160",
		   "81-137-984-36-657-13-596",
		   "39-762-843-78-734-90-953",
		   "72-917-022-73-334-94-944",
		   "75-295-324-37-015-35-330",
		   "23-586-664-01-680-01-836",
		   "47-206-028-65-845-17-025"};
	
   static String l=""; 	
	public static void main(String[] args) {
	if((args.length)!=0)
	{
	 firstlabel=args[0];
	}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
					 catch (Exception e) {  }
			    
					l=usename();
			     	 final login window = new login();
			     	 l=usename();								
                     textField.setText(l);     					 
                    
					 window.frmDentotech.setUndecorated(false);
	
                     if(firstlabel=="1"||firstlabel=="3"||firstlabel=="4"){
    					
                    	 //window.frmDentotech.setLocation(520, 260);
                    	   window.frmDentotech.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-378/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-324/2);
	                         
                    	 window.frmDentotech.setVisible(true);
                    	 
                     }
                     else{
                    	 
                     
					final start   st=new start();
					st.setUndecorated(true);
					
							
					st.setVisible(true);
					
					Thread clock=new Thread()
							{
				
					public void run()
					{
						try { 
							
							for(int i=0;i<=100;i++)
							{		
								System.out.println(9);	
								              								              
								if (i==100)
								{
									 
									 st.dispose();
								
					     			if((usercheck())!=1) 
									{
									 
				                  	  welcome.main(null);
					     			 
							      }
									else{
										
	                                l=usename();								
	                                textField.setText(l);     					 
	                       //         window.frmDentotech.setLocation(520, 260);
	                            window.frmDentotech.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-378/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-324/2);
	                                window.frmDentotech.setVisible(true);
									}
					     		
								}
							
								if(i<90)
								st.setOpacity(Float.parseFloat("0."+(100-i)+"\b")); 
								else
									st.setOpacity(0.0f);
								sleep(76);
							}
						} catch (InterruptedException e) {
						
						}		
					}
					};
				      clock.start(); 
                     }     
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			});
		
	}
	static Connection connection1=null;
	private static JTextField textField;
	private JPasswordField passwordField;

	
	public static int usercheck(){
		  int re = 0 ;
		   Connection connection=sqliteconnection.dbconnector();
		  try{
		  String query="select * from   empollyee ;";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{ 
				re= Integer.parseInt( rs.getString("id"));
				
			}
			pst.close();
			rs.close();
		}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		  finally {
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		return re;
	  }

	@SuppressWarnings("unused")
	public static boolean registyrationcheck(){
		  int id = 0 ;
		   String registerdate=null;
		  String key = null;
		  try{
			
			  String query="select * from  register ;";
				PreparedStatement pst=connection1.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{ 
				id= Integer.parseInt( rs.getString("id"));
		         registerdate=rs.getString("registerdate");
		         key=rs.getString("register");
		          
			}
			pst.close();
			rs.close();
		}
			catch(Exception e){
			
			}
		  
		  if(key!=null){
			  for(int i=0;i<serialkey.length;i++){
			      if(key.equals(serialkey[i])){
				  return true;
			      }
			  }
			  return false;
		  }
		  else if (key==null){
			  return false;
		  }
		  
		return false;
		  

	  }


	public login() {
		initialize();
		 
        connection1=sqliteconnection.workdbconnector();	
			
	}

	private void initialize() {
		
		frmDentotech = new JFrame();
		frmDentotech.setLocationByPlatform(true);
		
		frmDentotech.setTitle("DentoTech");
		frmDentotech.getContentPane().setBackground(UIManager.getColor("Panel.background"));
		frmDentotech.setResizable(false);
      Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	
    	frmDentotech.setIconImage(Imgh);
		frmDentotech.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
		//		Window.TRANSPARENT=new window();
			}
		});
		
		frmDentotech.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frmDentotech.setBounds(100, 100, 378, 324);
		
		frmDentotech.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-378/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-324/2);
		frmDentotech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDentotech.getContentPane().setLayout(null);
		@SuppressWarnings("unused")
		Image img1=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
	
	textField = new JTextField();
	
	textField.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();

			if ( (c == ' ')||textField.getText().length()>=40) {

				Toolkit.getDefaultToolkit().beep();
				
                  e.consume();

			  }
		//	System.out.println(qualification.getText().length());
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});

	textField.setBorder(new LineBorder(Color.GRAY, 1, true));
	textField.setBounds(61, 108, 250, 30);
	frmDentotech.getContentPane().add(textField);
	textField.setFont(new Font("Tahoma", Font.BOLD, 14));
	textField.setBackground(Color.WHITE);
	textField.setColumns(10);
	
	passwordField = new JPasswordField();
	passwordField.addKeyListener(new KeyListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();

			if ( (c == ' ')||passwordField.getText().length()>=24) {

				Toolkit.getDefaultToolkit().beep();
				
                  e.consume();

			  }
			
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});

	passwordField.addActionListener(new ActionListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			if(firstlabel=="1"||firstlabel=="3"){
				Connection connection=sqliteconnection.dbconnector();
				try{
		  			@SuppressWarnings("deprecation")
					String query="update empollyee set name='"+textField.getText()+"',password='"+passwordField.getText()+"' where id=1;";
		  			PreparedStatement pst=connection.prepareStatement(query);
		  			
		  		   pst.execute();
		  		   
		  		   pst.close();
		  		   frmDentotech.dispose();
		  		 if(registyrationcheck()){
		  			 connection.close();
	             	Activity_1.main(new String []{});
	             }
	             else{
	            	 connection.close();
	             	t.main(null);
	             }
		  			//Activity_1.main(null);
	                //Activity_1 frame1 = new Activity_1();
	              
					//frame1.setVisible(true);
		  			
		  		}
		  		catch(Exception e2)
		  		{
	               JOptionPane.showMessageDialog(null, e2);				
		  		}
			}
			else{
				Connection connection=sqliteconnection.dbconnector();
			
				try{
					String query="select * from empollyee where Name= ? and password= ? and id=1 ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textField.getText() );
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next())
					{
						count=count+1;
					}
					if(count==1)
					{
						
						        frmDentotech.dispose();
		                        
		                        //Activity_1 frame1 = new Activity_1();
		                        //frame1.setLocation(220,50);
		    					//frame1.setVisible(true);
		    					//Activity_1.main(new String []{});
		                if(registyrationcheck()){
		                	Activity_1.main(new String []{});
		                }
		                else{
		                	t.main(null);
		                }
						        
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "username and password is duplicate");
					}
					else if(count==0)
					{
						JOptionPane.showMessageDialog(null, "username and password is not correct");
					}
					rs.close();
					pst.close();
			     
			}
				catch(Exception e1)
				{
					 JOptionPane.showMessageDialog(null, "Enter right user name and password  ");

				}
		finally {	try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					}
			
			
			}

			
		}
	});
	passwordField.setBorder(new LineBorder(Color.GRAY, 1, true));
	passwordField.setBounds(61, 173, 250, 30);
	frmDentotech.getContentPane().add(passwordField);
	passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
	passwordField.setForeground(new Color(0, 0, 0));
	passwordField.setBackground(Color.WHITE);
	

	JLabel lblUsername = new JLabel("UserName");
	lblUsername.setBounds(61, 77, 116, 28);
	frmDentotech.getContentPane().add(lblUsername);
	lblUsername.setBackground(new Color(240, 240, 240));
	lblUsername.setForeground(Color.BLACK);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
	
	JLabel lblPassword = new JLabel("Password ");
	lblPassword.setBounds(63, 147, 118, 26);
	frmDentotech.getContentPane().add(lblPassword);
	lblPassword.setForeground(Color.BLACK);
	
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
	
	
	JButton btnLogin = new JButton("login");
	btnLogin.setBounds(191, 220, 127, 31);
	frmDentotech.getContentPane().add(btnLogin);
	btnLogin.setBackground(new Color(245, 222, 179));
	
	btnLogin.addActionListener(new ActionListener() {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent arg0) 
		{
			if(firstlabel=="1"||firstlabel=="3"){
			Connection connection=sqliteconnection.dbconnector();
			try{
	  			String query="update empollyee set name='"+textField.getText()+"',password='"+passwordField.getText()+"' where id=1;";
	  			PreparedStatement pst=connection.prepareStatement(query);
	  			
	  		   pst.execute();
	  		   
	  		   pst.close();
	  		   frmDentotech.dispose();
	  		 if(registyrationcheck()){
	  			 connection.close();
             	Activity_1.main(new String []{});
             }
             else{
            	 connection.close();
             	t.main(null);
             }
	  			//Activity_1.main(null);
                //Activity_1 frame1 = new Activity_1();
              
				//frame1.setVisible(true);
	  			
	  		}
	  		catch(Exception e)
	  		{
               JOptionPane.showMessageDialog(null, e);				
	  		}
		}
		else{
			Connection connection=sqliteconnection.dbconnector();
		
			try{
				String query="select * from empollyee where Name= ? and password= ? and id=1 ";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1,textField.getText() );
				pst.setString(2, passwordField.getText());
				ResultSet rs=pst.executeQuery();
				int count=0;
				while(rs.next())
				{
					count=count+1;
				}
				if(count==1)
				{
					
					        frmDentotech.dispose();
	                        
	                        //Activity_1 frame1 = new Activity_1();
	                        //frame1.setLocation(220,50);
	    					//frame1.setVisible(true);
	    					//Activity_1.main(new String []{});
	                if(registyrationcheck()){
	                	Activity_1.main(new String []{});
	                }
	                else{
	                	t.main(null);
	                }
					        
				}
				else if(count>1)
				{
					JOptionPane.showMessageDialog(null, "username and password is duplicate");
				}
				else if(count==0)
				{
					JOptionPane.showMessageDialog(null, "username and password is not correct");
				}
				rs.close();
				pst.close();
		     
		}
			catch(Exception e)
			{
				 JOptionPane.showMessageDialog(null, "Enter right user name and password  ");

			}
	finally {	try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				}
		
		
		}
		}
	});
	btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
	
	JButton btnSetting = new JButton("Setting");
	btnSetting.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			frmDentotech.dispose();
			String b[]={"2"};
			try{
			userdata.main(b);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	});
	btnSetting.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnSetting.setBackground(new Color(245, 222, 179));
	btnSetting.setBounds(61, 220, 118, 31);
	frmDentotech.getContentPane().add(btnSetting);
	
	JLabel label = new JLabel("");
	label.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label.setBounds(12, 24, 360, 30);
	frmDentotech.getContentPane().add(label);
	if(firstlabel=="1"){
		label.setText("    It is your first time set Username and password");
	}
	if(firstlabel=="3"){
		label.setText("    your data is updated set username and password");
	}

	}
	public static String usename(){
		  String re = "";
		  Connection connection=sqliteconnection.dbconnector();		
			
		  try{
		      String q="select * from empollyee where id=1";
				PreparedStatement pst=connection.prepareStatement(q);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{ 
					
			
					re=  rs.getString("doctor_name");
				}
				pst.close();
				rs.close();
			}
				catch(Exception e){
				
				}
	finally {
				
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				}
		
				return re;		
	}
	
}
