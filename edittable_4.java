import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class edittable_4 extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		/**
		 * Launch the application.
		 */
		static edittable_4 dialog ;
		
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
	             
				 dialog = new edittable_4();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	private JTextArea textArea;
	private JTextField textField;
		/**
		 * Create the dialog.
		 */
		public edittable_4() {
			setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			setResizable(false);
			setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
			   setIconImage(Imgh);
			setBounds(100, 100, 498, 379);
			setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-498/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-379/2);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			{
				JLabel lblComments = new JLabel("Treatment advised:");
				lblComments.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblComments.setBounds(22, 25, 134, 17);
				contentPanel.add(lblComments);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
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
				lblSrno.setBounds(22, 229, 99, 16);
				contentPanel.add(lblSrno);
			}
			{
				JLabel lblToothNo = new JLabel("Tooth No  : "+info1[1]);
				lblToothNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblToothNo.setBounds(22, 258, 134, 16);
				contentPanel.add(lblToothNo);
			}
			
			JLabel lblMtrlUsed = new JLabel("Fee :");
			lblMtrlUsed.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblMtrlUsed.setBounds(22, 162, 33, 17);
			contentPanel.add(lblMtrlUsed);
			
			textField = new JTextField(info1[3]);
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					@SuppressWarnings("unused")
					char c=e.getKeyChar();
					if(textField.getText().length()>7){
						Toolkit.getDefaultToolkit().beep();
						e.consume();
					}
				}
			});
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
			textField.setBounds(67, 160, 116, 22);
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
						
							final String treatmentinfo=textArea.getText();
							final String feelinfo=textField.getText();
							Activity_1.Refreshcelltable_4(treatmentinfo,feelinfo);
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
