import java.util.Scanner;

public class Lab6MainClass {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// asks the user to enter number of sides of dice
		int numSides = Validator.getInt(scnr, "Please specify how many sides of the dice we will roll.");
		// prompt to roll the dice
		System.out.println("You entered: " + numSides + "\r\nAre we ready to roll? (y/n)");
		boolean readyToRoll = scnr.next().equalsIgnoreCase("y");
		if (readyToRoll == true) {
			int rollOne = GenerateRandomRoll(numSides); // roll 1
			int rollTwo = GenerateRandomRoll(numSides); // roll 2
			System.out.println("You rolled a: " + rollOne + " & " + rollTwo);
		} else {
			System.out.println("Invalid. Restarting...");
			main(null);
		}
		System.out.println("Do you want to continue? (y/n)");
		boolean flag = true;
		do {
			String answer = scnr.next();
			if (answer.equalsIgnoreCase("y")) {
				main(null);
			} else if (answer.equalsIgnoreCase("n")) {
				System.out.println("Goodbye!");
				flag = false;
			} else {
				System.out.println("You did not enter a valid y or n");
				System.out.println("Please Try again");
			}
		} while (flag);

		// display result of each
		// ask user if they want to continue
	}

	public static int GenerateRandomRoll(int numSides) {
		int roll = (int) (Math.random() * numSides) + 1;
		return roll;
	}
}