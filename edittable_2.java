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
import javax.swing.JTextField;


public class edittable_2 extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		/**
		 * Launch the application.
		 */
		static edittable_2 dialog ;
		
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
	             
				 dialog = new edittable_2();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextField textField;
		/**
		 * Create the dialog.
		 */
		public edittable_2() {
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
				scrollPane.setBounds(22, 47, 425, 68);
				contentPanel.add(scrollPane);
				{
					textArea = new JTextArea();
					textArea.setText(info1[3]);
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
			lblMtrlUsed.setBounds(22, 128, 134, 16);
			contentPanel.add(lblMtrlUsed);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 157, 425, 43);
			contentPanel.add(scrollPane);
			
			 textArea_1 = new JTextArea();
			textArea_1.setText(info1[4]);
			textArea_1.setFont(new Font("Kartika", Font.PLAIN, 14));
			textArea_1.setLineWrap(true);
			textArea_1.setWrapStyleWord(true);
			
			scrollPane.setViewportView(textArea_1);
			
			JLabel lblFee = new JLabel("Fee");
			lblFee.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblFee.setBounds(22, 224, 40, 16);
			contentPanel.add(lblFee);
			
			textField = new JTextField();
			textField.setText(info1[2]);
			textField.setBounds(61, 222, 116, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
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
							final  String feeinfo=textField.getText();
							Activity_1.Refreshcelltable_2(commentinfo,mtrlinfo,feeinfo);
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
