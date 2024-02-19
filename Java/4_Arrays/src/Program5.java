//5. Write a function to remove a specific element from an array

import java.util.Scanner;
import java.util.Arrays;

public class Program5 {

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
        
        //calling method
        int[] newArray = removeElement(arr, targetElement);
        
        //printing the original array
        System.out.println("Original Array : "+ Arrays.toString(arr));
        
        //printing the removed array
        System.out.println("Array after removing " + targetElement + ": " + Arrays.toString(newArray));

	}
	
	//creating a method
	public static int[] removeElement(int[] arr, int target) {
		
		// checking if the target element is present in the array
		int index = -1;
		
		//checking the condition
		for(int i = 0; i<arr.length;i++) {
			if (arr[i] == target) {
				
				//storing the value in index
                index = i;
                
                //breaking to exit
                break;
            }
		}
		
		// If the target element is not found, return the original array
        if (index == -1) {
        	
        	//return if found
            return arr;
        }
        
        // Creating  new array with size reduced by 1
        int[] newArray = new int[arr.length - 1];

        // Copy elements before the target index
        System.arraycopy(arr, 0, newArray, 0, index);

        // Copy elements after the target index
        System.arraycopy(arr, index + 1, newArray, index, arr.length - index - 1);

        //return newArray
        return newArray;
	}

}
