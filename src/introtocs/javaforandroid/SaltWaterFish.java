package introtocs.javaforandroid;

public class SaltWaterFish extends Fish {
	@Override
	public void makeBabyFish(Fish fishSpouse, int numBabies) {
		// call parent method
		super.makeBabyFish(fishSpouse, numBabies);
		// eat mate
		eat(fishSpouse);
	}
}