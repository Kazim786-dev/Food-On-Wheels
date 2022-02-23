import java.awt.EventQueue;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Cgui extends javax.swing.JFrame {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH:mm:ss");  
	private JFrame frame;
	private JTextField custenterIDtextField;
	private JTextField custIDtocarttextField;
	private JTextField custenterQtytextField;
	
	
	//Customer objc=new Customer();
	
	private JTextField totalBilltextField;
	private JTextField updateIDtextField;
	private JTextField updateQTYtextField;
	private JTextField deleteIDtextField;
	private JTextField updatetotaltextField;
	private JTextField deletetotalextField;
	private JTextField checkoutbilltextField;
	int receiptNum=36762;
	
	boolean checkout=false;

	/**
	 * Launch the application.
	 */
	
	public Cgui(ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> rider, ArrayList<Rider> orderRecord ) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 873, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(161, -21, 668, 482);
		frame.getContentPane().add(tabbedPane);
		frame.setVisible(true);

		double localPrice=0;
		String localBill;
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea custRnametextArea = new JTextArea();
		custRnametextArea.setEditable(false);
		custRnametextArea.setBounds(10, 35, 138, 228);
		panel_1.add(custRnametextArea);
		
	//Checkout text areas
		

		JPanel panel_4 = new JPanel();
		
		JTextArea CheckoutDishtextArea = new JTextArea();
		CheckoutDishtextArea.setBounds(77, 75, 157, 183);
		JTextArea CheckoutPricetextArea = new JTextArea();
		CheckoutPricetextArea.setBounds(230, 75, 61, 183);
		JTextArea CheckoutQtytextArea = new JTextArea();
		CheckoutQtytextArea.setBounds(292, 75, 27, 183);
		JTextArea CheckoutCosttextArea = new JTextArea();
		CheckoutCosttextArea.setBounds(318, 75, 103, 183);
		JTextArea CheckoutReciepttextArea = new JTextArea();
		CheckoutReciepttextArea.setBounds(45, 11, 376, 44);
		JTextArea CheckoutBilltextArea = new JTextArea();
		CheckoutBilltextArea.setBounds(136, 269, 192, 22);
		
		panel_4.add(CheckoutQtytextArea);
		panel_4.add(CheckoutCosttextArea);
		panel_4.add(CheckoutReciepttextArea);
		panel_4.add(CheckoutBilltextArea);
		panel_4.add(CheckoutPricetextArea);
		
		if(restaurantnameslist!=null) {
			for(int i=0;i<restaurantnameslist.size();i++) {
				custRnametextArea.append("  "+(i+1)+" - "+restaurantnameslist.get(i).getRestaurantname()+" \n");	
				
			}
		}
		
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Restaurant name");
		lblNewLabel_1.setBounds(56, 11, 92, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter ID to view dishes");
		lblNewLabel_2.setBounds(10, 287, 138, 14);
		panel_1.add(lblNewLabel_2);
		
		custenterIDtextField = new JTextField();
		custenterIDtextField.setBounds(10, 312, 110, 20);
		panel_1.add(custenterIDtextField);
		custenterIDtextField.setColumns(10);
		
		JTextArea custdishtextArea = new JTextArea();
		custdishtextArea.setEditable(false);
		custdishtextArea.setBounds(158, 35, 159, 228);
		panel_1.add(custdishtextArea);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(165, 11, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dishes");
		lblNewLabel_1_2.setBounds(221, 11, 75, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JTextArea custPricetextArea = new JTextArea();
		custPricetextArea.setEditable(false);
		custPricetextArea.setBounds(316, 35, 71, 228);
		panel_1.add(custPricetextArea);
		
		

	/*	
		if(restaurantdisheslist!=null && enterIDtextField.getText()!=null) {
			int id =Integer.parseInt(enterIDtextField.getText());
			for(int i=0;i<restaurantdisheslist.size();i++) {
				if(restaurantdisheslist.get(i).getDishresname().equals(restaurantdisheslist.get(id).getDishresname())) {
					custPricetextArea.append("  "+(i+1)+" - "+restaurantdisheslist.get(i).getDishPrice()+" \n");	
				}
			}
		}
		*/
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setBounds(324, 11, 46, 14);
		panel_1.add(lblNewLabel_1_3);
		
		
		JLabel lblNewLabel_1_4 = new JLabel("Dish name");
		lblNewLabel_1_4.setBounds(457, 11, 75, 14);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Quantity");
		lblNewLabel_1_5.setBounds(542, 11, 64, 14);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("ID");
		lblNewLabel_1_6.setBounds(415, 11, 51, 14);
		panel_1.add(lblNewLabel_1_6);
		
		JButton custviewDishButton = new JButton("View Dishes");
		custviewDishButton.setBounds(20, 353, 89, 23);
		panel_1.add(custviewDishButton);
		
		
		
		custviewDishButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	int idd=-1;
            	
            	custdishtextArea.setText("");
            	custPricetextArea.setText("");
            	
            	if(restaurantdisheslist!=null && custenterIDtextField.getText()!=null) {
            		System.out.println(custenterIDtextField.getText());
            		if(!custenterIDtextField.getText().equals("")) {
            			
            		idd =Integer.parseInt(custenterIDtextField.getText());
        			idd=idd-1;
        			}
            		
            		
            		
        			for(int i=0;i<restaurantdisheslist.size();i++) {
        				
        				if(idd<restaurantnameslist.size())
        				if( restaurantdisheslist.get(i).getDishresname().equals(restaurantnameslist.get(idd).getRestaurantname())) {
        				
        					custdishtextArea.append("  "+(i+1)+" - "+restaurantdisheslist.get(i).getDishName()+" \n");	
        				
        					custPricetextArea.append(restaurantdisheslist.get(i).getDishPrice()+" \n");
        					
        				}
        				
        			}
        		}	
            }
        });
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Enter Quanitity");
		lblNewLabel_2_1.setBounds(179, 315, 110, 14);
		panel_1.add(lblNewLabel_2_1);
		
		custIDtocarttextField = new JTextField();
		custIDtocarttextField.setColumns(10);
		custIDtocarttextField.setBounds(305, 284, 75, 20);
		panel_1.add(custIDtocarttextField);
		
		JButton custAddCartButton = new JButton("Add to Cart");
		custAddCartButton.setBounds(228, 353, 89, 23);
		panel_1.add(custAddCartButton);
		
		
       
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Enter ID to add to cart");
		lblNewLabel_2_1_1.setBounds(179, 287, 138, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		custenterQtytextField = new JTextField();
		custenterQtytextField.setColumns(10);
		custenterQtytextField.setBounds(306, 312, 75, 20);
		panel_1.add(custenterQtytextField);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Total Bill : ");
		lblNewLabel_3.setBounds(426, 287, 92, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Price");
		lblNewLabel_4.setBounds(607, 11, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		
		JTextArea custqty_PriceTextArea = new JTextArea();
		custqty_PriceTextArea.setBounds(535, 35, 110, 228);
		panel_1.add(custqty_PriceTextArea);
		
		JTextArea custAddDishtextArea = new JTextArea();
		custAddDishtextArea.setEditable(false);
		custAddDishtextArea.setBounds(392, 35, 140, 228);
		panel_1.add(custAddDishtextArea);
		
		/*
		
         if(orderPlace!=null) {
			
			for(int i=0;i<orderPlace.size();i++) {
				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName())) {
				custAddDishtextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() );
				
				
				
				custqty_PriceTextArea.append(orderPlace.get(i).getDishQuantity() + "   " + localPrice);
				}
				
			}
		
		
		}*/
		
		localBill=""+localPrice;
		

		JButton custcartRefreshRefresh = new JButton("Refresh Cart");
		custcartRefreshRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				custAddDishtextArea.setText(null);
				custqty_PriceTextArea.setText(null);
				
				double singleprice=0;
				
				if(orderPlace!=null &&  checkout==false) {
					
					for(int i=0;i<orderPlace.size();i++) {
						
						
						if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName())) {
						
							singleprice=orderPlace.get(i).getDishQuantity()*orderPlace.get(i).getDishprice();
							
							custAddDishtextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
							custqty_PriceTextArea.append(orderPlace.get(i).getDishQuantity() + "   " +  singleprice+"\n" );
						}
						
					}
				
				
				}
				
				totalBilltextField.setText("");
				
				if(orderPlace!=null &&  checkout==false) {
				
				double t = 0;
		       	
		       	for(int i=0;i<orderPlace.size();i++) {
		       	
		     
		            
		       		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName())) {
		       			
		       			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
		       		}
		       		
		       		
		       	}
		       	
		       	totalBilltextField.setText(""+t); 
		       	
				}
				
			}
		});
		
		custAddCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
         
            	int checkflag=0;
            	
            	
            	
            	if(!orderPlace.isEmpty()) {
            	
            	for(int i=0;i<orderPlace.size();i++) {
            		
            		if(!orderPlace.isEmpty()){
            		if(orderPlace.get(i).getCustomerCNIC().equals(cust.get(ActiveIndex).getCustomerCNIC())) {
            			if(orderPlace.get(i).getOrderstatus()==0 || orderPlace.get(i).getOrderstatus()==3) {
            				checkflag=1;
            			}
            			else {
            				checkflag=0;
            				break;
            			}
            			
               		}
            	}
            		else {
            			checkflag=1;
            		}
            	}
            	
    			
            	
            	}
            	
            	else {
            		checkflag=1;
            	}
            	
            if(checkflag==1)	{  	
            	
       	AddcartbuttonClicked(ActiveIndex,restaurantnameslist,cust,orderPlace,restaurantdisheslist,custenterIDtextField.getText(),custIDtocarttextField.getText(),custenterQtytextField.getText(),localPrice,restaurantdisheslist); 
        
       	double t = 0;
       	
       	for(int i=0;i<orderPlace.size();i++) {
       	
     
            
       		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName())) {
       			
       			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
       		}
       		
       		
       	}
       	
       	custAddDishtextArea.setText(null);
		custqty_PriceTextArea.setText(null);
		
		double singleprice=0;
		
		if(orderPlace!=null &&  checkout==false) {
			
			for(int i=0;i<orderPlace.size();i++) {
				
				
				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName())) {
				
					singleprice=orderPlace.get(i).getDishQuantity()*orderPlace.get(i).getDishprice();
					
					custAddDishtextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
					custqty_PriceTextArea.append(orderPlace.get(i).getDishQuantity() + "   " +  singleprice+"\n" );
				}
				
			}
		
       	
         	totalBilltextField.setText(""+t);}
       	
            }
          
            else  
             {
            	
            	JOptionPane.showMessageDialog(null,"\t 1 order at a time.","Info",
        			JOptionPane.INFORMATION_MESSAGE);
            	
            }
             
            }
        });
		
		
		custcartRefreshRefresh.setBounds(491, 353, 124, 23);
		panel_1.add(custcartRefreshRefresh);
		
		totalBilltextField = new JTextField();
		totalBilltextField.setEditable(false);
		totalBilltextField.setBounds(529, 284, 86, 20);
		panel_1.add(totalBilltextField);
		totalBilltextField.setColumns(10);
		
				
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextArea updateDNtextArea = new JTextArea();
		updateDNtextArea.setEditable(false);
		updateDNtextArea.setBounds(73, 29, 185, 302);
		panel_2.add(updateDNtextArea);
		
		JTextArea updateDPtextArea = new JTextArea();
		updateDPtextArea.setBounds(255, 29, 89, 302);
		panel_2.add(updateDPtextArea);
		
		JLabel lblNewLabel_5 = new JLabel("ID");
		lblNewLabel_5.setBounds(74, 11, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dish Name");
		lblNewLabel_6.setBounds(136, 11, 68, 14);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Quantity");
		lblNewLabel_7.setBounds(269, 11, 46, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter ID to modify : ");
		lblNewLabel_8.setBounds(380, 98, 174, 14);
		panel_2.add(lblNewLabel_8);
		
		updateIDtextField = new JTextField();
		updateIDtextField.setBounds(379, 142, 254, 20);
		panel_2.add(updateIDtextField);
		updateIDtextField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(379, 123, 46, 14);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Enter new Quantity :");
		lblNewLabel_10.setBounds(386, 194, 112, 14);
		panel_2.add(lblNewLabel_10);
		
		updateQTYtextField = new JTextField();
		updateQTYtextField.setBounds(379, 237, 254, 20);
		panel_2.add(updateQTYtextField);
		updateQTYtextField.setColumns(10);
		
		JButton updateButton = new JButton("Update");
		updateButton.setBounds(437, 301, 89, 23);
		panel_2.add(updateButton);
		
		JButton refreshButton = new JButton("Refresh");
		refreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(orderPlace!=null &&  checkout==false) {
					
					updateDNtextArea.setText("");
					updateDPtextArea.setText("");
					
					for(int i=0;i<orderPlace.size();i++) {
						
						
						if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName()) && orderPlace.get(i).getOrderstatus()==0) {
						
							
							updateDNtextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
							updateDPtextArea.append("    " + orderPlace.get(i).getDishQuantity() + "   " +"\n" );
						}
						
					}
			
				}
				
				updatetotaltextField.setText("");
				
				if(orderPlace!=null &&  checkout==false) {
			
				double t = 0;
               	
               	for(int i=0;i<orderPlace.size();i++) {
               	
             
                    
               		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && orderPlace.get(i).getOrderstatus()==0) {
               			
               			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
               		}
               		
               		
               	}
            	
               	updatetotaltextField.setText(""+t); }
			
			
			}
			
			
			
			
		});
		refreshButton.setBounds(265, 342, 89, 23);
		panel_2.add(refreshButton);
		
		updatetotaltextField = new JTextField();
		updatetotaltextField.setEditable(false);
		updatetotaltextField.setBounds(136, 343, 86, 20);
		panel_2.add(updatetotaltextField);
		updatetotaltextField.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Total Bill");
		lblNewLabel_15.setBounds(73, 346, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		
		
		
		updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	updateID(evt,orderPlace,updateIDtextField.getText(),updateQTYtextField.getText());
            	updateDNtextArea.setText("");
            	updateDPtextArea.setText("");
            	
            	if(orderPlace!=null &&  checkout==false) {
        			
            		updateDNtextArea.setText("");
            		updateDPtextArea.setText("");
            		
            		
        			for(int i=0;i<orderPlace.size();i++) {
        				
        				
        				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName()) && orderPlace.get(i).getOrderstatus()==0) {
        				
        					
        					updateDNtextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
        					updateDPtextArea.append("    " + orderPlace.get(i).getDishQuantity() + "   " +"\n" );
        				}
        				
        			}
        		
        		
        		}
            	
            	double t = 0;
               	
            	if(orderPlace!=null &&  checkout==false) {
            	
               	for(int i=0;i<orderPlace.size();i++) {
               	
             
                    
               		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && orderPlace.get(i).getOrderstatus()==0) {
               			
               			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
               		}
               		
               		
               	}
            	
               	updatetotaltextField.setText(""+t); }
            	
            }
        });
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea deleteCartdnametextArea = new JTextArea();
		deleteCartdnametextArea.setEditable(false);
		deleteCartdnametextArea.setBounds(72, 53, 156, 246);
		panel_3.add(deleteCartdnametextArea);
		
		JLabel lblNewLabel_11 = new JLabel("ID");
		lblNewLabel_11.setBounds(92, 33, 46, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Dish Name");
		lblNewLabel_12.setBounds(148, 33, 68, 14);
		panel_3.add(lblNewLabel_12);
		
		JTextArea deleteCartpricetextArea = new JTextArea();
		deleteCartpricetextArea.setBounds(226, 53, 119, 246);
		panel_3.add(deleteCartpricetextArea);
		
		
		
		//hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
		if(orderPlace!=null &&  checkout==false) {
			
			for(int i=0;i<orderPlace.size();i++) {
				
				
				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName())  && orderPlace.get(i).getOrderstatus()==0 ) {
				
					
					deleteCartdnametextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
					deleteCartpricetextArea.append("    " + orderPlace.get(i).getDishQuantity() + "   " +"\n" );
				}
				
			}
		
		
		}
		
		
		
		JLabel lblNewLabel_13 = new JLabel("Price");
		lblNewLabel_13.setBounds(246, 33, 59, 14);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Enter ID to delete :");
		lblNewLabel_14.setBounds(392, 70, 127, 14);
		panel_3.add(lblNewLabel_14);
		
		deleteIDtextField = new JTextField();
		deleteIDtextField.setBounds(392, 107, 203, 20);
		panel_3.add(deleteIDtextField);
		deleteIDtextField.setColumns(10);
		
		JButton deleteCartButton = new JButton("Delete");
		
		deleteCartButton.setBounds(430, 198, 89, 23);
		panel_3.add(deleteCartButton);
		
		deletetotalextField = new JTextField();
		deletetotalextField.setEditable(false);
		deletetotalextField.setBounds(148, 328, 86, 20);
		panel_3.add(deletetotalextField);
		deletetotalextField.setColumns(10);
		
		deleteCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	deleteClicked(evt,orderPlace,deleteIDtextField.getText());
            	
            	deleteCartdnametextArea.setText("");
        		deleteCartpricetextArea.setText("");
            	
            	if(orderPlace!=null &&  checkout==false  ) {
        			
            		
            		
        			for(int i=0;i<orderPlace.size();i++) {
        				
        				
        				if(cust.get(ActiveIndex).getCustomerCNIC().equals(orderPlace.get(i).getCustomerCNIC()) && (orderPlace.get(i).getOrderstatus()==0)) {
        				
        					
        					
        					deleteCartdnametextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
        					deleteCartpricetextArea.append("    " + orderPlace.get(i).getDishQuantity() + "   " +"\n" );
        				}
        				
        			}
        		
        		
        		}
            	if(orderPlace!=null &&  checkout==false) {
            	
            	double t = 0;
               	
               	for(int i=0;i<orderPlace.size();i++) {
               	
             
                    
               		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && (orderPlace.get(i).getOrderstatus()==0)) {
               			
               			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
               		}
               		
               		
               	}
               	
               	deletetotalextField.setText(""+t);}
            	
            	
            }
        });
		
		
		JLabel lblNewLabel_16 = new JLabel("Total Bill");
		lblNewLabel_16.setBounds(72, 331, 46, 14);
		panel_3.add(lblNewLabel_16);
		
		JButton deleterefreshButton = new JButton("Refresh");
		deleterefreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deleteCartdnametextArea.setText("");
        		deleteCartpricetextArea.setText("");
				
				if(orderPlace!=null &&  checkout==false) {
        			
            		
            		
        			for(int i=0;i<orderPlace.size();i++) {
        				
        				
        				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName()) && (orderPlace.get(i).getOrderstatus()==0)) {
        				
        					
        					deleteCartdnametextArea.append(" "+(i+1)+" -"+orderPlace.get(i).getDishname() + "\n" );
        					deleteCartpricetextArea.append("    " + orderPlace.get(i).getDishQuantity() + "   " +"\n" );
        				}
        				
        			}
        		
        		
        		}
				
				deletetotalextField.setText("");
				if(orderPlace!=null &&  checkout==false) {
				
				double t = 0;
               	
               	for(int i=0;i<orderPlace.size();i++) {
               	
             
                    
               		if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && (orderPlace.get(i).getOrderstatus()==0)) {
               			
               			t = t + (orderPlace.get(i).getDishprice()*orderPlace.get(i).getDishQuantity());
               		}
               		
               		
               	}
               	
               	deletetotalextField.setText(""+t); }
				
			}
		});
		deleterefreshButton.setBounds(272, 327, 89, 23);
		panel_3.add(deleterefreshButton);
		
		
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea checkoutIDtextArea = new JTextArea();
		checkoutIDtextArea.setEditable(false);
		checkoutIDtextArea.setBounds(45, 75, 33, 183);
		panel_4.add(checkoutIDtextArea);
		
		JLabel lblNewLabel_17 = new JLabel("ID");
		lblNewLabel_17.setBounds(56, 56, 46, 14);
		panel_4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Dish");
		lblNewLabel_18.setBounds(136, 56, 46, 14);
		panel_4.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Cost");
		lblNewLabel_19.setBounds(360, 56, 61, 14);
		panel_4.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Total price");
		lblNewLabel_20.setBounds(93, 333, 89, 14);
		panel_4.add(lblNewLabel_20);
		
		checkoutbilltextField = new JTextField();
		checkoutbilltextField.setEditable(false);
		checkoutbilltextField.setBounds(169, 330, 86, 20);
		panel_4.add(checkoutbilltextField);
		checkoutbilltextField.setColumns(10);
		
		JButton checkrefreshButton = new JButton("Refresh");
	
		//Refresh button to print reciept	
		
		checkrefreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkoutIDtextArea.setText("");
				 LocalDateTime now = LocalDateTime.now();
				
				if(orderPlace!=null  &&  checkout==false  ) {
        			
					
					int i=0;
					
        			for( i=0;i<orderPlace.size();i++) {
        				
        				
        				if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName()) && (orderPlace.get(i).getOrderstatus()==0)) {
        					if(i==0){
        					CheckoutReciepttextArea.append("                                        ------Reciept------\n");
        					CheckoutReciepttextArea.append("Name: "+ cust.get(ActiveIndex).getCustomerName()+" || CNIC: "+cust.get(ActiveIndex).getCustomerCNIC()+ " ||  "+ dtf.format(now));
        					checkoutIDtextArea.append(""+"\n" );
        					CheckoutDishtextArea.append(""+"\n");
        					CheckoutPricetextArea.append(""+"\n");CheckoutQtytextArea.append(""+"\n");CheckoutCosttextArea.append(""+"\n");
        					CheckoutBilltextArea.append("");
        				}
        				
        					
        					checkoutIDtextArea.append((i+1)+"-\n" );
        					CheckoutDishtextArea.append(" "+orderPlace.get(i).getDishname() + "\n");
        					CheckoutPricetextArea.append(" "+" "+orderPlace.get(i).getDishprice()+"\n" );
        					CheckoutQtytextArea.append(" " + orderPlace.get(i).getDishQuantity()+"\n" );
        					CheckoutCosttextArea.append(" "+ orderPlace.get(i).getDishQuantity()+"*"+orderPlace.get(i).getDishprice() +"="+( orderPlace.get(i).getDishQuantity() * orderPlace.get(i).getDishprice() ) +"\n" );
        				
        				}
        				
        			}
        			CheckoutBilltextArea.append("         ------Total Bill   "+ (orderPlace.get(i-1).getBill() ) +"------" );
        		
			
				
				
				double t = 0;
               	
               	for(int ii=0;ii<orderPlace.size();ii++) {
               	
             
                    
               		if(orderPlace.get(ii).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && (orderPlace.get(ii).getOrderstatus()==0)) {
               			
               			t = t + (orderPlace.get(ii).getDishprice()*orderPlace.get(ii).getDishQuantity());
               		}
               		
               		
               	}
               	
               	checkoutbilltextField.setText(""+t); 
               	
				}
				
				
			}
		});
		checkrefreshButton.setBounds(278, 329, 89, 23);
		panel_4.add(checkrefreshButton);
		
		
// Checkout 
		
		JButton checkoutButton = new JButton("Checkout");
		
		checkoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for(int ii=0;ii<orderPlace.size();ii++) {
					
					if(orderPlace.get(ii).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && orderPlace.get(ii).getOrderstatus()==0) {
				
			if(checkout==false ) {	
				
			int result = 	JOptionPane.showConfirmDialog(null,"\tAre you sure to checkout? ", "Swing Tester",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	    		
	    		if(result==JOptionPane.YES_OPTION) {
	    			
	    			
	    			checkout=true;
	    			
	    			
	    			checkoutIDtextArea.setText("");
	    			
	    			
	    			
	    			JOptionPane.showMessageDialog(null,"\tYour ordered has been placed.","Info",
	    					JOptionPane.INFORMATION_MESSAGE);
	    			
	    			if(!orderPlace.isEmpty()) {
	    			
	    				for(int i=0;i<orderPlace.size();i++) {
	    				
	    				if(orderPlace.get(i).getCustomerName().equals(cust.get(ActiveIndex).getCustomerName()) && orderPlace.get(i).getOrderstatus()!=3) {
	    					
	    					orderPlace.get(i).setOrderstatus(1);
	    					
	    					orderPlace.get(i).setTotalOrder(orderPlace.get(i).getTotalOrder()+1);
	    					    					
	    				
	    				}
	    			}
	    			
	    		}
	    			
	    			
	    			
	    		}
	    		if(result==JOptionPane.NO_OPTION) {
	    			
	    			checkout=false;
	    			
	    		}
	    		
				
			}
			else {
				
				JOptionPane.showMessageDialog(null,"\tYour have already checked out.","Info",
    					JOptionPane.INFORMATION_MESSAGE);
			}
			
				}
					else
						JOptionPane.showMessageDialog(null,"\tYour have already checked out.","Info",
		    					JOptionPane.INFORMATION_MESSAGE);
						
					
					break;}
				}
			
			
		});
		
		
		
		
		checkoutButton.setBounds(431, 150, 89, 23);
		panel_4.add(checkoutButton);
		
		JLabel lblNewLabel_21 = new JLabel("Qty");
		lblNewLabel_21.setBounds(292, 56, 33, 14);
		panel_4.add(lblNewLabel_21);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash on delivery"}));
		comboBox.setBounds(432, 76, 128, 22);
		panel_4.add(comboBox);
		
		panel_4.add(CheckoutDishtextArea);
		
		
		JLabel lblNewLabel_22 = new JLabel("Payment method");
		lblNewLabel_22.setBounds(431, 41, 128, 14);
		panel_4.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Price");
		lblNewLabel_23.setBounds(245, 56, 46, 14);
		panel_4.add(lblNewLabel_23);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 83, 149, 335);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("View Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton.setBounds(10, 25, 129, 23);
		panel.add(btnNewButton);
		
		JButton logoutButton = new JButton("Logout");
		logoutButton.setBounds(10, 279, 129, 23);
		panel.add(logoutButton);
		
		JButton btnNewButton_2 = new JButton("Update Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_2.setBounds(10, 59, 129, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(2);
				
			}
		});
		btnNewButton_3.setBounds(10, 96, 129, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Check Order Status");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s=0;
				
				if(!orderPlace.isEmpty()) {
				 s = orderPlace.get(ActiveIndex).getOrderstatus();
				
				if(s==1) {
				JOptionPane.showMessageDialog(null,"Your order is being cooked.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if(s==2) {
					
					JOptionPane.showMessageDialog(null,"Your order has been dispatched through rider","Info",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else if(s==3) {
					
					JOptionPane.showMessageDialog(null,"Your order has been delivered.","Info",
							JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				
			}
				else {
				JOptionPane.showMessageDialog(null,"No order has been placed yet.","Info",
						JOptionPane.INFORMATION_MESSAGE);	
				}
			}
			
			
			
		});
		btnNewButton_1.setBounds(10, 187, 129, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Checkout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(3);
				
				if(orderPlace!=null  &&  checkout==false) {
        			
					for(int i=0;i<orderPlace.size();i++) {
        				
						if(cust.get(ActiveIndex).getCustomerName().equals(orderPlace.get(i).getCustomerName())) {
        				
        					
						}
        				
        			}
        		
        		
        		}
				
			}
		});
		btnNewButton_4.setBounds(10, 130, 129, 23);
		panel.add(btnNewButton_4);
		
		logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	logoutClicked(evt, cust, restaurantnameslist, orderPlace,restaurantdisheslist,ActiveIndex, admin, rider,  orderRecord);
            }
        });
		
	}
	
	void AddcartbuttonClicked(int index, ArrayList<Restaurant> rest ,ArrayList<Customer> cust, ArrayList<Customer> orderPlace,ArrayList<Food> dishes,String resId,String dishid,  String Qty,  double localPrice ,ArrayList<Food> food) {
		
		int dId=Integer.parseInt(dishid);
		dId-=1;
		//double dP=Double.parseDouble(dishprice);
		int rid=Integer.parseInt(resId);
		rid-=1;
		int qty=Integer.parseInt(Qty);
		
		double tbill=0;
	//double dP=Double.parseDouble(localPrice);
		int flag=0;
		
		for(int i=0;i<dishes.size();i++) {
			
		
			if(dishes.get(dId).getDishresname().equals(rest.get(rid).getRestaurantname()) ) {
			
				tbill=tbill+dishes.get(dId).getDishPrice();
			
				if(!orderPlace.isEmpty()) {	
			
					for(int k=0; k<orderPlace.size();k++) {	
				
						if(orderPlace.get(k).getCustomerName().equals(cust.get(index).getCustomerName())&&dishes.get(dId).getDishName().equals(orderPlace.get(k).getDishname() ) && orderPlace.get(k).getOrderstatus()==0) {
					
							flag=1;
				
								int qtity=orderPlace.get(k).getDishQuantity();
			
								qtity=qty+qtity;
					
								orderPlace.get(k).setDishQuantity(qtity);
								
								break;
					
						}
						else {
							flag=0;
						}
					
						
						
					}
					
			}
				if (flag==0 ) {
					
					Customer objcustomer=new Customer(dishes.get(dId).getDishresname(),cust.get(index).getCustomerName(),cust.get(index).getCustomerCNIC(), dishes.get(dId).getDishName(),qty,0,tbill,dishes.get(dId).getDishPrice(),0);
		        
					orderPlace.add(objcustomer); 
					JOptionPane.showMessageDialog(null,"\tAdded." ,"Info",
							JOptionPane.INFORMATION_MESSAGE);
					
					
					}
				break;
				}
			
		
		
		
		}
			if(orderPlace!=null) {
				
			for(int i=0;i<orderPlace.size();i++) {
			
				if(cust.get(index).getCustomerName().equals(orderPlace.get(i).getCustomerName())) {
					tbill=0;
				tbill=tbill+(int) ( orderPlace.get(i).getDishQuantity() * food.get(i).getDishPrice() );
				orderPlace.get(i).setBill(tbill);
				
				}
			}
		
			}
	}
	
	void logoutClicked(java.awt.event.MouseEvent evt,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist ,int activeIndex, ArrayList <Admin> admin,ArrayList <Rider> rider, ArrayList<Rider> orderRecord) {
		
		activeIndex=-5;
		Front f = new Front(cust, restaurantnameslist , orderPlace, restaurantdisheslist , activeIndex, admin, rider, orderRecord);
		
		JOptionPane.showMessageDialog(null,"\tLogged Out!.","Info",
				JOptionPane.INFORMATION_MESSAGE);
		
		//r.setVisible(false);
		f.setVisible(true);
		
	}
	
	
	void updateID(java.awt.event.MouseEvent evt ,ArrayList<Customer> orderPlace , String id , String qty) {
		
		int idd = Integer.parseInt(id);
		int qtty = Integer.parseInt(qty);
		
		
		if(orderPlace!=null) {
			
			for(int i=0;i<orderPlace.size();i++) {
				
				if(orderPlace.get(i).getDishname().equals(orderPlace.get(idd-1).getDishname())) {
					
					
					orderPlace.get(i).setDishQuantity(qtty);
					break;
					
					
				}
				
				
			}
			
			
			JOptionPane.showMessageDialog(null,"\t Quantity has been updated. ","Info",
					JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
	}
	
	void deleteClicked(java.awt.event.MouseEvent evt ,ArrayList<Customer> orderPlace , String id ) {
		
		int idd = Integer.parseInt(id);
		
		if(orderPlace!=null) {
			
			for(int i=0;i<orderPlace.size();i++) {
				
				if(orderPlace.get(i).getDishname().equals(orderPlace.get(idd-1).getDishname())) {
					
					
					orderPlace.remove(i);
					break;
					
					
				}
				
				
			}
		
		
	}
	
	
	}
}
