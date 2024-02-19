//9. Write a program to generate ArrayIndexOutOfBoundException

public class Program6 {

	public static void main(String[] args) {

		//creating an array
		String[] arr = { "Arjun", "Amit", "Aarav", "Aham" };
		
		//creating try catch block to handle the exception
		// ArrayIndexOutOfBoundException because there is no 5th index
		try {
			
			//printing the statement
			System.out.println(arr[5]);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			//printing the statement
			System.out.println("ArrayIndexOutOfBoundsException caught");
			
			/*
			 * printStackTrace() prints the throwable Exception object as well as with other
			 * Information like the line number where Exception occurs and class name where
			 * the exception occurred.
			 */
			e.printStackTrace();
		}

	}

}
