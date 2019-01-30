package introtocs.javaforandroid;

public class Fish {

	private String mSpecies;
	private String mColor;
	private int mSize;

	public Fish() {
		// generic fish
		mSpecies = "unknown";
		mColor = "unknown";
		mSize = 0;
	}

	public Fish(String species, String color, int size) {
		mSpecies = species;
		mColor = color;
		mSize = size;
	}

	public void eat() {
		// eat some algae
	};

	public void eat(Fish fishToEat) {
		// eat another fish!
	};

	public void sleep() {
		// sleep
	};

	public void makeBabyFish(Fish fishSpouse, int numBabies) {
		// Make numBabies worth of baby fish with Fish spouse
	};
}