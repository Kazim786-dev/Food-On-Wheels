import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Customer extends Person implements Serializable   {

	private String customerName , customerAddress , customerPhone , customerCNIC , customerPassword,dishName,restname ;
	private int  dishQuantity,selectresindex, orderstatus, totalOrder;
	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	private double Bill,dishprice;
	private boolean block=false; 
	 //Creating arraylist to place orders
	
	 
	// Order orderobj = new Order();
	
		public double getDishprice() {
		return dishprice;
	}

	public void setDishprice(double dishprice) {
		this.dishprice = dishprice;
	}

		Customer(){
			//default constructor
		}
		
		Customer(String n,String ad , String ph , String cnic, String pass , boolean status){
			
			this.customerName=n;
			this.customerAddress=ad;
			this.customerPhone=ph;
			this.customerCNIC=cnic;
			this.customerPassword = pass;
			block=status;
			
		}
		
         Customer(String resname,String custname , String custcnic , String dishname, int dishQty, int ostatus, double bill,double price, int tOrder ) {
			
        	 dishQuantity=dishQty;
        	 customerName=custname;
        	 customerCNIC=custcnic;
        	 restname=resname;
        	 dishName=dishname;
        	 orderstatus=ostatus;
        	 Bill=bill;
        	 dishprice=price;
        	 totalOrder = tOrder;
		}
	 
	 
	
	
	
	
	
	
	public int getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}

	public int getSelectresindex() {
		return selectresindex;
	}

	public void setSelectresindex(int selectresindex) {
		this.selectresindex = selectresindex;
	}

	public String getDishname() {
		return dishName;
	}

	public void setDishname(String dishname) {
		this.dishName = dishname;
	}

	public String getRestname() {
		return restname;
	}

	public void setRestname(String restname) {
		this.restname = restname;
	}

	public int getDishQuantity() {
		return dishQuantity;
	}

	public void setDishQuantity(int dishQuantity) {
		this.dishQuantity = dishQuantity;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerCNIC() {
		return customerCNIC;
	}

	public void setCustomerCNIC(String customerCNIC) {
		this.customerCNIC = customerCNIC;
	}
	
	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	public double getBill() {
		return Bill;
	}

	public void setBill(double bill) {
		Bill = bill;
	}

	

	
	public boolean Registeration(ArrayList <Food> dish , ArrayList<Rider> rider, ArrayList<Customer> cust, ArrayList<Restaurant> restaurantnameslist, ArrayList<Admin> admin, String name, String address, String cnic, String phone, String pasword, String r,int activeindex) {

		
		int flag=0;
		if(!cust.isEmpty()) {
			
			for(int i=0;i<cust.size();i++) {
				
				if(cust.get(i).getCustomerCNIC().equals(cnic)) {
					
					flag=1;
					break;
				}
			}
			
			
		}
		
		if(flag==0) {
		Customer c = new Customer(name,address,phone,cnic,pasword , false);
		cust.add(c);
		}
		
		
		
		
		int f=0;
		
		for(int i=0;i<cust.size();i++) {
		
		if(cust.get(i).getCustomerName().equals(name)) {
			
			f=1;break;
		}
		
		}
		
		if(f==1) {
			
			return true;
		}
		
		
		else {
			return false;
		}
		
		

	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	
	
	
	
	//-------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	

	
	
	
//---------------------------------------------------------------------------------------------
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
