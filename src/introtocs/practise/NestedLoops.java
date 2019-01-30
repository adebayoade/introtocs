package introtocs.practise;

public class NestedLoops {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String[] bigCats = { "Lion", "Tiger", "Leopad" };
	String[] birds = { "Parot", "Humming", "Ostrich" };
	String[] coldBlooded = { "Frog", "Snake", "Toad" };

	String[][] animals = { bigCats, birds, coldBlooded };
	System.out.println("Index\tvalue");

	for (int i = 0; i < animals.length; i++)
	    for (int j = 0; j < animals[i].length; j++) {
		System.out.println(i + Integer.toString(j) + "\t" + animals[i][j]);
	    }
    }
}
