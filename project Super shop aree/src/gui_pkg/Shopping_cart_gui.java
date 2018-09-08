package gui_pkg;

import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;


public class Shopping_cart_gui{
	
   public Shopping_cart_gui(int c_id){
	   
   }

	public Shopping_cart_gui(String c_id){
		
		double price = 0.5;
		String s= String.valueOf(price);
		
		JFrame j=new JFrame("Shopping_cart");
		j.setSize(1300,800);
		j.setLayout(null);
		
		JLabel l1=new JLabel("Total price(TAKA) : ");
		l1.setBounds(20,20,160,30);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Times new Rooman",Font.PLAIN,16));
		j.add(l1);
		
		JTextField t1=new JTextField(s);
		t1.setEditable(false);
		t1.setBounds(180,20,200,33);
		j.add(t1);
		
		JButton buy= new JButton("Confirm & BUY");
		buy.setBounds(1100,20,150,40);
		buy.setBackground(Color.magenta);
		buy.setForeground(Color.BLACK);
		j.add(buy);
		buy.addActionListener(e->{
			
			
			
		});
		
		/*JButton back=new JButton("BACK");
		back.setBounds(550,40,100,50);
		back.setForeground(Color.black);
		back.setBackground(Color.blue);
		j.add(back);
		back.addActionListener(e->{
	           j.setVisible(false);
	           //((Window) Customer_gui.j).setVisible(true);
	           
		});
		*/
		
		
		
		j.revalidate();
		j.repaint();
		
		j.setVisible(true);
		
		
	}
	public void dlete_cart(String c_id){
		
		  
		  JOptionPane.showMessageDialog(null,"shopping cart cleared!!!");
		  
		  
			
			//delete all row that match with c_id from table shopping_cart from database
			
		}
	

}
