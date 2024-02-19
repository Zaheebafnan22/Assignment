//1. Write a program to generate Arithmetic Exception without exception handling
//2. Handle the Arithmetic exception using try-catch block
//8. Write a program to generate Arithmetic Exception

public class Program1 {

	public static void main(String[] args) {
		
		//creating a variable
		int a = 10;
		int b = 0;
		
		//creating try catch block to handle the exception
		try {
			
			//printing the statement
			System.out.println("Inside try block");
			
			//performing the task
			int c = a/b;
			
			//printing the statement
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			
			//printing the statement
			System.out.println("Handling exception in try catch");
			
			/* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
			e.printStackTrace();
		}
		
		
		//performing the task with out exception handling
		//int c=a/b;   //it will throw an error
		
		//printing the statement
		//System.out.println("Handling exception without try catch");

	}

}
