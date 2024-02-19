//16. Write a function to get the difference of largest and smallest value

import java.util.Arrays;

public class Program15 {

	public static void main(String[] args) {
		
		//creating an array
        int[] my_arr = {11, 22, 33, 44, 55};
        
        //printing the statement
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        
        //passing array to method to get difference
        difference(my_arr);

	}
	
	//creating a method
	static void difference(int[] arr) {

		//initializing the value
		int max = arr[0];
        int min = arr[0];
        int difference;
        
        //performing the for loop
        for (int i = 1; i < arr.length; i++) {
        	
            //Executes if value at index is larger
            if (arr[i] > max) {
            
            	//storing the value
            	max = arr[i];
            }
            
            //Executes if value at index is smaller
            else if (arr[i] < min) {
            	
            	//storing the value
                min = arr[i];
            }
        }
        
        //Difference of both max and min is assigned
        difference = max - min;
        
        
        //printing the statement of largest and smallest values
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
        
        //printing the statement of difference of largest and smallest value
        System.out.println("\nDifference of largest and smallest values : " + difference);

    }

}
