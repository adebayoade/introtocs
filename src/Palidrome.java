import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// variable declaration.
		String word, reverse = "";

		// accept the input from the user
		System.out.print("Enter word to check if it is a Palidrome: ");
		word = input.nextLine();

		// reverse the word and stores in variable reverse.
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}

		// compare the two variables
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is a Palidrome");
		} else {
			System.out.println("Input is not a Palidrome.");
		}

	}

}
