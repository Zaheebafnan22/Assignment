//9. Write a program to find the prime or not.

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		//creating a scanner class to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
				
		//getting the input from the user
		int num = scan.nextInt();
				
		primeNumber(num);
	}
	
	static void primeNumber(int num) {
		
		boolean isPrime = false;
		
		//checking the condition using from loop
		//initializing, checking condition, incrementing
		for(int i=2; i<=num/2; i++) {
			
			//checking the condition if the number is divisible by 2 or not
			if(num%i == 0) {
				
				//if its true then break
				isPrime = true;
				
				//break to exit
				break;
				
				//The number should be divisible by 1 or itself is a primenumber
			}
		}
		
		//checking the condition is true of false
		if(!isPrime) {
			
			//print the statement is true
			System.out.println(num + " is a prime number");
		}
		else {
			
			//printing the statement is false
			System.out.println(num + " is not a prime number");
		}
	}

}
