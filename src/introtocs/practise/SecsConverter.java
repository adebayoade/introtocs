package introtocs.practise;

import java.util.Scanner;

public class SecsConverter {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int seconds;
	int minutes;
	int hour;
	String input;

	while (true) {
	    try {
		System.out.printf("Enter the seconds to convert: %n");
		input = in.nextLine();
		int input2 = Integer.parseInt(input);

		if (input2 >= 60) {

		    minutes = input2 / 60;
		    hour = minutes / 60;
		    
		    System.out.printf("%d is %d minutes%n", input2, minutes);
		    System.out.printf("%d is %d hours%n", input2, hour);
		    minutes = minutes - 60;
		    System.out.printf("%d is %d hours and %d minutes", input2, hour, minutes);
		   
		    break;
		} else {
		    System.out.println("Input must be greater than 60");
		}
	    } catch (Exception ingnore) {
		System.out.println("Enter a valid input");
	    }
	}
    }
}
