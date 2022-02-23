import java.util.ArrayList;

public class Payment {

	private int payment_amount;
	private int payment_id;
	
	Payment() {
		
	}
	
	Payment( int i , int j ) {
		
		payment_amount=i;
		payment_id=j;
		
	}

	public int getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	
	int receive_payment( ArrayList <Rider> orderRecord , String input) {
		
		int flag=0;
		
		if(!orderRecord.isEmpty()) {
			
			for(int i=0;i<orderRecord.size();i++) {
				
				 {
					 if(Double.parseDouble(input)==orderRecord.get(i).getPickUpCash()) { 
						 
						 flag=1;
					 }
					 if(Double.parseDouble(input)<orderRecord.get(i).getPickUpCash()) 
						 flag=1;
					 if(Double.parseDouble(input)>orderRecord.get(i).getPickUpCash()) 
						 flag=2;
				}
		
	}
		
		
		
		}
		else
			{flag=4;}
		
	
		if(flag==0)
			return 0;
		else if(flag==1)
			return 1;
		else if(flag==2) 
			return 2;
		else
			return 3;
		
	
	}
	
	
	}

