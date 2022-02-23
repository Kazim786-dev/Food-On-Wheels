import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public abstract class Person   {

	
	
	int Login(ArrayList <Rider> rider , ArrayList <Customer> cust , ArrayList<Restaurant> restaurantcustomerlist ,ArrayList <Admin> admin , String id , String pass , int flagg ) {// throws InvalidExceptions{ 
		
		
		
		int flag=0,index=-1;
		
		
		
		
		if(flagg==1) {
		
		if(cust.size()!=0) {	
		for(int i=0;i<cust.size();i++) {
		
			//System.out.println("cnic "+cust.get(i).getCustomerCNIC()+" pass1  " + cust.get(i).getCustomerPassword()+ " pass  " + pass + "id  " + id);
			
			if(cust.get(i).getCustomerCNIC().equals(id)) {
				
				
				if(cust.get(i).getCustomerPassword().equals(pass) && cust.get(i).isBlock()==false) {
					
					index = i;
					flag=1;
					
					break;
				}
				
			}
			
		}
		}		
		}
			
		
		if(flagg==2) {
			
			if(restaurantcustomerlist.size()!=0) {
			for(Restaurant str: restaurantcustomerlist) {
				
				if(str.getRestcnic().equals(id)) {
				
					
					if(str.getRPassword().equals(pass)) {
						
						index = restaurantcustomerlist.indexOf(str);
						flag=1;
						break;
					
					}
					
					
				}
					
			}
		}
	}
		
		if(flagg==3) {
			
			
				
			if(id.equals("37401")) {
				
				if(pass.equals("admin123")) {
					
					index = 0;
					flag=1;
					
					
				
				}
				
			}
		
		
		
		
		}
		
		if(flagg==4) {
			
			
			
			if(rider.size()!=0) {
			for(Rider str : rider) {
				
				

				if(str.getCnic().equals(id)) {
				
					
					if(str.getPassword().equals(pass)) {
					index = rider.indexOf(str);
					flag=1;
					
					break;
				
				}
				
				
			}
			
			}
		}
		}

		if(flag==0) {
			//throw new InvalidExceptions("ID is not valid");
			
			return -5;
		}
		
		if(index==-1) {
			
			return 0;
		}
		else {
		
		return index;
		
		}
		
	
		
	}
	
			

	public  abstract boolean  Registeration(ArrayList <Food> dish ,ArrayList <Rider> rider , ArrayList <Customer> cust , ArrayList<Restaurant> restaurantcustomerlist ,ArrayList <Admin> admin , String name , String address, String cnic , String phone , String password , String r, int ActiveIndex);




}

	
	
