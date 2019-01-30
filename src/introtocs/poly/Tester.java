package introtocs.poly;

public class Tester {

	public static void main(String[] args) {
		Food[] foodObject = new Food[3];
		
		foodObject[0] = new Food();
		foodObject[1] = new Rice();
		foodObject[2] = new Beans();
		
		foodObject[1].category = "protein";
		System.out.println(foodObject[1].getCategory());
	}
}
