/**
 * 
 */
package countries;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author juliadart
 *
 */
public class CountriesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Countries> clist = new ArrayList<>();

		int choice = 1;

		// Continue while the user doesn't select exit option
		while (choice != 3) {
			System.out.println("Welcome to the Countries Application");
			System.out.println("1 - See list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");

			// Validator to ensure user enters correct number range and data type
			choice = Validator.getInt(scan, "Enter menu number: ", 0, 5);

			// Display various menu options
			if (choice == 1) {
				
				// Displays current countries in file
				clist = CountriesTextFile.readFromFile();

			} else if (choice == 2) {
				// This adds new country using writeToFile method
				System.out.println("Enter country: ");
				String newC = scan.nextLine();
				Countries c = new Countries(newC);
				clist.add(c);
				CountriesTextFile.writeToFile(c);

				System.out.println("This country has been saved!");

			} else if (choice == 3) {
				// Exits application
				System.out.println("Goodbye.");
			}

		}
		scan.close();

	}

}
