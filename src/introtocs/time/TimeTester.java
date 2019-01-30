package introtocs.time;

public class TimeTester {
	public static void main(String[] args) {
		Time timeObject = new Time(13, 1, 15);
		Time timeObject2 = new Time(14, 0, 30);
		
		System.out.printf("%s \tMitilary Format%n",timeObject.toMillitary());
		System.out.printf("%s \tStandard Format%n%n",timeObject.toStandard());
		
		System.out.printf("%s \tMitilary Format%n",timeObject2.toMillitary());
		System.out.printf("%s \tStandard Format%n%n",timeObject2.toStandard());		

	}
}
