import java.util.*;
/**
 * J. Joshua Daguna, IV
 * CSE 21 - 1.23.2011 4:10
 * RemainderFunc.java
 * Find the remainder(s) of a sequential numbers leading to a user defined variable (max) and then finding the remainder of that number against variable divisor (user defined).
 */
public class RemainderFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//initialize variables 
		int max = 0;
		int divisor = 0;
		Scanner in = new Scanner(System.in);
		
		//prompt for max and divisor
		System.out.println("Please enter the max number: ");
		max = in.nextInt();
		System.out.println("Please enter the divisor: ");
		divisor = in.nextInt();
		
		//for loop for calculation of remainder
		for(int a=1; a<=max;a++){
			System.out.println("Num: " + a + " % " + divisor + " = " + a%divisor);
		}
		
		


	}

}
