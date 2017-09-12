import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class costemprecription extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		static costemprecription dialog ;
		
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
	             
				 dialog = new costemprecription();
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
	
		public costemprecription() {
			
			setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			setAutoRequestFocus(false);
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
				lblComments.setBounds(12, 86, 99, 24);
				contentPanel.add(lblComments);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
				scrollPane.setBounds(12, 110, 456, 61);
				contentPanel.add(scrollPane);
				{
					textArea = new JTextArea();
					textArea.setBorder(null);
					textArea.setBackground(new Color(255, 255, 255));
					textArea.setText(info1[1]);
					textArea.setFont(new Font("Kartika", Font.PLAIN, 14));
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					scrollPane.setViewportView(textArea);
				}
			}
			
			JLabel lblMtrlUsed = new JLabel("Instructions");
			lblMtrlUsed.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblMtrlUsed.setBounds(12, 195, 134, 16);
			contentPanel.add(lblMtrlUsed);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
			scrollPane.setBounds(12, 214, 456, 86);
			contentPanel.add(scrollPane);
			
			 textArea_1 = new JTextArea();
			textArea_1.setText(info1[2]);
			textArea_1.setFont(new Font("Kartika", Font.PLAIN, 14));
			textArea_1.setLineWrap(true);
			textArea_1.setWrapStyleWord(true);
			
			scrollPane.setViewportView(textArea_1);
			
			textField = new JTextField();
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
			textField.setBounds(118, 44, 350, 27);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			JLabel lblPrescription = new JLabel("Prescription :");
			lblPrescription.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPrescription.setBounds(12, 47, 101, 19);
			contentPanel.add(lblPrescription);
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
							final String prescriptio=textField.getText();
							if(prescriptio==null||prescriptio==""||prescriptio==" "){
								JOptionPane.showMessageDialog(null, "please enter valid values");
							}
							else{
								Activity_1.Refreshaddtable_3(prescriptio,dosageinfo,instructioninfo);
							}
	                        			
						
						}
					});
					
					JButton btnAddToList = new JButton("Add  to list ");
					btnAddToList.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Connection connection=sqliteconnection.dbconnector();
							try{
								String query="insert into prescription (prescription,dosage,instruction) values(?,?,?)";
								PreparedStatement pst=connection.prepareStatement(query);
						        pst.setString(1, textField.getText() );
						        pst.setString(2, textArea.getText());
						        pst.setString(3, textArea_1.getText());
								pst.execute();
								pst.close();
								JOptionPane.showMessageDialog(null, "Desired Complaint added to List, You can now select it from list !");
								textField.setText("");
								textArea.setText("");
								textArea_1.setText("");
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null,e);
							}
							finally {
								try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
						           }
							
							
						}
					});
					btnAddToList.setFont(new Font("Tahoma", Font.BOLD, 14));
					buttonPane.add(btnAddToList);
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
