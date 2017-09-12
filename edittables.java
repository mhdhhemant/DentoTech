import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class edittables extends JDialog {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static String info1[]=new String[100];
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	static edittables dialog ;
	
	public static void main(String info[]) {
		try {
			for(int i=0;i<info.length;i++){
				info1[i]=info[i];
				
			}
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
             
			 dialog = new edittables();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
private JTextArea textArea;
	/**
	 * Create the dialog.
	 */
	public edittables() {
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
		 setIconImage(Imgh);
		setBounds(100, 100, 498, 364);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-498/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-364/2);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblComments = new JLabel("Comments :");
			lblComments.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblComments.setBounds(22, 13, 99, 24);
			contentPanel.add(lblComments);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 47, 425, 145);
			contentPanel.add(scrollPane);
			{
				textArea = new JTextArea();
				textArea.setText(info1[2]);
				textArea.setFont(new Font("Kartika", Font.PLAIN, 14));
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(true);
				scrollPane.setViewportView(textArea);
			}
		}
		{
			JLabel lblSrno = new JLabel("Sr.No  : "+info1[0]);
			
			lblSrno.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSrno.setBounds(22, 205, 99, 16);
			contentPanel.add(lblSrno);
		}
		{
			JLabel lblToothNo = new JLabel("Tooth No  : "+info1[1]);
			lblToothNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblToothNo.setBounds(22, 234, 134, 16);
			contentPanel.add(lblToothNo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						final String commentinfo=textArea.getText();
						Activity_1.Refreshcell(commentinfo);
                        dialog.dispose();			
					
					}
				});
				okButton.setFont(new Font("Tahoma", Font.BOLD, 14));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dialog.dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 14));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	

}
