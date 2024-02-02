//1. How to create a class, object, method and its signature
import java.util.Scanner;

//create class
public class Program1 {

	public static void main(String[] args) {
		// Creating scanner class to take input from the user
        Scanner scan = new Scanner(System.in);
        
        //Take the first input from the user
        System.out.println("Enter first number : ");
		int num1 = scan.nextInt();
		
		//Take the second input from the user
        System.out.println("Enter second number : ");
		int num2 = scan.nextInt();
		
		//creating an object
		CreateObject obj = new CreateObject();
		
		//creating a method
		//Sending the argument to the parameter
		//Getting the value of a and b from create object and storing it in the result
		int result = CreateObject.getValue(num1,num2);
		
		//Print the result
		System.out.println(result);
		

	}

}
