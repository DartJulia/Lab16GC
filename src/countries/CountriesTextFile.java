/**
 * 
 */
package countries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author Julia Dart
 *
 */
public class CountriesTextFile {

	public static void createFile() {
		String fileName = "countries.txt";
		Path filePath = Paths.get(fileName);
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
			} catch (IOException e) {
				System.out.println("Something went wrong..");

			}
		}
	}

	public static ArrayList<Countries> readFromFile() {
		ArrayList<Countries> clist = new ArrayList<>();
		String fileName = "countries.txt";
		Path filePath = Paths.get(fileName);
		File file = filePath.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();

			}
			reader.close();

		} catch (FileNotFoundException e) {

			System.out.println("Something went wrong..");
		} catch (IOException e) {

			System.out.println("Something went wrong..");
		}
		return clist;
	}

	public static ArrayList<Countries> writeToFile(ArrayList<Countries> clist, int index) {
		String fileName = "countries.txt";
		Path writeFile = Paths.get(fileName);
		File file = writeFile.toFile();
		clist.remove(index - 1);

		// parameter true - appends to end
		// parameter false/nothing - overwrites
		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file));
			outW.println(clist);
			outW.close();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("The file was not found.");
		}

		return clist;
	}

	public static void writeToFile(Countries newName) {
		String fileName = "countries.txt";
		Path writeFile = Paths.get(fileName);
		File file = writeFile.toFile();

		// parameter true - appends to end
		// parameter false/nothing - overwrites
		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
			outW.println(newName);
			outW.close();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("The file was not found.");
		}
	}

}
