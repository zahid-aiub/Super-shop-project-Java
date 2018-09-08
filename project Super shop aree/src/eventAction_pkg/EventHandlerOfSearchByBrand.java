package eventAction_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;

import gui_pkg.SearchByBrand;
import product_pkg.Mobile_ctgr;

public class EventHandlerOfSearchByBrand implements ActionListener{
    
	SearchByBrand homepageRef;
	static String e;
	public EventHandlerOfSearchByBrand(SearchByBrand homepage) {
		// TODO Auto-generated constructor stub
		this.homepageRef = homepage;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getActionCommand().equals("search")){
			//GUI1 g = new GUI1("ADD", new Rectangle(200, 300, 150, 100));
			String brandName = this.homepageRef.txtFieldNum1.getText();
			homepageRef.addcombo();
			
			 ArrayList<Mobile_ctgr>mcList=Mobile_ctgr.searchByBrand(brandName);
			 for(Mobile_ctgr c:mcList){
		    	 
		    	 homepageRef.searchcombo.addItem(c.m_name);
		     }
			 //Mobile_ctgr.searchByBrand(num);
			 /*for(Mobile_ctgr c:mcList){
		    	 if(c.brand.equals(num))
		    	 homepageRef.searchcombo.addItem(c.m_name);
		     }*/
			 
			
		}
	}




	
	

	

}
