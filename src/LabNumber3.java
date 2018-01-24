/*
 * Steven Clauw
 * Program and display a table of powers
 * 	-Prompt the user to enter an integer
 *  -Display a table of squares and cubes from 1 to the value entered
 *  -Ask if the user wants to continue
 *  
 * BUILD SPECS
 * 	-Assume the user will enter valid data
 *  -Only continue if the user agrees to
 *  
 *  HINTS
 *  --Don't mess up the difference between squares and cubes
 *  --Chapter 4
 */
import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Learn your squares and cubes!");

		int userNum = 0;
		boolean validNum;
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			do { // loop used to validate user input will be an int
				System.out.print("Please enter a number: ");
				if (scan.hasNextInt()) {
					userNum = scan.nextInt();
					System.out.println("");
					validNum = true;
				} else {
					System.out.print("Not a valid entry. ");
					validNum = false;
					scan.nextLine();
				}
			} while (!(validNum));

			System.out.println("Number" + "   " + "Squared" + "   " + "Cubed");
			System.out.println("======" + "   " + "=======" + "   " + "=====");
			/// 9 spaces from N to "S" square
			/// 10 spaces from S to "C" cube
			/// Cubed is 5 spaces
			for (int i = 1; i <= userNum; i++) {
				System.out.format("%-9d", i);
				System.out.format("%-10d", (int) (Math.pow(i, 2)));
				System.out.format("%-10d", (int) (Math.pow(i, 3)));
				System.out.println("");
			}

			System.out.println("");
			System.out.print("Do you want to continue? (y/n): ");
			cont = scan.next();
			System.out.println("");
			if (!cont.equalsIgnoreCase("y")) {
				System.out.println("Goodbye!");
			}

		}
		scan.close();
	}
}
