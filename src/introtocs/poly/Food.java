package introtocs.poly;

public class Food {
	
	protected String category;
	
	public void eat() {
		System.out.println("This food is great.");
	}
	
	public String getCategory() {
		
		return String.format("%s is been added.", category);
	}
}
