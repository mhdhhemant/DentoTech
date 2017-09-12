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

public class CustomTreatment extends JDialog {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		static CustomTreatment dialog ;
		
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
	             
				 dialog = new CustomTreatment();
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
	
		public CustomTreatment() {
			
			setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			setAutoRequestFocus(false);
			Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
			setIconImage(Imgh);
			setBounds(100, 100, 498, 194);
			setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-498/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-439/2);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			
			textField = new JTextField();
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
			textField.setBounds(118, 44, 350, 27);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			JLabel lblPrescription = new JLabel("Treatment :");
			lblPrescription.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPrescription.setBounds(12, 47, 101, 19);
			contentPanel.add(lblPrescription);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					
					
					JButton btnAddToList = new JButton("Add  to list ");
					btnAddToList.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Connection connection=sqliteconnection.dbconnector();
							try{
								final String cm=textField.getText();
								if(cm==null||cm==""||cm==" "){
									JOptionPane.showMessageDialog(null, "please enter valid values");
								}
								else
								{
									
								
								String query="insert into rx_advise (advise) values(?)";
								PreparedStatement pst=connection.prepareStatement(query);
						        pst.setString(1, textField.getText() );
								pst.execute();
								pst.close();
								}
								JOptionPane.showMessageDialog(null, "Desired Complaint added to List, You can now select it from list !");
								textField.setText("");
								
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
