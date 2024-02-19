//7. Write a function to insert an element at a specific position in the array

import java.util.Arrays;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		//creating scanner class to get the user input
		Scanner scan = new Scanner(System.in);
		
		//creating an array
		int[] arr = {11,22,33,44,55,66,77,88,99};
		
		//printing the statement
		System.out.println("Original Array : " + Arrays.toString(arr));
		
		System.out.println("Enter the index number");
		
		//get the index from the user to print the number
		int index = scan.nextInt();
		
		System.out.println("Enter the value to insert at index : " + index);
		
		//get the element from the user to print 
		int elem = scan.nextInt();
		
		//calling a method
		insertElement(arr, index, elem);
		
		//printing the statement
		System.out.println("Array after inserting element : " + Arrays.toString(arr));

	}
	
	//creating a method
	static void insertElement(int[] arr, int index, int elem) {
		
		//performing a loop
		for(int i=arr.length; i<=index; i--) {
			
			//inserting the element in the specific position
			arr[i] = arr[i - 1];
			
		}
		
		//storing the elem in the arr[index]
		arr[index] = elem;
	}

}
