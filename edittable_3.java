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


public class edittable_3 extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		/**
		 * Launch the application.
		 */
		static edittable_3 dialog ;
		
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
	             
				 dialog = new edittable_3();
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
		public edittable_3() {
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
				JLabel lblComments = new JLabel("Dosage");
				lblComments.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblComments.setBounds(22, 84, 99, 24);
				contentPanel.add(lblComments);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(22, 110, 425, 61);
				contentPanel.add(scrollPane);
				{
					textArea = new JTextArea();
					textArea.setText(info1[1]);
					textArea.setFont(new Font("Kartika", Font.PLAIN, 14));
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					scrollPane.setViewportView(textArea);
				}
			}
			{
				JLabel lblSrno = new JLabel(" Prescription : "+info1[0]);
				
				lblSrno.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblSrno.setBounds(22, 31, 383, 16);
				contentPanel.add(lblSrno);
			}
			{
				JLabel lblToothNo = new JLabel("Date : "+info1[3]);
				lblToothNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblToothNo.setBounds(32, 60, 164, 16);
				contentPanel.add(lblToothNo);
			}
			
			JLabel lblMtrlUsed = new JLabel("Instructions");
			lblMtrlUsed.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblMtrlUsed.setBounds(22, 192, 134, 16);
			contentPanel.add(lblMtrlUsed);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 214, 425, 86);
			contentPanel.add(scrollPane);
			
			 textArea_1 = new JTextArea();
			textArea_1.setText(info1[2]);
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
						
							final String dosageinfo=textArea.getText();
							final String instructioninfo=textArea_1.getText();
							Activity_1.Refreshcelltable_3(dosageinfo,instructioninfo);
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
