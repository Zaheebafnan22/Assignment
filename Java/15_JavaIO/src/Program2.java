//2. Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;
import java.io.OutputStream;


public class Program2 {

	public static void main(String[] args) {
		
		//creating a variable
		String data = "The text is writing in output stream";

		// creating try block and catch block
		try {

			// creating an object
			// FileInputStream is a subclass of Output Stream
			// file path passed as parameter to the FileOutputsStream constructor.
			OutputStream f = new FileOutputStream("Prog2");

			//converting the string into byte
			byte[] db = data.getBytes();
			
			//writing data to the output stream
			f.write(db);
			
			//printing the statement
			System.out.println("Data is written to the file");
		}

		catch (Exception e) {

			// prints the throwable Exception object as well as with other Information
			// like the line number where Exception occurs and class name where the
			// exception occurred.*/
			e.getStackTrace();
		}

	}

}
