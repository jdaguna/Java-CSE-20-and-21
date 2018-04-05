/* CSE020 - April 20, 2010 4:21 PM
 * Cards.java
 * @author J. Joshua Daguna, IV
 * This program will take in two arguments from the user that represent number of hands and number of cards per hand to be dealt. 
 * The program works around these variables and returns to the user the number of hands and cards per hands in terms of a deck of cards.
 */
/*Pseudocode:
	 * Initialize variables 
	 * Initialize and declare array
	 * Check for 2 arguments  Emit error msg and exit on error
	 * Emit error msg and exit on error if total amount of cards are greater than 52
	 * Fisher–Yates shuffle
	 * Swap out The variables in the array start with 0 then afterwards hello[0]=hello[count]
	 * output encoded string
 */
/*1.	Create 2 arrays of String's: one to hold the rank: "2", "3", "4", "5", "6", "7", "8", "9","T", "J", "Q", "K", "A", and one to hold the suit: "S", "H", "D", "C", which stands for Spades, Hearts, Diamonds, and Clubs.
2.	Create the deck as an array of String's, by concatenating each rank to each suit (e.g. 2S, 3S, 4S, etc.). You must use nested loops (for or while – your choice) for this process.
 * 
 */

public class Cards {
public static void main(String[] args) {

	//initialize variables 
	int maxCards = 52;
	int count = 0;
	//initialize and declare array
	String [] rank ={"2", "3", "4", "5", "6", "7", "8", "9","T", "J", "Q", "K", "A",};
	String [] suit ={"S", "H", "D", "C",};
	String [] deck = new String [maxCards];	
	for(int b=0; b<4; b++){
			for(int c=0; c<13; c++){
				deck[count]=rank[c]+suit[b];
				count++;
			}
	}
	// Check for 2 arguments  Emit error msg and exit on error
	if(args.length !=2){
		System.out.println("Two integer arguments are required.");
		System.exit(0);
	}
	int numHands = Integer.parseInt(args[0]);
	int numCards = Integer.parseInt(args[1]);
	// Emit error msg and exit on error if total amount of cards are greater than 52
	if((numHands*numCards)>maxCards){
		System.out.println("This Deck Only has " + maxCards + " Cards");
		System.exit(0);
	}

	// Fisher–Yates shuffle
	for (int i = deck.length; i > 1; i--) {
	int r = (int) (Math.random() * i);
	String swap = deck[i - 1];
	deck[i - 1] = deck[r];
	deck[r] = swap;
	}
	// Output encoded string
	count = 1;
	for (int b=1; b<numHands+1; b++){
		System.out.print("Hand "+ b +":  ");
		for(int c=0; c<numCards; c++){
			//swap out The variables in the array start with 0 then afterwards hello[0]=hello[count]
			System.out.print(deck[0]);
			System.out.print(" ");
			deck[0]=deck[count];
			if(count<51)
			count++;
		}
		System.out.println();
	}

}

}

	

