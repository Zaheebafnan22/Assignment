//17. Write a method to verify if the array contains two specified elements(12,23)

import java.util.Arrays;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		
		//creating an array
        int[] my_arr = {11, 22, 12, 33, 44, 23, 55};
        
        //creating scanner class to get value for the user
        Scanner sc = new Scanner(System.in);
        
        //printing the statement
        System.out.println("Enter value to verify n1 & n2 : ");
        
        //getting the value from the user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        //passing array and Elements to verify
        contains(my_arr, n1,n2);

	}
	
	//creating a method
	static void contains(int[] arr, int n1,int n2) {
		
		//creating the boolean values
        boolean num1 = false;
        boolean num2 = false;
        
        //performing for-each loop
        for (int i : arr) {
            
        	//checks if given element is present and returns true
            if (i == n1) {
            	
            	//assigning true
                num1 = true;
            }
            
            //checks if given element is present and returns true
            if (i==n2){
            	
            	//assigning true
                num2 = true;
            }
        }
        
        //checking the condition
        if (num1) {
        	
        	//printing the statement
            System.out.printf("Contains %d in the array", n1);
        } else {
        	
        	//printing the statement
            System.out.printf("\nDoesn't Contain %d in the array", n1);
        }
        
        //checking the condition
        if (num2) {
        	
        	//printing the statement
            System.out.printf("\nContains %d in the array", n2);
        } 
        
        else {
        	
        	//printing the statement
            System.out.printf("\nDoesn't Contain %d in the array", n2);
        }
        
        //printing the statement
        System.out.println("\nmy_arr[] = " + Arrays.toString(arr));
    }

}
