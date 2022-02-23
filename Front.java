

import javax.swing.JFrame;

import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

import java.awt.Font;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class Front extends javax.swing.JFrame  {
	
	Main mobj = new Main();
	Customer cobj = new Customer();
	Rider ridobj = new Rider();
	Admin aobj = new Admin();
	Restaurant robj = new Restaurant();

	
	static String selection="";

    @SuppressWarnings({ "rawtypes", "unchecked", "deprecation", "deprecation", "deprecation" })
	public Front(ArrayList <Customer> cust, ArrayList<Restaurant> restaurantnameslist , ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist , int activeIndex, ArrayList<Admin> admin,  ArrayList <Rider> rider, ArrayList<Rider> orderRecord)  {
    	
    //this.setLocationRelativeTo(null);// center form in the screen
    

   

        jPanel1 = new javax.swing.JPanel();
       
        jLabelClose = new javax.swing.JLabel();
        
        jPanel1.setVisible(true);

        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        
        lblNewLabel_1 = new JLabel("Foods on Wheels");
        lblNewLabel_1.setBackground(new Color(230, 230, 250));
        lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        lblNewLabel_1.setForeground(new Color(0, 0, 139));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(326, Short.MAX_VALUE)
        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        			.addGap(305)
        			.addComponent(jLabelMin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabelClose)
        			.addGap(21))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabelMin, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        				.addComponent(lblNewLabel_1)
        				.addComponent(jLabelClose))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(new Color(0, 128, 128));
        
        
        JSeparator separator = new JSeparator();
        
        JPanel panel_1 = new JPanel();
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap(62, Short.MAX_VALUE)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(178))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
        			.addGap(30))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(168)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        			.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(26))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
        JPanel panel = new JPanel();
        tabbedPane.addTab("Rider", null, panel, null);
        panel.setLayout(null);
        
        JLabel lblNewLabel_18 = new JLabel("Rider Registeration");
        lblNewLabel_18.setBounds(253, 22, 121, 14);
        panel.add(lblNewLabel_18);
        
        JLabel lblNewLabel_19 = new JLabel("Name");
        lblNewLabel_19.setBounds(75, 81, 46, 14);
        panel.add(lblNewLabel_19);
        
        JLabel lblNewLabel_20 = new JLabel("Address");
        lblNewLabel_20.setBounds(75, 120, 46, 14);
        panel.add(lblNewLabel_20);
        
        JLabel lblNewLabel_21 = new JLabel("CNIC");
        lblNewLabel_21.setBounds(75, 155, 46, 14);
        panel.add(lblNewLabel_21);
        
        JLabel lblNewLabel_22 = new JLabel("Phone");
        lblNewLabel_22.setBounds(75, 194, 46, 14);
        panel.add(lblNewLabel_22);
        
        JLabel lblNewLabel_23 = new JLabel("Password");
        lblNewLabel_23.setBounds(75, 239, 81, 14);
        panel.add(lblNewLabel_23);
        
        JLabel lblNewLabel_24 = new JLabel("Bike Registeration Number");
        lblNewLabel_24.setBounds(48, 276, 161, 14);
        panel.add(lblNewLabel_24);
        
        RidnameField = new JTextField();
        RidnameField.setBounds(219, 78, 225, 20);
        panel.add(RidnameField);
        RidnameField.setColumns(10);
        
        RidaddressField = new JTextField();
        RidaddressField.setBounds(219, 117, 225, 20);
        panel.add(RidaddressField);
        RidaddressField.setColumns(10);
        
        RidcnicField = new JTextField();
        RidcnicField.setBounds(219, 152, 225, 20);
        panel.add(RidcnicField);
        RidcnicField.setColumns(10);
        
        RidphoneField = new JTextField();
        RidphoneField.setBounds(219, 191, 225, 20);
        panel.add(RidphoneField);
        RidphoneField.setColumns(10);
        
        RidpasswordField = new JPasswordField();
        RidpasswordField.setBounds(219, 236, 225, 20);
        panel.add(RidpasswordField);
        
        RidplateField = new JTextField();
        RidplateField.setBounds(219, 273, 225, 20);
        panel.add(RidplateField);
        RidplateField.setColumns(10);
        
        JButton RidregisterButton = new JButton("Register");
        RidregisterButton.setBounds(203, 331, 89, 23);
        panel.add(RidregisterButton);
        
        RidregisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	if(!RidnameField.getText().isBlank() && !RidaddressField.getText().isBlank() && !RidcnicField.getText().isBlank() && !RidphoneField.getText().isBlank() && !RidpasswordField.getText().isBlank() && !RidplateField.getText().isBlank() ) {
            	
            	RidregisterClicked(evt,orderPlace,rider,cust ,restaurantnameslist,activeIndex ,admin ,restaurantdisheslist,orderRecord,RidnameField.getText(),RidcnicField.getText(),RidaddressField.getText(),RidpasswordField.getText(),RidphoneField.getText(),RidplateField.getText());
            	   
            }
            	else
            		JOptionPane.showMessageDialog(null,"\tFields cant be empty. ","Info",
        					JOptionPane.INFORMATION_MESSAGE);	
            }
        });
      
        
        
        
        
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Customer", null, panel_2, null);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_12 = new JLabel("Customer Registeration");
        lblNewLabel_12.setBounds(216, 11, 128, 14);
        panel_2.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("Name");
        lblNewLabel_13.setBounds(91, 74, 46, 14);
        panel_2.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("Address");
        lblNewLabel_14.setBounds(91, 110, 46, 14);
        panel_2.add(lblNewLabel_14);
        
        JLabel lblNewLabel_15 = new JLabel("CNIC");
        lblNewLabel_15.setBounds(91, 149, 46, 14);
        panel_2.add(lblNewLabel_15);
        
        JLabel lblNewLabel_16 = new JLabel("Phone");
        lblNewLabel_16.setBounds(91, 188, 46, 14);
        panel_2.add(lblNewLabel_16);
        
        JLabel lblNewLabel_17 = new JLabel("Password");
        lblNewLabel_17.setBounds(91, 227, 59, 14);
        panel_2.add(lblNewLabel_17);
        
        CnameField = new JTextField();
        CnameField.setBounds(230, 71, 184, 20);
        panel_2.add(CnameField);
        CnameField.setColumns(10);
        
        CaddressField = new JTextField();
        CaddressField.setBounds(230, 107, 184, 20);
        panel_2.add(CaddressField);
        CaddressField.setColumns(10);
        
        CcnicField = new JTextField();
        CcnicField.setBounds(226, 146, 188, 20);
        panel_2.add(CcnicField);
        CcnicField.setColumns(10);
        
        CphoneField = new JTextField();
        CphoneField.setBounds(225, 185, 189, 20);
        panel_2.add(CphoneField);
        CphoneField.setColumns(10);
        
        CpasswordField = new JPasswordField();
        CpasswordField.setBounds(226, 224, 188, 20);
        panel_2.add(CpasswordField);
        
        JButton CregisterButton = new JButton("Register");
        CregisterButton.setBounds(234, 310, 89, 23);
        panel_2.add(CregisterButton);
        
        CregisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	if(!CnameField.getText().isBlank() && !CaddressField.getText().isBlank() && !CcnicField.getText().isBlank() && !CphoneField.getText().isBlank() && !CpasswordField.getText().isBlank() ) {
            		
            		int check=0, m=0;
            		while(check==0 && m<=CphoneField.getText().length()) 
            		 {
            			try {
            				int a=Integer.parseInt(CphoneField.getText());
            			if(CphoneField.getText().charAt(m)<10) {
            			
            				check=0;
            				m++;
            			}
            			}
            			catch(Exception e) {
            				check=1;
            				JOptionPane.showMessageDialog(null,"\tPhone cant have alphabets. ","Info",
                					JOptionPane.INFORMATION_MESSAGE);
            				m=0;
            			}
            				
            			
            		  }
            		
            		
            			
            		
            	if(check==0)	
            	CregisterClicked(evt,orderPlace, restaurantdisheslist, cust,restaurantnameslist,admin,rider,CnameField.getText(),CcnicField.getText(),CpasswordField.getText(),activeIndex,CaddressField.getText(),CphoneField.getText(),orderRecord);
 
            }
            	else
            		JOptionPane.showMessageDialog(null,"\tFields cant be empty. ","Info",
        					JOptionPane.INFORMATION_MESSAGE);
            		
            
            }
        });
        
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("Restaurant", null, panel_3, null);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel("Name");
        lblNewLabel_4.setBounds(81, 54, 79, 14);
        panel_3.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Address");
        lblNewLabel_5.setBounds(81, 100, 95, 14);
        panel_3.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Phone ");
        lblNewLabel_6.setBounds(81, 144, 46, 14);
        panel_3.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("CNIC");
        lblNewLabel_7.setBounds(81, 189, 46, 14);
        panel_3.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("Password");
        lblNewLabel_8.setBounds(81, 237, 95, 14);
        panel_3.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("Restaurant Name");
        lblNewLabel_9.setBounds(81, 290, 128, 14);
        panel_3.add(lblNewLabel_9);
        
        RnameField = new JTextField();
        RnameField.setBounds(205, 51, 248, 20);
        panel_3.add(RnameField);
        RnameField.setColumns(10);
        
        RaddressField = new JTextField();
        RaddressField.setBounds(205, 97, 248, 20);
        panel_3.add(RaddressField);
        RaddressField.setColumns(10);
        
        RphoneField = new JTextField();
        RphoneField.setBounds(205, 141, 248, 20);
        panel_3.add(RphoneField);
        RphoneField.setColumns(10);
        
        RcnicField = new JTextField();
        RcnicField.setBounds(205, 186, 248, 20);
        panel_3.add(RcnicField);
        RcnicField.setColumns(10);
        
        RpasswordField = new JPasswordField();
        RpasswordField.setBounds(205, 234, 248, 20);
        panel_3.add(RpasswordField);
        
        ResnameField = new JTextField();
        ResnameField.setBounds(205, 287, 248, 20);
        panel_3.add(ResnameField);
        ResnameField.setColumns(10);
        
        JButton RregisterButton = new JButton("Register");
        RregisterButton.setBounds(248, 342, 128, 23);
        panel_3.add(RregisterButton);
        
        RregisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
            	if( !RnameField.getText().isBlank() && !RaddressField.getText().isBlank() && !RphoneField.getText().isBlank() && !RcnicField.getText().isBlank() && !RpasswordField.getText().isBlank() && !ResnameField.getText().isBlank() ) {
            	RregisterClicked(evt,cust ,restaurantnameslist ,activeIndex ,admin ,rider,orderPlace, restaurantdisheslist,orderRecord);
           
            }
            
            	else
            		JOptionPane.showMessageDialog(null,"\tFields cant be empty. ","Info",
        					JOptionPane.INFORMATION_MESSAGE);	
            	
            }
        });
        
        
        
        
        JLabel lblNewLabel_10 = new JLabel("Restaurant Registeration");
        lblNewLabel_10.setBounds(259, 11, 161, 14);
        panel_3.add(lblNewLabel_10);
        
        JPanel Loginpanel = new JPanel();
        tabbedPane.addTab("Login", null, Loginpanel, null);
        Loginpanel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Enter CNIC");
        lblNewLabel_2.setBounds(114, 95, 120, 20);
        Loginpanel.add(lblNewLabel_2);
        
        UsernameField = new JTextField();
       
        	
        UsernameField.setBounds(244, 95, 191, 20);
        Loginpanel.add(UsernameField);
        UsernameField.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Enter Password");
        lblNewLabel_3.setBounds(114, 192, 94, 14);
        Loginpanel.add(lblNewLabel_3);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(241, 189, 191, 20);
        Loginpanel.add(passwordField);
        
        @SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
        
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Restaurant", "Rider", "Customer"}));
        comboBox.setBounds(133, 281, 120, 22);
      //  comboBox.addActionListener((ActionListener) this);
        comboBox.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				selection = (String) comboBox.getSelectedItem();
			
			}
        });
        
        
        Loginpanel.add(comboBox);
        
        
        
        
        JButton LoginButton = new JButton("Login");
        LoginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        LoginButton.setBounds(297, 281, 89, 23);
        
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	LoginClicked(evt,cust,restaurantnameslist,orderPlace, restaurantdisheslist,activeIndex,admin,  rider,  orderRecord);
            }
        });
        
        Loginpanel.add(LoginButton);
        
        JLabel lblNewLabel_11 = new JLabel("Login Form");
        lblNewLabel_11.setBounds(269, 22, 117, 14);
        Loginpanel.add(lblNewLabel_11);
        
        
        JButton btnNewButton = new JButton("Login      ");
        btnNewButton.setBounds(9, 5, 157, 23);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabbedPane.setSelectedIndex(3);
        	}
        });
        panel_1.setLayout(null);
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Customer Regiseration");
        btnNewButton_1.setBounds(9, 33, 157, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		tabbedPane.setSelectedIndex(1);
        		
        	}
        });
        panel_1.add(btnNewButton_1);
        
        
        JButton btnNewButton_3 = new JButton("Rider Registeration");
        btnNewButton_3.setBounds(9, 67, 157, 23);
        panel_1.add(btnNewButton_3);
        
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		tabbedPane.setSelectedIndex(0);
        		
        	}
        });
        
        JButton btnNewButton_4 = new JButton("Restaurant Registeration");
        btnNewButton_4.setBounds(9, 101, 157, 23);
        panel_1.add(btnNewButton_4);
        
        JButton btnNewButton_2 = new JButton("Exit");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		File custfobj1 = new File("Customer.txt");
        		File restfobj1 = new File("Restaurant.txt");
        		File riderfobj1 = new File("Rider.txt");
        		File riderrecord = new File("Rider_record.txt");
        		File dishes = new File("dishes.txt");
        		

        // customer txt file		
        		try {
        			if(custfobj1.createNewFile()) {
        				System.out.println("Created!");
        			}
        			else {
        				System.out.println("Everything is OK!");
        			}
        		} catch (IOException edf) {
        			// TODO Auto-generated catch block
        			edf.printStackTrace();
        		}

        // restaurant txt file
        		try {
        			if(restfobj1.createNewFile()) {
        				System.out.println("Created!");
        			}
        			else {
        				System.out.println("Everything is OK!");
        			}
        		} catch (IOException ed) {
        			// TODO Auto-generated catch block
        			ed.printStackTrace();
        		}
        		
        		
        		try {
        			if(riderfobj1.createNewFile()) {
        				System.out.println("Created!");
        			}
        			else {
        				System.out.println("Everything is OK!");
        			}
        		} catch (IOException es) {
        			// TODO Auto-generated catch block
        			es.printStackTrace();
        		}
        		
        		try {
        			if(dishes.createNewFile()) {
        				System.out.println("Created!");
        			}
        			else {
        				System.out.println("Everything is OK!");
        			}
        		} catch (IOException e1) {
        			// TODO Auto-generated catch block
        			e1.printStackTrace();
        		}
        		//riderrecord
        		try {
        			if(riderrecord.createNewFile()) {
        				System.out.println("Created!");
        			}
        			else {
        				System.out.println("Everything is OK!");
        			}
        		} catch (IOException e2) {
        			// TODO Auto-generated catch block
        			e2.printStackTrace();
        		}
        		
        		
        		
        		filehandling  fhandling = new   filehandling();
        		try {
					fhandling.write(cust, rider, restaurantnameslist,restaurantdisheslist,orderRecord, custfobj1,  riderfobj1,restfobj1 ,dishes ,riderrecord);
					
					
					//public void write(ArrayList <Customer> cust, ArrayList <Rider> ride, ArrayList <Restaurant> res,ArrayList <Food> fd,ArrayList <Rider> riderr, File f1, File f2, File f3,File f4,File f5) throws FileNotFoundException, IOException
					
					
					System.out.println("Data stored.");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	
        		
        		System.exit(0);
        		
        		
        	}
        });
        btnNewButton_2.setBounds(38, 143, 89, 23);
        panel_1.add(btnNewButton_2);
        jPanel2.setLayout(jPanel2Layout);
        
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		tabbedPane.setSelectedIndex(2);
        		
        	}
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 872, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE))
        			.addGap(1114))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        
        
        
        pack();
        
        
        
        
        
    }
    
    public void MLoginClicked(java.awt.event.MouseEvent evt) {
    	
    	
    }
    
    //RidregisterClicked(evt,cust ,restaurantnameslist ,activeIndex ,admin ,rider,orderPlace, restaurantdisheslist);
    
    @SuppressWarnings("deprecation")
	public void RregisterClicked(java.awt.event.MouseEvent evt , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist ,int ActiveIndex,ArrayList <Admin> admin, ArrayList <Rider> rider, ArrayList<Customer> orderPlace, ArrayList<Food> restaurantdisheslist, ArrayList<Rider> orderRecord) {
    	
    	int result = JOptionPane.showConfirmDialog(null,"As an ADMIN , do you want to validate this addition? ", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    	
    	if(result==JOptionPane.YES_OPTION) {
    	
    		
    	
    	if(robj.Registeration(restaurantdisheslist,rider, cust, restaurantnameslist, admin, RnameField.getText(), RaddressField.getText(), RcnicField.getText(), RphoneField.getText(), RpasswordField.getText(), ResnameField.getText(),ActiveIndex)){
    		
    		JOptionPane.showConfirmDialog(null,"\tRegisteration SUCCESSFULL\n Would you like to proceed ", "Swing Tester",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
    		
    		if(result==JOptionPane.YES_OPTION) {
    			
    			int index =  robj.Login(rider, cust, restaurantnameslist, admin , RcnicField.getText(), RpasswordField.getText(),2);	
    			
    			if(index==-1) {
    				
    				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    			}
    			
    				
    			else {	
    				
    				ActiveIndex=index;
    				
    				JOptionPane.showMessageDialog(null," " + "Welcome!"+ ActiveIndex  ,"Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    				Rgui rff  = new Rgui(orderPlace, cust, restaurantnameslist, restaurantdisheslist,ActiveIndex, admin,rider,orderRecord);
    				rff.pack();
    				rff.setVisible(true);
    				
    				
    			}	
    		}
    		
    		
    	}
    	else {
    		
    		JOptionPane.showMessageDialog(null,"\t You were denied permission to register.\\nOne reason could be a duplicate CNIC ","Info",
					JOptionPane.INFORMATION_MESSAGE);
    		
    	}
    	
    	}
    	
    	else {
    		
    		JOptionPane.showMessageDialog(null,"\t You were denied permission by admin.","Info",
					JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	
    	
    }

    
    @SuppressWarnings("deprecation")
	public void CregisterClicked(java.awt.event.MouseEvent evt,ArrayList<Customer> orderPlace,ArrayList<Food> restaurantdisheslist,ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,ArrayList <Admin> admin, ArrayList <Rider> rider,String name, String id , String passwrd, int activeIndex,String adress,String ph, ArrayList<Rider> orderRecord) {
    	
    	int result = JOptionPane.showConfirmDialog(null,"As an ADMIN , Do you want to validate this addition? ", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    	
    	if(result==JOptionPane.YES_OPTION) {
    	
    		
    	
    	
		if( cobj.Registeration(restaurantdisheslist,rider, cust, restaurantnameslist,admin, name, adress, id ,ph, passwrd," ", activeIndex)){
    		
    		
    		JOptionPane.showConfirmDialog(null,"\tRegisteration SUCCESSFULL\n Would you like to proceed ", "Swing Tester",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
    		
    		if(result==JOptionPane.YES_OPTION) {
    			
    			int index =  cobj.Login(rider, cust, restaurantnameslist, admin , id, passwrd,1);	
    			
    			
    			if(index==-1) {
    				
    				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    			}
    			
    			
    			
    			else {	
    				
    				activeIndex=index;
    				
    				JOptionPane.showMessageDialog(null," " + "Welcome! "   ,"Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    				
    				Cgui cd=new Cgui(orderPlace,cust,restaurantnameslist,restaurantdisheslist,activeIndex,admin,rider, orderRecord);
    				cd.setVisible(true);
    				
    				
    			}	
    		}
    		
    		
        		
    	
    	else if(result==JOptionPane.NO_OPTION){
    		
    		JOptionPane.showMessageDialog(null,"\tOk  ","Info",
					JOptionPane.INFORMATION_MESSAGE);
    		}	
        	
        	
    	
    	
    }
    
		else {
    		
    		JOptionPane.showMessageDialog(null,"\t Error. You could not be registered.\nOne reason could be a duplicate CNIC","Info",
					JOptionPane.INFORMATION_MESSAGE);
    	}
		
    	
    }
    	
    	else {
    		
    		JOptionPane.showMessageDialog(null,"\t You were denied permission by admin.","Info",
					JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	
    }	
    
    @SuppressWarnings("deprecation")
	public void RidregisterClicked(java.awt.event.MouseEvent evt, ArrayList<Customer> orderPlace,ArrayList <Rider> rider , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,int ActiveIndex,ArrayList <Admin> admin , ArrayList<Food> restaurantdisheslist, ArrayList<Rider> orderRecord ,String name ,String cnic,String add,  String pass , String phone , String plateNum) {
    	
    	int result = JOptionPane.showConfirmDialog(null,"As an ADMIN , Do you want to validate this addition? ", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    	
    	if(result==JOptionPane.YES_OPTION) {
    	
    	
    	
    	if(ridobj.Registeration(restaurantdisheslist,rider, cust,restaurantnameslist, admin, name, add, cnic, phone, pass,plateNum,ActiveIndex)){
    		
    		
    		JOptionPane.showConfirmDialog(null,"\tRegisteration SUCCESSFULL\n Would you like to proceed ", "Swing Tester",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
    		
    		if(result==JOptionPane.YES_OPTION) {
    			
    			
    			
    			int index =  ridobj.Login(rider, cust, restaurantnameslist, admin ,cnic , pass,4);	
    			
    			
    			
    			if(index==-1) {
    				
    				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    			}
    			
    				
    			else {	
    				
    				ActiveIndex=index;
    				
    				JOptionPane.showMessageDialog(null,"\tLOGIN SUCCESSFULL\n\n" + "Welcome!" ,"Info",
    						JOptionPane.INFORMATION_MESSAGE);
    				
    				Ridgui rid = new Ridgui(orderPlace, cust, restaurantnameslist, restaurantdisheslist,ActiveIndex, admin,rider,  orderRecord);
    				rid.setVisible(true);
    				rid.pack();
    				
    				
    				
    				
    			}	
    		}
    		
    	
    		
    	}
    	else {
    		
    		JOptionPane.showMessageDialog(null,"\t Error. You could not be registered.\\nOne reason could be a duplicate CNIC","Info",
					JOptionPane.INFORMATION_MESSAGE);
    		
    	}
    	
    	}
    	
    	else {
    		
    		JOptionPane.showMessageDialog(null,"\t You were denied permission by admin.","Info",
					JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	
    	
    }
    
  
	
	private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       
        System.exit(0);
        
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
        
    }
    
    
    private void LoginClicked(java.awt.event.MouseEvent evt, ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist , ArrayList<Customer> orderPlace, ArrayList<Food> restaurantdisheslist, int activeIndex ,ArrayList <Admin> admin, ArrayList <Rider> rider, ArrayList<Rider> orderRecord) {
    	
    if(!selection.equals("")) {
    	
    	if(selection.equalsIgnoreCase("Admin")) {
			
			int index =  aobj.Login(rider, cust,restaurantnameslist, admin , UsernameField.getText(), passwordField.getText(),3);	
			
			if(index==-1) {
				
				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(index==-5) {
				
				JOptionPane.showMessageDialog(null,"\t data not stored.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
			else {	
				JOptionPane.showMessageDialog(null,"\tLOGIN SUCCESSFULL\n\n" + "Welcome!","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				Admingui adgui = new Admingui(orderPlace,cust,restaurantnameslist,restaurantdisheslist,activeIndex,admin, rider ,orderRecord);
				adgui.setVisible(true);
				adgui.pack();
				
				
			}
			
    	}
		
		if(selection.equalsIgnoreCase("Customer")) {
			
			int index =  cobj.Login(rider, cust, restaurantnameslist, admin , UsernameField.getText(), passwordField.getText(),1);	
			
			if(index==-1) {
				
				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(index==-5) {
				
				JOptionPane.showMessageDialog(null,"\t Data not Found.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
			else {
				
				
				activeIndex=index;
				
				JOptionPane.showMessageDialog(null,"\tLOGIN SUCCESSFULL\n\n" + "Welcome!","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			//	Cgui cdd = new Cgui(orderPlace, cust, restaurantnameslist, restaurantdisheslist, activeIndex, admin, rider);
				Cgui cd=new Cgui(orderPlace,cust,restaurantnameslist,restaurantdisheslist,activeIndex,admin,rider,  orderRecord);
				cd.setVisible(true);
				//public Cgui(ArrayList<Customer> orderPlace , ArrayList <Customer> cust,ArrayList<Restaurant> restaurantnameslist,
				//ArrayList<Food> restaurantdisheslist ,int  ActiveIndex, ArrayList <Admin> admin ,ArrayList <Rider> rider ) {				
				
			}
			
		}
		
		if(selection.equalsIgnoreCase("Rider")) {
			
			int index =  ridobj.Login(rider, cust, restaurantnameslist, admin , UsernameField.getText(), passwordField.getText(),4);	
			
			if(index==-1) {
				
				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(index==-5) {
				
				JOptionPane.showMessageDialog(null,"\t data not stored.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
			else {	
				JOptionPane.showMessageDialog(null,"\tLOGIN SUCCESSFULL\n\n" + "Welcome!","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
				Ridgui rid = new Ridgui(orderPlace, cust, restaurantnameslist, restaurantdisheslist,activeIndex, admin,rider,  orderRecord);
				rid.setVisible(true);
				
			}
			
		}
		
		if(selection.equalsIgnoreCase("Restaurant")) {
			
			int index =  robj.Login(rider, cust, restaurantnameslist, admin , UsernameField.getText(), passwordField.getText(),2);	
			
			if(index==-1) {
				
				JOptionPane.showMessageDialog(null,"\t Error! Please try again.","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(index==-5) {
				
				JOptionPane.showMessageDialog(null,"\t Error! Wrong credentials..","Info",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
			else {	
				
				activeIndex=index;
				
				JOptionPane.showMessageDialog(null,"\tLOGIN SUCCESSFULL\n\n" + "Welcome!  "+activeIndex   ,"Info",
						JOptionPane.INFORMATION_MESSAGE);
				
				Rgui rff  = new Rgui(orderPlace, cust, restaurantnameslist, restaurantdisheslist,activeIndex, admin,rider,  orderRecord);
				rff.setVisible(true);
				
				
			}
				
				
			}	
				
			}
			
		
		
    
    else {
    	JOptionPane.showMessageDialog(null,"\t Error! Please select a login type.","Info",
				JOptionPane.INFORMATION_MESSAGE);}
    	
    }
		
    	
    
    
    
    private void logout(java.awt.event.MouseEvent evt) {
    	
    	JOptionPane.showMessageDialog(null,"\tLogged Out.\n\n Thanks for using our service","Info",
				JOptionPane.INFORMATION_MESSAGE);
    	
    	
    	
    }
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private JLabel lblNewLabel_1;
    private JTextField UsernameField;
    private JPasswordField passwordField;
    private JTextField RnameField;
    private JTextField RaddressField;
    private JTextField RphoneField;
    private JTextField RcnicField;
    private JPasswordField RpasswordField;
    private JTextField ResnameField;
    private JTextField CnameField;
    private JTextField CaddressField;
    private JTextField CcnicField;
    private JTextField CphoneField;
    private JPasswordField CpasswordField;
    private JTextField RidnameField;
    private JTextField RidaddressField;
    private JTextField RidcnicField;
    private JTextField RidphoneField;
    private JPasswordField RidpasswordField;
    private JTextField RidplateField;
}
