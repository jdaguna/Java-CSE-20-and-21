import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Match {

	public static void check(Student[] s, int num) {


		for (int i = 0; i < num; i++) {
			if (!s[i].getMatched()) {
				int maxScore = 0;
				int maxIndex = -1;
				int currentScore = 0;
				for (int j = 0; j < num; j++) {
					if (i != j) {
						currentScore = s[i].compare(s[j]);
						if (currentScore > maxScore && !s[j].getMatched()) {
							maxScore = currentScore;
							maxIndex = j;
						}
					}
				}

				if (maxIndex != -1){
					s[i].setMatched(true);
					s[maxIndex].setMatched(true);
					System.out.println(s[i].getName() + " matches with "
							+ s[maxIndex].getName() + " with the score " + maxScore);
				}
				else
					System.out.println(s[i].getName() + " has no matches.");			
			}
		}
	}

	public static void main(String[] args) {

		int numStudents = 0;

		Student[] students = new Student[100];

		String filename = "students.txt";
		Scanner input;
		try {
			input = new Scanner(new FileReader(filename));

			while (input.hasNextLine() && numStudents < 100) {

				String line = input.nextLine();

				Scanner text = new Scanner(line);
				text.useDelimiter("\t");

				String name = text.next();
				String g = text.next();
				char gender = g.charAt(0);

				String date = text.next();
				Scanner d1 = new Scanner(date);
				d1.useDelimiter("-");

				int mo = d1.nextInt();
				int d = d1.nextInt();
				int y = d1.nextInt();
				
//				int mo = Integer.parseInt(month);
//				int d = Integer.parseInt(day);
//				int y = Integer.parseInt(year);

				Date bd = new Date(mo, d, y);

				int qt = text.nextInt();
				int m = text.nextInt();
				int r = text.nextInt();
				int c = text.nextInt();

				Preference pf = new Preference(qt, m, r, c);

				students[numStudents] = new Student(name, gender, bd, pf, false);
				numStudents++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		check(students, numStudents);
	}

}