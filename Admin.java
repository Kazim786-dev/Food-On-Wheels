import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person{

	protected String adminName , adminAddress , adminPhone , adminCNIC , adminPassword ;
	
	
	
	
	
	
	Scanner scan = new Scanner(System.in);
	
	Admin() {
		//default constructor
		
	}
	
	Admin(String name,String address , String phone , String cnic ,String passwrd ){
		this.adminName=name;
		this.adminAddress=address;
		this.adminPhone = phone;
		this.adminCNIC = cnic;
		this.adminPassword=passwrd;
		
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public String getAdminCNIC() {
		return adminCNIC;
	}

	public void setAdminCNIC(String adminCNIC) {
		this.adminCNIC = adminCNIC;
	}
	
	
	
	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	

	@SuppressWarnings("unlikely-arg-type")
	public boolean Registeration(ArrayList <Food> dish,ArrayList<Rider> rider, ArrayList<Customer> cust,ArrayList<Restaurant> restaurantcustomerlist, ArrayList<Admin> adminn, String name, String address, String cnic, String phone, String password, String r,int activeIndex) {
		
		
		
		setAdminName("Umer");
		
		setAdminAddress("Lahore");
		
		setAdminPhone("03552");
		
		setAdminCNIC("37401");
		
		setAdminPassword("admin123");
		
		Admin obj = new Admin("Umer", "Lahore","03552","37401","admin123");
	
		adminn.add(obj);
		
		if(adminn.contains("Umer")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	

	
	void manageVendors(ArrayList <Restaurant> restaurantnameslist , ArrayList <Restaurant> approvalList ) {
		
		System.out.println(" Press 1: To view availabe restaurants"
				+ "\nPress 2: To  Validate any pending approvals"
				+ "\nPress 3: To exit");
		
		int choice = scan.nextInt();
		
		while(choice!=3) {
			
			if(choice==1) {
				
				System.out.println("\t----Available Resturants------\n");
				for(int i=0;i<restaurantnameslist.size();i++) {
					System.out.println((i+1)+"- " +restaurantnameslist.get(i).restaurantname+"         Location : "+ restaurantnameslist.get(i).restaurantlocation+"\n");
				}
			}
			
			if(choice==2) {
				
				System.out.println("\n-----Pending Approvals--------\n");
				for(int i=0;i<approvalList.size();i++) {
					System.out.println((i+1)+"- " +approvalList.get(i).restaurantname+"         Location : "+ approvalList.get(i).restaurantlocation+"\n");
				}
				
				System.out.println("Enter the serial number of record to validate: ");
				int serial = scan.nextInt();
				
				for(int i=0;i<approvalList.size();i++) {
					
					if(serial==i+1) {
						
						restaurantnameslist.add(approvalList.get(i));
						
						approvalList.remove(i);
						
						System.out.println("Restaurant has been approved and added in record.");
						break;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	void manageRiders(ArrayList <Rider> ridernameslist , ArrayList <Rider> approvalList ){
		
		
		System.out.println(" Press 1: To view availabe Riders"
				+ "\nPress 2: To  Validate any pending approvals"
				+ "\nPress 3: To exit");
		
		int choice = scan.nextInt();
		
		while(choice!=3) {
			
			if(choice==1) {
				
				System.out.println("\t----Available Riders------\n");
				for(int i=0;i<ridernameslist.size();i++) {
					System.out.println((i+1)+"--    Name " +ridernameslist.get(i).getName()+"\tAddress : "+ ridernameslist.get(i).getAddress()+"\tContact No. :  "+ridernameslist.get(i).getPhone() +"\tRider CNIC : "+ridernameslist.get(i).getCnic()+"\n");
				}
			}
			
			if(choice==2) {
				
				System.out.println("\n-----Pending Approvals--------\n");
				for(int i=0;i<approvalList.size();i++) {
					System.out.println((i+1)+"- " +approvalList.get(i).getName()+"\\tAddress : "+ approvalList.get(i).getAddress()+"\tContact No. :  "+approvalList.get(i).getPhone() +"\tRider CNIC : "+approvalList.get(i).getCnic()+"\n");
				}
				
				System.out.println("Enter the serial number of record to validate: ");
				int serial = scan.nextInt();
				
				for(int i=0;i<approvalList.size();i++) {
					
					if(serial==i+1) {
						
						ridernameslist.add(approvalList.get(i));
						
						approvalList.remove(i);
						
						System.out.println("Rider has been approved and added in record.");
						break;
						
					}
					
				}
				
			}
			
		}
		
	}
			
	void manageCustomers(ArrayList <Customer> cust) {
		
		System.out.println("Press 1: To view all Customers"
				+ "\nPress 2: To Remove any Customer"
				+ "\nPress 3: To exit.");
		
		int choice = scan.nextInt();
		
		while(choice!=3) {
			
			if(choice==1) {
				
				System.out.println("\n-------Customer Data--------\n");
				System.out.println(" Name\tAddress\tPhone Number\tCNIC");
				
				for(int i=0;i<cust.size();i++) {
					
					System.out.println((i+1)+cust.get(i).getCustomerName()+"\t"+cust.get(i).getCustomerAddress()+"\t"+cust.get(i).getCustomerPhone()+"\t"+cust.get(i).getCustomerCNIC()+"\n");
				}
				
			}
			
			
			if(choice==2) {
				
				System.out.println("Enter the serial number of record to remove: ");
				int serial = scan.nextInt();
				
				for(int i=0;i<cust.size();i++) {
					
					if(serial==i+1) {
						
												
						cust.remove(i);
						
						System.out.println("The customer has been removed.");
						break;
						
					}
					
				}
				
			}
			
		}
		
	}	
	
	/*void manageFoodDetails(ArrayList<Restaurant> restaurantdishes) {
		
		System.out.println("Press 1: To view the food products of all Restaurants"
				+ "\nPress 2: To view food products of any specific resturant"
				+ "\nPress 3: To exit.");
		
		int choice = scan.nextInt();
		
		while(choice!=3) {
			
			if(choice==1) {
				
				for(int i=0;i< restaurantdishes.size();i++) {
					
					System.out.println(" Resturant name : "+restaurantdishes.get(i).getRestaurantName() + "\tDish name : "+ restaurantdishes.get(i).getItemName()+"\tPrice : "+ restaurantdishes.get(i).getPrice());
				}
				
			}
			
			
			if(choice==2) {
				
				System.out.println("Enter the name of Restaurant : ");
				String name = scan.nextLine();
				int flag=0;
				
				for(int i=0;i< restaurantdishes.size();i++) {
				
					while(name.equals(restaurantdishes.get(i).getRestaurantName())) {
						
						System.out.println( "\tDish name : "+ restaurantdishes.get(i).getItemName()+"\tPrice : "+ restaurantdishes.get(i).getPrice());flag=1;
					}
					
				}
				
				if(flag==0) {
					System.out.println("No resturant with this name was found.");
				}
				
			}
			
		}
		
	}*/

	
}
