package gui_pkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

import product_pkg.Mobile_ctgr;

public class SearchByNameM {
	
	public SearchByNameM(){
		JFrame j=new JFrame("Search By mobile model");
		JLabel l2=new JLabel("Enter Model Name : ");
		l2.setBounds(20, 40, 150, 30);
		j.add(l2);
		
		JTextField search =new JTextField();
		search.setBounds(190,40,150,30);
		j.add(search);
		
		JButton searchh=new JButton("SEARCH");
		searchh.setBounds(445,40,100,30);
		j.add(searchh);
		searchh.addActionListener(e->{
	           //j.setVisible(false);
				//new SearchFunc();	
			String fromv = search.getText();
			//Double numVal1 = Double.parseDouble(fromv);
			
			Mobile_ctgr.searchByMobileName(fromv);
		});
		
		JButton back=new JButton("BACK");
		back.setBounds(550,40,100,50);
		back.setForeground(Color.black);
		back.setBackground(Color.blue);
		j.add(back);
		back.addActionListener(e->{
	           j.setVisible(false);
				new SearchFunc();	
		});
		
		j.setSize(1500,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public SearchByNameM(String c_id, String c_name){
		JFrame j=new JFrame("Search By mobile model");
		JLabel l2=new JLabel("Enter Model Name : ");
		l2.setBounds(20, 40, 150, 30);
		j.add(l2);
		
		JTextField search =new JTextField();
		search.setBounds(190,40,150,30);
		j.add(search);
		
		JButton searchh=new JButton("SEARCH");
		searchh.setBounds(445,40,100,30);
		j.add(searchh);
		searchh.addActionListener(e->{
	           //j.setVisible(false);
				//new SearchFunc();	
			String fromv = search.getText();
			//Double numVal1 = Double.parseDouble(fromv);
			
			Mobile_ctgr.searchByMobileName(fromv);
		});
		
		JButton addToShoppingCart = new JButton("Add To Cart");
		addToShoppingCart.setBounds(1300,180,140,60);
		addToShoppingCart.setForeground(Color.black);
		addToShoppingCart.setBackground(Color.yellow);
		j.add(addToShoppingCart);
		addToShoppingCart.addActionListener(e->{
	          // this.j.setVisible(false);
			//s_cart.add(new Shopping_cart(sname,sbrand,sunitprice,squantity));
	 		
	 	});
		
		JButton shoppingCart = new JButton("Shopping Cart");
		shoppingCart.setBounds(1300,110,140,60);
		shoppingCart.setForeground(Color.black);
		shoppingCart.setBackground(Color.red);
		j.add(shoppingCart);
		shoppingCart.addActionListener(e->{
			//this.j.setVisible(false);
			new Shopping_cart_gui(c_id);
	 		
	 	});
		
		JButton back=new JButton("BACK");
		back.setBounds(550,40,100,50);
		back.setForeground(Color.black);
		back.setBackground(Color.blue);
		j.add(back);
		back.addActionListener(e->{
	           
	        	   j.setVisible(false);
	        	   new Customer_gui(c_id, c_name);
	         
					
		});
		
		
		j.setSize(1500,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
	
	
}
