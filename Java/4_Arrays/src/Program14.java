//15. Write a method to find number of even number and odd numbers in an array

import java.util.Arrays;

public class Program14 {

	public static void main(String[] args) {
		
		//storing the value of array
        int[] arr = {11, 22, 33, 44, 55};
        
        //printing the element
        System.out.println("a[] = " + Arrays.toString(arr));
        
        //passing array to method to get even numbers
        evenNumber(arr);
        System.out.println();
        
        //passing array to method to get odd numbers
        oddNumber(arr);

	}

	//creating a method 
	static void evenNumber(int[] arr) {
		
		//printing the statement
        System.out.print("Even numbers in array : ");
        
        //performing for each loop
        for (int i : arr) {
        	
            //checking the condition
            if (i % 2 == 0) {
            	
            	//printing the statement
                System.out.print(i + "  ");
            }
        }
    }

    //creating a method
    static void oddNumber(int[] arr) {
    	
    	//printing the statement
        System.out.print("Odd numbers in array : ");
        
        //performing for each loop
        for (int j : arr) {
            
        	//checking the condition
            if (j % 2 != 0) {
        
            	//printing the statement
            	System.out.print(j + "  ");
            }
        }
    }

}
