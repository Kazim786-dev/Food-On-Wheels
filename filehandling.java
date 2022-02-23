import java.io.*;
import java.util.*;

 



public class filehandling{
	
 
	
	public void write_customer(ArrayList <Customer> cust, File f) throws FileNotFoundException, IOException
	{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
			 out.writeObject(cust);
			 out.close();
	}
	
	public void write_dishes(ArrayList <Food> food, File f) throws FileNotFoundException, IOException
	{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
			 out.writeObject(food);
			 out.close();
	}
	
	public void write_riderrecord(ArrayList <Rider> riderrecord , File f) throws FileNotFoundException, IOException
	{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
			 out.writeObject(riderrecord);
			 out.close();
	}
	
	public void write_rider(ArrayList <Rider> ride, File f) throws FileNotFoundException, IOException
	{
		 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		 
			 out.writeObject(ride);
			 out.close();
	}
	
	public void write_resturants(ArrayList <Restaurant> res, File f) throws FileNotFoundException, IOException
	{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		 
		  out.writeObject(res);
		  out.close();
		 
	}
	
	public void write(ArrayList <Customer> cust, ArrayList <Rider> ride, ArrayList <Restaurant> res,ArrayList <Food> fd,ArrayList <Rider> riderr, File f1, File f2, File f3,File f4,File f5) throws FileNotFoundException, IOException
	{
		write_customer(cust,f1);
		write_rider(ride,f2);
		write_resturants(res,f3);
		write_dishes(fd,f4);
		write_riderrecord(riderr,f5);
		
	}
	
	public void read_cust(ArrayList <Customer> cust, File f) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList <Customer> ds = (ArrayList<Customer>) in.readObject(); 
		cust.addAll(ds);
		in.close();
	}
	
	public void read_dishes(ArrayList <Food> fd, File f) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList <Food> ds = (ArrayList<Food>) in.readObject(); 
		fd.addAll(ds);
		in.close();
	}
	
	public void read_riderr(ArrayList <Rider> rd, File f) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList <Rider> ds = (ArrayList<Rider>) in.readObject(); 
		rd.addAll(ds);
		in.close();
	}
		 
	
	public void read_rider(ArrayList <Rider> ride, File f) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList <Rider> ds = (ArrayList<Rider>) in.readObject(); 
		ride.addAll(ds);
		in.close();
	}
	
	public void read_resturants(ArrayList <Restaurant> res ,File f) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList <Restaurant> ds = (ArrayList <Restaurant>) in.readObject();
		res.addAll(ds);
		in.close();
	}
	
	
	public void read_all(ArrayList <Restaurant> res, ArrayList <Rider> ride, ArrayList <Customer> cust,ArrayList <Rider> riderrecrd,ArrayList <Food> fd, File f1, File f2, File f3, File f4, File f5) throws FileNotFoundException, ClassNotFoundException, IOException
	{
		read_resturants(res,f3);
		read_rider(ride,f2);
		read_cust(cust,f1);
		read_dishes(fd,f4);
		read_riderr(riderrecrd,f5);
	}
	
	
	

}