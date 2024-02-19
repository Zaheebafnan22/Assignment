//11. Program to check whether a number is EVEN or ODD using switch


import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		//creating a scanner class to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
				
		//getting the input from the user
		int num = scan.nextInt();
	
		//checking the condition
		switch(num%2) {
		
		//if the remainder is 0 
		case 0:
			
			//print the statement
			System.out.println(num + " is a even number");
			
			//break to exit
			break;
		
		//if the remainder is 1
		case 1:
			
			//print the statement
			System.out.println(num + " is a odd number");
			
			//break to exit
			break;
		}
	}

}
