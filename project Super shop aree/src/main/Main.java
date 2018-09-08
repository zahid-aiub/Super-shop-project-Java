package main;
import gui_pkg.HomePage;
import gui_pkg.SearchByBrand;
import product_pkg.Mobile_ctgr;
import java.util.*;

/*import com.gui.CountryViewer;
import db.DBConnectionProvider;
import db.DBDataProvider;
import model.Country;

/**
 *
 * @author Student
 */
public class Main {
	Mobile_ctgr mc;
    public static void main(String arg[]){    	
    	//SearchByBrand hp =new SearchByBrand();
    	
       Mobile_ctgr  m_c=new  Mobile_ctgr();
 	   Mobile_ctgr  m_c1=new  Mobile_ctgr("0-01","Xiaomi 473",5.5,3.0,13.0,2.2,"Android","Xiaomi",20000,15,2016,02,24);
 	   Mobile_ctgr  m_c2=new  Mobile_ctgr("0-01","Xiaomi 473",5.5,3.0,13.0,2.2,"Android","Xiaomi",20000,5,2016,02,24);
 	   Mobile_ctgr  m_c3=new  Mobile_ctgr("0-02","Xiaomi N73",5.0,3.5,15.0,5.0,"Android","Xiaomi",22000,13,2016,03,21);
 	   Mobile_ctgr  m_c4=new  Mobile_ctgr("0-03","Samsung J2",5.3,2.0,10.0,7.0,"Android","Samsung",15000,9,2016,02,14);
 	   Mobile_ctgr  m_c5=new  Mobile_ctgr("0-04","Nokia Lumia Xl",4.5,Double.NaN,5.0,Double.NaN,"Windowsos","Microsoft",21000,17,2016,11,10);
 			   
 	   m_c.addMobile(m_c1);
 	   m_c.addMobile(m_c2);
 	   m_c.addMobile(m_c3);
 	   m_c.addMobile(m_c4);
 	   m_c.addMobile(m_c5);
 	  HomePage hp=new HomePage();
 	   
 	  
 	   //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 	   //Date date = new Date(2017-1900, 6, 20);
 	   //System.out.println(date);
 	   
 	   /*m_c.searchByBrand("SamSung");        //middle 's'==uppercase bt still found
 	   m_c.searchByMobileName("Xiaomi n73");  //'n'==lowercase bt still found
 	   m_c.searchBySelfie_camera_Resolution(2,5);
 	   m_c.searchByRear_camera_Resolution(10,16);
 	   m_c.searchByMobileUnitPrice(20000,29000);*/
 	  //m_c.showMobile_ctgrList();
 	  
 	 /*ArrayList<Mobile_ctgr>mcList=Mobile_ctgr.getmobile_ctgrList();
     for(Mobile_ctgr c:mcList){
			hp.searchcombo.addItem(c.m_name);
     }
 	  */
 	 //EventHandler ev=new EventHandler(hp);
 	 Mobile_ctgr.setobject(m_c);
 	 
 	   
 	   //searchbycamera(rear+selfie) [done]
 	   //searchByBrand  [done]
 	   //searchbyrealeasedate
 	   //recentsold
 	   //pictureadd
 	   //comment+rating
 	   //deliveryDistance
 	   //network_send new product notification
 	   //most new item show in first interface
 	   //specific brand or product search auto genarate
 	   //to find specific brand all product . in main class with switch case call every category "searchByBrand" 
 	   //search letterbyletter
 	   
    }
    
}