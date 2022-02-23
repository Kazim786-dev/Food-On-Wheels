import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class Ridgui extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField RiderOrderIDtextField;

	/**
	 * Launch the application.
	 */
	
	public Ridgui(ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> riderrecord, ArrayList<Rider> orderRecord) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 871, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 102, 148, 307);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(181, -24, 664, 461);
		frame.getContentPane().add(tabbedPane);
		
		JButton viewOrderButton = new JButton("View Orders");
		viewOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		viewOrderButton.setBounds(10, 39, 128, 23);
		panel.add(viewOrderButton);
		
		JButton btnNewButton = new JButton(" Deleivery/Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(10, 85, 128, 23);
		panel.add(btnNewButton);
		
		JButton RiderLogoutButton = new JButton("Logout");
		RiderLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
				logout(evt, cust, restaurantnameslist, orderPlace,restaurantdisheslist,ActiveIndex, admin, riderrecord,  orderRecord);
		           
				
			}
		});
		RiderLogoutButton.setBounds(30, 229, 89, 23);
		panel.add(RiderLogoutButton);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea RiderViewordertextArea = new JTextArea();
		RiderViewordertextArea.setBounds(10, 28, 482, 318);
		panel_1.add(RiderViewordertextArea);
		
	//for view order
	
		if (!orderPlace.isEmpty()){
		for(int i=0;i<orderPlace.size();i++) {
			
			for(int j=0;j<restaurantnameslist.size(); j++) {
				if( orderPlace.get(i).getRestname().equals( restaurantnameslist.get(j).getRestaurantname()) ) {
				
				for(int k=0;k<cust.size();k++) {
					
					if(cust.get(k).getCustomerName().equals(orderPlace.get(i).getCustomerName())) 
											
						if(orderPlace.get(i).getOrderstatus()==1 ) {
						RiderViewordertextArea.append("ID: "+(i+1)+"- Name: "+orderPlace.get(i).getCustomerName()+", Contact: "+cust.get(k).getCustomerPhone()+", Restaraunt: " + orderPlace.get(i).getRestname() +"\n------------\n"+" From "+ restaurantnameslist.get(j).getRestaurantlocation()+" To :"+cust.get(k).getCustomerAddress() + "\n\n-----------\n\n" );
			             break;   
					  }	
					
				  }
				break;
			   }
				
			}
		  }
		}
		
		JLabel lblNewLabel = new JLabel("----All Orders---");
		lblNewLabel.setBounds(216, 11, 127, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Id to pick :");
		lblNewLabel_1.setBounds(502, 45, 114, 14);
		panel_1.add(lblNewLabel_1);
		
		RiderOrderIDtextField = new JTextField();
		RiderOrderIDtextField.setBounds(502, 83, 127, 20);
		panel_1.add(RiderOrderIDtextField);
		RiderOrderIDtextField.setColumns(10);
		
		JButton RiderOrderConfirmButton = new JButton("Confirm");
		RiderOrderConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		// for order accepting/rejecting
				
				int checkflag=0;
				if(!RiderOrderIDtextField.getText().equals("")) {
				int idofdish = Integer.parseInt(RiderOrderIDtextField.getText());
				
				
				if(!orderPlace.isEmpty()) {
					
					System.out.println(1);
					
					if(!orderRecord.isEmpty()) {
						
						System.out.println(2);
						
					for(int index=0; index<orderRecord.size();index++) {
					
						if(orderRecord.get(index).getPickStatus()==1) {
							
							System.out.println(3);
							checkflag=1;
							break;
						}
						else {
							checkflag=0;
						}
					 }
					}
					
					
					
					if(checkflag==0) {
						
						
    				for(int i=0;i<orderPlace.size();i++ ) {
    					    									
					if(orderPlace.get(i).getOrderstatus()<2) {
						
						System.out.println(5);
					  
						if((idofdish-1)==i) { 
							
							int flag=0;
							
							for(int j=0;j<restaurantnameslist.size();j++) {
								
								if(orderPlace.get(i).getRestname().equals(restaurantnameslist.get(j).getRestaurantname()) ) {
							
									for(int k=0;k<orderRecord.size();k++) {
										
										if(orderRecord.get(i).getPickStatus()==2) {
											flag=1;
											break;
										}
										else {
											flag=0;
										}
											
									}
									
						if(flag==0) {			
							
						  orderPlace.get(i).setOrderstatus(2);
						    
						  Rider objrider= new Rider(orderPlace.get(i).getRestname(), riderrecord.get(ActiveIndex).getCnic()  ,orderPlace.get(i).getCustomerCNIC(),i,orderPlace.get(i).getBill(),2,restaurantnameslist.get(j).getRestaurantlocation());
						    orderRecord.add(objrider);
						    JOptionPane.showMessageDialog(null,"\tOrder booked !","Info",
									JOptionPane.INFORMATION_MESSAGE);
						    RiderViewordertextArea.setText(" You have already picked an order.");
						}
						    
						    break;
								}
							}
							
						}
						
					}
						
					}
					
				}
				}
					else {
						JOptionPane.showMessageDialog(null,"\tOnly one order at a time !","Info",
								JOptionPane.INFORMATION_MESSAGE);
					}
			}
			
			
				
			
			}	
			
			
		});
		RiderOrderConfirmButton.setBounds(527, 178, 89, 23);
		panel_1.add(RiderOrderConfirmButton);
		
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Your Picked Order:");
		lblNewLabel_2.setBounds(62, 33, 119, 14);
		panel_2.add(lblNewLabel_2);
		
		JTextArea PickedOrdertextArea = new JTextArea();
		PickedOrdertextArea.setBounds(24, 58, 263, 207);
		panel_2.add(PickedOrdertextArea);
		
		
		
		JCheckBox cdeleievryStstusCheckBox = new JCheckBox("Order as been deleiverd.");
		cdeleievryStstusCheckBox.setBounds(321, 208, 183, 23);
		panel_2.add(cdeleievryStstusCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("----Order Status----");
		lblNewLabel_3.setBounds(315, 187, 119, 14);
		panel_2.add(lblNewLabel_3);
		
		JButton ReceivePaymentButton = new JButton("Receive Payment");
		ReceivePaymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!orderRecord.isEmpty()) {
					
					for(int i=0;i<orderRecord.size();i++) {
						
						 {
						
						String name=JOptionPane.showInputDialog(frame,"\t---Make Payment as a Customer Role----\n \n--> Total Bill to be Paid: "+orderRecord.get(i).getPickUpCash()+"\n--> Enter Payment :");  
						
					
						if(Double.parseDouble(name)==orderRecord.get(i).getPickUpCash()) {
							
							
							JOptionPane.showMessageDialog(frame,"Successfully made Payment.","Alert",JOptionPane.WARNING_MESSAGE);
							
							orderRecord.get(i).setPickStatus(3);
							
							
						for(int k=0;k<orderRecord.size();k++) {	
							for(int l=0; l<orderPlace.size();l++) {
								
								if(orderPlace.get(k).getCustomerCNIC().equals(orderRecord.get(k).getCustcnic()) && orderPlace.get(l).getOrderstatus()==2 ) {
									orderPlace.get(l).setOrderstatus(3);
									orderRecord.get(k).setPickStatus(3);
									
								}
							}
							
						}
							
						}
						else if(Double.parseDouble(name)>orderRecord.get(i).getPickUpCash()) {
							
							
							JOptionPane.showMessageDialog(frame,"Successfully made Payment.\n Collect your remaining R.s: "+( Double.parseDouble(name)-orderRecord.get(i).getPickUpCash()) ,"Alert",JOptionPane.WARNING_MESSAGE);
							
							for(int k=0;k<orderRecord.size();k++) {	
								for(int l=0; l<orderPlace.size();l++) {
									
									if(orderPlace.get(k).getCustomerCNIC().equals(orderRecord.get(k).getCustcnic()) && orderPlace.get(l).getOrderstatus()==2 ) {
										orderPlace.get(l).setOrderstatus(3);
										orderRecord.get(k).setPickStatus(3);
										
									}
								}
								
							}
							
							
						}
						else {
							
						
							
						JOptionPane.showConfirmDialog(null,"\tError!  Payment was not equal to total Bill.\\n Do you want to block this customer ", "Swing Tester",
			                    JOptionPane.YES_NO_OPTION,
			                    JOptionPane.QUESTION_MESSAGE);
						
						int result=0;
						if( result==JOptionPane.YES_OPTION) {
							
							for(Customer c: cust) {
								if(c.getCustomerCNIC().equals(orderRecord.get(ActiveIndex).getCustcnic())) {
									c.setBlock(true);
									JOptionPane.showMessageDialog(frame,"Customer has been Blocked.","Alert",JOptionPane.WARNING_MESSAGE);
									break;
								}
							}
						
							
							
							
						}
						
					}
				   }
				}
				
				
			}}
		});
		ReceivePaymentButton.setBounds(321, 119, 183, 23);
		panel_2.add(ReceivePaymentButton);
		
		JButton pickedorderRefreshButton = new JButton("Refresh");
		pickedorderRefreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PickedOrdertextArea.append("");
				if(!orderRecord.isEmpty()) {
					
					for(int i=0;i<orderRecord.size();i++) {
						
						if(orderRecord.get(i).getCnic().equals(riderrecord.get(ActiveIndex).getCnic())){
							
							for(int j=0;j<cust.size();j++) {
					
								if(orderRecord.get(i).getCustcnic().equals(cust.get(j).getCustomerCNIC())){
							
								
								PickedOrdertextArea.append( " Customer Name: " + cust.get(j).getCustomerName()+ " , Contact: " + cust.get(j).getCustomerPhone()+ "\n Total Bill: " + orderRecord.get(i).getPickUpCash() + " \nPick Up Location:  "+orderRecord.get(i).getRestLocation() + " Drop Location : " + cust.get(j).getCustomerAddress() );
							
							}
						}
						
					}
					
					
				}
				
				}
				
				
				
			}
		});
		pickedorderRefreshButton.setBounds(92, 293, 89, 23);
		panel_2.add(pickedorderRefreshButton);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		frame.setVisible(true);
		
		
	
	
	
		
	}
	
	
	void logout(java.awt.event.MouseEvent evt,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist ,int activeIndex, ArrayList <Admin> admin,ArrayList <Rider> rider, ArrayList<Rider> orderRecord) {
		
		
		JOptionPane.showMessageDialog(null,"\tLogged Out.","Info",
				JOptionPane.INFORMATION_MESSAGE);
		
		activeIndex=-5;
		Front f = new Front(cust, restaurantnameslist , orderPlace, restaurantdisheslist , activeIndex, admin, rider,orderRecord);
		f.setVisible(true);
		
	}
	
}
	

