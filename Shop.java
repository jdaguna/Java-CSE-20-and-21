import java.util.Random;
import java.util.Scanner;

public class Shop {
	

	public static void intro() {
		
		System.out.println("This program supports 4 functions:");
		System.out.println("     1. Setup Shop");
		System.out.println("     2. Buy");
		System.out.println("     3. List Items");
		System.out.println("     4. Checkout");
		
		
	}
	
	public static int getOption(Scanner input, String[] names, double[] prices) {
		System.out.print("Please choose the function you want: ");
		int option = input.nextInt();
		if (1>option || option > 4){
			System.out.println("Error: Do Not Know " + option);
			return 0;
			
		}
		if (option == 1){
			System.out.println("initializing shop...");

			return 1;
		}
		if (option == 2){
			System.out.println("initializing buy...");
			
			return 2;
		}
		if (option == 3){
			System.out.println("initializing list...");
			return 3;

		}		
		if (option == 4){
			System.out.println("initializing check out...");
			return 4;
		
		}	
		return 0;
	}

	public static void shopSetup(Scanner input, String[] names, double[] prices, int[] amounts, int discount, double rate){
			
		boolean twoWord = false;
		int words =0;
		String temp = "hello";
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < prices.length; i++) {

			System.out.print("Enter the name of item " + i + ":");
			names[i] = sc.nextLine();
	
			temp = names[i];
			

			words = temp.split(" ").length;
	
			
			while(words!=1){
				
				System.out.print("Name must be one word only, input name:");
				names[i] = sc.next();
				temp = names[i];
				words = temp.split(" ").length;
				
				}
				
		
			System.out.print("Enter the price of item " + i + ":");
			prices[i] = input.nextDouble();
		
			
			
			
	}
	}

	public static void buy(Scanner input, String[] names, int[]amounts){
		for (int i = 0; i < amounts.length; i++) {
			System.out.print("Enter the amount of " + names[i] + " :");
			amounts[i] = input.nextInt();
		}	
		return;
	}
	
	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
	
		for (int i = 0; i < amounts.length; i++) {
			if(amounts[i]!=0)					
			System.out.println(amounts[i] + "  of " + names[i] + ": $" + prices[i] + "  = $" + amounts[i]*prices[i]);
		}
		
		return;
	}
	public static void checkout(double[]prices, int[] amounts, int discount, double rate){
		double subTotal = 0;
		double temp =0;
		double total =0;
		for (int i = 0; i < amounts.length; i++) {
			if(amounts[i]!=0)					
			subTotal += amounts[i]*prices[i];
		}
		
		System.out.println("Sub Total: $" + subTotal);
		if (subTotal >= discount){
			temp= subTotal*rate;
			System.out.println("-Discount: $"+temp);
		}
		
		System.out.println("Total:  $"+(total=subTotal-temp));
		return;
	}
		
	public static void main(String[] args) {
		boolean setupShop = false;
		boolean bought = false;
		
		
		String[] names = new String[0];
		double[] prices = new double[0];
		int[] amounts = new int[0];
		
		int option =0;
		int discount = 0;
		double rate = 0;
		Scanner input = new Scanner(System.in);
		boolean shopMode = true;
		
		int discountThreshold = 0;
		double discountRate = 0;
		
		while(shopMode){
		intro();
		option = getOption(input, names, prices);
		
		if (option == 1){
			System.out.print("How many items do you want to sell:");
			int sell = input.nextInt();
			names = new String[sell];
			prices = new double[sell];
			amounts = new int[sell];
			
			shopSetup(input, names, prices, amounts, discount, rate);
			
			System.out.print("What is your discount threshold: ");
			discountThreshold = input.nextInt();
			
			System.out.print("What is your discount rate(%): ");
			discountRate = input.nextDouble();
			discount = discountThreshold;
			rate= discountRate;
			setupShop = true;
		}
		if(option == 2){
			if(setupShop==false){
				System.out.println("Shop is not setup yet!");
								
			} else
				buy(input, names, amounts);
				
				bought = true;
			}
		
		
		if(option == 3){
			
			if(setupShop==false)
				System.out.println("Shop is not setup yet!");
		    if(bought==false)
				System.out.println("buy items first");
			
			if(bought == true)		
				itemizedList(names, prices, amounts);
			
		}
			
		if(option == 4){
			if(setupShop==false){
				System.out.println("Shop is not setup yet!");
				
			} else if(bought==false){
				System.out.println("buy items first");
				
			} else{
				checkout(prices, amounts, discount, rate);
				shopMode=false;
			}
		
		}
		}
		
	}		
}

