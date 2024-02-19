//7. Write a program with finally block

public class Program5 {

	public static void main(String[] args) {

		// creating a variable
		int a = 10;
		int b = 0;

		// using try catch finally block to handle the exception
		try {

			// printing the statement
			System.out.println("Inside try block");

			// performing the task
			int c = a / b;

			// printing the statement
			System.out.println(c);
		}

		catch (ArithmeticException e) {

			// printing the statement
			System.out.println("Handling exception in try catch");
			e.printStackTrace();
		}
		
		finally {
			
			//printing the statement
			System.out.println("Finally block is always executed");
		}

	}

}
