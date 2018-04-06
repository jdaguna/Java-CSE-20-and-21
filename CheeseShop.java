import java.util.*;

public class CheeseShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("We sell 3 kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		
		
		double sharp, brie, swiss, subtotal, total, discount = 0;
		
		System.out.print("Enter the amount of Sharp: ");
		sharp = input.nextDouble();
		
		System.out.print("Enter the amount of Brie: ");
		brie = input.nextDouble();
		
		System.out.print("Enter the amount of Swiss: ");
		swiss = input.nextDouble();
		subtotal = sharp*1.25 + brie*10 + swiss*40; 
		System.out.print("Display the itemized list? ( 1 for yes) ");
		if (input.nextInt() == 1){
			if(sharp > 0)
				System.out.println(sharp+ "lbs of Sharp @ $1.25 = $" + sharp*1.25);
			if(brie > 0)
				System.out.println(brie+ "lbs of Brie @ $10.00 = $" + brie*10.00);
			if(swiss > 0)
			System.out.println(swiss+ "lbs of Swiss @ $40.00 = $" + swiss*40.00);
		
		}
		System.out.println("Sub Total: $" + subtotal);
		total = subtotal;
		if (subtotal >= 50 && subtotal <= 99){
			total -= 10;
			
			discount = 10;
		}else if(subtotal > 100){
		total -= 25;
		discount =25;
		
		}
		System.out.println("-Discount: $"+discount);
		System.out.println("Total    : $"+total);
	}
}
