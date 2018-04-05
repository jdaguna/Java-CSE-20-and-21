
/* CSE020 - March 11, 2010 6:21 PM
 * Horoscope.java
 * @author J. Joshua Daguna, IV
 * This program will give the user their horoscope according to their zodiac sign.
 *
 */

/*Pseudocode
 *	Declare and Initialize variables
 *	Ask user for their name
 *	Ask user for their birth date
 *	Get the current date
 *	Use if and else statements to check what zodiac sign the user is
 *	Return to user their name, zodiac sign, and their horoscope
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Horoscope {
	
	public static void main(String[] args) {
		String name = "user";
		String birthMonth = "default"; 
		String zodiac = "default";
		String horoscope = "default";
		String todayDate = DateFormat.getDateInstance().format(new Date());
		int dayOfBirth = 0;
		boolean runHoroscope = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		name = in.nextLine();
		
		System.out.println("What date were you born?");
		System.out.println("Example: October 30");
		birthMonth = in.next();
		dayOfBirth = in.nextInt();
		
		if(dayOfBirth>=32){
			System.out.println(name+", "+birthMonth+" "+dayOfBirth+" does not seem be a valid date");
			runHoroscope = false;
		}else if((birthMonth.compareToIgnoreCase("march") == 0)&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("april") == 0)&&(dayOfBirth<=20)){
			zodiac = "Aries";
			horoscope = "You will find true love soon.";
		}else if((birthMonth.compareToIgnoreCase("april") == 0)&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("may") == 0)&&(dayOfBirth<=21)){
			zodiac = "Taurus";
			horoscope = "You will rekindle an old relationship.";
		}else if((birthMonth.compareToIgnoreCase("may") == 0)&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("june") == 0)&&(dayOfBirth<=21)){
			zodiac = "Gemini";
			horoscope = "Your fortunes will soon change for the better.";
		}else if((birthMonth.compareToIgnoreCase("june") == 0)&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("july") == 0)&&(dayOfBirth<=22)){
			zodiac = "Cancer";
			horoscope = "You will avoid a disasterous outcome.";
		}else if((birthMonth.compareToIgnoreCase("july") == 0)&&(dayOfBirth>=23)||(birthMonth.compareToIgnoreCase("august") == 0)&&(dayOfBirth<=23)){
			zodiac = "Leo";
			horoscope = "You will join a country club.";
		}else if((birthMonth.compareToIgnoreCase("august") == 0)&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("september") == 0)&&(dayOfBirth<=23)){
			zodiac = "Virgo";
			horoscope = "A blessing will find its way to you.";
		}else if((birthMonth.compareToIgnoreCase("september") == 0)&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("october") == 0)&&(dayOfBirth<=23)){
			zodiac = "Libra";
			horoscope = "You will get a new car.";
		}else if((birthMonth.compareToIgnoreCase("october") == 0)&&(dayOfBirth>=24)||(birthMonth.compareToIgnoreCase("november") == 0)&&(dayOfBirth<=22)){
			zodiac = "Scorpio";
			horoscope = "You are an awesome person and will find happiness in all that you do.";
		}else if((birthMonth.compareToIgnoreCase("november") == 0)&&(dayOfBirth>=23)||(birthMonth.compareToIgnoreCase("december") == 0)&&(dayOfBirth<=21)){
			zodiac = "Sagittarius";
			horoscope = "Your life will be like Oohh Aahhh.";
		}else if((birthMonth.compareToIgnoreCase("december") == 0)&&(dayOfBirth>=22)||(birthMonth.compareToIgnoreCase("january") == 0)&&(dayOfBirth<=20)){
			zodiac = "Capricorn";
			horoscope = "You will be showered with blessings.";	
		}else if((birthMonth.compareToIgnoreCase("january") == 0)&&(dayOfBirth>=21)||(birthMonth.compareToIgnoreCase("fenruary") == 0)&&(dayOfBirth<=18)){
			zodiac = "Aquarius";
			horoscope = "The attractive opposite sex will find you more appealing.";
		}else if((birthMonth.compareToIgnoreCase("february") == 0)&&(dayOfBirth>=19)||(birthMonth.compareToIgnoreCase("march") == 0)&&(dayOfBirth<=20)){
			zodiac = "Pisces";
			horoscope = "You will slip and fall, but learn an important lesson from it.";
		}else{
			System.out.println(name+", "+birthMonth+" "+dayOfBirth+" does not seem be a valid date");
			runHoroscope = false;
		}
		
		if(runHoroscope == true){
		System.out.println(name+", you are a "+ zodiac);
		System.out.println("Your horoscope for "+ todayDate + " is:");
		System.out.println(horoscope);
		}
	}

}
