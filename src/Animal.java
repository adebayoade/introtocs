
public class Animal
{
    public static void main(String[] args) {
	
	int[] arr = { 56, 10, 14, 3, 22 };
	
	int maxVal = arr[0];
	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > maxVal) {
		System.out.println(arr[i] + ">" + maxVal);
		maxVal = arr[i];
	    }
	}
	
	System.out.println(maxVal);
    }
}
