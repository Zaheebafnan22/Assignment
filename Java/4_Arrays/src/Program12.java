//12. Write a method to remove duplicate elements from an array
//18. Write a program to remove the duplicate elements and return the new array

import java.util.Arrays;

public class Program12 {

	public static void main(String[] args) {

		//creating an array
		int[] arr = { 11, 22, 22, 33, 44, 44, 55, 66 };
		
		// Printing the statement
		System.out.println("arr[] = " + Arrays.toString(arr));
		
		//initializing the lenght of arr
		int n = arr.length;
		
		//sending array and array length to method
		n = removerDuplicate(arr, n);
		
		// Printing the statement
		System.out.println("Array after removing duplicate values : ");
		
		//checking the condition
		for (int i = 0; i < n; i++) 
		{
			
			//printing the statement
			System.out.print(arr[i] + " ");
		}
	}
	
	//creating a method
	static int removerDuplicate(int[] arr, int n) {
		
		//checking the condition
        if (n == 0 || n == 1) {
        	
        	//returning the value of n
            return n;
        }
        // creating another array for only storing the unique elements
        int[] temp = new int[n];
        
        //initializing the value for j
        int j = 0;
        
        //performing the for loop condition
        for (int i = 0; i < n - 1; i++) {
        	
        	//checking the condition
            if (arr[i] != arr[i + 1]) {
            	
            	//storing the value
                temp[j++] = arr[i];
            }
        }
        
        //storing the value
        temp[j++] = arr[n - 1];
        
        //performing the condition by changing the original array
        for (int i = 0; i < j; i++) {
        	
        	//storing the value
            arr[i] = temp[i];
        }
        
        //returning the value
        return j;
    }

}
