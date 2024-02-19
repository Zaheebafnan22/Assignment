//15. Write a program to generate NullPointerException

public class Program12 {

	public static void main(String args[]) {

		//creating null value and storing in input
		String str = null;

		//creating try catch block to handle the exception
		try {
			
			//getting a value from the method
			simpleNullCheck(str);
		} 
		
		
		/* NullPointerException :
		This exception is raised when referring to the members of a null object. Null represents nothing */
		catch (NullPointerException e) {
			
			//printing the statement
			System.out.println("NullPointerException caught!");
			
			/*
			 * printStackTrace() prints the throwable Exception object as well as with other
			 * Information like the line number where Exception occurs and class name where
			 * the exception occurred.
			 */
			e.printStackTrace();
		}
	}

	// we are trying to perform the length() operation on str which is null
	static void simpleNullCheck(String str) {
		
		//printing the statement
		System.out.println(str.length());
	}

}
