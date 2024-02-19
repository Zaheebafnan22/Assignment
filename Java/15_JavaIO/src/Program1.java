//1. Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;
import java.io.InputStream;

public class Program1 {

	public static void main(String[] args) {
		
		//creating try block and catch block 
		try {
			
			//creating an object
			// FileInputStream is a subclass of InputStream
            //file path passed as parameter to the FileInputStream constructor.
			InputStream f = new FileInputStream("Prog1");
			
			//creating a data type
			int i;
			
			//performing the loop
			//If the read() method returns -1, then there is no more data to read in the FileInputStream
			while((i = f.read()) != -1) {
				
				//printing the statement
				System.out.print((char) i);
			}
			
			//closing the File input stream
			f.close();
		}
		
		catch(Exception e) {
			
			//prints the throwable Exception object as well as with other Information
            //like the line number where Exception occurs and class name where the exception occurred.*/
			e.getStackTrace();
		}

	}

}
