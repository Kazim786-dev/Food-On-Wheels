import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Rgui extends javax.swing.JFrame {
	
	Main mobj = new Main();
	Customer cobj = new Customer();
	Rider ridobj = new Rider();
	Admin aobj = new Admin();
	Restaurant robj = new Restaurant();
	Food objf=new Food();
	
	
	int check=1;
	

	private JFrame frame;
	private JTextField uidField;
	private JTextField uDNField;
	private JTextField uDPField;
	private JTextField aDNField;
	private JTextField aDPField;
	private JTextField deleteIDField;
	private JTextField StatusCNICtextField;
	private JTextField textField;
	
	String rname = "";

	
	@SuppressWarnings("unlikely-arg-type")
	public Rgui( ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> rider, ArrayList<Rider> orderRecord ) {
		
	//@SuppressWarnings({ "unlikely-arg-type", "unchecked", "rawtypes" })
		
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBounds(10, 79, 161, 353);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(193, -23, 678, 476);
		frame.getContentPane().add(tabbedPane);
		
		JButton addfButton = new JButton("View All Orders");
		addfButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				
			}
		});
		addfButton.setBounds(10, 24, 141, 23);
		panel.add(addfButton);
		
		JButton upsButton = new JButton("Delete Food Item");
		upsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		upsButton.setBounds(10, 157, 141, 23);
		panel.add(upsButton);
		
		JButton upfButton = new JButton("View Food Item");
		upfButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		upfButton.setBounds(10, 114, 141, 23);
		panel.add(upfButton);
		
		JButton calbButton = new JButton("Update Food Item");
		calbButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		calbButton.setBounds(10, 201, 141, 23);
		panel.add(calbButton);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(35, 319, 89, 23);
		panel.add(btnNewButton);
		
		JButton ViewfButton = new JButton("Add Food Item");
		ViewfButton.setBounds(10, 69, 141, 23);
		panel.add(ViewfButton);
		
		JButton btnNewButton_1 = new JButton("Update Status");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(10, 243, 141, 23);
		panel.add(btnNewButton_1);
		
		ViewfButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(1);
        		
        	}
        });
		
		btnNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	logout(evt, cust, restaurantnameslist, orderPlace,restaurantdisheslist,ActiveIndex, admin, rider,  orderRecord);
            }
        });
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
	
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(107, 11, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Dish Name");
		lblNewLabel_4.setBounds(181, 11, 85, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setBounds(358, 11, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		JTextArea dntextArea = new JTextArea();
		dntextArea.setBounds(76, 32, 221, 251);
		panel_2.add(dntextArea);
		
		JTextArea dptextArea = new JTextArea();
		dptextArea.setBounds(296, 32, 154, 251);
		panel_2.add(dptextArea);
		
		JButton refreshButton = new JButton("Refresh");
		refreshButton.setBounds(234, 310, 89, 23);
		panel_2.add(refreshButton);
		
		if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
			
			for(int i=0; i< restaurantdisheslist.size();i++ ) {
				if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
					dntextArea.append("       "+ (i+1)+"   -         " +  restaurantdisheslist.get(i).getDishName()+"\n") ;
				}
			}
		}
			
		if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
			
			
			for(int j=0; j< restaurantdisheslist.size();j++ ) {
				if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
					dptextArea.append( "         "+ restaurantdisheslist.get(j).getDishPrice()+"\n") ;
					
				}
			}
			}
		
		
		
		
		refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            //	refreshClicked(evt);
            	
            	dntextArea.setText(null);
            	dptextArea.setText(null);
            	
            	if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
        			
        			for(int i=0; i< restaurantdisheslist.size();i++ ) {
        				if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
        					dntextArea.append("       "+ (i+1)+"      -             " +  restaurantdisheslist.get(i).getDishName()+"\n") ;
        				}
        			}
        		}
        			
        		if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
        			
        			
        			for(int j=0; j< restaurantdisheslist.size();j++ ) {
        				if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
        					dptextArea.append( "            "+ restaurantdisheslist.get(j).getDishPrice()+"\n") ;
        					
        				}
        			}
        			}
            	
            	
            }
        });
		
		
		
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		
		
		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setBounds(73, 11, 46, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Dish Name");
		lblNewLabel_10.setBounds(129, 11, 63, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Dish Price");
		lblNewLabel_11.setBounds(298, 11, 46, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Enter new Dish Name:");
		lblNewLabel_12.setBounds(444, 54, 157, 14);
		panel_3.add(lblNewLabel_12);
		
		aDNField = new JTextField();
		aDNField.setBounds(444, 90, 157, 20);
		panel_3.add(aDNField);
		aDNField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Enter  Price:");
		lblNewLabel_13.setBounds(444, 140, 121, 14);
		panel_3.add(lblNewLabel_13);
		
		aDPField = new JTextField();
		aDPField.setBounds(443, 181, 158, 20);
		panel_3.add(aDPField);
		aDPField.setColumns(10);
		
		JButton RDishaddButton = new JButton("Add");
		
		RDishaddButton.setBounds(462, 245, 89, 23);
		panel_3.add(RDishaddButton);
		
		JTextArea adntextArea = new JTextArea();
		adntextArea.setBounds(50, 38, 202, 293);
		panel_3.add(adntextArea);
		
		JTextArea adptextArea = new JTextArea();
		adptextArea.setBounds(251, 36, 146, 295);
		panel_3.add(adptextArea);
		
		JButton addrefreshButton = new JButton("Refresh");
		addrefreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adntextArea.setText("");
				adptextArea.setText("");
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
					
					for(int i=0; i< restaurantdisheslist.size();i++ ) {
						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
							adntextArea.append("          "+ (i+1)+"      -             " +  restaurantdisheslist.get(i).getDishName()+"\n") ;
						}
					}
				}
					
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
					
					
					for(int j=0; j< restaurantdisheslist.size();j++ ) {
						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
							adptextArea.append( "             "+ restaurantdisheslist.get(j).getDishPrice()+"\n") ;
							
						}
					}
					}
				
			}
		});
		addrefreshButton.setBounds(561, 245, 89, 23);
		panel_3.add(addrefreshButton);
		
			
		
		if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
		
		for(int i=0; i< restaurantdisheslist.size();i++ ) {
			if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
				adntextArea.append("            "+ (i+1)+"       -             " +  restaurantdisheslist.get(i).getDishName()+"\n") ;
			}
		}
	}
		
	if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
		
		
		for(int j=0; j< restaurantdisheslist.size();j++ ) {
			if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
				adptextArea.append( "             "+ restaurantdisheslist.get(j).getDishPrice()+"\n") ;
				
			}
		}
		}
		
			
		RDishaddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            
			public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	addclicked(restaurantnameslist,restaurantdisheslist,ActiveIndex,aDNField.getText(),aDPField.getText());
            
            	adntextArea.setText("");
            	adptextArea.setText("");
            	

            	if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
					
            		//System.out.println("dish add 1");
            		
					for(int i=0; i< restaurantdisheslist.size();i++ ) {
						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
							
							adntextArea.append("           "+ (i+1)+"       -           " +  restaurantdisheslist.get(i).getDishName()+"\n") ;
						}
					}
				}
					
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
					
					
					for(int j=0; j< restaurantdisheslist.size();j++ ) {
						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
							adptextArea.append( "            "+ restaurantdisheslist.get(j).getDishPrice()+"\n") ;
							
						}
					}
					
				}
            	
            	
            	
            
            	
			
			}
        	
        });
		
				
		
		
		for(int i=0; i< restaurantdisheslist.size();i++ ) {
			
			
			if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

			if(restaurantnameslist.get(ActiveIndex).equals( restaurantdisheslist.get(i).getDishresname())) {
				aDNField.setText( (i+1)+" - " + aDNField.getText() +  restaurantdisheslist.get(i).getDishName()+"\n") ;
			}
		}
		}
		
		if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

		
		for(int j=0; j< restaurantdisheslist.size();j++ ) {
				if(restaurantnameslist.get(ActiveIndex).equals( restaurantdisheslist.get(j).getDishresname())) {
					aDPField.setText(aDPField.getText() +  restaurantdisheslist.get(j).getDishPrice()+"\n") ;
				}

			}
		
		}
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		int fl=0;
		
		double bill=0;
		
		
		/*for(int j=0; j<orderPlace.size();j++ ) {
			
						
			if(orderPlace.get(j).getCustomerName().equals(orderPlace.get(j-1).getCustomerName())&&j!=0) {
				fl=1;
			}
			else {
				fl=0;
			}
			
			if(orderPlace.get(j).getRestname().equals(restaurantnameslist.get(ActiveIndex).restaurantname)){
				
				
			if(fl==0) {
			viewordertextField.setText(viewordertextField.getText() + " Customer Name : "+ orderPlace.get(j).getCustomerName()+"\n"
					+ " Customer CNIC : " + orderPlace.get(j).getCustomerCNIC() + "\n----------------\n"  ) ;
			
			
			for(int i=0; i<orderPlace.size();i++) {
			if(orderPlace.get(i).getCustomerName().equals(orderPlace.get(j).getCustomerName())) {
				bill=bill+orderPlace.get(j).getBill();
				viewordertextField.setText(viewordertextField.getText() + " Dish Name : "+ orderPlace.get(j).getDishname()+"\t"
					+ " Dish quantity : " + orderPlace.get(j).getDishQuantity() + "\n"  ) ;
		    }
		  }
		}
			if(fl==0) { 
				viewordertextField.setText(viewordertextField.getText()+"-->  Total Bill : "+orderPlace.get(j).getBill()+"\n-----------\n\n");
			}
	  }
			
			
		}*/
		
		JLabel lblNewLabel_18 = new JLabel("All Orders");
		lblNewLabel_18.setBounds(76, 22, 116, 14);
		panel_5.add(lblNewLabel_18);
		
		@SuppressWarnings("rawtypes")
		JComboBox statuscomboBox = new JComboBox();
		statuscomboBox.setModel(new DefaultComboBoxModel(new String[] {"Order is being cooked", "Order dispatched", "Order delivered"}));
		statuscomboBox.setBounds(513, 47, 137, 22);
		panel_5.add(statuscomboBox);
		
		

				
		StatusCNICtextField = new JTextField();
		StatusCNICtextField.setBounds(513, 126, 137, 20);
		panel_5.add(StatusCNICtextField);
		StatusCNICtextField.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Customer CNIC");
		lblNewLabel_19.setBounds(513, 91, 97, 14);
		panel_5.add(lblNewLabel_19);
		
		JButton statusButton = new JButton("Upload");
		
		statusButton.setBounds(537, 185, 89, 23);
		panel_5.add(statusButton);
		
		statusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	String statuss=""+statuscomboBox.getSelectedItem();
        
        		uploadbuttonclicked(evt, orderPlace, statuss);
            }
        });
		
		JLabel lblNewLabel_20 = new JLabel("Order Status");
		lblNewLabel_20.setBounds(537, 22, 89, 14);
		panel_5.add(lblNewLabel_20);
		
		JTextArea RvieworderstextArea = new JTextArea();
		RvieworderstextArea.setBounds(38, 47, 444, 302);
		panel_5.add(RvieworderstextArea);
		
		JButton ResStatusRefreshButton = new JButton("Refresh");
		ResStatusRefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	int fl=0;
        		
        		double bill=0;
        		RvieworderstextArea.setText("");
            	for(int j=0; j<orderPlace.size();j++ ) {
            		
            		if(j!=0) {
            		if(orderPlace.get(j).getCustomerName().equals(orderPlace.get(j-1).getCustomerName())) {
            			fl=1;
            		}}
            		else {
            			fl=0;
            		}
            		
            		if(orderPlace.get(j).getRestname().equals(restaurantnameslist.get(ActiveIndex).restaurantname)){
            			
            			
            			
            		if(fl==0) {
            			RvieworderstextArea.append( " Customer Name : "+ orderPlace.get(j).getCustomerName()+"\n"
            				+ " Customer CNIC : " + orderPlace.get(j).getCustomerCNIC() + "\n----------------\n"  ) ;
            		
            			
            		for(int i=0; i<orderPlace.size();i++) {
            		if(orderPlace.get(i).getCustomerName().equals(orderPlace.get(j).getCustomerName())) {
            			bill=bill+orderPlace.get(i).getBill();
            			RvieworderstextArea.append( " Dish Name : "+ orderPlace.get(i).getDishname()+"\t"
            				+ " Dish quantity : " + orderPlace.get(i).getDishQuantity() + "\n"  ) ;
            	    }
            		
            	  }
            		RvieworderstextArea.append("-->  Total Bill : "+orderPlace.get(j).getBill()+"\n-----------\n\n");
            	}
            		
            		
              }
            		
            		
            	}
            	
            }
        });
		ResStatusRefreshButton.setBounds(537, 232, 89, 23);
		panel_5.add(ResStatusRefreshButton);
		
		for(int j=0; j<orderPlace.size();j++ ) {
		
		if(j!=0) {
		if(orderPlace.get(j).getCustomerName().equals(orderPlace.get(j-1).getCustomerName())) {
			fl=1;
		}}
		else {
			fl=0;
		}
		
		if(orderPlace.get(j).getRestname().equals(restaurantnameslist.get(ActiveIndex).restaurantname)){
			
			
			
		if(fl==0) {
			RvieworderstextArea.append( " Customer Name : "+ orderPlace.get(j).getCustomerName()+"\n"
				+ " Customer CNIC : " + orderPlace.get(j).getCustomerCNIC() + "\n----------------\n"  ) ;
		
			
		for(int i=0; i<orderPlace.size();i++) {
		if(orderPlace.get(i).getCustomerName().equals(orderPlace.get(j).getCustomerName())) {
			bill=bill+orderPlace.get(i).getBill();
			RvieworderstextArea.append( " Dish Name : "+ orderPlace.get(i).getDishname()+"\t"
				+ " Dish quantity : " + orderPlace.get(i).getDishQuantity() + "\n"  ) ;
	    }
		
	  }
		RvieworderstextArea.append("-->  Total Bill : "+orderPlace.get(j).getBill()+"\n-----------\n\n");
	}
		
		
  }
		
		
	}
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
				
				
				JLabel lblNewLabel_14 = new JLabel("ID");
				lblNewLabel_14.setBounds(80, 11, 46, 14);
				panel_4.add(lblNewLabel_14);
				
				JLabel lblNewLabel_15 = new JLabel("Dish Name");
				lblNewLabel_15.setBounds(173, 11, 78, 14);
				panel_4.add(lblNewLabel_15);
				
				JLabel lblNewLabel_16 = new JLabel("Price");
				lblNewLabel_16.setBounds(332, 11, 46, 14);
				panel_4.add(lblNewLabel_16);
				
				JLabel lblNewLabel_17 = new JLabel("Enter ID:");
				lblNewLabel_17.setBounds(468, 77, 118, 14);
				panel_4.add(lblNewLabel_17);
				
				deleteIDField = new JTextField();
				deleteIDField.setBounds(468, 102, 153, 20);
				panel_4.add(deleteIDField);
				deleteIDField.setColumns(10);
				
				JButton deleteButton = new JButton("Delete");
				deleteButton.setBounds(497, 177, 89, 23);
				panel_4.add(deleteButton);
				
				JTextArea deldntextArea = new JTextArea();
				deldntextArea.setBounds(61, 36, 196, 312);
				panel_4.add(deldntextArea);
				
				JTextArea deldptextArea = new JTextArea();
				deldptextArea.setBounds(256, 36, 142, 312);
				panel_4.add(deldptextArea);
				
				JButton btnNewButton_3 = new JButton("Refresh");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						deldntextArea.setText("");deldptextArea.setText("");
						if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
							for(int i=0; i< restaurantdisheslist.size();i++ ) {
								
								

								
								if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
									deldntextArea.append( (i+1)+" -   "  +  restaurantdisheslist.get(i).getDishName()+"\n") ;
								}
							}
							}
							
							if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

							
							for(int j=0; j< restaurantdisheslist.size();j++ ) {
									if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
										deldptextArea.append(  "     " + restaurantdisheslist.get(j).getDishPrice()+"\n") ;
									}

								}
							
							}
						
					}
				});
				btnNewButton_3.setBounds(173, 359, 89, 23);
				panel_4.add(btnNewButton_3);
				
				
				
				
				
				JPanel panel_1 = new JPanel();
				tabbedPane.addTab("New tab", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Dish Name");
				lblNewLabel.setBounds(180, 16, 74, 14);
				panel_1.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Price");
				lblNewLabel_1.setBounds(350, 16, 46, 14);
				panel_1.add(lblNewLabel_1);
				
				
				
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
				for(int i=0; i< restaurantdisheslist.size();i++ ) {
					
					

					
					if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
						deldntextArea.append( (i+1)+" -   "  +  restaurantdisheslist.get(i).getDishName()+"\n") ;
					}
				}
				}
				
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

				
				for(int j=0; j< restaurantdisheslist.size();j++ ) {
						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
							deldptextArea.append(  "     " + restaurantdisheslist.get(j).getDishPrice()+"\n") ;
						}

					}
				
				}
				
				deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseClicked(java.awt.event.MouseEvent evt) {
		            	deleteclicked(evt, restaurantnameslist, restaurantdisheslist,ActiveIndex);
		            	deldntextArea.setText(null);
		            	deldptextArea.setText(null);
		            	deleteIDField.setText(null);
		            	
		            	if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
		    				for(int i=0; i< restaurantdisheslist.size();i++ ) {
		    					
		    					

		    					
		    					if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
		    						deldntextArea.append( (i+1)+" - "  +  restaurantdisheslist.get(i).getDishName()+"\n") ;
		    					}
		    				}
		    				}
		    				
		    				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

		    				
		    				for(int j=0; j< restaurantdisheslist.size();j++ ) {
		    						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
		    							deldptextArea.append("    " +  restaurantdisheslist.get(j).getDishPrice()+"\n") ;
		    						}

		    					}
		    				
		    				}
		            	
		            	
		            }
		        });
				
				
				JLabel lblNewLabel_3 = new JLabel("ID");
				lblNewLabel_3.setBounds(124, 16, 46, 14);
				panel_1.add(lblNewLabel_3);
				
				JLabel lblNewLabel_6 = new JLabel("Enter ID to modify :");
				lblNewLabel_6.setBounds(469, 41, 136, 14);
				panel_1.add(lblNewLabel_6);
				
				uidField = new JTextField();
				uidField.setBounds(469, 66, 86, 20);
				panel_1.add(uidField);
				uidField.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Enter New Dish Name:");
				lblNewLabel_7.setBounds(469, 95, 136, 14);
				panel_1.add(lblNewLabel_7);
				
				uDNField = new JTextField();
				uDNField.setBounds(469, 120, 86, 20);
				panel_1.add(uDNField);
				uDNField.setColumns(10);
				
				JLabel lblNewLabel_8 = new JLabel("Enter new Price:");
				lblNewLabel_8.setBounds(469, 157, 115, 14);
				panel_1.add(lblNewLabel_8);
				
				uDPField = new JTextField();
				uDPField.setBounds(469, 182, 86, 20);
				panel_1.add(uDPField);
				uDPField.setColumns(10);
				
				JButton updateButton = new JButton("Update");
				updateButton.setBounds(469, 238, 89, 23);
				panel_1.add(updateButton);
				
				JTextArea updatednArea = new JTextArea();
				updatednArea.setBounds(91, 41, 196, 288);
				panel_1.add(updatednArea);
				
				JTextArea updatedpArea = new JTextArea();
				updatedpArea.setBounds(281, 41, 115, 288);
				panel_1.add(updatedpArea);
				
				JButton btnNewButton_2 = new JButton("Refresh");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
		    				for(int i=0; i< restaurantdisheslist.size();i++ ) {
		    					
		    					

		    					
		    					if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
		    						updatednArea.append( (i+1)+" - "  +  restaurantdisheslist.get(i).getDishName()+"\n") ;
		    					}
		    				}
		    				}
		    				
		    				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

		    				
		    				for(int j=0; j< restaurantdisheslist.size();j++ ) {
		    						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
		    							updatedpArea.append("    " +  restaurantdisheslist.get(j).getDishPrice()+"\n") ;
		    						}

		    					}
		    				
		    				}	
						
						
					}
				});
				btnNewButton_2.setBounds(183, 351, 89, 23);
				panel_1.add(btnNewButton_2);
				
				
				
				updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	            	updateclicked(evt,restaurantnameslist,restaurantdisheslist,ActiveIndex);
	            	
					updatednArea.setText(null);
					updatedpArea.setText(null);
					uidField.setText(null);
					uDNField.setText(null);
					uDPField.setText(null);
	            	
	            	if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
	    				for(int i=0; i< restaurantdisheslist.size();i++ ) {
	    					
	    					

	    					
	    					if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(i).getDishresname())) {
	    						updatednArea.append( (i+1)+" - "  +  restaurantdisheslist.get(i).getDishName()+"\n") ;
	    					}
	    				}
	    				}
	    				
	    				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {

	    				
	    				for(int j=0; j< restaurantdisheslist.size();j++ ) {
	    						if(restaurantnameslist.get(ActiveIndex).getRestaurantname().equals( restaurantdisheslist.get(j).getDishresname())) {
	    							updatedpArea.append("    " +  restaurantdisheslist.get(j).getDishPrice()+"\n") ;
	    						}

	    					}
	    				
	    				}
	            	
	            	
	            }
	        });
		
				if(restaurantdisheslist.size()!=0 && restaurantnameslist.size()!=0) {
					
					rname = restaurantnameslist.get(ActiveIndex).getRestaurantname();
				
				
				}
		
		addfButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(2);
        	}
        });
		
		
		upfButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(0);
        	}
        });
		
		upsButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(3);
        	}
        });
		
		calbButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(4);
        	}
        });
		
		
		
		
		JLabel resNameLabel = new JLabel(rname);
		resNameLabel.setBounds(34, 32, 96, 19);
		frame.getContentPane().add(resNameLabel);
		
	
	}

	void updateclicked(java.awt.event.MouseEvent evt,ArrayList<Restaurant> restaurantnameslist, ArrayList<Food> restaurantdisheslist, int activeIndex) {
		
		if(uidField.getText()!=null && uDNField.getText()!=null && uDPField.getText()!=null ) {
		
		if(objf.UpdateFooddetails( restaurantdisheslist, restaurantnameslist, uidField.getText(), uDNField.getText(), uDPField.getText(),activeIndex)) {
			JOptionPane.showMessageDialog(null,"\t Food Item Updated.","Info",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			
			JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		}
		
		else {
			
			JOptionPane.showMessageDialog(null,"\t Error! Fields cant be empty.","Info",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	int addclicked(ArrayList<Restaurant> restaurantnameslist, ArrayList<Food> restaurantdisheslist, int active , String name , String price) {
		boolean check=false;
		int find=0,f1=0;
		
		
		
		if(name!=null && price!=null) {
		
			for(int i=0;i<restaurantdisheslist.size();i++) {
				
				if( restaurantdisheslist.get(i).getDishName()!=null ) {
					if( restaurantdisheslist.get(i).getDishName().equals(name)) {
				
					f1=1;
					break;
				}
				
					
					else {
						f1=0;
						}
					
				}
				
				
			}
			
			
			if(f1==0) {
			
			if(objf.AddFooddetails(restaurantnameslist, restaurantdisheslist,name,price,active)) {
			
				JOptionPane.showMessageDialog(null,"\t Food Item Added.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
				find=1;
			
				
				
			}
			
			else{
				
				
			JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
					JOptionPane.INFORMATION_MESSAGE);
			
			find=0;
			
			}
			}
			else {
				JOptionPane.showMessageDialog(null,"\t A dish with same name exists.","Info",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
		
	}
		
	
		
		else {
			
			JOptionPane.showMessageDialog(null,"\t Error! Fields cant be empty.","Info",
					JOptionPane.INFORMATION_MESSAGE);
			find=0;
		}
		
		return find;
		
	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	void deleteclicked(java.awt.event.MouseEvent evt,ArrayList<Restaurant> restaurantnameslist ,ArrayList<Food> restaurantdisheslist,int ActiveIndex) {
		int s=0;
		if(deleteIDField.getText()!=null ) {
		
			s =  objf.DeleteFood(restaurantnameslist, restaurantdisheslist ,  deleteIDField.getText() , ActiveIndex);
		
			if(s==0) {
			JOptionPane.showMessageDialog(null,"\t Successfully deleted!","Info",
				JOptionPane.INFORMATION_MESSAGE);
			}
			
			else {
				JOptionPane.showMessageDialog(null,"\t Error! Data could not be deleted.","Info",
						JOptionPane.INFORMATION_MESSAGE);
			}
		
		
		
	}
		
	else {
		JOptionPane.showMessageDialog(null,"\t Error! Fields cant be empty.","Info",
				JOptionPane.INFORMATION_MESSAGE);

	}
	
	
	}
	
	void uploadbuttonclicked(java.awt.event.MouseEvent ev,ArrayList<Customer> orderPlace,String statuss ) {
		
		
		int status=0;
		
		if(statuss.equalsIgnoreCase("Order is being cooked")) {
			status=1;
			for(Customer str: orderPlace) {
				if(str.getCustomerCNIC().equals(StatusCNICtextField.getText())) {
					str.setOrderstatus(status);
					JOptionPane.showMessageDialog(null,"Status updated.","Info",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}
		else if(statuss.equalsIgnoreCase("Order dispatched")) {
			status=2;
			for(Customer str: orderPlace) {
				if(str.getCustomerCNIC().equals(StatusCNICtextField.getText())) {
					str.setOrderstatus(status);
					JOptionPane.showMessageDialog(null,"Status updated.","Info",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
        else if(statuss.equalsIgnoreCase("Order delivered")) {
        	status=3;
			for(Customer str: orderPlace) {
				if(str.getCustomerCNIC().equals(StatusCNICtextField.getText())) {
					str.setOrderstatus(status);
					JOptionPane.showMessageDialog(null,"Status updated.","Info",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	
	}
	
	
	void logout(java.awt.event.MouseEvent evt,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist ,int activeIndex, ArrayList <Admin> admin,ArrayList <Rider> rider, ArrayList<Rider> orderRecord) {
		
		activeIndex=-5;
		Front f = new Front(cust, restaurantnameslist , orderPlace, restaurantdisheslist , activeIndex, admin, rider,orderRecord);
		
		JOptionPane.showMessageDialog(null,"\tLogged Out!.","Info",
				JOptionPane.INFORMATION_MESSAGE);
		
		//r.setVisible(false);
		f.setVisible(true);
		
	}
}





