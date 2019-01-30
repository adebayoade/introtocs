package introtocs.arrayalgorithms;

import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {
	// Sorting an Array
	int[] numbers = { 7, 1, 9, 5, 3, 4, 2, 8, 6, 10 };

	for (int i = 0; i < numbers.length - 1; i++) {
	    for (int j = i + 1; j < numbers.length; j++) {
		if (numbers[i] > numbers[j]) {
		    int iVal = numbers[i];

		    numbers[i] = numbers[j];
		    numbers[j] = iVal;
		}
	    }
	}

	System.out.println(Arrays.toString(numbers));
    }

}
