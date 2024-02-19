//10. Write a program to palindrome or not.

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		//creating a scanner class to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		//getting the input from the user
		int num = scan.nextInt();
		
		//checking the condition by calling a method
		if (palindromeNumber(num)) {
			
			//printing the statement if the condition is true
            System.out.println(num + " is a Palindrome Number");
        } else {
        	
        	//printing the statement if the condition is false
            System.out.println(num + " is not a Palindrome Number");
        }

	}
	
	//creating a method
	static boolean palindromeNumber(int num) {
		
		//creating the value of r, sum and temp to perform the palindrome
		int r;
		int sum = 0;
		
		//assigning the the num to temp
		int temp = num;
		
		//checking if the condition is true
		while(num > 0) {
			
			//storing the num mod 10 in r
			r = num % 10;
			
			//multiplying the sum * 10 and adding the r 
			sum = (sum * 10) + r;
			
			//dividing the num with 10 it will split the number
			num = num/10;
		}
		
		//returning if the temp and sum or equal
		return temp == sum;
	}

}
