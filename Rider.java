import java.io.Serializable;
import java.util.ArrayList;

public class Rider extends Person implements Serializable{

	private String name , address , phone , ridercnic , password , vehicleNum , orderPickresname, custcnic , restLocation;
	
	private int availability,orderid,pickStatus=0;
	private double pickUpCash;
	
	

	Rider(){
		
	}
	
	Rider(String n , String ad, String cn, String ps, String ph , String plate ){
		
		this.name=n;
		this.address=ad;
		this.ridercnic = cn;
		this.password = ps;
		this.phone=ph;
		this.vehicleNum=plate;
		
	}
	
	Rider(String resname, String ridcnic,String Ccnic, int id, double payment , int pStatus, String restlocation){
		orderPickresname=resname;
		ridercnic=ridcnic;
		setCustcnic(Ccnic);
		orderid=id;
		pickUpCash=payment;
		setPickStatus(pStatus);
		restLocation=restlocation;
		
	}
	
	
	
	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCnic() {
		return ridercnic;
	}

	public void setCnic(String cnic) {
		this.ridercnic = cnic;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean Registeration(ArrayList <Food> dish,ArrayList <Rider> rider, ArrayList <Customer> cust , ArrayList<Restaurant> restaurantcustomerlist ,ArrayList <Admin> admin , String name , String address, String cnic , String phone , String password , String pl,int activeIndex) {
		
		
		Rider robj = new Rider( name , address , cnic , password , phone , pl );
		
		
		
		int flag=1,ind=-1;
		
		for(int i=0; i<rider.size();i++) {
	    	
	    	if(rider.get(i).getCnic().equals(cnic)) {
	    		flag=0;
	    		break;
	    		
	    	}
	    }
	    
	    if(flag==1) {
	    	
	    	
	    	rider.add(robj);
       
	    
	    for(int i=0; i<rider.size();i++) {
	    	
	    	if(rider.get(i).getName().equals(name)) {
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
	
	
	 public void viewRiders(ArrayList <Rider> rider) {
		 
		 for( Rider r : rider ) {
			 
			 System.out.println(" Name: "+ r.getName() + " Address: " + r.getAddress() + " CNIC: " + r.getCnic() + "Conatact: "+r.getPhone());
			 
		 }
		 
	 }
	
	
	
	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getOrderPickresname() {
		return orderPickresname;
	}

	public void setOrderPickresname(String orderPick) {
		this.orderPickresname = orderPick;
	}

	public double getPickUpCash() {
		return pickUpCash;
	}

	public void setPickUpCash(double pickUpCash) {
		this.pickUpCash = pickUpCash;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCustcnic() {
		return custcnic;
	}

	public void setCustcnic(String custcnic) {
		this.custcnic = custcnic;
	}

	public int getPickStatus() {
		return pickStatus;
	}

	public void setPickStatus(int pickStatus) {
		this.pickStatus = pickStatus;
	}

	public String getRestLocation() {
		return restLocation;
	}

	public void setRestLocation(String restLocation) {
		this.restLocation = restLocation;
	}

	
	
	
	
	
	

	
	
	
	
}
