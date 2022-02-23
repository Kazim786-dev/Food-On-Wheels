
import java.io.Serializable;
import java.util.ArrayList;

public class Food implements Serializable {

	protected String dishName  , dishresname;
   protected double dishPrice;
	
	
	public String getDishresname() {
		return dishresname;
	}



	public void setDishresname(String dishresname) {
		this.dishresname = dishresname;
	}



	public String getDishName() {
		return dishName;
	}



	public void setDishName(String dishName) {
		this.dishName = dishName;
	}



	public double getDishPrice() {
		return dishPrice;
	}



	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}


	
	

	Food(){
		
	}
	
	Food( String name , double price, String resname ){
		
		
		this.dishName=name;
		this.dishPrice=price;
		this.dishresname=resname;
		
	}
	
	
	
	

	
	
	void assignitems(ArrayList<Food> restauranttdishes, ArrayList<Restaurant> restaurantnames ) {
		
		Food objr1=new Food("1st", 150.0, restaurantnames.get(0).restaurantname  );
		
		Food  objr2 = new Food("Carrabba's_Italian_Grill", 1000.0 , restaurantnames.get(0).restaurantname);
		
		
		Food objr3=new Food("TGI_Friday's", 400, restaurantnames.get(0).restaurantname);
		Food objrp1=new Food("2nd", 170, restaurantnames.get(1).restaurantname);
		Food objrp2=new Food ("Golden_Corral:_A_Blue-Plate_Tie", 1080, restaurantnames.get(1).restaurantname);
		Food  objrp3=new Food ("BBQ_Chicken_Pizza", 350, restaurantnames.get(1).restaurantname);
		Food  objrds1=new Food ("3rd", 380, restaurantnames.get(2).restaurantname);
		Food  objrds2=new Food ("Bombay_Chicken", 450, restaurantnames.get(2).restaurantname);
		Food  objrds3=new Food ("Mango_Shake", 120, restaurantnames.get(2).restaurantname);
	
		restauranttdishes.add(objr1);
		restauranttdishes.add(objr2);
		restauranttdishes.add(objr3);
		restauranttdishes.add(objrp1);
		restauranttdishes.add(objrp2);
		restauranttdishes.add(objrp3);
		restauranttdishes.add(objrds1);
		restauranttdishes.add(objrds2);
		restauranttdishes.add(objrds3);
		
		
	}
	
	
	
	 boolean AddFooddetails(ArrayList<Restaurant> rest, ArrayList<Food> r, String newName , String newPrice,int Active) {
		 
		 		
		boolean find=false;
		double nn = Double.parseDouble(newPrice);
	
	
		
		Food f = new Food(newName,nn,rest.get(Active).getRestaurantname());
		
		if(r.get(Active).getDishName()!=null)
		  { 
			r.add(f);

		  }
		else
		{	  
			r.get(Active).setDishName(newName);
			r.get(Active).setDishPrice(nn);
			r.get(Active).setDishresname(rest.get(Active).getRestaurantname());
		}
		
		
		
			
		 for(Food rr  : r) {
			 
			if(rr.getDishName()!=null)
		 	if(rr.getDishName().equals(newName)) {
		 		
		 		find=true;
		 		break;
		 	}
		 	
		}
		 if(find==true) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
			
		
			
	
	 
	 
	 
	 boolean UpdateFooddetails(ArrayList<Food> dish , ArrayList<Restaurant> rest , String id , String newName , String newPrice,int activeIndex) {

		
		 int newID = Integer.parseInt(id);
		 double nn = Double.parseDouble(newPrice);
		 
		 System.out.println("(food ->update)dish res name: "+dish.get((newID-1)).getDishresname()+"active res anme : "+dish.get(activeIndex).getDishresname());
		 
		 if( dish.get((newID-1)).getDishresname().equals(dish.get(activeIndex).getDishresname())) {
			 dish.get((newID-1)).setDishName(newName);
			 dish.get((newID-1)).setDishPrice(nn);
		     
		 }
			
		 
		 	if(dish.get((newID-1)).getDishName().equals(newName)) {
		 		return true;
		 	}
		 	else
		 		return false;
		 
		}
				 
				
		 
	 
	 
	 int DeleteFood(ArrayList<Restaurant> r, ArrayList<Food> rest , String id, int activeIndex) {
		 
		 int newID = Integer.parseInt(id);
		 
		 if(r.get(activeIndex).getRestaurantname().equals(rest.get(newID-1).getDishresname())) {
		
			 rest.remove(newID-1);
			 return 0;
		     
		 }
		 else {
			return 1; 
		 }
		 
		 
	 }
	 
	 
	 

	 
	
	
}
