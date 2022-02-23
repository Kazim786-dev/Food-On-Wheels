import java.util.ArrayList;

public class Cash_on_delivery extends Payment{

	
	Cash_on_delivery(){
		super();
	}
	
	
	Payment pobj = new Cash_on_delivery();
	
	
	// METHOD OVERRIDING	
	
	@Override
	
	int receive_payment( ArrayList <Rider> orderRecord , String input) {
		
		 int ret = pobj.receive_payment(orderRecord, input);
		
		 return ret;
	}
	
	
}
