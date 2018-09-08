package gui_pkg;

import java.io.IOException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import product_pkg.Mobile_ctgr;


public class SearchFunc /*implements ItemListener*/{
	public JComboBox<String> categoryCombo;
	public JFrame j;
	
	JLabel l7;
	JButton searchByNameM;
	JButton searchByBrandM;
	JButton searchByUnitPriceM;
	JButton searchByRear_camera_ResolutionM;
	JButton searchBySelfie_camera_ResolutionM;
	
	JLabel l8;
	JButton searchByBrandL;
	
	JTable jt;
	
	public String p;
	public int Ms;
	public int Ls;
	
	//for admin
	//for customer in customer_gui
	
	
	
	
public SearchFunc(String c_id,String name,String passww,String u_type){
		
		this.j=new JFrame("Search Product");
		
		JLabel l9=new JLabel("Select Category :");
		l9.setBounds(20,20,250,20);
		l9.setFont(new Font("Times new Rooman",Font.PLAIN,16));
		l9.setForeground(Color.ORANGE);
		this.j.add(l9);
		
		categoryCombo = new JComboBox<String>();
		//categoryCombo.addItemListener(this);
		//*******************+++++++++++++++++++++++*******************
		categoryCombo.addItemListener(e->{
			
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
			/*if(this.p.equals("Laptop")){
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
				
			}*/
			
		});
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
	           //this.j.setVisible(false);
	 		
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
	 	
	 	JButton back=new JButton("BACK");
	 	back.setBounds(755,40,200,50);
	 	back.setForeground(Color.black);
	 	back.setBackground(Color.orange);
	 	this.j.add(back);
	 	back.addActionListener(e->{
	           this.j.setVisible(false);
	           new Admin_gui(c_id,name,passww);
	 		
	 	});
	 	
		
		this.j.setSize(1000,900);
		this.j.setLayout(null);
		this.j.setVisible(true);
		this.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	//for general


	public SearchFunc(){
		
		this.j=new JFrame("Search Product");
		
		JLabel l9=new JLabel("Select Category :");
		l9.setBounds(20,20,250,20);
		l9.setFont(new Font("Times new Rooman",Font.PLAIN,16));
		l9.setForeground(Color.ORANGE);
		this.j.add(l9);
		
		categoryCombo = new JComboBox<String>();
		categoryCombo.addItemListener(e->{
		
	
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
		/*if(this.p.equals("Laptop")){
			this.Ls=1;
            if(this.Ms==1){
            	
            	this.j.remove(this.l7);
            	this.j.remove(this.searchByBrandM);
            	this.j.remove(this.searchByUnitPriceM);
            	this.j.remove(this.searchByNameM);
            	this.j.remove(this.searchByRear_camera_ResolutionM);
            	this.j.remove(this.searchBySelfie_camera_ResolutionM);
            	
            	
			}
			
			
			this.addcomponentforlaptop();
			
		}*/
	
	
	
	
	});
		
		
		
		
		
		
		
		
		
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
	           //this.j.setVisible(false);
	 		
	 		//Mobile_ctgr.showMobile_ctgrList();	
	 		
	 		String data[][]={ 
	 				
	 				
	 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
	 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
	 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"}
	 				
	 				};
	 		
	 		
	  String column[]={"Name","Id","brand","Display size","ram","rear_camera_Resolution","selfie_camera_Resolution","os","unitPrice","availablity"};         
	 jt=new JTable(data,column); 
	for(int i=0;i<50;i++){
		String i1[][]={ 
 				
 				
 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"},    
 				{"Values","Values","Values","Values","Values","Values","Values","Values","Values","Values"}
 				
 				};
		 DefaultTableModel model = (DefaultTableModel) jt.getModel();
         model.addRow(i1);
		//this.jt.add(i1);
		
	}
	
	jt.setBounds(20,300,950,850);       
	JScrollPane sp=new JScrollPane(jt);
	this.j.add(jt);
	this.j.add(sp);
	this.j.revalidate();
	this.j.repaint();
	 		
	 		
	 	});
	 	
	 	JButton back=new JButton("BACK");
	 	back.setBounds(755,40,200,50);
	 	back.setForeground(Color.black);
	 	back.setBackground(Color.orange);
	 	this.j.add(back);
	 	back.addActionListener(e->{
	           this.j.setVisible(false);
	 		new HomePage();
	 		
	 	});
	 	
		
		this.j.setSize(1000,900);
		this.j.setLayout(null);
		this.j.setVisible(true);
		this.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	/*@Override
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
			
			
			this.addcomponentforlaptop();
			
		}
		
	}*/
	
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
			new SearchByBrand();
		});
		

		this.searchByUnitPriceM = new JButton("UnitPrice");
		this.searchByUnitPriceM.setBounds(260,120,115,45);
		this.searchByUnitPriceM.setForeground(Color.black);
		this.searchByUnitPriceM.setBackground(Color.blue);
		this.j.add(this.searchByUnitPriceM);
		//this.j.remove(searchByBrand);
		this.searchByUnitPriceM.addActionListener(e -> {
			this.j.setVisible(false);
			new SearchByPriceM();
		});
		
		this.searchByNameM = new JButton("Model Name");
		this.searchByNameM.setBounds(380,120,115,45);
		this.searchByNameM.setForeground(Color.black);
		this.searchByNameM.setBackground(Color.blue);
		this.j.add(this.searchByNameM);
		this.searchByNameM.addActionListener(e -> {
			this.j.setVisible(false);
			new SearchByNameM();
		});
		
		this.searchByRear_camera_ResolutionM = new JButton("Rear Camera");
		this.searchByRear_camera_ResolutionM.setBounds(500,120,115,45);
		this.searchByRear_camera_ResolutionM.setForeground(Color.black);
		this.searchByRear_camera_ResolutionM.setBackground(Color.blue);
		this.j.add(this.searchByRear_camera_ResolutionM);
		this.searchByRear_camera_ResolutionM.addActionListener(e -> {
			this.j.setVisible(false);
			new SearchByRearCameraM();
		});
		
		this.searchBySelfie_camera_ResolutionM = new JButton("Selfie Camera");
		this.searchBySelfie_camera_ResolutionM.setBounds(620,120,115,45);
		this.searchBySelfie_camera_ResolutionM.setForeground(Color.black);
		this.searchBySelfie_camera_ResolutionM.setBackground(Color.blue);
		this.j.add(this.searchBySelfie_camera_ResolutionM);
		this.searchBySelfie_camera_ResolutionM.addActionListener(e -> {
			this.j.setVisible(false);
			new SearchBySelfieCamM();
		});
		
		
		this.j.revalidate();
		this.j.repaint();
	}
    
    public void addcomponentforlaptop(){
    	
    	this.Ms=0;
    	this.l8=new JLabel("YOU CAN SEARCH LAPTOP BY : ");
		this.l8.setBounds(40,170,1500,40);
		this.l8.setFont(new Font("Times new Rooman",Font.PLAIN,20));
		this.l8.setForeground(Color.ORANGE);
		this.j.add(this.l8);
		
		
		this.searchByBrandL = new JButton("BrandL");
		this.searchByBrandL.setBounds(140,210,115,45);
		this.searchByBrandL.setForeground(Color.black);
		this.searchByBrandL.setBackground(Color.blue);
		this.j.add(this.searchByBrandL);
		this.searchByBrandL.addActionListener(e -> {
			this.j.setVisible(false);
			//new SearchByBrand();
		});
		
		
		this.j.revalidate();
		this.j.repaint();
		
		
    	}
    	
    	
    }	
	




