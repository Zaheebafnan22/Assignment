//8. Write a function to find the minimum and maximum value of an array

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
	
		//creating an array
		int[] arr = {10,20, 30, 40 ,50};
		
		//printing the statement of all array
		System.out.println("The array = " + Arrays.toString(arr));

		//printing the statement of max value
		System.out.println("The maximum = " + maxValue(arr));
		
		//printing the statement of min value
		System.out.println("The minimum = " + minValue(arr));
	}
	
	//creating a method
	static int maxValue(int[] arr) {
		
		//initialize the max value
		int max = arr[0];
		
		//performing for each loop
		for(int j : arr) {
			
			//check the condition
			if(j>max) {
				
				//storing the max value
				max = j;
			}
		}
		
		//returning max
		return max;
	}
	
	//creating a method
	static int minValue(int[] arr) {
		
		//initializing the min value
		int min = arr[0];
		
		//performing for each loop
		for(int j : arr) {
			
			//check the condition
			if(j < min) {
				
				//storing the min value
				min = j;
			}
		}
		
		//returning min
		return min;
	}
	

}
