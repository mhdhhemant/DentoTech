import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class registraioncheck {
	
	static Connection connection1;
	private static String serialkey[]={ "83-763-626-34-766-51-864",
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
		   "47-206-028-65-845-17-025"};
    public static void main(String [] arg){
		
    	try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); } 
		 catch (Exception e) {  }
    
		
		connection1=sqliteconnection.workdbconnector();
	
		String installdate = null;
		@SuppressWarnings("unused")
		String exdate = null;
		Connection connection=sqliteconnection.dbconnector();
		try{
			String query="select * from  installrecord ;";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
  	    	
				installdate= rs.getString("installdate");
  	            exdate=rs.getString("exdate");
  	   
			}
			pst.close();
			rs.close();
			}
	
	  catch(Exception e){
	       JOptionPane.showMessageDialog(null, "this seems that it is an error please report as bug ");
	  	}
		finally {
			try {connection.close();} catch (SQLException e) {e.printStackTrace();}	
	           }

		
	
		if(registyrationcheck()==false){
		
			if(installdate==null&expaircheck()!=1){
				login.main(new String []{});
				}
			else if(expaircheck()==1){
				String []a={};
				error.main(a);			
			}
			else if(LocalDate.parse(installdate).isAfter(LocalDate.now())){
				JOptionPane.showMessageDialog(null,"this seems that your system date is wrong .If you believe this message is in error.please contact this program's @author.");
				}
			
			else if(LocalDate.parse(installdate).plusDays(15).isAfter(LocalDate.now())){
			
				@SuppressWarnings("unused")
				String a[]={};
				login.main(new String []{});
			
			}
			else{
				try{
					String query ="CREATE  TABLE expairtrail_register ("+'"'+"expair"+'"'+" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE  )";
		  		    PreparedStatement pst=connection1.prepareStatement(query);
		            pst.execute();
		            pst.close();}
				  catch(Exception e){}
				
				try{
					String query="insert into expairtrail_register (expair) values(?);";
					PreparedStatement pst=connection1.prepareStatement(query);
		  		    pst.setString(1,"1");
		            pst.execute();
		            pst.close(); 
			
					}
				catch(Exception e){
					e.printStackTrace();
					}
				
				String []a={};
				error.main(a);
				}
			}
		
	else{
			
			String regdate = null;
			
			try{
			String query="select * from  register ;";
	   		PreparedStatement pst=connection1.prepareStatement(query);
	  	    ResultSet rs=pst.executeQuery();
	  	    while(rs.next()){
	  	       regdate= rs.getString("registerdate");
	  	     }
	  	    pst.close();
	  	    rs.close();
			}
		
		  catch(Exception e){
		       JOptionPane.showMessageDialog(null, "this seems that it is an error please report as bug ");
		  	}
			
			
			 if(LocalDate.parse(regdate).isAfter(LocalDate.now())){
				JOptionPane.showMessageDialog(null,"this seems that your system date is wrong .If you believe this message is in error.please contact this program's @author.");
			 	}
			 else if(expaircheck()==1){
					String []a={};
					error.main(a);
					
				}
			else if(LocalDate.parse(regdate).plusDays(365).isAfter(LocalDate.now())){
				       for(int j=1;j<=10;j++){
			              if(!LocalDate.parse(regdate).plusDays(365-j).isAfter(LocalDate.now())){
			            	  JOptionPane.showMessageDialog(null, "your register key expire  after "+(j)+" days, purchase a new key for continue use..");
			              break;
			              }
				       }
			@SuppressWarnings("unused")
			String a[]={};
			login.main(new String []{});
			
			}
			else{
				
				try{
					String query ="CREATE  TABLE expairtrail_register ("+'"'+"expair"+'"'+" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE  )";
		  		    PreparedStatement pst=connection1.prepareStatement(query);
		            pst.execute();
		            pst.close();}
				  catch(Exception e){}
					
				try{
					String query="insert into expairtrail_register (expair) values(?);";
					PreparedStatement pst=connection1.prepareStatement(query);
		  		    pst.setString(1,"1");
		            pst.execute();
		            pst.close(); 
			
				}
				catch(Exception e){
					e.printStackTrace();
				}
				String []a={};
				error.main(a);
			}
		}
		/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-mm-dd ").parse(installdate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
       //System.out.println( LocalDate.parse(installdate).isBefore);
	}
		@SuppressWarnings("unused")
		public static boolean registyrationcheck()
	{
		  int id = 0 ;
		   String registerdate=null;
		  String key = null;
		  try{
			
			  String query="select * from  register ;";
				PreparedStatement pst=connection1.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{ 
				id= Integer.parseInt( rs.getString("id"));
		         registerdate=rs.getString("registerdate");
		         key=rs.getString("register");
		          
			}
			pst.close();
			rs.close();
		}
			catch(Exception e){
			
			}
		  
		  if(key!=null){
			  for(int i=0;i<serialkey.length;i++){
			      if(key.equals(serialkey[i])){
				  return true;
			      }
			  }
			     return false;
		  }
		  else if (key==null){
			  return false;
		  }
		  
		return false;
	}
	public static int expaircheck(){
	
		int i=0;
	    try{
	    	String query="select * from expairtrail_register";
	    	PreparedStatement pst=connection1.prepareStatement(query);
	    	ResultSet rs=pst.executeQuery();
	    	while(rs.next()){
        	 	i=Integer.parseInt(rs.getString("expair")); 
         	}
	    	pst.close(); 
	    	rs.close();
	    }
	    catch(Exception e){
	  
	    }
	 return i;
	}

}
