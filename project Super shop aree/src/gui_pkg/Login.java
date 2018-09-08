package gui_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import user.Customer;

public class Login{
	String userType;
	HomePage hrefer;
	String userId;
	String pass;
	String name;
	Connection conn;
	Statement stmt;
	ArrayList<Customer>cList;
	
	public Login(String userId,String password,HomePage href) throws SQLException{
		this.hrefer=href;
		Customer c1 = new Customer();
		
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javasuperproject", "root", "");
		stmt = conn.createStatement();
		cList=new ArrayList<Customer>();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		String query = "select * from customer";
//      query = "select * from City where CountryCode='"+countryCode+"'";
//      System.out.println(query);
      ResultSet rs = stmt.executeQuery(query);
      
      while(rs.next()){
          
      	//System.out.println(rs.getString("name"));
      	
    	  
    	  c1.setid(rs.getString("c_id"));
    	  c1.setpassword(rs.getString("c_password"));
    	  c1.setName(rs.getString("c_name"));
    	  c1.setAddress(rs.getString("c_address"));
    	  c1.setPhone(rs.getString("c_phone"));
    	  c1.setCard(rs.getString("c_cardNo"));
    	  c1.setType(rs.getString("u_type"));
    	  
          
          // add this country to countryList
          cList.add(c1);
      }
		
		
		//if check of login verfied then goto customer gui for customer
		//user id diye query kore usertype anbe thn search dbe
		//check gulo ArrayList r moddhe hbe
		
      for(Customer cl:cList){
    	  System.out.println("id"+cl.c_id+"pass:"+cl.c_passwordNo);
		this.pass=password;
		this.userId=userId;
		String userType=cl.u_type;
		
		String databaseCusID=cl.c_id;
		String databaseCusPassword=cl.c_passwordNo;
		String databaseAdmID="16";
		String databaseAdmPassword="93";
		
if((this.userId.equals(databaseCusID) && this.pass.equals(databaseCusPassword)) /*||( this.userId.equals(databaseAdmID) && this.pass.equals(databaseAdmPassword))*/){
	             
	hrefer.j.setVisible(false);
	this.gotoUser(userType);
	
		}
		else{
			
			hrefer.adderror();
			break;
		}
		
		
	}
      
	}
	
	public void gotoUser(String userType){
		String cus="customer";
		String admn="admin";
		
		if(userType.equals(cus)){
			//database theke c_name ber korbe then{{{ this.name=c_name
			this.name="Alavi";
			new Customer_gui(this.userId,this.name,this.pass);
		}
		else if(userType.equals(admn)){
			//database theke u_name ber korbe then{{{ this.name=u_name
			this.name="Ovi";
			new Admin_gui(this.userId,this.name,this.pass);
		}
		else{
	
			//hrefer.adderror();
			System.out.println("type error");
		}
		
	}
	

}
