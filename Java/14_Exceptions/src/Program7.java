//10. Write a program to generate ClassNotFoundException

public class Program7 {

	public static void main(String[] args) {

		//creating try catch to block to handle the exception
		try {
			
			//if find the package if its not present it will throw an error
			Class.forName("com.exceptions.ex");
			
			//if find the package using system class loader if its not present it will throw an error
			ClassLoader.getSystemClassLoader().loadClass("com.exceptions.ex");

		} 
		
		catch (ClassNotFoundException e) {
			
			/*
			 * printStackTrace() prints the throwable Exception object as well as with other
			 * Information like the line number where Exception occurs and class name where
			 * the exception occurred.
			 */
			e.printStackTrace();
		}

	}

}
