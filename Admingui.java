import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Admingui extends  javax.swing.JFrame {

	private JFrame frame;
	private JTextArea customerdetailtextArea;
	public JTextArea AdminRestDatatextArea;
	private JTextArea riderDetailtextArea;
	private JTextField restdeletetextField;
	private JTextField riderdeletetextField;
	private JTextField custtextField;
	
	public JTextArea getRiderDetailtextArea() {
		return riderDetailtextArea;
	}

	public void setRiderDetailtextArea(JTextArea riderDetailtextArea) {
		this.riderDetailtextArea = riderDetailtextArea;
	}

	public JTextArea getCustomerdetailtextArea() {
		return customerdetailtextArea;
	}

	public void setCustomerdetailtextArea(JTextArea customerdetailtextArea) {
		this.customerdetailtextArea = customerdetailtextArea;
	}
	
	

	public Admingui(ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> riderrecord, ArrayList<Rider> orderRecord) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 866, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 86, 147, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(183, 42, 608, 383);
		frame.getContentPane().add(tabbedPane);
		
		JButton AdminCustomerDataButton = new JButton("Customer Data");
		
		
		AdminCustomerDataButton.setBounds(10, 80, 127, 23);
		panel.add(AdminCustomerDataButton);
		
		AdminCustomerDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	tabbedPane.setSelectedIndex(2);
            	//displayCustomers(evt, orderPlace, cust, restaurantnameslist, restaurantdisheslist, ActiveIndex, admin, riderrecord, orderRecord);    
				
			}
		});
		
		
		JButton adminLogoutButton = new JButton("Logout");
		
		adminLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
				logout(evt, cust, restaurantnameslist, orderPlace,restaurantdisheslist,ActiveIndex, admin, riderrecord,  orderRecord);
		           
				
			}
		});
		adminLogoutButton.setBounds(10, 232, 127, 23);
		panel.add(adminLogoutButton);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		JButton RestaurantDataButton = new JButton("Restaurant Data");
		RestaurantDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		
		RestaurantDataButton.setBounds(10, 46, 127, 23);
		panel.add(RestaurantDataButton);
		
		JButton riderRecordButton = new JButton("Rider Data");
		riderRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		riderRecordButton.setBounds(10, 114, 127, 23);
		panel.add(riderRecordButton);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		
		JTextArea riderDetailtextArea = new JTextArea();
		riderDetailtextArea.setBounds(24, 35, 548, 284);
		panel_3.add(riderDetailtextArea);
		
		JLabel lblNewLabel_2 = new JLabel("-------Rider Data-------");
		lblNewLabel_2.setBounds(216, 10, 196, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("To Delete:");
		lblNewLabel_4.setBounds(34, 330, 63, 14);
		panel_3.add(lblNewLabel_4);
		
		riderdeletetextField = new JTextField();
		riderdeletetextField.setBounds(98, 327, 86, 20);
		panel_3.add(riderdeletetextField);
		riderdeletetextField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(206, 326, 89, 23);
		panel_3.add(btnNewButton_2);
		
		btnNewButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	 delete_account( evt,cust,restaurantnameslist , riderrecord , riderdeletetextField.getText() , 2); 
             	
            	
            }});
		
		JButton btnNewButton_3 = new JButton("Refersh");
		btnNewButton_3.setBounds(323, 326, 89, 23);
		panel_3.add(btnNewButton_3);
		
		
		btnNewButton_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	riderDetailtextArea.setText("");
            	riderdeletetextField.setText("");
            	
            	if(!riderrecord.isEmpty()) {
        			
        		for(int i=0;i<riderrecord.size();i++) {
        			
        			riderDetailtextArea.append("ID: "+(i+1)+ "Rider name : " + riderrecord.get(i).getName() + " Rider Phone : "+ riderrecord.get(i).getPhone() );
        			
        		}
        	}
            	
            }});	
		
		
		riderRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	
            	if(!riderrecord.isEmpty()) {
        			
        		for(int i=0;i<riderrecord.size();i++) {
        			
        			riderDetailtextArea.append("ID: "+(i+1)+ "  Rider name : " + riderrecord.get(i).getName() + " Rider Phone : "+ riderrecord.get(i).getPhone() );
        			
        		}
        	}
            	
            }});
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		customerdetailtextArea = new JTextArea();
		customerdetailtextArea.setEditable(false);
		customerdetailtextArea.setBounds(27, 35, 526, 287);
		panel_1.add(customerdetailtextArea);
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("---------------All Available Customers----------");
		lblNewLabel.setBounds(161, 11, 251, 14);
		panel_1.add(lblNewLabel);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(536, 161, 17, 128);
		panel_1.add(scrollBar);
		
		JLabel lblNewLabel_5 = new JLabel("To Delete:");
		lblNewLabel_5.setBounds(37, 330, 69, 14);
		panel_1.add(lblNewLabel_5);
		
		custtextField = new JTextField();
		custtextField.setBounds(97, 327, 86, 20);
		panel_1.add(custtextField);
		custtextField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setBounds(217, 326, 89, 23);
		panel_1.add(btnNewButton_4);
		
		btnNewButton_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	 delete_account( evt,cust,restaurantnameslist , riderrecord , custtextField.getText() , 0); 
             		
            }});
		
		JButton btnNewButton_5 = new JButton("Refresh");
		btnNewButton_5.setBounds(332, 326, 89, 23);
		panel_1.add(btnNewButton_5);
		
		btnNewButton_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	displayCustomers(evt, orderPlace, cust, restaurantnameslist, restaurantdisheslist, ActiveIndex, admin, riderrecord, orderRecord);    
				
            }}); 
		
		
		
		JLabel lblNewLabel_1 = new JLabel("--------Restaurant Data---------");
		lblNewLabel_1.setBounds(204, 10, 172, 14);
		panel_2.add(lblNewLabel_1);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(10, 35, 583, 283);
		panel_2.add(textArea1);
		
		JLabel lblNewLabel_3 = new JLabel("To Delete :");
		lblNewLabel_3.setBounds(20, 330, 65, 14);
		panel_2.add(lblNewLabel_3);
		
		restdeletetextField = new JTextField();
		restdeletetextField.setBounds(83, 329, 86, 20);
		panel_2.add(restdeletetextField);
		restdeletetextField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(204, 326, 89, 23);
		panel_2.add(btnNewButton);
		
		btnNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	
            	 delete_account( evt,cust,restaurantnameslist , riderrecord , restdeletetextField.getText() , 1); 
            		
            	
            }});	
            
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {	
            	
            	restdeletetextField.setText("");
            	textArea1.setText("");
            	
            	if(!restaurantnameslist.isEmpty())
            	 for(int i=0; i<restaurantnameslist.size();i++ ) {
             		
         			textArea1.append( "ID: "+ (i+1)+ " Restaurant: "+restaurantnameslist.get(i).restaurantname+"|| Restaurant location: "+restaurantnameslist.get(i).getRestaurantlocation()+" || Owner name: "+restaurantnameslist.get(i).getName()+" || Owner CNIC: "+restaurantnameslist.get(i).getRestcnic()+"\n");
         			
         			if(restaurantdisheslist.size()!=0 && restaurantnameslist.get(i).restaurantname!=null ) {
         				
         			for(int j=0;j<restaurantdisheslist.size();j++) {
         				if(restaurantdisheslist.get(j).getDishresname()!=null) {
         				if(restaurantdisheslist.get(j).getDishresname().equals(restaurantnameslist.get(i).restaurantname)) {
         					
         					textArea1.append("\n---> Dish:  "+restaurantdisheslist.get(j).getDishName()+" ---> Price:  "+restaurantdisheslist.get(j).getDishPrice()+"\n");
         			}
         			}}}
         	  }
				
				
			}
		});
		btnNewButton_1.setBounds(314, 326, 89, 23);
		panel_2.add(btnNewButton_1);
		
		
	  
		
		
		
	
		
	
		frame.setVisible(true);
	}
	
		void displayCustomers( java.awt.event.MouseEvent evt, ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> riderrecord, ArrayList<Rider> orderRecord) {
		
		Admingui admingui = new Admingui(orderPlace,cust,restaurantnameslist,restaurantdisheslist,ActiveIndex,admin, riderrecord ,orderRecord);
		System.out.println("admin line 284");
		
		if(!cust.isEmpty()) {
			
			System.out.println("admin line 288");
			
			for(int i=0;i<cust.size();i++) {
				int totalOrders=0;
				for(int j=0;j<orderPlace.size();j++) {
				
					if(!orderPlace.isEmpty()) {
					if(orderPlace.get(j).getCustomerName().equals(cust.get(i).getCustomerName())) {
					totalOrders=orderPlace.get(j).getTotalOrder();
					}
				  }
					
				}
				admingui.getCustomerdetailtextArea().append( "ID: "+ (i+1)+ " Customer Name : " + cust.get(i).getCustomerName() + "\nCustomer Address : " + cust.get(i).getCustomerAddress() + "\nCustomer Contact : " + cust.get(i).getCustomerPhone() + "\nCustomer CNIC : "+cust.get(i).getCustomerCNIC() + "\n"
						+ "Total orders : "+totalOrders+"\n--------------------\n");
			
		}
			
		}
		
		
	}
		
	/*	void displayRestaurnts(ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> riderrecord, ArrayList<Rider> orderRecord) {
			
			Admingui admingui = new Admingui(orderPlace,cust,restaurantnameslist,restaurantdisheslist,ActiveIndex,admin, riderrecord ,orderRecord);
			
			admingui.setAdminRestDatatextArea(AdminRestDatatextArea);
			
			for(int i=0; i<restaurantnameslist.size();i++ ) {
        		
				admingui.getAdminRestDatatextArea().append("Restaurant "+restaurantnameslist.get(i).restaurantname+", Restaurant location "+restaurantnameslist.get(i).getRestaurantlocation()+", Owner name: "+restaurantnameslist.get(i).getName()+", Owner CNIC: "+restaurantnameslist.get(i).getRestcnic()+"\n");
				
				for(int j=0;j<restaurantdisheslist.size();j++) {
					if(restaurantdisheslist.get(j).getDishresname().equals(restaurantnameslist.get(i).restaurantname)) {
						
						admingui.getAdminRestDatatextArea().append("\n---Dish:"+restaurantdisheslist.get(j).getDishName()+", Price: "+restaurantdisheslist.get(j).getDishPrice()+"\n");
				}
				}
		  }
				
				
			}
	*/
		
	
	void logout(java.awt.event.MouseEvent evt,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist ,int activeIndex, ArrayList <Admin> admin,ArrayList <Rider> rider, ArrayList<Rider> orderRecord) {
		
		
		JOptionPane.showMessageDialog(null,"\tLogged Out.","Info",
				JOptionPane.INFORMATION_MESSAGE);
		
		activeIndex=-5;
		Front f = new Front(cust, restaurantnameslist , orderPlace, restaurantdisheslist , activeIndex, admin, rider,orderRecord);
		f.setVisible(true);
		
	}
	
	void delete_account(java.awt.event.MouseEvent evt,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,ArrayList <Rider> rider , String id , int flag) {
		
		int idd=Integer.parseInt(id);
		
		if(flag==0) {
			
			if(cust!=null) {
				
				cust.remove(idd-1);
				JOptionPane.showMessageDialog(null,"\tDone.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
		if(flag==1) {
			
			if(restaurantnameslist!=null)
			{
				
				restaurantnameslist.remove(idd-1);
				JOptionPane.showMessageDialog(null,"\tDone.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
		if(flag==2) {
			
			if(rider!=null) {
				
				rider.remove(idd-1);
				JOptionPane.showMessageDialog(null,"\tDone.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
