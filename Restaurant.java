import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Restaurant extends Person implements Serializable{
	

	protected String name,restaurantlocation,restaurantname;
	private String password, restcnic , rphone;
    protected double price;
    protected int deleiveryStatus;
    
    static final long serialVersionUID = 0;
    
    //Creating arraylist for restaurant approvaL
       
	
	Restaurant() {
		
	}
	
	
	
	


	public String getRphone() {
		return rphone;
	}



	public void setRphone(String rphone) {
		this.rphone = rphone;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRestaurantlocation() {
		return restaurantlocation;
	}



	public void setRestaurantlocation(String restaurantlocation) {
		this.restaurantlocation = restaurantlocation;
	}



	public String getRestaurantname() {
		return restaurantname;
	}



	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}



	


	public String getRestcnic() {
		return restcnic;
	}



	public void setRestcnic(String restcnic) {
		this.restcnic = restcnic;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getDeleiveryStatus() {
		return deleiveryStatus;
	}



	public void setDeleiveryStatus(int deleiveryStatus) {
		this.deleiveryStatus = deleiveryStatus;
	}






	
	
	

	
	Restaurant(String Name,String code,String CNIC, String add , String resname , String phone){
		this.name=Name;
		this.password=code;
		this.restcnic=CNIC;
		this.restaurantlocation=add;
		this.restaurantname=resname;
		this.rphone=phone;
		
		
	}
	
	
	
	
	public String getRPassword() {
		return password;
	}
	public void setRPassword(String password) {
		this.password = password;
	}
	
		
	void showrestaurants(ArrayList<Restaurant> restaurantnameslist) {
		for(int i=0;i<restaurantnameslist.size();i++) {
			System.out.println(i+1+"- " +restaurantnameslist.get(i).restaurantname+"         Location : "+ restaurantnameslist.get(i).restaurantlocation);
		}
	}
	
	
	void assignRestauarnt(ArrayList<Restaurant> restaurantnameslist) {
		
		Restaurant o1 = new Restaurant("Fahad Sajjad", "d","3", "H-11","DisasterCafe" ,"36634" );
		Restaurant o2=new Restaurant("Umar Iftikhar", "p" , "5", "F-7", "parallex","23243");
		Restaurant o3=new Restaurant("Kazim Asif","k", "7","Markaz I-10","Dinnerinthesky","46466");
		
		restaurantnameslist.add(o1);
		restaurantnameslist.add(o2);
		restaurantnameslist.add(o3);
		
		
		
	}
	
	
		 
	public boolean  Registeration(ArrayList <Food> dish , ArrayList <Rider> rider,ArrayList <Customer> cust , ArrayList<Restaurant> restaurantnameslist ,ArrayList <Admin> admin , String Name , String Address, String Cnic , String Phone , String Password , String resName, int activeIndex) {
			
		
		int flag=1,ind=-1;
		
	    Restaurant objr=new Restaurant(Name,Password,Cnic,Address,resName,Phone);
	    
	    Food foodobject = new Food(null, 0.0,null);
	    dish.add(foodobject);
	   
	    for(int i=0; i<restaurantnameslist.size();i++) {
	    	
	    	if(restaurantnameslist.get(i).getRestaurantname().equals(resName) && restaurantnameslist.get(i).getRestcnic().equals(Cnic)) {
	    		flag=0;
	    		break;
	    		
	    	}
	    }
	    
	    if(flag==1) {
	    	
	    	
	    restaurantnameslist.add(objr);
        
	    
	    for(int i=0; i<restaurantnameslist.size();i++) {
	    	
	    	if(restaurantnameslist.get(i).getRestaurantname().equals(resName)) {
	    		ind=i;
	    		break;
	    	}
	    }
	    activeIndex=ind;
	   
	    return true;
	    
	    }
	    
	    
	    
	    
		
		else {
			return false;
		}
	    
	    
		
	}
	 
	}
	 
	 
		
