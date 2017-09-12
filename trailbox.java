import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class trailbox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private static trailbox frame;
	/**
	 * Launch the application.
	 */
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
				   frame = new trailbox();
					frame.setLocation(550, 260);
					//frame.setLocationByPlatform(true);
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
	public trailbox() {
		setTitle("Unregistered copy of DentoTech");
		setResizable(false);
		 Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
	    	
	    	setIconImage(Imgh);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 263);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ProgressBar.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrYouHave = new JTextArea();
		txtrYouHave.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		txtrYouHave.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtrYouHave.setText("You have 15 days before this trial\r\nedition expires !\r\nPlease activate unrestricted license to \r\nenable 1 year use.");
		txtrYouHave.setWrapStyleWord(true);
		txtrYouHave.setLineWrap(true);
		txtrYouHave.setBackground(UIManager.getColor("Panel.background"));
		txtrYouHave.setEditable(false);
		txtrYouHave.setBounds(12, 32, 342, 178);
		contentPane.add(txtrYouHave);
		
		JButton btnNewButton = new JButton("Trail");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(366, 34, 96, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			                try {
			                    Desktop.getDesktop().browse(new URI("http://www.mtbtechnologies.com/contact-us/"));
			                } catch (Exception ex) {
			                    JOptionPane.showMessageDialog(null, "Make sure you have default browser and internet connection");
			                }
			    
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(366, 136, 96, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnRegister = new JButton("register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrationbox.main(null);
				frame.dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnRegister.setBounds(366, 85, 96, 33);
		contentPane.add(btnRegister);
	}
}
