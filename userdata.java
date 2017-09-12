import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class userdata extends JFrame {

	private static final long serialVersionUID = 1L;
	int xonx=0;
	int yony=0;
	private JPanel contentPane;
	private JTextField clinic_name;
	private JTextField doctor_name;
	private JTextField license_no;
	private JTextField qualification;
	private JTextField clinic_tag_line;
	private JTextField zip;
	private JTextField phone;
	private JTextField email;
	private JTextField website;
	private JTextField phone_1;
	private JTextField time;
	private JTextField time_1;
	@SuppressWarnings("rawtypes")
	private JComboBox state;
    private JTextArea address;
    private JButton blogin;
    private JButton btnActivateUnregistaredLicense;
	/**
	 * Launch the application.
	 */
    static userdata frame;
    static String updatecheck="";
	public static void main(String[] args) {
		if((args.length)!=0){
			updatecheck=args[0];
			
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
			            // Set System L&F
			        UIManager.setLookAndFeel(
			            UIManager.getSystemLookAndFeelClassName());
			    } 
			    catch (UnsupportedLookAndFeelException e) {
			       // handle exception
			    }
			    catch (ClassNotFoundException e) {
			       // handle exception
			    }
			    catch (InstantiationException e) {
			       // handle exception
			    }
			    catch (IllegalAccessException e) {
			       // handle exception
			    }
				  frame = new userdata();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
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
				try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
		           }
	
		  
		return re;
	}

	private final JLabel label_1 = new JLabel("");
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public userdata() {
        Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	setIconImage(Imgh);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 593);
		
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-657/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-593/2);
		contentPane = new JPanel();
		
		contentPane.setMaximumSize(new Dimension(100, 100));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(178, 34, 34), 4, true), "                                                                                                                                                              ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToDentotech = new JLabel("Welcome to DentoTech");
		lblWelcomeToDentotech.setBounds(195, 5, 233, 25);
		lblWelcomeToDentotech.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblWelcomeToDentotech);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Algerian", Font.PLAIN, 16));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "This copy is licensed to", TitledBorder.LEADING, TitledBorder.TOP,  new Font("Algerian", Font.PLAIN, 15),new Color(0, 0, 0)));
		panel_1.setBounds(12, 34, 627, 135);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		clinic_name = new JTextField();
		clinic_name.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!((c >= ' ') ||(c >= '0') && (c <= '9')||(c >= 'a') && (c <= 'z') ||(c >= 'A') && (c <= 'Z') ||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))||clinic_name.getText().length()>55) {

				        getToolkit().beep();
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
		clinic_name.setBounds(6, 39, 253, 24);
		panel_1.add(clinic_name);
		clinic_name.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		clinic_name.setColumns(10);
		
		doctor_name = new JTextField();
		doctor_name.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!((c >= ' ') ||(c >= '0') && (c <= '9')||(c >= 'a') && (c <= 'z') ||(c >= 'A') && (c <= 'Z') ||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))||doctor_name.getText().length()>62) {

				        getToolkit().beep();
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

		doctor_name.setBounds(294, 39, 318, 24);
		panel_1.add(doctor_name);
		doctor_name.setColumns(10);
		doctor_name.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		JLabel lblClinic = new JLabel("Clinic Name");
		lblClinic.setBounds(9, 18, 89, 19);
		panel_1.add(lblClinic);
		lblClinic.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClinic.setForeground(Color.RED);
		
		JLabel lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setBounds(297, 19, 97, 19);
		panel_1.add(lblDoctorName);
		lblDoctorName.setForeground(Color.RED);
		lblDoctorName.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblDr = new JLabel("Dr.");
		lblDr.setBounds(266, 41, 23, 19);
		panel_1.add(lblDr);
		lblDr.setForeground(Color.BLACK);
		lblDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		license_no = new JTextField("A132");
		license_no.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!((c >= ' ')||(c >= '0') && (c <= '9')||(c >= 'a') && (c <= 'z') ||(c >= 'A') && (c <= 'Z') ||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))||license_no.getText().length()>29) {

				        getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(license_no.getText().length());
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
		license_no.setBounds(6, 90, 146, 24);
		panel_1.add(license_no);
		license_no.setColumns(10);
		license_no.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		JLabel lblDentalLicenseNo = new JLabel("Dental License No");
		lblDentalLicenseNo.setBounds(7, 69, 135, 19);
		panel_1.add(lblDentalLicenseNo);
		lblDentalLicenseNo.setForeground(Color.RED);
		lblDentalLicenseNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		qualification = new JTextField();
		qualification.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!((c >= ' ') ||(c == '.') || (c == ',')|| (c == '"')|| (c >= '0') && (c <= '9')||(c >= 'a') && (c <= 'z') ||(c >= 'A') && (c <= 'Z') ||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))||qualification.getText().length()>=40) {

				        getToolkit().beep();
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
		qualification.setBounds(162, 91, 194, 24);
		panel_1.add(qualification);
		qualification.setColumns(10);
		qualification.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		clinic_tag_line = new JTextField();
		clinic_tag_line.setText("Cosmetic & family dentistry");
		clinic_tag_line.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (clinic_tag_line.getText().length()>=47) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(clinic_tag_line.getText().length());
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

		clinic_tag_line.setBounds(368, 91, 244, 24);
		panel_1.add(clinic_tag_line);
		clinic_tag_line.setColumns(10);
		clinic_tag_line.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setBounds(165, 71, 76, 19);
		panel_1.add(lblQualification);
		lblQualification.setForeground(Color.BLACK);
		lblQualification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblClinicTagLine = new JLabel("Clinic Tag Line");
		lblClinicTagLine.setBounds(367, 71, 91, 19);
		panel_1.add(lblClinicTagLine);
		lblClinicTagLine.setForeground(Color.BLACK);
		lblClinicTagLine.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		zip = new JTextField();
		zip.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (zip.getText().length()>=21) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(zip.getText().length());
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
		zip.setColumns(10);
		zip.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		zip.setBounds(164, 303, 120, 24);
		contentPane.add(zip);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
		scrollPane.setBounds(19, 195, 253, 86);
		contentPane.add(scrollPane);
		
	    address = new JTextArea();
		address.setBorder(null);
		scrollPane.setViewportView(address);
		address.setWrapStyleWord(true);
		address.setLineWrap(true);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(303, 196, 32, 261);
		contentPane.add(separator);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(22, 174, 52, 19);
		contentPane.add(lblAddress);
		
		state = new JComboBox();
		state.setIgnoreRepaint(true);
		state.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		state.setBounds(19, 303, 136, 26);
		contentPane.add(state);
		state.setSelectedItem("Rajasthan");
		JLabel lblState = new JLabel("State");
		lblState.setForeground(Color.BLACK);
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblState.setBounds(22, 283, 52, 19);
		contentPane.add(lblState);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		lblZip.setForeground(Color.BLACK);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblZip.setBounds(163, 283, 52, 19);
		contentPane.add(lblZip);
		
		phone = new JTextField();
		phone.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (phone.getText().length()>=12) {

				      getToolkit().beep();
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
		phone.setColumns(10);
		phone.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		phone.setBounds(19, 355, 135, 24);
		contentPane.add(phone);
		
		JLabel lblEmail = new JLabel("Phone");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(22, 335, 52, 19);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (email.getText().length()>=56) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(email.getText().length());
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
		email.setColumns(10);
		email.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		email.setBounds(19, 402, 265, 24);
		contentPane.add(email);
		
		JLabel lblWebsite = new JLabel("Email");
		lblWebsite.setForeground(Color.BLACK);
		lblWebsite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWebsite.setBounds(21, 382, 52, 19);
		contentPane.add(lblWebsite);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(73, 167, 487, 8);
		contentPane.add(separator_1);
		
		website = new JTextField();
		website.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (website.getText().length()>=1000) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(zip.getText().length());
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
		website.setColumns(10);
		website.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		website.setBounds(19, 447, 265, 24);
		contentPane.add(website);
		
		JLabel lblWebsite_1 = new JLabel("Website");
		lblWebsite_1.setForeground(Color.BLACK);
		lblWebsite_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWebsite_1.setBounds(21, 428, 52, 19);
		contentPane.add(lblWebsite_1);
		
		phone_1 = new JTextField();
		phone_1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (phone_1.getText().length()>=12) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(zip.getText().length());
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
		phone_1.setColumns(10);
		phone_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		phone_1.setBounds(159, 355, 130, 24);
		contentPane.add(phone_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Clinic Timings", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), new Color(0, 0, 0)));
		panel.setBounds(325, 188, 285, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		time = new JTextField();
		time.setText("9 a.m. to 1 p.m. & 2.30 p.m. to 6 p.m.");
		time.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (time.getText().length()>=60) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(time.getText().length());
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
		time.setBounds(10, 18, 253, 24);
		panel.add(time);
		time.setColumns(10);
		time.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		time_1 = new JTextField();
		time_1.setText("Sat. evening & Sun closed");
		time.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				@SuppressWarnings("unused")
				char c = e.getKeyChar();

			
				if (time.getText().length()>=60) {

				      getToolkit().beep();
                      e.consume();

				  }
				//System.out.println(zip.getText().length());
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
		time_1.setBounds(10, 52, 253, 24);
		panel.add(time_1);
		time_1.setColumns(10);
		time_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 220, 220), null, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		panel_2.setBounds(322, 293, 305, 178);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHttpwwwmtbtechnologiescom = new JLabel("www.mtbtechnologies.com");
		lblHttpwwwmtbtechnologiescom.setBounds(53, 119, 192, 20);
		panel_2.add(lblHttpwwwmtbtechnologiescom);
		lblHttpwwwmtbtechnologiescom.setForeground(Color.BLUE);
		lblHttpwwwmtbtechnologiescom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
	    btnActivateUnregistaredLicense = new JButton("Activate unrestricted license");
	    if(registraioncheck.registyrationcheck()==false){
	    btnActivateUnregistaredLicense.setEnabled(true);
	    btnActivateUnregistaredLicense.setVisible(true);
	    }
	    else{

		    btnActivateUnregistaredLicense.setEnabled(false);
		    btnActivateUnregistaredLicense.setVisible(false);
	    	
	    }
		btnActivateUnregistaredLicense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a[]={};
				registrationbox.main(a);
				frame.dispose();
			}
		});
		btnActivateUnregistaredLicense.setBounds(23, 143, 247, 25);
		panel_2.add(btnActivateUnregistaredLicense);
		btnActivateUnregistaredLicense.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/LOGO_2.png")).getImage();
		
		label.setIcon( new ImageIcon(img1));
		label.setBounds(8, 0, 138, 124);
		panel_2.add(label);
		
		JLabel lblDentotech = new JLabel("DentoTech");
		lblDentotech.setForeground(new Color(123, 104, 238));
		lblDentotech.setBounds(144, 50, 151, 40);
		panel_2.add(lblDentotech);
		lblDentotech.setFont(new Font("Garamond", Font.BOLD, 29));
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(updatecheck=="2"){
					Connection connection=sqliteconnection.dbconnector();
					try{ 
			  			String query="update empollyee  set clinic_name='"+clinic_name.getText()+"',doctor_name='"+doctor_name.getText()+"',license='"+license_no.getText()+"',qualification='"+qualification.getText()+"',clinic_tag_line='"+clinic_tag_line.getText()+"',address='"+address.getText()+"',state='"+(String) state.getSelectedItem()+"',zip='"+zip.getText()+"',phone='"+phone.getText()+"',phone_1='"+phone_1.getText()+"',email='"+email.getText()+"',website='"+website.getText()+"',time='"+time.getText()+"',time_1='"+time_1.getText()+"' where id=1;";
			  			PreparedStatement pst=connection.prepareStatement(query);
			  					  		   pst.execute();
			  			 JOptionPane.showMessageDialog(null,"updated");
			  			 pst.close();
			  			blogin.setEnabled(true);
			  		}
			  		catch(Exception e)
			  		{
		               JOptionPane.showMessageDialog(null, e);				
			  		}
					finally {
						try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
				           }
			

				}
				else{
					Connection connection=sqliteconnection.dbconnector();
				try{String query ="insert into empollyee (clinic_name,doctor_name,license,qualification,clinic_tag_line,address,state,zip,phone,phone_1,id,email,website,time,time_1) values(  ?,?,?,?, ?,?,?,?,?,?,?,?,?,?,?)";
          		PreparedStatement pst=connection.prepareStatement(query);
          	    pst.setString(1, clinic_name.getText());
         		pst.setString(2,doctor_name.getText() );
         		pst.setString(3, license_no.getText()); 
         		pst.setString(4, qualification.getText());
         		pst.setString(5, clinic_tag_line.getText());
         		pst.setString(6, address.getText());
         		pst.setString(7, (String) state.getSelectedItem());
         		pst.setString(8, zip.getText());
         		pst.setString(9, phone.getText());
         	    pst.setString(10, phone_1.getText());
         	    pst.setInt(11, 1);
         	    pst.setString(12, email.getText());
         	    pst.setString(13, website.getText());
         	    pst.setString(14, time.getText());
         	    pst.setString(15, time_1.getText());
       
                pst.execute();
          	    pst.close();
          	  try{
					String query1="insert into installrecord (installdate,exdate) values(?,?);";
			   		PreparedStatement pst1=connection.prepareStatement(query1);
	          	    pst1.setString(1, LocalDate.now().toString());
	          	    pst1.setString(2, (LocalDate.now()).plusDays(2).toString());
	                pst1.execute();
	          	    pst1.close();
	        	}
				
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
          	  btnActivateUnregistaredLicense.setEnabled(true);
          	  String a[]={"1",""};
       		   login.main(a);
          	    
          		frame.dispose();
          		System.out.println("sdfkjsdflk");
		 		}
          	catch(Exception e)
          	{
          		JOptionPane.showMessageDialog(null, e);
          		e.printStackTrace();
          	}
		finally {
					try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
			           }
		
				
				
			}
				}
		});
		save.setBounds(73, 499, 99, 36);
		contentPane.add(save);
		
	    blogin = new JButton("Login");
		blogin.setEnabled(false);
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a[]={"3"};
	       		   login.main(a);
	          	    
	          		frame.dispose();
	          }
		});
		blogin.setBounds(185, 499, 99, 36);
		contentPane.add(blogin);
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		exit.setBounds(300, 499, 99, 36);
		contentPane.add(exit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				String s[]={"4"};
				
				login.main(s);
			}
		});
		btnBack.setVisible(false);
		btnBack.setBounds(528, 499, 99, 36);
		contentPane.add(btnBack);
		
		label_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			
			setLocation(e.getXOnScreen()-xonx,e.getYOnScreen()-yony);
			}
		});
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xonx=e.getX();
				yony=e.getY();	
			}
		});
		label_1.setBounds(0, 0, 639, 52);
		contentPane.add(label_1);
		if(updatecheck=="2"){
			Connection connection=sqliteconnection.dbconnector();
			try{
				String query="select * from empollyee ";
				PreparedStatement pst=connection.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					 clinic_name.setText(rs.getString("clinic_name"));
					 doctor_name.setText(rs.getString("doctor_name"));
					 license_no.setText(rs.getString("license"));
					 qualification.setText(rs.getString("qualification"));
					 clinic_tag_line.setText(rs.getString("clinic_tag_line"));
					 address.setText(rs.getString("address"));
					 state.setSelectedItem(rs.getString("state"));
					 zip.setText(rs.getString("zip"));
					 phone.setText(rs.getString("phone"));
					 phone_1.setText(rs.getString("phone_1"));
					 email.setText(rs.getString("email"));
					 website.setText(rs.getString("website"));
					 time.setText(rs.getString("time"));
					 time_1.setText(rs.getString("time_1"));
				}
				rs.close();
				pst.close();
				btnBack.setVisible(true);
			}
			catch(Exception e)
			{     e.printStackTrace();
				 JOptionPane.showMessageDialog(null, e);
				
                 
			}
			finally {
				try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
		           }
	
			

		}

	}
}
