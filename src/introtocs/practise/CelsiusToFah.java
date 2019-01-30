package introtocs.practise;

import java.util.Scanner;

public class CelsiusToFah {

    public static void main(String[] args) {
	// Program calculates from Celsius to Fahrenheit

	Scanner input = new Scanner(System.in);
	double f;
	double c;

	System.out.print("Enter the Celsius to convert: ");
	c = input.nextDouble();
	// Calculation phase
	f =  c * (double) (9 / 5) + 32;
	
	// output
	System.out.printf("%.1f C = %.1f F", c, f);
	
    }

}
