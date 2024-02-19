//7. Read text from a .txt file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;


public class Program7 {

	public static void main(String[] args) {
		
		//creating try block and catch block 
		try {
			
			//creating an object
			// FileInputStream is a subclass of file reader
            //file path passed as parameter to the File reader constructor.
			FileReader f = new FileReader("Prog7");
			
			//creating an object
			//creates a buffered reader
			BufferedReader b = new BufferedReader(f);
			
			//creating a data type
			int i;
			
			//performing the loop
			//If the read() method returns -1, then there is no more data to read in the buffered reader
			while((i = b.read()) != -1) {
				
				//printing the statement
				System.out.print((char) i);
			}
			
			//closing the File input stream and buffered reader
			b.close();
			f.close();
		}
		
		catch(Exception e) {
			
			//prints the throwable Exception object as well as with other Information
            //like the line number where Exception occurs and class name where the exception occurred.*/
			e.printStackTrace();
		}



	}

}
