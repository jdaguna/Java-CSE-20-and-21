/**
 * J. Joshua Daguna, IV
 * CSE 21 - 1.23.2011 4:10
 * FindDuplicate.java
 * Find duplicates in an array.
 */
public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		//first for loop to set an index entry to compare against the rest of array 
		for(int i=0; i<=arr.length; i++){

			//compare set entry against rest of array
			for(int b=i+1; b<arr.length; b++){
				//check if there is a duplicate and print it out
				if(arr[i]==arr[b]){
					System.out.println("Index " +i+ " same as Index " +b+ " with value " + arr[b]);
				
				}
			}
		}

	}

}
