//4. Write text to a .txt file using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Program4 {

	public static void main(String[] args) {

		// creating a variable
		String data = "This is a buffered output stream";

		// creating try block and catch block
		try {

			// creating an object
			// FileInputStream is a subclass of output Stream
			// file path passed as parameter to the FileOutputStream constructor.
			OutputStream f = new FileOutputStream("Prog4");

			// creating an object
			// creating a buffered outpur stream
			BufferedOutputStream b = new BufferedOutputStream(f);

			// converting the string into byte
			byte[] db = data.getBytes();

			// writing data to the output stream
			f.write(db);

			// printing the statement
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
