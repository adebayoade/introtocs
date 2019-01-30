import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word to check the number of vowels: ");
		String word = in.nextLine();
		
		System.out.println(vowelCount(word));
	}
	
	public static int vowelCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

}
