//6. Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;


public class Program6 {

	public static void main(String[] args) {
		
		//creating a variable
				String data = "The text is writing in File Writer";

				// creating try block and catch block
				try {

					// creating an object
					// FileInputStream is a subclass of file writer
					// file path passed as parameter to the FileWriter constructor.
					FileWriter f = new FileWriter("Prog6");
					
					//writing data to the file writer
					f.write(data);
					
					//closing the file writer
					f.close();
					
					//printing the statement
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
