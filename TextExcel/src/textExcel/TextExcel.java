package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
		Spreadsheet example = new Spreadsheet();
		Scanner console = new Scanner(System.in);
		String command = console.next();
		while (!command.equals("quit")) {
			System.out.println(example.processCommand(command));
			command = console.next();
		}
	}
}
