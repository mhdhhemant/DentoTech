import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class wait extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			wait dialog = new wait();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public wait() {
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	setIconImage(Imgh);
		setBounds(100, 100, 395, 153);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-395/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-153/2 );
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
					
	
	
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
			 int i=JOptionPane.showConfirmDialog(null, "please wait..");
				if(i==0){
				
				}
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
			
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		JLabel lblItTakeSome = new JLabel("It take some second. Please wait . . .");
		lblItTakeSome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblItTakeSome.setBounds(34, 24, 255, 51);
		contentPanel.add(lblItTakeSome);
	}
}
