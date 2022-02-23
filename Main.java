
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		int activeIndex = -8;
		
		 ArrayList<Customer> orderPlace=new ArrayList<Customer>();
		 ArrayList <Customer> cust = new ArrayList<Customer>() ;
		 
		 
		 ArrayList<Restaurant> restaurantnameslist=new ArrayList<Restaurant>();//Creating arraylist for restaurant names
		// ArrayList<Restaurant> allorderslist=new ArrayList<Restaurant>(); //Creating arraylist for all orders
		 ArrayList<Rider> orderRecord = new ArrayList <Rider>();
		 ArrayList<Food> restaurantdisheslist=new ArrayList<Food>();
		 ArrayList <Admin> admin=new ArrayList <Admin>();
		 ArrayList <Rider> rider = new ArrayList <Rider>();
		Restaurant robj = new Restaurant();
		Food fobj = new Food();
		
		//robj.assignRestauarnt(restaurantnameslist);
		
		//fobj.assignitems(restaurantdisheslist, restaurantnameslist);
		
		
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

// restaurant txt file
		try {
			if(restfobj1.createNewFile()) {
				System.out.println("Created!");
			}
			else {
				System.out.println("Everything is OK!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//rider txt file		
		try {
			if(riderfobj1.createNewFile()) {
				System.out.println("Created!");
			}
			else {
				System.out.println("Everything is OK!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	// dishes
		try {
			if(dishes.createNewFile()) {
				System.out.println("Created!");
			}
			else {
				System.out.println("Everything is OK!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//riderrecord
		try {
			if(riderrecord.createNewFile()) {
				System.out.println("Created!");
			}
			else {
				System.out.println("Everything is OK!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
// Read all files on start of program
		
	if(riderfobj1.length()!=0 && custfobj1.length()!=0 && restfobj1.length()!=0 && dishes.length()!=0 && riderrecord.length()!=0) {	
		filehandling fhandObj=new filehandling();
		fhandObj.read_all(restaurantnameslist, rider, cust,orderRecord,restaurantdisheslist, custfobj1, riderfobj1, restfobj1,dishes,riderrecord);
		
		

		
	}
		
		Front f = new Front(cust, restaurantnameslist ,orderPlace, restaurantdisheslist , activeIndex,admin, rider, orderRecord);
		
		f.setVisible(true);
		
		
		
		
	}

}
