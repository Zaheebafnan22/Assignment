//8. Write text to a .txt file using BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program8 {

	public static void main(String[] args) {

		// creating a variable
		String data = "This is a buffered writer and file writer";

		// creating try block and catch block
		try {

			// creating an object
			// FileInputStream is a subclass of FileWriter
			// file path passed as parameter to the File writer constructor.
			FileWriter f = new FileWriter("Prog8");

			// creating an object
			// creating a buffered writer
			BufferedWriter b = new BufferedWriter(f);

			// writing data to the output stream
			f.write(data);

			//closing
            b.close();
            f.close();
            
			// printing the statement
			System.out.println("Data is written to the file");
		}

		catch (Exception e) {

			// prints the throwable Exception object as well as with other Information
			// like the line number where Exception occurs and class name where the
			// exception occurred.*/

			e.printStackTrace();
		}

	}

}
