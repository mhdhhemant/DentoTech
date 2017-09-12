import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class t extends JDialog {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static 	t dialog;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
			 dialog = new t();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	
	public t() {
		setResizable(false);
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		setBounds(100, 100, 496, 263);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-496/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-263/2);
		Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	
    	setIconImage(Imgh);
		
		setTitle("Unregistered copy of DentoTech");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JTextArea txtrYouHave = new JTextArea();
		txtrYouHave.setBorder(null);
		txtrYouHave.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtrYouHave.setText("You have 15 days before this trial\r\nedition expires !\r\nPlease activate unrestricted license to \r\nenable 1 year use.");
		txtrYouHave.setWrapStyleWord(true);
		txtrYouHave.setLineWrap(true);
		txtrYouHave.setBackground(UIManager.getColor("Panel.background"));
		txtrYouHave.setEditable(false);
		txtrYouHave.setBounds(12, 26, 342, 145);
		contentPanel.add(txtrYouHave);
		JButton btnNewButton = new JButton("Trail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Activity_1.main(new String[] {});
				dialog.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(366, 34, 96, 38);
		contentPanel.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(366, 136, 96, 38);
		contentPanel.add(btnNewButton_1);
		
		JButton btnRegister = new JButton("register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrationbox.main(null);
				dialog.dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnRegister.setBounds(366, 85, 96, 38);
		contentPanel.add(btnRegister);
		
	/*	try{
			String query ="CREATE  TABLE register ("+'"'+"id"+'"'+" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , "+'"'+"register"+'"'+" TEXT NOT NULL  UNIQUE , "+'"'+"registerdate"+'"'+" TEXT NOT NULL  UNIQUE )";
  		    PreparedStatement pst=connection.prepareStatement(query);
            pst.execute();
            pst.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			
		}*/
	}

}
