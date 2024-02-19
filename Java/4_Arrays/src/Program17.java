import java.util.Arrays;

public class Program17 {

	public static void main(String[] args) {

		// creating an array
		int[] my_arr = { 10, 20, 30, 40, 50};

		// passing array to method
		missingNumber(my_arr);

	}

	// creating a method
	static void missingNumber(int[] arr) {

		// Sorting Array
		Arrays.sort(arr);

		// printing the statement
		System.out.println("a[] = " + Arrays.toString(arr));
		int j = 0;
		
		//performing the for loop
		for (int i = 1; i < 50; i++) {
			
			//checking the condition
			if (j < arr.length && i == arr[j]) {
				
				//incrementing
				j++;
			}
			
			else {
				
				//printing the statement
				System.out.print(i + " ");
			}
		}
	}

}
