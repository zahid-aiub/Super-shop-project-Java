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


public class SearchByRearCameraM {

	public SearchByRearCameraM(String c_id, String c_name){
		JFrame j=new JFrame("Search By Rear Camera(MEGAPIXEL)");
		
		JLabel l2=new JLabel("FROM : ");
		l2.setBounds(20,40,100,20);
		l2.setFont(new Font("Times new Rooman",Font.PLAIN,20));
		l2.setForeground(Color.red);
		j.add(l2);
		
		JLabel l3=new JLabel("TO :");
		l3.setBounds(240,40,100,20);
		l3.setFont(new Font("Times new Rooman",Font.PLAIN,20));
		l3.setForeground(Color.red);
		j.add(l3);
		
		JTextField from =new JTextField();
		from.setBounds(140,40,100,20);
		j.add(from);
		
		JTextField to =new JTextField();
		to.setBounds(340,40,100,20);
		j.add(to);
		
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
		
		
		JButton search=new JButton("SEARCH");
		search.setBounds(445,40,100,30);
		j.add(search);
		search.addActionListener(e->{
	           //j.setVisible(false);
				//new SearchFunc();	
			String fromv = from.getText();
			Double numVal1 = Double.parseDouble(fromv);
			
			String tov = to.getText();
			Double numVal2 = Double.parseDouble(tov);
			
			Mobile_ctgr.searchByRear_camera_Resolution(numVal1,numVal2);
		});
		
		j.setSize(1500,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	
	
	public SearchByRearCameraM(){
		JFrame j=new JFrame("Search By Rear Camera(MEGAPIXEL)");
		
		JLabel l2=new JLabel("FROM : ");
		l2.setBounds(20,40,100,20);
		l2.setFont(new Font("Times new Rooman",Font.PLAIN,20));
		l2.setForeground(Color.red);
		j.add(l2);
		
		JLabel l3=new JLabel("TO :");
		l3.setBounds(240,40,100,20);
		l3.setFont(new Font("Times new Rooman",Font.PLAIN,20));
		l3.setForeground(Color.red);
		j.add(l3);
		
		JTextField from =new JTextField();
		from.setBounds(140,40,100,20);
		j.add(from);
		
		JTextField to =new JTextField();
		to.setBounds(340,40,100,20);
		j.add(to);
		
		JButton back=new JButton("BACK");
		back.setBounds(550,40,100,50);
		back.setForeground(Color.black);
		back.setBackground(Color.blue);
		j.add(back);
		back.addActionListener(e->{
	           j.setVisible(false);
				new SearchFunc();	
		});
		
		JButton search=new JButton("SEARCH");
		search.setBounds(445,40,100,30);
		j.add(search);
		search.addActionListener(e->{
	           //j.setVisible(false);
				//new SearchFunc();	
			String fromv = from.getText();
			Double numVal1 = Double.parseDouble(fromv);
			
			String tov = to.getText();
			Double numVal2 = Double.parseDouble(tov);
			
			Mobile_ctgr.searchByRear_camera_Resolution(numVal1,numVal2);
		});
		
		j.setSize(1500,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	
	
	
}
