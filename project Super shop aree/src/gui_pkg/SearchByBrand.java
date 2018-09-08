package gui_pkg;
import product_pkg.Mobile_ctgr;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
/*import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;*/
import eventAction_pkg.EventHandlerOfSearchByBrand;

public class SearchByBrand implements ItemListener{
	JFrame frame;
	
	public JTextField txtFieldNum1;
	JLabel labelName;
	 
	 public JComboBox<String> searchcombo;
	JButton btnSearch;
	
	//for customer
	
	public SearchByBrand(String c_id, String c_name){
		    this.frame = new JFrame("SearchByBrand");
		    //this.frame.setSize(1000,800);
		    this.frame.setBounds(0,0,1000,800);
		    //this.frame.setTitle("HOME");  
	        //this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.frame.setLayout(null);
	        
	        this.txtFieldNum1 = new JTextField();
	        //this.txtFieldNum1.setEditable(true);
			this.txtFieldNum1.setBounds(210, 60, 120, 40);
			this.txtFieldNum1.setForeground(Color.BLUE);
			this.txtFieldNum1.setFont(new Font(null, Font.PLAIN,20));
			this.frame.add(this.txtFieldNum1);
			
			EventHandlerOfSearchByBrand eh = new EventHandlerOfSearchByBrand(this);
			
			this.btnSearch = new JButton("search");
			this.btnSearch.setBounds(332, 60, 100, 40);
			this.btnSearch.addActionListener(eh);
			this.frame.add(btnSearch);
			
			JButton addToShoppingCart = new JButton("Add To Cart");
			addToShoppingCart.setBounds(1300,180,140,60);
			addToShoppingCart.setForeground(Color.black);
			addToShoppingCart.setBackground(Color.yellow);
			this.frame.add(addToShoppingCart);
			addToShoppingCart.addActionListener(e->{
		          // this.frame.setVisible(false);
				//s_cart.add(new Shopping_cart(sname,sbrand,sunitprice,squantity));
		 		
		 	});
			
			JButton shoppingCart = new JButton("Shopping Cart");
			shoppingCart.setBounds(1300,110,140,60);
			shoppingCart.setForeground(Color.black);
			shoppingCart.setBackground(Color.red);
			this.frame.add(shoppingCart);
			shoppingCart.addActionListener(e->{
				//this.j.setVisible(false);
				new Shopping_cart_gui(c_id);
		 		
		 	});
			
			JButton back=new JButton("BACK");
			back.setBounds(550,40,100,50);
			back.setForeground(Color.black);
			back.setBackground(Color.blue);
			this.frame.add(back);
			back.addActionListener(e->{
		           
				this.frame.setVisible(false);
		        	   new Customer_gui(c_id, c_name);
		         
						
			});
			
	        
	        //Add the Country Combobox
	       
			/*JLabel lf=new JLabel("Welcome To Our University System");
			lf.setBounds(20,20,500,50);
			lf.setForeground(Color.red);
			lf.setFont(new Font("Times new Rooman",Font.PLAIN,30));*/
	       
	        this.frame.setLayout(null);
			this.labelName = new JLabel("Search by Brand:");
			this.labelName.setFont(new Font(null, Font.PLAIN,20));
			this.labelName.setBounds(47, 60, 170, 40);
			this.labelName.setForeground(Color.red);
	        this.frame.add(this.labelName);
	        
	       
	        this.frame.setVisible(true); //visibility sobar last e dite hbe
	        //countryCombo.setSelectedIndex(0);
	        
	        
	}
	
	
	
	public SearchByBrand(){
	    this.frame = new JFrame("SearchByBrand");
	    //this.frame.setSize(1000,800);
	    this.frame.setBounds(0,0,1000,800);
	    //this.frame.setTitle("HOME");  
        //this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        
        this.txtFieldNum1 = new JTextField();
        //this.txtFieldNum1.setEditable(true);
		this.txtFieldNum1.setBounds(210, 60, 120, 40);
		this.txtFieldNum1.setForeground(Color.BLUE);
		this.txtFieldNum1.setFont(new Font(null, Font.PLAIN,20));
		this.frame.add(this.txtFieldNum1);
		
		EventHandlerOfSearchByBrand eh = new EventHandlerOfSearchByBrand(this);
		
		this.btnSearch = new JButton("search");
		this.btnSearch.setBounds(332, 60, 100, 40);
		this.btnSearch.addActionListener(eh);
		this.frame.add(btnSearch);
		
		JButton back=new JButton("BACK");
		back.setBounds(435,60,100,40);
		back.setForeground(Color.black);
		back.setBackground(Color.blue);
		this.frame.add(back);
		back.addActionListener(e->{
	           this.frame.setVisible(false);
				new SearchFunc();	
		});
        
        //Add the Country Combobox
       
		/*JLabel lf=new JLabel("Welcome To Our University System");
		lf.setBounds(20,20,500,50);
		lf.setForeground(Color.red);
		lf.setFont(new Font("Times new Rooman",Font.PLAIN,30));*/
       
        this.frame.setLayout(null);
		this.labelName = new JLabel("Search by Brand:");
		this.labelName.setFont(new Font(null, Font.PLAIN,20));
		this.labelName.setBounds(47, 60, 170, 40);
		this.labelName.setForeground(Color.red);
        this.frame.add(this.labelName);
        
       
        this.frame.setVisible(true); //visibility sobar last e dite hbe
        //countryCombo.setSelectedIndex(0);
        
        
}
	
	
	
	public  void addcombo(){
	       
 	   searchcombo = new JComboBox<String>();
     searchcombo.addItemListener(this);
     //searchcombo.setEditable(false);
     this.frame.add(searchcombo);
     this.searchcombo.setBounds(210, 105, 150, 40);
     
    }


	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.flush();
		String p= (String)this.searchcombo.getSelectedItem();
	    System.out.println(p);
	    
	}
	
	
}
