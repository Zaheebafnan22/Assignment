//6. Write a function to print your name and call the function from main method
import java.util.Scanner;

public class Program6 {

	
	public static void myName() {
		//creating the scanner class to take the input from the user
		Scanner scan = new Scanner(System.in);
		
		//Enter your name
		System.out.println("Enter your name : ");
		String name = scan.nextLine();
		
		//printing the name 
		System.out.println("My Name is "+name);
		
		
	}
	
	public static void main(String[] args) {
		
		//calling the function
		myName();
	}

}
