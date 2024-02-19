//11. Write a program to find the common values between two arrays

import java.util.Arrays;

public class Program11 {

	public static void main(String[] args) {

		// creating an array
		int[] arr1 = { 10, 20, 30, 40, 50};
		int[] arr2 = {40,50,60,70,80};

		// printing the statement of all array
		System.out.println("The array = " + Arrays.toString(arr1));
		System.out.println("The array = " + Arrays.toString(arr2));

		// sending the method
		commonValue(arr1, arr2);

	}
	
	static void commonValue(int[] arr1, int[] arr2) {
		
		//performing outer loop
		for(int i : arr1) {
			
			//performing inner loop
			for(int j : arr2) {
				
				//checking the condition if both array are same
				if(i == j) {
					
					//printing the statement
					System.out.println("Common value : " +i);
				}
			}
		}
	}

}
