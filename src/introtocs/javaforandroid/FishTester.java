package introtocs.javaforandroid;

public class FishTester {
	public static void main(String[] args) {
		
		Fish shark = new Fish("Bigfish", "black", 3);
		Fish crab = new Fish("lobsters", "brown", 1);
		
		shark.eat(crab);
	}
}
