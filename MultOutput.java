import java.util.*;
import java.io.*;

public class MultOutput {

	public static int[][] getInput(String filename) {
		int[][] arr = null;

		try {
			Scanner sc = new Scanner(new FileReader(filename));
			int row = sc.nextInt();
			int column = sc.nextInt();
			arr = new int[row][column];
			for (int i = 0; i < row; i++)
				for (int j = 0; j < column; j++)
					arr[i][j] = sc.nextInt();
			sc.close();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		return arr;
	}

	public static void multOutput(int[][]firstArr, int[][]secondArr) {
		String filename = "Result3.txt";
		
		int m1rows = firstArr.length;
		int m1cols = firstArr[0].length;
		int m2rows = secondArr.length;
		int m2cols = secondArr[0].length;
		int[][] result = new int[m1rows][m2cols];
		for (int i=0; i<m1rows; i++){
			for (int j=0; j<m2cols; j++){
				for (int k=0; k<m1cols; k++){
					result[i][j] += firstArr[i][k] * secondArr[k][j];
				}
			}
		}
//print out new 2D arr from result		
		
		try {
			FileWriter output = new FileWriter(filename);
			System.out.println(result.length + "\t" + result[0].length);
			String ostr = "";
			for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
			System.out.print(ostr = (result[i][j] + "\t"));
			output.write(ostr);
			}
			System.out.println();
			output.write("\r\n"); // Carriage return
			}
			output.close();
			} catch (Exception e) {
			System.out.println(e);
			}

	
	
	}
	public static void main(String[] args) {
		// Create 2D array pointers
		int [][] firstMatrix = null, secondMatrix = null;

		Scanner input = new Scanner(System.in);

		// Get the First Matrix
		System.out.print("Enter the First file name: ");
		String filename = input.next();
		firstMatrix = getInput(filename);

		// Get the Second Matrix
		System.out.print("Enter the Second file name: ");
		filename = input.next();
		secondMatrix = getInput(filename);

		// Multiply and Output it to a file
		System.out.println("MATRIX MULTIPLY:");
		if (firstMatrix != null && secondMatrix != null)
			multOutput(firstMatrix, secondMatrix);
	}
}
