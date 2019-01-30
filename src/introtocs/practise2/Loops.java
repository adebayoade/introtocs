package introtocs.practise2;

import java.util.Scanner;
import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	// initialization phase
	int gradeCounter = 0;
	int grade;
	int average;
	int total = 0;
	

	ArrayList<Integer> gradeArray = new ArrayList<Integer>();

	grade = getUserInput("Enter a number or -1 to quit: ", input);

	// processing phase using sentinel control
	while (grade != -1) {
	    total += grade;
	    gradeCounter += 1;
	    // add grade to gradeArray
	    gradeArray.add(grade);

	    grade = getUserInput("Enter a number or -1 to quit: ", input);
	}

	// termination phase
	if (gradeCounter != 0) {
	    System.out.println();
	    System.out.println("You entered " + gradeCounter + " grades.");
	    average = total / gradeCounter;
	    System.out.println();
	    System.out.println("The total of the grades entered is " + total);
	    System.out.println("The average is " + average);

	    // outputs elements in the gradeArray
	    System.out.print("Grades entered are:");
	    for (int i = 0; i < gradeArray.size(); i++) {
		System.out.print(" " + gradeArray.get(i));

	    }
	} else {
	    System.out.println("No grades were entered.");
	}
    }

    public static int getUserInput(String promptMessage, Scanner input) {
	while (true) {
	    try {
		System.out.print(promptMessage);
		return Integer.parseInt(input.nextLine());
	    } catch (NumberFormatException ignore) {
		System.out.println("Not a valid input.");
	    }
	}
    }
}
