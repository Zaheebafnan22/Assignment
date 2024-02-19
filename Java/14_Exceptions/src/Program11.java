//14. Write a program to generate NoSuchMethodException

import java.lang.reflect.Method;

public class Program11 {

	public static void main(String[] args) {

		//creating try catch block to handle the exception
		try {
			
			//if find the package if its not present it will throw an error
			Class c = Class.forName("com.exceptions.Ex");
			
			// There is no subtraction() method in class Ex
			Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
		}
		
		// Throws NoSuchMethodException
		catch (NoSuchMethodException | ClassNotFoundException e) {
			
			/*
			 * printStackTrace() prints the throwable Exception object as well as with other
			 * Information like the line number where Exception occurs and class name where
			 * the exception occurred.
			 */
			e.printStackTrace();
		}

	}

}
