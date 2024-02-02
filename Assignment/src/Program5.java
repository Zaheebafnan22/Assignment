//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables

import java.util.Scanner;

public class Program5 {
	//creating the scanner class to get input from the user
	Scanner scan= new Scanner(System.in);
	
	//Getting the input for the global variable which can be accessed by any function present in the program 
	private int my_variables = scan.nextInt();
	
	public void vari() {
		System.out.println("Enter the local variable : ");
		
		//Getting the input for the local variable which access only that particular function 
		int my_variables = scan.nextInt();
		
		//printing the local variable
		System.out.println("Local Variable : " +my_variables);
		
		//printing the global variable
		System.out.println("Global Variable : " +this.my_variables);
	}

	public static void main(String[] args){
		System.out.println("Enter the Global variable");
		
		//Creating the object
		Program5 result = new Program5();
		
		//Calling the function
		result.vari();
		
		
		

	}

}
