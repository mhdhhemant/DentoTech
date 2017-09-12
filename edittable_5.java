import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class edittable_5 extends JDialog {
	
	private static final long serialVersionUID = 1L;
	static String info1[]=new String[100];
		private final JPanel contentPanel = new JPanel();

		/**
		 * Launch the application.
		 */
		public static edittable_5 dialog ;
		private JTextField amount_area;
		
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
	             
				 dialog = new edittable_5();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/**
		 * Create the dialog.
		 */
		public edittable_5() {
			setResizable(false);
			setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
			setIconImage(Imgh);
			setBounds(100, 100, 498, 197);
			setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-498/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-439/2);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			{
				JLabel lblComments = new JLabel("Amount To Be Paid By Patient :");
				lblComments.setHorizontalAlignment(SwingConstants.CENTER);
				lblComments.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblComments.setBounds(91, 11, 273, 24);
				contentPanel.add(lblComments);
			}
			
			amount_area = new JTextField();
			amount_area.setBounds(130, 46, 200, 48);
			contentPanel.add(amount_area);
			amount_area.setColumns(10);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("Save");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							final String fees=amount_area.getText();
							final String date=LocalDate.now().toString();
							String status="Amount to Get from Patient";
							Activity_1.feesTable(date, fees,status);
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
