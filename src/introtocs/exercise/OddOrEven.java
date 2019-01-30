package introtocs.exercise;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to check if it's Odd or Even: ");
		int num = input.nextInt();

		if (num % 2 == 0)
			System.out.printf("%d is even", num);
		else
			System.out.printf("%d is odd", num);

	}

}
