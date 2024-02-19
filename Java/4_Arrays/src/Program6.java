//6. Write a function to copy an array to another array
import java.util.Scanner;
import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {
		
		//Creating scanner class to get the input from the user
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of element to store : ");
        //asking the user input to store the number of element
        int n = scan.nextInt();
        
        System.out.println("Enter the element");
        
        //storing the the user input in the arr
        int[] arr = new int[n];
        
        //performing the loop
        for(int i=0; i<n; i++) {
        	
        	//printing the statement
        	System.out.println("arr elemeng of "+i);
        	
        	//getting the new user input to store the element
        	arr[i] = scan.nextInt();
        }
        
        //printing the element 
        System.out.println("Before coping " + Arrays.toString(arr));
        
        //calling a method
        copyingArray(arr);
	}

	//creating a method
	static void copyingArray(int[] arr) {
		
		//storing the array element in the copy
		int[] copy = arr;
		
		//printing the statement
		System.out.println("Array after copying : " +Arrays.toString(arr));
	}
}
