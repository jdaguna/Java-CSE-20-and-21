import java.util.Scanner;

/**
 * J. Joshua Daguna, IV
 * CSE 20 - 4.22.2010 9:00 AM
 * Sort.java
 * Short Description
 */
public class Sort {

public static void main(String[] args) {
	String[] strings = null;
	String stringIn;
	int numLines = 10;
	int numItemsReadSoFar;
	int insertionPoint;
	int i; 
	Scanner input = new Scanner(System.in);
	

	if (args.length > 0){
		numLines=Integer.parseInt(args[0]);
		strings = new String[numLines];
	}
	System.out.println("Type " + numLines + "Strings");
	for (numItemsReadSoFar = 0; numItemsReadSoFar < strings.length; ++numItemsReadSoFar) {
		stringIn = input.nextLine();
		insertionPoint = numItemsReadSoFar;
		for(i=0;i<numItemsReadSoFar; i++){
			if(stringIn.compareTo(strings[i]) < 0){
				insertionPoint=i;
				break;
			}
		}
		
		System.out.println("insertionPoint= " + insertionPoint);
		for(i =numLines-1; i > insertionPoint; i--){
			strings[i] = strings[i-1];
		}
		strings[insertionPoint]=stringIn;
		
	}

	System.out.println("Strings are: ");
	for(i=0; i<strings.length;i++){
	System.out.println(strings[i]);
	}

}

}
