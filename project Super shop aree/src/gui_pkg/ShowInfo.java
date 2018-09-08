package gui_pkg;

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


public class ShowInfo {
	
	String c_id;
	String name;
	String passw;
	
	public ShowInfo(String c_id,String name,String passww){
		
		this.c_id=c_id;
		this.name=name;
		this.passw=passww;
		
		JFrame frame=new JFrame("Personal information"+'\n'+" CUSTOMER:"+'\n'+name);
		
		//take data from database by type admin & add it to textfield
	
    JLabel l1 = new JLabel("Id:");
	l1.setBounds(10,50,150,20);
	frame.add(l1);
	
	JTextField id=new JTextField();
	id.setEditable(false);
	id.setBounds(200,50,200,20);
	frame.add(id);
	
	
	 JLabel l2 = new JLabel("Password:");
	l2.setBounds(10,120,150,20);
	frame.add(l2);
	
	JPasswordField oldpass=new JPasswordField();
	oldpass.setEditable(false);
	oldpass.setEchoChar((char) 0);
	oldpass.setBounds(200,120,200,20);
	frame.add(oldpass);
	
	
	 JLabel l3 = new JLabel("Address:");
	l3.setBounds(10,190,230,20);
	frame.add(l3);
	
	JTextField address=new JTextField();
	address.setEditable(false);
	address.setBounds(200,190,200,20);
	frame.add(address);
	
	
	 JLabel l4 = new JLabel("Contact NO:");
	l4.setBounds(10,260,230,20);
	frame.add(l4);
	
	JTextField contactNO=new JTextField();
	contactNO.setEditable(false);
	contactNO.setBounds(200,260,200,20);
	frame.add(contactNO);
	
	
	 JLabel l5 = new JLabel("Name:");
		l5.setBounds(10,330,230,20);
		frame.add(l5);
		
		JTextField firstName=new JTextField();
		firstName.setEditable(false);
		firstName.setBounds(200,330,200,20);
		frame.add(firstName);
		
		
		 JLabel l6 = new JLabel("CreditCardNo:");
			l6.setBounds(10,400,230,20);
			frame.add(l6);
			
			JTextField cCard=new JTextField();
			cCard.setEditable(false);
			cCard.setBounds(200,400,200,20);
			frame.add(cCard);
			
			
			
	
	
	JButton cancel=new JButton("BACK");
	cancel.setBounds(270,500,100,70);
	frame.add(cancel);
	cancel.addActionListener(e -> {
		frame.setVisible(false);
		new Customer_gui(c_id,name,this.passw);
	});
	
	
	frame.setSize(1000,900);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	//**************for admin///
	
public ShowInfo(String c_id,String name,String passww,String u_type){
		
	this.c_id=c_id;
	this.name=name;
	this.passw=passww;
	
	JFrame frame=new JFrame(("Personal information:")+'\n'+" ADMIN:"+'\n'+name);
          
	//take data from database by type admin & add it to textfield
	
	
	
	JLabel l1 = new JLabel("Id:");
	l1.setBounds(10,50,150,20);
	frame.add(l1);
	
	JTextField id=new JTextField();
	id.setEditable(false);
	id.setBounds(200,50,200,20);
	frame.add(id);
	
	
	 JLabel l2 = new JLabel("Password:");
	l2.setBounds(10,120,150,20);
	frame.add(l2);
	
	JPasswordField oldpass=new JPasswordField();
	oldpass.setEditable(false);
	oldpass.setEchoChar((char) 0);
	oldpass.setBounds(200,120,200,20);
	frame.add(oldpass);
	
	
	 JLabel l3 = new JLabel("Address:");
	l3.setBounds(10,190,230,20);
	frame.add(l3);
	
	JTextField address=new JTextField();
	address.setEditable(false);
	address.setBounds(200,190,200,20);
	frame.add(address);
	
	
	 JLabel l4 = new JLabel("Contact NO:");
	l4.setBounds(10,260,230,20);
	frame.add(l4);
	
	JTextField contactNO=new JTextField();
	contactNO.setEditable(false);
	contactNO.setBounds(200,260,200,20);
	frame.add(contactNO);
	
	
	 JLabel l5 = new JLabel("Name:");
		l5.setBounds(10,330,230,20);
		frame.add(l5);
		
		JTextField firstName=new JTextField();
		firstName.setEditable(false);
		firstName.setBounds(200,330,200,20);
		frame.add(firstName);	
	
	
	JButton cancel=new JButton("BACK");
	cancel.setBounds(270,500,100,70);
	frame.add(cancel);
	cancel.addActionListener(e -> {
		frame.setVisible(false);
		new Admin_gui(c_id,name,this.passw);
	});
	
	
	frame.setSize(1000,900);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
