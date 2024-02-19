//13. Write a method to find the second largest number in an array
//14. Write a method to find the second largest number in an array

import java.util.Arrays;

public class Program13 {

	public static void main(String[] args) {

		// creating an array
		int[] arr = { 10, 20, 30, 40, 50 };

		// printing the statement of all array
		System.out.println("The array = " + Arrays.toString(arr));

		//getting the method
		secondlargest(arr);

	}
	
	//creating a method
	static void secondlargest(int[] arr) {
		
		//initializing the value
		int temp;
        //performing outer loop
        for (int i = 0; i < arr.length; i++) {
            
        	//performing inner loop
            for (int j = i + 1; j < arr.length; j++) {
                
            	//checking the condition
            	if (arr[i] > arr[j]) {
            		
            		//storing the value to temp
                    temp = arr[i];
                    
                    //storing the value to arr[i]
                    arr[i] = arr[j];
                    
                    //storing the value to arr[j]
                    arr[j] = temp;
                }
            }
        }
        
        //printing the statement
        System.out.println("The second largest number in Array : " + arr[arr.length - 2]);
	}

}
