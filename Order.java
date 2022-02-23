import java.util.ArrayList;
import java.util.Scanner;

public class Order {

	private int size=50;
	protected String[] order = new String[size];
	protected int[] orderQty = new int[size];
	protected String[] cartHistory=new String[size];
	
	Customer objc=new Customer();
	
	
	Scanner scan = new Scanner(System.in);
	
	public String[] getOrder() {
		return order;
	}

	public void setOrder(String[] order) {
		this.order = order;
	}

	public int[] getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int[] orderQty) {
		this.orderQty = orderQty;
	}

	public String[] getCartHistory() {
		return cartHistory;
	}

	public void setCartHistory(String[] cartHistory) {
		this.cartHistory = cartHistory;
	}
	
	
	
	
	void addTocart(  ArrayList<Customer> orderPlace ,ArrayList <Customer> cust,ArrayList <Restaurant> rest ,ArrayList <Food> dish,String id, String qty, String rindex,int ActiveIndex) {
		
		
		int nid=Integer.parseInt(id);
		int nqty=Integer.parseInt(qty);
		int ri=Integer.parseInt(rindex);
		String Dish=dish.get(nid-1).getDishName();
		double bill=0;
		
		
		if(dish.get(nid-1).dishName.equals(Dish) ){
			
			bill=bill+( dish.get(nid-1).getDishPrice() * nqty ) ;
		}
		
		Customer objcust=new Customer(rest.get(ri).getRestaurantname(),cust.get(ActiveIndex).getCustomerName(),cust.get(ActiveIndex).getCustomerCNIC(),dish.get(nid).getDishName(),nqty,0,bill,0,0);
		orderPlace.add(objcust);
		
	}
		
	
	
	
	void cancelOrder() {
		
		int flag=0;
		
		System.out.println(" Press 1:  To cancel a item from order");
		System.out.println(" Press 2:  To cancel whole order.");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Press the serial number of the dish as displayed in the cart ");
			int serial = scan.nextInt();
			
			for(int i=0;i<size;i++) {
				if(i==serial) {
					
					order[i]=null;
					orderQty[i]=0;
					System.out.println("Done! The item has been removed.");flag=1;
				}
			
				if(flag==1 && !order[i+1].equals("") && orderQty[i+1]!=(0)) {
				
					order[i]=order[i+1];
					order[i=1]=null;
					orderQty[i]=orderQty[i+1];
					orderQty[i]=0;
				}
			
			}

			if(flag==0) {
				System.out.println("Invalid Input. No item exists with this serial.");
			}
		
		}
	}
	
	
	
	
}
