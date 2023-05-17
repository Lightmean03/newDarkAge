//package pyramidJava;
import java.io.*;
import java.util.*;

public class InputHandler {
	public static double getDoubleInRange(Scanner input, double min, double max) {
		double val = 0.0;

		while (true) {
			try {
				val = input.nextDouble();
				if (val <= max && val >= min) {
					break;
				} else {
					System.out.println("Invalid number. Try again");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Invalid entry. re-enter");
				input.nextLine();
			}
		}
		return val;
	}

	public static double getDouble(Scanner input) {
		double val = 0.0;

		while (true) {
			try {
				val = input.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Invalid entry. re-enter");
				input.nextLine();
			}
		}
		return val;
	}

	public static char getChar(Scanner input) {
		String line = "";
		while (true) {
			try {
				line = input.nextLine();
				if (line.length() == 1) {
					break;
				} else if (line.length() > 1) {
					System.out.println("You enter multiple characters, please enter just one");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error");
				input.nextLine();
			}
		}
		return line.charAt(0);
	}

	public static int getIntInRange(Scanner input, int min, int max) {
		int value = 0;
		while (true) {
			try {
				value = input.nextInt();
				if (value >= min && value <= max) {
					break;
				} else {
					System.out.println("Please enter a number between " + min + " and " + max);
				}

			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer");
				input.nextLine();
			}
		}
		return value;
	}

	public static int getInt(Scanner input) {
		int value = 0;
		while (true) {
			try {
				value = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer");
				input.nextLine();
			}
		}
		return value;
	}

	public static int getOddIntInRange(Scanner input, int min, int max) {
		int n = getIntInRange(input, min, max);
		while (n % 2 == 0) {
			System.out.println("Not an odd number. Try again");
			n = getIntInRange(input, min, max);
		}
		return n;
	}
	public static int getEvenIntInRange(Scanner input, int min, int max) {
		int n = getIntInRange(input, min, max);
		while (n % 2 != 0) {
			System.out.println("Not an even number. Try again");
			n = getIntInRange(input, min, max);
		}
		return n;
	}
	public static Scanner openFile(String fileName) {
		Scanner inputFile = null;
		File someFile = new File(fileName);
		try {
			inputFile = new Scanner(someFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		return inputFile;
	}

	public static void readFile(String fileName) {
		boolean fileOpened = true;
		Scanner inputFile = null;
		String text = null;

		File someFile = new File(fileName);

		try {
			inputFile = new Scanner(someFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			fileOpened = false;
		}

		if (fileOpened && inputFile.hasNext()) {
			while (inputFile.hasNext()) {
				text = inputFile.next();
				System.out.println(text);
			}
			inputFile.close();
		}
	}

}