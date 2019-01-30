package introtocs.exercise;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a number to check if it's prime: ");
		double num = console.nextInt();
		
		System.out.println(5.0 % 2.5);
		
		if (num % (num/2.0) == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
