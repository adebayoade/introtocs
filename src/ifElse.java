import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter your age:");
		
		int age = acceptInput("How old are you?");
		
		if (age > 18) {
			if (age > 50) {
				System.out.println("You are a senior citizen.");
			} else {
				System.out.println("You are an Adult.");
			}
		} else { 
			System.out.println("You are too small.");
		}
		
	}
	
	public static int acceptInput(String prompt) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
			System.out.print(prompt);
			String in = input.nextLine();
			return Integer.parseInt(in);
			}
			catch (Exception e ) {
				System.out.println("Enter correct data.");
			}
		}
	}

}
