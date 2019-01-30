import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word, reverse = "";
		
		System.out.print("Enter the word to reverse: ");
		word = in.nextLine();
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.print(reverse);
	}
}
