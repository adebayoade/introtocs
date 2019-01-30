package introtocs.arrayalgorithms;

public class MaxAndMinVal {

    public static void main(String[] args) {
	// Checking min or max value in an Array of integers.

	int[] numbers = { 5, 8, 4, 1, 6, 3, 0 };

	System.out.println(max(numbers));
	System.out.println(min(numbers));
    }
    
    // method that returns the maximum of an array of integers.
    public static int max(int[] arr) {
	int currMax = arr[0];
	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > currMax) {
		currMax = arr[i];
	    }
	}
	return currMax;
    }
    
    // method that returns the minimum of an array of integers.
    public static int min(int[] arr) {
	int currMin = arr[0];
	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] < currMin) {
		currMin = arr[i];
	    }
	}
	return currMin;
    }

}
