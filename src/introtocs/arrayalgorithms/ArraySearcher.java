package introtocs.arrayalgorithms;

import java.util.Scanner;

public class ArraySearcher {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// Searching an Array
	String[] mList = { "homecoming", "wonderwoman", "arrow", "flash", "ironman" };

	while (true) {
	    String search = getUserInput("Enter search: ", input);

	    int match = stringSearcher(mList, search);
	    if (match == -1) {
		System.out.println("No match found.");
	    } else {
		System.out.println("match located at index " + match);
		System.out.println("You search for: " + mList[match]);
		break;
	    }
	}

    }

    public static int stringSearcher(String[] arr, String val) {
	int match = -1;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i].equalsIgnoreCase(val)) {
		match = i;
		break;
	    }
	}
	return match;
    }

    public static String getUserInput(String promptMessage, Scanner input) {
	System.out.print(promptMessage);
	String userInput = input.nextLine();
	return userInput;
    }
}
