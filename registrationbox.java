import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class registrationbox extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
    private static registrationbox dialog;
	private  JLabel label;
	Connection connection;
	private String serialkey[]={ "83-763-626-34-766-51-864",
			"46-475-350-27-008-76-104",
			"49-288-410-84-373-46-294",
			"19-863-910-40-923-76-600",
		    "03-240-169-47-929-14-617",
		    "83-031-942-77-084-25-277",
		    "82-745-822-34-964-62-149",
		    "73-044-390-43-650-18-424",
		    "83-985-311-44-448-41-065",
		   "06-945-724-36-788-89-560",
		   "61-619-878-99-369-44-775",
		   "73-700-211-61-154-48-538",
		   "03-395-620-22-758-48-990",
		   "97-175-532-53-471-97-174",
		   "66-924-113-15-430-71-117",
		   "10-929-924-75-278-61-610",
		   "40-881-293-69-159-01-517",
		   "39-811-548-35-221-70-996",
		   "78-809-606-28-920-06-973",
		   "11-391-952-21-157-46-065",
		   "26-155-087-62-984-71-554",
		   "99-056-048-11-412-40-235",
		   "45-667-263-95-957-99-847",
		   "08-201-385-05-080-83-484",
		   "92-869-168-79-322-98-580",
		   "44-655-132-62-176-44-382",
		   "67-456-097-32-585-60-487",
		   "14-078-305-72-490-40-438",
		   "37-397-603-78-582-45-187",
		   "22-503-335-70-361-73-503",
		   "55-767-721-02-076-17-128",
		   "19-798-131-10-452-25-578",
		   "28-355-814-20-556-18-143",
		   "27-333-468-78-737-35-385",
		   "00-217-708-15-788-16-807",
		   "62-321-142-47-774-50-509",
		   "52-922-866-78-385-62-298",
		   "59-930-875-98-981-07-119",
		   "18-796-874-49-209-80-745",
		   "73-332-744-78-401-17-641",
		   "53-126-119-50-675-81-764",
		   "20-566-099-93-320-16-658",
		   "00-459-763-79-700-72-160",
		   "44-663-410-28-244-24-160",
		   "81-137-984-36-657-13-596",
		   "39-762-843-78-734-90-953",
		   "72-917-022-73-334-94-944",
		   "75-295-324-37-015-35-330",
		   "23-586-664-01-680-01-836",
		   "47-206-028-65-845-17-025"
		   };
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		try {
			try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
			 catch (Exception e) {  }
			dialog = new registrationbox();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
			dialog.setVisible(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */


public boolean matchkey(String test){
	for(int i=0;i<serialkey.length;i++){
		if(test.equals(serialkey[i])){
			return true;
		}
	}

	return false;
}
	public registrationbox() {
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		connection=sqliteconnection.workdbconnector();
	
	
	
		
        Image Imgh=new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
    	
    	setIconImage(Imgh);
		setBounds(100, 100, 568, 391);
		setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-568/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-391/2);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				label.setIcon(null);
				@SuppressWarnings("unused")
				char c=e.getKeyChar();
				if(textField.getText().length()>30){
					Toolkit.getDefaultToolkit().beep();
					e.consume();
					
				}
			}
		});
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		textField.setFont(new Font("Rockwell", Font.PLAIN, 18));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
		textField.setBounds(137, 209, 304, 32);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblKey = new JLabel(" Key -");
		lblKey.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKey.setBounds(73, 212, 52, 25);
		contentPanel.add(lblKey);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(-11, 0, 574, 82);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setFont(new Font("Kartika", Font.BOLD, 20));
		lblRegistration.setBounds(56, 20, 115, 29);
		panel.add(lblRegistration);
		
		JLabel txtrEnterTheRegistration = new JLabel();
		txtrEnterTheRegistration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrEnterTheRegistration.setText("enter the registration key below, exactly as given to you");
		txtrEnterTheRegistration.setBounds(56, 45, 391, 23);
		panel.add(txtrEnterTheRegistration);
		txtrEnterTheRegistration.setBackground(Color.WHITE);
		
		label = new JLabel("");
		label.setIcon(null);
		
		label.setBounds(447, 200, 48, 48);
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Submit");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
	
						if(matchkey(textField.getText())){							
							Image img1=new ImageIcon(this.getClass().getResource("/ok-icon.png")).getImage();
							label.setIcon(new ImageIcon(img1));
							try{
							String query ="CREATE  TABLE register ("+'"'+"id"+'"'+" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , "+'"'+"register"+'"'+" TEXT NOT NULL  UNIQUE , "+'"'+"registerdate"+'"'+" TEXT NOT NULL  UNIQUE )";
				  		    PreparedStatement pst=connection.prepareStatement(query);
				            pst.execute();
				            pst.close();}
						  catch(Exception e){}
							int i=0;
							try{
								
								String query ="insert into register (register,registerdate) values (?,?)";
					  		    PreparedStatement pst=connection.prepareStatement(query);
					  		    pst.setString(1, textField.getText());
					  		    pst.setString(2, LocalDate.now().toString());
					            pst.execute();
					            pst.close(); }
						
							  catch(Exception e){i=1;}
							if(i==0){
								int action =JOptionPane.showConfirmDialog(null,"Do you want to launch the program's...",  "Confirm for run",JOptionPane.YES_NO_OPTION);
								if(action==0){
					  			try{
					  			   PreparedStatement pst=connection.prepareStatement("DELETE FROM expairtrail_register WHERE expair");
					                pst.execute(); 
					                pst.close();
					 	         
					             }
					  			catch(Exception e){
					  			}
					  			String []a={};
					  			login.main(a);
					  			dialog.dispose();	
					  		
							}
					  		else{
					  			dialog.dispose();
					  		}
							}
							else if(i==1){
								Image img2=new ImageIcon(this.getClass().getResource("/cross.png")).getImage();
								label.setIcon(new ImageIcon(img2));
								JOptionPane.showMessageDialog(null, "this key alerady use .purchase a new key,for this contact @author");
								textField.setText("");
								label.setIcon(null);
							}
							//JOptionPane.showMessageDialog(null, "You have succesfully registration for one year\nThanking you");
		       				//	dialog.dispose();
						}
						else {
							Image img1=new ImageIcon(this.getClass().getResource("/cross.png")).getImage();
							label.setIcon(new ImageIcon(img1));
							JOptionPane.showMessageDialog(null, "the key, you enter does not appear valid key");
							textField.setText("");
							label.setIcon(null);
						}
					}
				});
				okButton.setFont(new Font("Tahoma", Font.BOLD, 15));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dialog.dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
	}
}

