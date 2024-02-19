//5. Write a program to read text from .txt file using FileReader

import java.io.FileReader;

public class Program5 {

	public static void main(String[] args) {
		
		//creating try block and catch block 
				try {
					
					//creating an object
					// FileInputStream is a subclass of file reader
		            //file path passed as parameter to the FileReader constructor.
					FileReader f = new FileReader("Prog5");
					
					//creating a data type
					int i;
					
					//performing the loop
					//If the read() method returns -1, then there is no more data to read in the File reader
					while((i = f.read()) != -1) {
						
						//printing the statement
						System.out.print((char) i);
					}
					
					//closing the File reader
					f.close();
				}
				
				catch(Exception e) {
					
					//prints the throwable Exception object as well as with other Information
		            //like the line number where Exception occurs and class name where the exception occurred.*/
					e.printStackTrace();
				}

	}

}
