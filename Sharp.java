
public class Sharp extends Cheese {
	public Sharp() { // initialization 
		name = "Sharp";
		price = 1.25;
	}

	public void setName(String newName) {
		// do nothing
	}
	
	public void setPrice(Double newPrice){
		// do nothing
		
	}
	
	public double getPrice() {
	
			
		if (amount > 10)
			return price*0.80;
		if (amount > 20)
			return price*0.72;	
		return price;
	}
}


