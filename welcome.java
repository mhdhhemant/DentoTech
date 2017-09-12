import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static welcome frame;
	public static void main(String[] args) {
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
					 frame = new welcome();
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
	public welcome() {
	
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 385);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-424/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-385/2);

        Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	
    	setIconImage(Imgh);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Kartika", Font.BOLD, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("This seems to be the first time that you are using DentoTech");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));

		label.setBounds(12, 13, 370, 17);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Before exploring DentoTech ,you need to enter your clinic");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(27, 80, 355, 17);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("related information. Click the setting button below.");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(12, 100, 307, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("For any help needed for you to get started, feel free to");
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(10, 130, 363, 19);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("contact us");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(12, 150, 68, 19);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("There is no password for administrator. Just click the");
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(10, 175, 363, 19);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Login button when prompted at startup.You can later");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(12, 193, 348, 19);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("assign a password using the Setting window");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(12, 212, 348, 19);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Visit us at");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(12, 244, 56, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Support ");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(12, 266, 49, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("http://www.mtbtechnologies.com");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(80, 244, 216, 19);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("+91-9667260088");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(73, 264, 112, 19);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("+91-8852818812");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(73, 286, 112, 19);
		contentPane.add(label_11);
		
		JButton btnSetting = new JButton("Setting");
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				frame.dispose();
		
				String s[]={};
				userdata.main(s);							
			}
		});
		btnSetting.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSetting.setBounds(297, 283, 97, 25);
		contentPane.add(btnSetting);
		/*try{
			String query="select * from  installrecord ;";
	   		PreparedStatement pst=connection.prepareStatement(query);
      	    ResultSet rs=pst.executeQuery();
      	    while(rs.next()){
      	    	
      	      String installdate= rs.getString("installdate");
      	    System.out.println(installdate);
      	  System.out.println(rs.getString("exdate"));
      	      /*SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
      	      Calendar cal=Calendar.getInstance();
      	      cal.setTime(format.parse(installdate));
      	      cal.add(Calendar.DATE, 30);
      	   
      	      installdate=format.format(cal.getTime());
     	 c.setTime(sdf.parse(dt));
       c.add(Calendar.DATE, 1);  // number of days to add
               dt = sdf.format(c.getTime());  // dt is now the new date
             System.out.println(installdate+(LocalDate.now()).plusDays(45));
      	   
      	    }
      	    pst.close();
      	    rs.close();
		}
		
		catch(Exception e){
		 JOptionPane.showMessageDialog(null, e);
		 e.printStackTrace();
		}*/
	
	}
}
