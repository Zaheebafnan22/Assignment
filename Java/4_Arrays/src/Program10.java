//10. Write a function to find the duplicate values of an array

import java.util.Arrays;

public class Program10 {

	public static void main(String[] args) {

		// creating an array
		int[] arr = { 10, 20, 30, 40, 50, 20 };

		// printing the statement of all array
		System.out.println("The array = " + Arrays.toString(arr));

		// sending the method
		duplicateArray(arr);

	}
	
	static void duplicateArray(int[] arr) {
		
		//printing the statement
		System.out.println("Duplicate value : ");
		
		//performing the outer loop
		for(int i = 0; i<arr.length - 1; i++) {
			
			//performing the inner loop
			for(int j = i+1; j<arr.length; j++) {
				
				//checking the condition
				if ((arr[i] == arr[j] && (i != j))) {
					
                    //printing the statement of the duplicate element
                    System.out.print(arr[j] + " ");
                }
			}
		}
	}

}
