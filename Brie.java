
public class Brie extends Cheese{
	public Brie() { // initialization 
		name = "Brie";
		price = 10.00;
	}

	public void setName(String newName) {
		// do nothing
	}
	
	public void setPrice(Double newPrice){
		// do nothing
		
	}
	
	public double getPrice() {
		if (amount > 10)
			return price*0.9;
		return price;
	}
}
