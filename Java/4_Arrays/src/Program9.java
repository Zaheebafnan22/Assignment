//9. Write a function to reverse an array of integer values

import java.util.Arrays;

public class Program9 {

	public static void main(String[] args) {
		
		//creating an array
		int[] arr = {10,20, 30, 40 ,50};
		
		//printing the statement of all array
		System.out.println("The array = " + Arrays.toString(arr));
		
		//sending the method
		reverseArray(arr);

	}
	
	//creating a method
	static void reverseArray(int[] arr) {
		
		//initializing the value
		int[] My_arr = new int[arr.length];
		
		//storing the arr length
		int j = arr.length;
		
		//performing for each loop
		for(int i : arr) {
			
			//storing the i value
			My_arr[j-1] = i;
			
			//storing the value in j
			j = j-1;
		}
		
		//printing the statement 
		System.out.println("Reversed array = " + Arrays.toString(My_arr));
	}

}
