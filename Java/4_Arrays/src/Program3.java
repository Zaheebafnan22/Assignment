//3. Write a program to find the index of an array element
import java.util.Scanner;
public class Program3 {

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
        int result = findElement(arr, targetElement);

        // printing the result
        if (result != -1) {
            System.out.println("Index of " + targetElement + " in the array: " + result);
        } else {
            System.out.println(targetElement + " not found in the array.");
        }

	}
	
	//creating the method
	public static int findElement(int[] arr, int target) {
		
		//checking the condition
		for(int i = 0; i<arr.length;i++) {
			
			//if the value is equal return 
			if(arr[i] == target) {
				
				//return the value
				return i;
			}
		}
		
		//return the value
		return -1;
	}

}
