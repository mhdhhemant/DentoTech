import java.awt.GraphicsEnvironment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.*;
import javax.swing.JCheckBox;

public class demo extends JDialog {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final JPanel contentPanel = new JPanel();
	//private static demo frame;
	@SuppressWarnings("unused")
	private JPanel contentPane;
	static private JCheckBox chckbxPicture;
	private static JCheckBox chckbxComplaints;
	private	 static JCheckBox chckbxOnExamination;
	private	 static JCheckBox chckbxNewCheckBox;
	private	 static JCheckBox chckbxNewCheckBox_1;
	private	 static JCheckBox chckbxNewCheckBox_2;
	private static demo dialog;
	private static Connection connection=sqliteconnection.dbconnector();
	
	
	public static void main(String[] args) 
	{
		try 
		{
			try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
			 catch (Exception e) {  }
	    
             
			dialog = new demo();
			dialog.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		}
		catch (Exception e) { e.printStackTrace(); }
	}

	public static void printbutton(String detail [],byte[] xray,String complainttablevalues[],String onexaminationtablevalues[],String [] rxadvisedtablevalues,String workdonetablevalues[],String prescriptiontablevalues[])
	{
			JOptionPane.showMessageDialog(null, "your reqest has been sending...");
			Document document = new Document(PageSize.A4, 150, 10, 20, 10);
			@SuppressWarnings("unused")
			Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL, new CMYKColor(255, 0, 0, 0));
			@SuppressWarnings("unused")
			Font redFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(0, 255, 0, 0));
			@SuppressWarnings("unused")
			Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 0, 255, 0));
		
			try
		      {     
		         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("print.pdf"));
		         document.open();
		         Paragraph p = new Paragraph("", new Font(Font.FontFamily.COURIER,12));
				   
		         p.add("Date      :        "+LocalDate.now()+"\n\n");
 		         p.add("\nName      :        "+detail[0]);
 		         p.add("\nAge       :        "+detail[1]);
 		         p.add("\nGender    :      "+detail[6]);
 		         p.add("\nAddress   :        "+detail[2]);
 		         p.add("\nPhone No  :        "+detail[3]);
 		         p.add("\nHealth Alert :    "+detail[4]);
 		         p.add("\nAlergies     :    "+detail[5]);
 		         p.add("\n");
		       
 		        try{ 		
	 				String query="select * from  mm ";
	 				PreparedStatement pst=connection.prepareStatement(query);
	 				ResultSet rs=pst.executeQuery();
	 				byte[] b2=rs.getBytes("pic");
	 			
	 				pst.close();
	 				rs.close();
	 				Image image1 = Image.getInstance(b2);
	 				image1.setAlignment(Element.ALIGN_BOTTOM);
	 				image1.scalePercent(100);
	 				PdfPTable nestedTable = new PdfPTable(1);	
	 				float[] columnWidths = {4f, 2f};
	 				try {nestedTable.setWidths(columnWidths);}
	 				catch(Exception e){ }
	 				
	 				nestedTable.setWidthPercentage(100);

	 				PdfPCell cell2 = new PdfPCell(image1,true);
	 				cell2.setBorder(0); 
	 				cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	 				cell2.setVerticalAlignment(Element.ALIGN_TOP);
	 				cell2.setPaddingTop(30);
	 				nestedTable.addCell(cell2);
	 				p.add(nestedTable);

	 				
      	        }catch(Exception fe)
      	        {}        
 		        
		         if(chckbxPicture.isSelected())
		         {
		        	 try{ 		
		        		 		        		 	
		        		 	byte[] b2=xray;
		        		 	PdfPTable nestedTable = new PdfPTable(1);
			 				Image image1 = Image.getInstance(b2);
			 				image1.setAlignment(Element.ALIGN_BOTTOM);
			 				image1.scalePercent(100);
			 					
			 				float[] columnWidths = {4f, 2f};
			 				try {nestedTable.setWidths(columnWidths);}
			 				catch(Exception e){ }
			 				
			 				nestedTable.setWidthPercentage(100);

			 				PdfPCell cell2 = new PdfPCell(image1,true);
			 				cell2.setBorder(0); 
			 				cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
			 				cell2.setVerticalAlignment(Element.ALIGN_TOP);
			 				cell2.setPaddingTop(30);
			 				nestedTable.addCell(cell2);
			 				p.add(nestedTable);
		     	         	 
		            	}
		            	catch(Exception e)
		            	{}
		         }
		    
		        		         
		         
	            if(chckbxComplaints.isSelected()){
	            	try{ 		
		 				/*String query="select * from  mm ";
		 				PreparedStatement pst=connection.prepareStatement(query);
		 				ResultSet rs=pst.executeQuery();
		 				byte[] b2=rs.getBytes("pic");
		 			
		 				pst.close();
		 				rs.close();
		 				Image image1 = Image.getInstance(b2);
		 				image1.setAlignment(Element.ALIGN_BOTTOM);
		 				image1.scalePercent(100);*/
	     			
		 				PdfPTable nestedTable = new PdfPTable(1);
	     			 //Set Column widths
		 				float[] columnWidths = {3f, 2.4f};
		 				try {nestedTable.setWidths(columnWidths);}
		 				catch(Exception e){  }
		     			nestedTable.setWidthPercentage(100);
		     		    PdfPTable complainttable =createcomplainttable(complainttablevalues);	
		     			PdfPCell cell1 = new PdfPCell(new Paragraph());
		                cell1.addElement(complainttable);
		                cell1.setBorder(0);
		                cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
	      	       
	      		    
		                /*PdfPCell cell2 = new PdfPCell(image1,true);
		                cell2.setBorder(0); 
		                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
		                cell2.setVerticalAlignment(Element.ALIGN_TOP);
		                cell2.setPaddingTop(10);*/
		                nestedTable.addCell(cell1);
		                //nestedTable.addCell(cell2);
		                p.add(nestedTable);
		                p.add("\n");
	     	         	 
	            	}
	            	catch(Exception e)
	            	{}
	            	
	            }
	            
	            if(chckbxOnExamination.isSelected()){
	            	try{ 		
		 				/*String query="select * from  mm ";
		 				PreparedStatement pst=connection.prepareStatement(query);
		 				ResultSet rs=pst.executeQuery();
		 				byte[] b2=rs.getBytes("pic");
		 			
		 				pst.close();
		 				rs.close();
		 				Image image1 = Image.getInstance(b2);
		 				image1.setAlignment(Element.ALIGN_BOTTOM);
		 				image1.scalePercent(100);*/
	 			
	 			  PdfPTable nestedTable = new PdfPTable(1);
	 			 //Set Column widths
	 	         float[] columnWidths = {3f, 2.4f};
	 	         try {
	 				nestedTable.setWidths(columnWidths);}
	 	         catch(Exception e){
	 	        	 
	 	         }
	 			nestedTable.setWidthPercentage(100);
	 			PdfPTable onexamtable= createonexaminationtable(onexaminationtablevalues);	
	 			PdfPCell cell1 = new PdfPCell(new Paragraph());
	            cell1.addElement(onexamtable);
	            cell1.setBorder(0);
	            
	            
	  	        cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
	  	       
	  		    
	            /*PdfPCell cell2 = new PdfPCell(image1,true);
	            cell2.setBorder(0); 
	            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	            cell2.setVerticalAlignment(Element.ALIGN_TOP);
	            cell2.setPaddingTop(10);*/
	            nestedTable.addCell(cell1);
	            //nestedTable.addCell(cell2);
	            
	            
	            p.add(nestedTable);
	            p.add("\n");
	            	
	            }catch(Exception e)
	            	{}
	            }

	            
	            if(chckbxNewCheckBox.isSelected()){
	            	try{ 		
		 				/*String query="select * from  mm ";
		 				PreparedStatement pst=connection.prepareStatement(query);
		 				ResultSet rs=pst.executeQuery();
		 				byte[] b2=rs.getBytes("pic");
		 			
		 				pst.close();
		 				rs.close();
		 				Image image1 = Image.getInstance(b2);
		 				image1.setAlignment(Element.ALIGN_BOTTOM);
		 				image1.scalePercent(100);*/
	     			
	     			  PdfPTable nestedTable = new PdfPTable(1);
	     			 //Set Column widths
	     	         float[] columnWidths = {3f, 2.4f};
	     	         try {
	     				nestedTable.setWidths(columnWidths);}
	     	         catch(Exception e){
	     	        	 
	     	         }
	     			nestedTable.setWidthPercentage(100);
	     			PdfPTable rxadvisedtable= rxadvisedtable(rxadvisedtablevalues);	
	     			PdfPCell cell1 = new PdfPCell(new Paragraph());
	                cell1.addElement(rxadvisedtable);
	                cell1.setBorder(0);
	                
	                
	      	        cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
	      	       
	      		    
	                /*PdfPCell cell2 = new PdfPCell(image1,true);
	                cell2.setBorder(0); 
	                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	                cell2.setVerticalAlignment(Element.ALIGN_TOP);
	                cell2.setPaddingTop(10);*/
	                nestedTable.addCell(cell1);
	                //nestedTable.addCell(cell2);
	                
	                
	                p.add(nestedTable);
	                p.add("\n");
	     	 
	            	}catch(Exception e) {}
	            	            		
	            }
	             
		         if(chckbxNewCheckBox_1.isSelected()){
		        	 try{ 		
			 				/*String query="select * from  mm ";
			 				PreparedStatement pst=connection.prepareStatement(query);
			 				ResultSet rs=pst.executeQuery();
			 				byte[] b2=rs.getBytes("pic");
			 			
			 				pst.close();
			 				rs.close();
			 				Image image1 = Image.getInstance(b2);
			 				image1.setAlignment(Element.ALIGN_BOTTOM);
			 				image1.scalePercent(100);
*/	     			
	     			  PdfPTable nestedTable = new PdfPTable(1);
	     			 //Set Column widths
	     	         float[] columnWidths = {3f, 2.4f};
	     	         try {
	     				nestedTable.setWidths(columnWidths);}
	     	         catch(Exception e){
	     	        	 
	     	         }
	     			nestedTable.setWidthPercentage(100);
	     			PdfPTable workdonetable= workDonetable(workdonetablevalues);	
	     			PdfPCell cell1 = new PdfPCell(new Paragraph());
	                cell1.addElement(workdonetable);
	                cell1.setBorder(0);
	                
	                
	      	        cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
	      	       
	      		    
	                /*PdfPCell cell2 = new PdfPCell(image1,true);
	                cell2.setBorder(0); 
	                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	                cell2.setVerticalAlignment(Element.ALIGN_TOP);
	                cell2.setPaddingTop(10);*/
	                nestedTable.addCell(cell1);
	                //nestedTable.addCell(cell2);
	      	        
	                p.add(nestedTable);
	                p.add("\n");
	     		
		        }catch(Exception e) {}
		     }
		      if(chckbxNewCheckBox_2.isSelected()){
		    	  try{ 		
		 				/*String query="select * from  mm ";
		 				PreparedStatement pst=connection.prepareStatement(query);
		 				ResultSet rs=pst.executeQuery();
		 				byte[] b2=rs.getBytes("pic");
		 			
		 				pst.close();
		 				rs.close();
		 				Image image1 = Image.getInstance(b2);
		 				image1.setAlignment(Element.ALIGN_BOTTOM);
		 				image1.scalePercent(100);*/
				     			
				     			  PdfPTable nestedTable = new PdfPTable(1);
				     			 //Set Column widths
				     	         float[] columnWidths = {3f, 2.4f};
				     	         try {
				     				nestedTable.setWidths(columnWidths);}
				     	         catch(Exception e){
				     	        	 
				     	         }
				     			nestedTable.setWidthPercentage(100);
				     			PdfPTable prescriptiontable= prescriptiontable(prescriptiontablevalues);	
				     			PdfPCell cell1 = new PdfPCell(new Paragraph());
				                cell1.addElement(prescriptiontable);
				                cell1.setBorder(0);
				                
				                
				      	        cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
				      	       
				      		    
				                /*PdfPCell cell2 = new PdfPCell(image1,true);
				                cell2.setBorder(0); 
				                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
				                cell2.setVerticalAlignment(Element.ALIGN_TOP);
				                cell2.setPaddingTop(10);*/
				                nestedTable.addCell(cell1);
				                //nestedTable.addCell(cell2);
				      	        
				                p.add(nestedTable);
				                p.add("\n");
				            }catch(Exception e) {}
		      }
		        
		         p.add("Signature-............."+"\n \n");
		         document.add(p);
		         @SuppressWarnings("unused")
				 Paragraph p1 = new Paragraph("\n \nFor more, please visit ");
		         @SuppressWarnings("unused")
				 Anchor anchor = new Anchor("http://www.mtbtechnologies.com", FontFactory.getFont(FontFactory.TIMES_ROMAN));
		  
		         //p1.add(anchor);
		         //document.add(p1);
		         document.close();
		         writer.close();
		         Desktop.getDesktop().open(new File("print.pdf"));
		      } catch (Exception e)
		      {JOptionPane.showMessageDialog(null, e);
		         e.printStackTrace();
		      } 

		}
	
	public demo() 
	{
			setResizable(false);
			setTitle("Custom Print");
		   
			setBounds(100, 100, 450, 300);
			setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-450/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-300/2);
			getContentPane().setLayout(null);
			getContentPane().setLayout(null);
			
			JLabel lblChoseCoustumPrinting = new JLabel("Chose coustum Printing option>>");
			lblChoseCoustumPrinting.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16));
			lblChoseCoustumPrinting.setBounds(12, 13, 359, 29);
			getContentPane().add(lblChoseCoustumPrinting);
			chckbxComplaints = new JCheckBox("Complaints");
			chckbxComplaints.setSelected(true);
			chckbxComplaints.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			chckbxComplaints.setBounds(24, 61, 113, 25);
			getContentPane().add(chckbxComplaints);
			
			chckbxOnExamination = new JCheckBox("On examination");
			chckbxOnExamination.setSelected(true);
			chckbxOnExamination.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			chckbxOnExamination.setBounds(175, 61, 146, 25);
			getContentPane().add(chckbxOnExamination);
			
			chckbxNewCheckBox = new JCheckBox("Rx Advised");
			chckbxNewCheckBox.setSelected(true);
			chckbxNewCheckBox.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			chckbxNewCheckBox.setBounds(24, 114, 113, 25);
			getContentPane().add(chckbxNewCheckBox);
			
			chckbxNewCheckBox_1 = new JCheckBox("Work Done");
			chckbxNewCheckBox_1.setSelected(true);
			chckbxNewCheckBox_1.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			chckbxNewCheckBox_1.setBounds(173, 114, 113, 25);
			getContentPane().add(chckbxNewCheckBox_1);
			
			 chckbxNewCheckBox_2 = new JCheckBox("Prescription");
			chckbxNewCheckBox_2.setSelected(true);
			chckbxNewCheckBox_2.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			chckbxNewCheckBox_2.setBounds(323, 114, 113, 25);
			getContentPane().add(chckbxNewCheckBox_2);
			
			JButton btnNext = new JButton("Next");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				     String [] detail=Activity_1.printbutton1();
				     byte[] xray=Activity_1.printXray();
				     String [] tablevalueslenghth=Activity_1.printbutton2();
				     String [] table_1valueslenghth=Activity_1.printbutton3();
				     String [] table_2valueslenghth=Activity_1.printbutton4();
				     String [] table_3valueslenghth=Activity_1.printbutton5();
				     String [] table_4valueslenghth=Activity_1.printbutton6();
				    
				     printbutton(detail,xray,tablevalueslenghth,table_1valueslenghth,table_2valueslenghth,table_3valueslenghth,table_4valueslenghth);
				     
				     dialog.dispose();
				}
			});
			btnNext.setBounds(295, 190, 97, 30);
			getContentPane().add(btnNext);
			
		     chckbxPicture = new JCheckBox("picture");
			 chckbxPicture.setSelected(true);
			 chckbxPicture.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
			 chckbxPicture.setBounds(323, 62, 113, 25);
			getContentPane().add(chckbxPicture);
	      	}
		 	
			@SuppressWarnings("unused")
		 	private static PdfPTable generateHeaderTable() throws Exception{
			    //Generic logo
			    PdfPTable headerTable= new PdfPTable(4);

			 
			    headerTable.addCell(borderlessCell("Name-"));
			    headerTable.addCell(borderlessCell("Age-"));
			   
			    headerTable.addCell(borderlessCell("Address-"));
			   
			    headerTable.addCell(borderlessCell("Phone No.-"));
			   
			    headerTable.addCell(borderlessCell("Health Alert-"));
			   
			    headerTable.addCell(borderlessCell("Alergies-"));
			   
			    return headerTable;
			}
		 private static PdfPCell borderlessCell(String s){
			    PdfPCell cell = new PdfPCell();
			    Font f = new Font(Font.FontFamily.COURIER);
			    cell.setBorder(0);
			    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			    cell.addElement(new Paragraph(s,f));
			    return cell;
			}
		 @SuppressWarnings("unused")
		private PdfPTable generateLineItemTable(String [] item){
			    PdfPTable table = new PdfPTable(2);
			    DecimalFormat df = new DecimalFormat("0.00");    
			    double total = 0;
			    for (int i=0;i<item.length;i++){
			        table.addCell(item[i]);
			        table.addCell("$"+item[i]);
			        total += 10;
			    }
			 
			    table.addCell("Tax\nShipping");
			    table.addCell("$"+df.format(total*.08)+"\n$4.99");
			    table.addCell("Applied Coupons");
			    table.addCell("$0.00");
			    table.addCell("Total");
			    table.addCell(df.format(total));
			    return table;
			}
		 @SuppressWarnings("unused")
		private static void addBarcode(PdfWriter writer,PdfPTable table){
			    PdfContentByte cb = writer.getDirectContent();
			    BarcodeEAN codeEAN = new BarcodeEAN();
			    codeEAN.setCodeType(Barcode.EAN13);
			    codeEAN.setCode("9780201615883");
			    Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
			    PdfPCell cell = new PdfPCell(imageEAN,false);
			   // cell.setPaddingTop(10);
			    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			    cell.setColspan(2);
			    cell.setBorder(0);
			    table.addCell(cell);
			}
		 
		 public static PdfPTable xrayImage(byte []xray){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(98); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.19f, .3f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	       //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("X-Ray Image", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell); 
	         return table;
	  }
		 
		 
		 
		 
		 public static PdfPTable createcomplainttable(String []tablevalues){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(98); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.19f, .3f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	       //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("Complaint", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell);

			    //insert column headings
			    insertCell(table, "Teeth No", Element.ALIGN_RIGHT, 1, bfBold12);
			    insertCell(table, "Complaints No", Element.ALIGN_LEFT, 1, bfBold12);
			    insertCell(table, "Comments", Element.ALIGN_LEFT, 1, bfBold12);
	           
	            for(int i=0;i<tablevalues.length;i++){
			    insertCell(table, tablevalues[i], Element.ALIGN_RIGHT, 1, bf12);
			    }
			    
	         return table;
	  }
		 
		 
		 
		 
		 
		 public static PdfPTable createonexaminationtable(String []tablevalues){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(98); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.19f, .3f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("On Examination", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell);
	  

			    //insert column headings
			    insertCell(table, "Teeth No", Element.ALIGN_RIGHT, 1, bfBold12);
			    insertCell(table, "Findings", Element.ALIGN_LEFT, 1, bfBold12);
			    insertCell(table, "Comments", Element.ALIGN_LEFT, 1, bfBold12);
	           
	            for(int i=0;i<tablevalues.length;i++){
			    insertCell(table, tablevalues[i], Element.ALIGN_RIGHT, 1, bf12);
			    }
			    
	         return table;
	  }
		 public static PdfPTable rxadvisedtable(String []tablevalues){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(98); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.19f, .3f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           
	       //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("Rx_advised", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell);
	  		    //insert column headings
			    insertCell(table, "Teeth No", Element.ALIGN_RIGHT, 1, bfBold12);
			    insertCell(table, "Treatement", Element.ALIGN_LEFT, 1, bfBold12);
			    insertCell(table, "fee", Element.ALIGN_LEFT, 1, bfBold12);
	           
	            for(int i=0;i<tablevalues.length;i++){
			    insertCell(table, tablevalues[i], Element.ALIGN_RIGHT, 1, bf12);
			    }
			    
	         return table;
	  }
		 public static PdfPTable workDonetable(String []tablevalues){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(99); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.3f, .2f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("Work done", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell);
	  

			    //insert column headings
			    insertCell(table, "Teeth No", Element.ALIGN_RIGHT, 1, bfBold12);
			    insertCell(table, "Work Done", Element.ALIGN_LEFT, 1, bfBold12);
			    insertCell(table, "Fee", Element.ALIGN_LEFT, 1, bfBold12);
	           
	            for(int i=0;i<tablevalues.length;i++){
			    insertCell(table, tablevalues[i], Element.ALIGN_RIGHT, 1, bf12);
			    }
			    
	         return table;
	  }
		 public static PdfPTable prescriptiontable(String []tablevalues){
			 Font bfBold12 = new Font(FontFamily.COURIER, 10, Font.BOLD); 
			   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 9); 
			 
	         PdfPTable table = new PdfPTable(3); // 3 columns.
	         table.setWidthPercentage(99); //Width 100%
	         table.setHorizontalAlignment(Element.ALIGN_LEFT);//Space before table
	         
	  
	         //Set Column widths
	         float[] columnWidths = {.3f, .2f,.2f};
	         try {
				table.setWidths(columnWidths);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	  
	         //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase("Precription", bfBold12));
			  //set the cell alignment
			 
		         cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			     cell.setColspan(3);
			    cell.setBorder(0);
			    table.addCell(cell);
			    //insert column headings
			    insertCell(table, "Prescription", Element.ALIGN_RIGHT, 1, bfBold12);
			    insertCell(table, "Dosage", Element.ALIGN_LEFT, 1, bfBold12);
			    insertCell(table, "Instruction", Element.ALIGN_LEFT, 1, bfBold12);
	           
	            for(int i=0;i<tablevalues.length;i++){
			    insertCell(table, tablevalues[i], Element.ALIGN_RIGHT, 1, bf12);
			    }
			    
	         return table;
	  }
		 private static void insertCell(PdfPTable table, String text, int align, int colspan, Font font){
			   
			  //create a new cell with the specified Text and Font
			  PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
			  //set the cell alignment
			  cell.setHorizontalAlignment(align);
		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		         cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			  //set the cell column span in case you want to merge two or more cells
			  cell.setColspan(colspan);
			  //in case there is no text and you wan to create an empty row
			  if(text.trim().equalsIgnoreCase("")){
			   cell.setMinimumHeight(10f);
			  }
			  //add the call to the table
			  table.addCell(cell);
			   
			 }
	}



