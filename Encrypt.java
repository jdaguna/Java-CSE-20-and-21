import java.util.Scanner;
//Author,
//course name, date and time, source file name, and a brief program description.


public class Encrypt {

public static void main(String[] args) {
	String inString; // Input String
	char[] inChars; // Input String as char array
	char[] originalChars; // Input alphabet
	char[] replaceChars; // Substitution alphabet
	int i, j; // Utility loop control variables
	Scanner input = new Scanner(System.in);
	
	
	// Check for 2 arguments  Emit error msg and exit on error
	if(args.length !=2){
		System.out.println("Please try again, using two arguments");
		System.exit(0);
	}
	// Check that both arguments are equal length
	// Emit error msg and exit on error
	if(args[0].length() != args[1].length()){
		System.out.println("error!!! Arguments are not equal lengths");
		System.exit(0);
	}
	// Convert argument Strings to array of char
	originalChars = args[0].toCharArray();
	replaceChars = args[1].toCharArray();

	// Get input line and convert to lowercase
	inString = input.nextLine().toLowerCase();

	// Convert input String to array of char
	inChars = inString.toCharArray();

	// Perform character substitutions
	for(i=0;i<inChars.length; i++){
		for(j=0; j < originalChars.length; j++){
			if(inChars[i] == originalChars[j]){
				inChars[i]=replaceChars[j];
				break;
			}
		}
		//look for the char in the original chas
		// -- another for (use counter j, loop orginal chars)
	}
	// Output encoded string
	System.out.println(new String(inChars));
}

}
