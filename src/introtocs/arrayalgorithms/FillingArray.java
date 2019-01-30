package introtocs.arrayalgorithms;

import java.util.Arrays;

public class FillingArray {

    public static void main(String[] args) {
	// Filling an Array
	int[] numbers = new int[10];
	
	for (int i = 0; i < numbers.length; i++) {
	    numbers[i] = i;
	}
	
	System.out.println(Arrays.toString(numbers));
	
	// Deleting an Array
	String[] clubs = { "Arsenal", "Chelsea", "Leceister", "Man U", "Everton" };
	
	clubs[2] = clubs[clubs.length - 1];
	
	String[] newClubs = new String[clubs.length - 1];
	
	for (int i = 0; i < clubs.length - 1; i++) {
	    newClubs[i] = clubs[i];
	}
	
	System.out.println(Arrays.toString(clubs));
	System.out.println(Arrays.toString(newClubs));
	
    }
}
