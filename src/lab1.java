
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stringPicker("a", "b", "c", "d", 79));

	}
	
	public static String stringPicker(String a, String b, String c, String d, int number) {
		if (number >= 80) {
			return a;
		} else if (number >= 60) {
			return b;
		} else if (number >= 50) {
			return c;
		} else {
			return d;
		}
	}
}
