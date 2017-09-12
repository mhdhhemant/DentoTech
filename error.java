import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class error extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private static error frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
					 catch (Exception e) {  }

				    frame = new error();
					frame.setLocation(420,250);
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
	public error() {
		
		setTitle("Warring");
        Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	
    	setIconImage(Imgh);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 152);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-764/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-152/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(error.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-warning.png")));
		lblNewLabel.setBounds(26, 13, 48, 48);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrYourTemporaryKey = new JTextArea();
		txtrYourTemporaryKey.setEditable(false);
		txtrYourTemporaryKey.setBackground(UIManager.getColor("Panel.background"));
		txtrYourTemporaryKey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrYourTemporaryKey.setText("Your temporary key has been expired. If you believe this message is in error.please contact this program's @author.");
		txtrYourTemporaryKey.setWrapStyleWord(true);
		txtrYourTemporaryKey.setLineWrap(true);
		txtrYourTemporaryKey.setBounds(101, 24, 657, 46);
		contentPane.add(txtrYourTemporaryKey);
		
		JButton btnNewButton = new JButton("Enter key");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrationbox.main(null);
				frame.dispose();
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(224, 83, 99, 29);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(354, 83, 79, 29);
		contentPane.add(btnCancel);
	}
}
