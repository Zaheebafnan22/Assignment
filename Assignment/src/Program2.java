//2. Write a program to print your name

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Creating the scanner class to get the name input from the user
		Scanner scan = new Scanner(System.in);
		
		//Getting the name input from the user
		System.out.println("Enter your name : ");
		String name = scan.nextLine();
		
		//printing the name input from the user
		System.out.println(name);

	}

}
