package gui_pkg;

import product_pkg.Mobile_ctgr;
import product_pkg.Shopping_cart;
import user.Customer;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
import java.util.Collections;

import javax.swing.*;

import product_pkg.Shopping_cart;

public class Customer_gui implements ItemListener{
     String c_id;
	 JFrame j;
	public static boolean clog;
	public String sname;
	public String sbrand;
	public double sunitprice;
	public int squantity;
	ArrayList<Shopping_cart> s_cart=new ArrayList<Shopping_cart>();
	
	 public JComboBox<String> categoryCombo;
		
		JLabel l7;
		JButton searchByNameM;
		JButton searchByBrandM;
		JButton searchByUnitPriceM;
		JButton searchByRear_camera_ResolutionM;
		JButton searchBySelfie_camera_ResolutionM;
		JLabel l8;
		JButton searchByBrandL;
		
		public String c_name;
		public String p;
		public int Ms;
		public int Ls;
		String passw;
	

		public Customer_gui(String c_id,String name,String passw){  //String customerId parameter hisebe thakbe sobkichute
			
			//this. c_name=name;
			this.c_id=c_id;
			this.c_name=name;
			this.passw=passw;
			clog=true;
			Customer cu =new Customer();
			 
			    this.j=new JFrame();
			    //**********************
			    JMenuBar menubar=new JMenuBar();
			    this.j.setJMenuBar(menubar);
				
				JMenu menu =new JMenu("Menu");
				menubar.add(menu);
				
				JMenu hlp =new JMenu("Help");
				menubar.add(hlp);
				
				
				JMenuItem pass = new JMenuItem("Change Password");
				menu.add(pass);
				pass.addActionListener(e -> {
					this.j.setVisible(false);
					new ChangePassword(this.c_id,this.c_name,this.passw);
				} );
				
				JMenuItem sami = new JMenuItem("Change Information");
				menu.add(sami);
				sami.addActionListener(e -> {
					this.j.setVisible(false);
					new ChangeInfo(this.c_id,this.c_name,this.passw);
				} );
				
				JMenuItem sInfo = new JMenuItem("Show Information");
				menu.add(sInfo);
				sInfo.addActionListener(e -> {
					new ShowInfo(this.c_id,this.c_name,this.passw);
					/*this.j.setVisible(false);
					new ChangeInfo(this.c_id,this.c_name,this.passw);*/
				} );
				
				
				//********************************
			
			
			this.j.setTitle("Customer: "+c_name);
			this.j.setSize(950,800);
			this.j.setLayout(null);
			this.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton logout = new JButton("Logout");
			logout.setBounds(780,40,120,60);
			logout.setForeground(Color.black);
			logout.setBackground(Color.yellow);
			this.j.add(logout);
			logout.addActionListener(e->{
				this.j.setVisible(false);
				//new Delete_cart(c_id);
				Shopping_cart_gui scg=new Shopping_cart_gui(15);
				scg.dlete_cart(c_id);
		 		new HomePage();
		 		
		 	});
			JButton addToShoppingCart = new JButton("Add To Cart");
			addToShoppingCart.setBounds(780,180,140,60);
			addToShoppingCart.setForeground(Color.black);
			addToShoppingCart.setBackground(Color.yellow);
			this.j.add(addToShoppingCart);
			addToShoppingCart.addActionListener(e->{
		          // this.j.setVisible(false);
				s_cart.add(new Shopping_cart(sname,sbrand,sunitprice,squantity));
		 		
		 	});
			
			JButton shoppingCart = new JButton("Shopping Cart");
			shoppingCart.setBounds(780,110,140,60);
			shoppingCart.setForeground(Color.black);
			shoppingCart.setBackground(Color.red);
			this.j.add(shoppingCart);
			shoppingCart.addActionListener(e->{
				//this.j.setVisible(false);
				new Shopping_cart_gui(c_id);
		 		
		 	});
			
			//********************************************************************
			
		
			
				
				
				
				JLabel l9=new JLabel("Select Category :");
				l9.setBounds(20,20,250,20);
				l9.setFont(new Font("Times new Rooman",Font.PLAIN,16));
				l9.setForeground(Color.ORANGE);
				this.j.add(l9);
				
				categoryCombo = new JComboBox<String>();
				categoryCombo.addItemListener(this);
			     //categoryCombo.setEditable(false);
				this.categoryCombo.setEditable(false);
			     this.categoryCombo.addItem("Mobile");
			    
			     this.categoryCombo.setBounds(150, 20, 100, 20);
			     this.j.add(categoryCombo);
			     
			     JButton allProduct=new JButton("Search ALL Product");
			     allProduct.setBounds(550,40,200,50);
			     allProduct.setForeground(Color.black);
			     allProduct.setBackground(Color.yellow);
			     this.j.add(allProduct);
			 	allProduct.addActionListener(e->{
			           //this.this.j.setVisible(false);
			 		
			 		String data[][]={ {"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
			 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
			 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"}};
			 		
			 		
			  String column[]={"Name","Id","brand","Display size","ram","rear_camera_Resolution","selfie_camera_Resolution","os","unitPrice","availablity"};         
			JTable jt=new JTable(data,column);    
			jt.setBounds(20,300,950,850);       
			JScrollPane sp=new JScrollPane(jt);
			this.j.add(jt);
			this.j.add(sp);
			 	});
			 	
			 	
			 	this.j.revalidate();
			 	this.j.repaint();
			
			
			 	this.j.setVisible(true);
			
			
		}
		
		
//****************+++++++++++++++++++++++++++++++*************************************+++++++++++++++++++++++++++++++++++++++
		
		
		
		public Customer_gui(String c_id,String name){  //String customerId parameter hisebe thakbe sobkichute
		
			//this. c_name=name;
			this.c_id=c_id;
			this.c_name=name;
			this.passw=passw;
			clog=true;
			Customer cu =new Customer();
			 
			    this.j=new JFrame();
			    //**********************
			    JMenuBar menubar=new JMenuBar();
			    this.j.setJMenuBar(menubar);
				
				JMenu menu =new JMenu("Menu");
				menubar.add(menu);
				
				JMenu hlp =new JMenu("Help");
				menubar.add(hlp);
				
				
				JMenuItem pass = new JMenuItem("Change Password");
				menu.add(pass);
				pass.addActionListener(e -> {
					this.j.setVisible(false);
					new ChangePassword(this.c_id,this.c_name,this.passw);
				} );
				
				JMenuItem sami = new JMenuItem("Change Information");
				menu.add(sami);
				sami.addActionListener(e -> {
					this.j.setVisible(false);
					new ChangeInfo(this.c_id,this.c_name,this.passw);
				} );
				
				JMenuItem sInfo = new JMenuItem("Show Information");
				menu.add(sInfo);
				sInfo.addActionListener(e -> {
					new ShowInfo(c_id,name,passw);
					/*this.j.setVisible(false);
					new ChangeInfo(this.c_id,this.c_name,this.passw);*/
				} );
				
				
				//********************************
			
			
			this.j.setTitle("Customer: "+c_name);
			this.j.setSize(950,800);
			this.j.setLayout(null);
			this.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton logout = new JButton("Logout");
			logout.setBounds(780,40,120,60);
			logout.setForeground(Color.black);
			logout.setBackground(Color.yellow);
			this.j.add(logout);
			logout.addActionListener(e->{
				this.j.setVisible(false);
				clog=false;
				new Delete_cart(c_id);
		 		new HomePage();
		 		
		 	});
			JButton addToShoppingCart = new JButton("Add To Cart");
			addToShoppingCart.setBounds(780,180,140,60);
			addToShoppingCart.setForeground(Color.black);
			addToShoppingCart.setBackground(Color.yellow);
			this.j.add(addToShoppingCart);
			addToShoppingCart.addActionListener(e->{
		          // this.j.setVisible(false);
				s_cart.add(new Shopping_cart(sname,sbrand,sunitprice,squantity));
		 		
		 	});
			
			JButton shoppingCart = new JButton("Shopping Cart");
			shoppingCart.setBounds(780,110,140,60);
			shoppingCart.setForeground(Color.black);
			shoppingCart.setBackground(Color.red);
			this.j.add(shoppingCart);
			shoppingCart.addActionListener(e->{
				//this.j.setVisible(false);
				new Shopping_cart_gui(c_id);
		 		
		 	});
			
			//********************************************************************
			
		
			
				
				
				
				JLabel l9=new JLabel("Select Category :");
				l9.setBounds(20,20,250,20);
				l9.setFont(new Font("Times new Rooman",Font.PLAIN,16));
				l9.setForeground(Color.ORANGE);
				this.j.add(l9);
				
				categoryCombo = new JComboBox<String>();
				categoryCombo.addItemListener(this);
			     //categoryCombo.setEditable(false);
				this.categoryCombo.setEditable(false);
			     this.categoryCombo.addItem("Mobile");
			     
			     this.categoryCombo.setBounds(150, 20, 100, 20);
			     this.j.add(categoryCombo);
			     
			     JButton allProduct=new JButton("Search ALL Product");
			     allProduct.setBounds(550,40,200,50);
			     allProduct.setForeground(Color.black);
			     allProduct.setBackground(Color.yellow);
			     this.j.add(allProduct);
			 	allProduct.addActionListener(e->{
			           //this.this.j.setVisible(false);
			 		
			 		String data[][]={ {"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
			 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
			 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"}};
			 		
			 		
			  String column[]={"Name","Id","brand","Display size","ram","rear_camera_Resolution","selfie_camera_Resolution","os","unitPrice","availablity"};         
			JTable jt=new JTable(data,column);    
			jt.setBounds(20,300,950,850);     
			JScrollPane sp=new JScrollPane(jt);
			this.j.add(jt);
			this.j.add(sp);
			
			
			
			 	});
			 	
			 	
			 	this.j.revalidate();
			 	this.j.repaint();
			
			
			 	this.j.setVisible(true);
			
		
	}

public void addcomponentforMobile(){
	this.Ls=0;
	
	this.l7=new JLabel("YOU CAN SEARCH MOBILE BY : ");
	this.l7.setBounds(40,60,1500,40);
	this.l7.setFont(new Font("Times new Rooman",Font.PLAIN,20));
	this.l7.setForeground(Color.ORANGE);
	this.j.add(this.l7);
	
	
	this.searchByBrandM = new JButton("Brand");
	this.searchByBrandM.setBounds(140,120,115,45);
	this.searchByBrandM.setForeground(Color.black);
	this.searchByBrandM.setBackground(Color.blue);
	this.j.add(this.searchByBrandM);
	this.searchByBrandM.addActionListener(e -> {
		this.j.setVisible(false);
		new SearchByBrand(this.c_id,this.c_name);
	});
	

	this.searchByUnitPriceM = new JButton("UnitPrice");
	this.searchByUnitPriceM.setBounds(260,120,115,45);
	this.searchByUnitPriceM.setForeground(Color.black);
	this.searchByUnitPriceM.setBackground(Color.blue);
	this.j.add(this.searchByUnitPriceM);
	//j.remove(searchByBrand);
	this.searchByUnitPriceM.addActionListener(e -> {
		this.j.setVisible(false);
		new SearchByPriceM(this.c_id,this.c_name);
	});
	
	this.searchByNameM = new JButton("Model Name");
	this.searchByNameM.setBounds(380,120,115,45);
	this.searchByNameM.setForeground(Color.black);
	this.searchByNameM.setBackground(Color.blue);
	this.j.add(this.searchByNameM);
	this.searchByNameM.addActionListener(e -> {
		this.j.setVisible(false);
		new SearchByNameM(this.c_id,this.c_name);
	});
	
	this.searchByRear_camera_ResolutionM = new JButton("Rear Camera");
	this.searchByRear_camera_ResolutionM.setBounds(500,120,115,45);
	this.searchByRear_camera_ResolutionM.setForeground(Color.black);
	this.searchByRear_camera_ResolutionM.setBackground(Color.blue);
	this.j.add(this.searchByRear_camera_ResolutionM);
	this.searchByRear_camera_ResolutionM.addActionListener(e -> {
		this.j.setVisible(false);
		new SearchByRearCameraM(this.c_id,this.c_name);
	});
	
	this.searchBySelfie_camera_ResolutionM = new JButton("Selfie Camera");
	this.searchBySelfie_camera_ResolutionM.setBounds(620,120,115,45);
	this.searchBySelfie_camera_ResolutionM.setForeground(Color.black);
	this.searchBySelfie_camera_ResolutionM.setBackground(Color.blue);
	this.j.add(this.searchBySelfie_camera_ResolutionM);
	this.searchBySelfie_camera_ResolutionM.addActionListener(e -> {
		this.j.setVisible(false);
		new SearchBySelfieCamM(this.c_id,this.c_name);
	});
	
	
	this.j.revalidate();
	this.j.repaint();
}


@Override
public void itemStateChanged(ItemEvent e) {
	System.out.flush();
	this.p= (String)this.categoryCombo.getSelectedItem();
	
	//this.p=null;
    //System.out.println(p);
	if(this.p.equals("Mobile")){
		this.Ms=1;
		if(this.Ls==1){
			this.j.remove(this.l8);
			this.j.remove(this.searchByBrandL);
			
		}
		System.out.println();
		
		this.addcomponentforMobile();
		
	}
	if(this.p.equals("Laptop")){
		this.Ls=1;
        if(this.Ms==1){
        	
        	this.j.remove(this.l7);
        	this.j.remove(this.searchByBrandM);
        	this.j.remove(this.searchByUnitPriceM);
        	this.j.remove(this.searchByNameM);
        	this.j.remove(this.searchByRear_camera_ResolutionM);
        	this.j.remove(this.searchBySelfie_camera_ResolutionM);
        	
        	
		}
		
		
		//this.addcomponentforlaptop();
		
	}
	
}


	



}
