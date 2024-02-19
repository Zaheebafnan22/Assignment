//4. Write a function to test if array contains a specific value

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		// created scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        
        //asking the user to enter the size of the array
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        
        //storing the size in the array
        int[] arr = new int[size];
        
        System.out.println("Enter elements for the array");
        //storing the element 
        for(int i=0; i<size; i++) {
        	System.out.println("Element " + (i+1)  + " is : ");
        	arr[i] = scan.nextInt();
        }
        
        // asking the target element to find from the user
        System.out.print("Enter the target element to find: ");
        int targetElement = scan.nextInt();

        // calling the method
        boolean result = findElement(arr, targetElement);

        // printing the result
        if(result) {
            System.out.println("Array contains the value " + targetElement);
        } else {
            System.out.println("Array don't contains the value " + targetElement);
        }

	}
	
	//creating the method
	public static boolean findElement(int[] arr, int target) {
		
		//checking the condition
		for(int value: arr) {
			
			//if the value is equal return
			if(value == target) {
				
				//return true if it present
				return true;
			}
		}
		
		//return false if its not present
		return false;
	}


}
