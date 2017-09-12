import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;


public class edittable_1 extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		/**
		 * Launch the application.
		 */
		static edittable_1 dialog ;
		
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
	             
				 dialog = new edittable_1();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	private JTextArea textArea;
	private JTextArea textArea_1;
		/**
		 * Create the dialog.
		 */
		public edittable_1() {
			setResizable(false);
			setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
			setIconImage(Imgh);
			setBounds(100, 100, 498, 439);
			setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-498/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-439/2);
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
				scrollPane.setBounds(22, 47, 425, 90);
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
				lblSrno.setBounds(22, 268, 99, 16);
				contentPanel.add(lblSrno);
			}
			{
				JLabel lblToothNo = new JLabel("Tooth No  : "+info1[1]);
				lblToothNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblToothNo.setBounds(22, 297, 134, 16);
				contentPanel.add(lblToothNo);
			}
			
			JLabel lblMtrlUsed = new JLabel("Mtrl Used");
			lblMtrlUsed.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblMtrlUsed.setBounds(22, 162, 134, 16);
			contentPanel.add(lblMtrlUsed);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 184, 425, 68);
			contentPanel.add(scrollPane);
			
			 textArea_1 = new JTextArea();
			textArea_1.setText(info1[3]);
			textArea_1.setFont(new Font("Kartika", Font.PLAIN, 14));
			textArea_1.setLineWrap(true);
			textArea_1.setWrapStyleWord(true);
			
			scrollPane.setViewportView(textArea_1);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("Save");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						
							final String commentinfo=textArea.getText();
							final String mtrlinfo=textArea_1.getText();
							Activity_1.Refreshcelltable_1(commentinfo,mtrlinfo);
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
