import java.util.Scanner;

public class MathsOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the seconds: ");
		int i = input.nextInt();
		
		double minutes = (i % 3600) / 60;
		
		System.out.printf("%.2f minutes(s) %n", minutes);
		System.out.println(3600 / 60);
	}

}
