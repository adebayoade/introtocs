package introtocs.basics;

public class Strings {

	public static void main(String[] args) {
		
		int age = 24;
		String name = "Bayor";
		
		System.out.printf("My name is %s\nI am %d years old\n", name.trim(), age);

		for ( int i = 0; i < name.length(); i++ ) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'b') {
				System.out.println("We've got an A or B");
			}
		}
	}

}
