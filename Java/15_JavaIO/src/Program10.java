//11. Write a program to write data to excel

import java.io.FileOutputStream;
import java.util.Properties;

public class Program10 {

	public static void main(String[] args) {

		//creating try block and catch block 
		try {

			//creating an object for properties
			Properties p = new Properties();
			
			//putting the data in the file
			p.put("Name", "Amit");
			p.put("E.no", "102");
			p.put("College", "NIT");

			//creating an object
			// FileInputStream is a subclass of InputStream
            //file path passed as parameter to the FileInputStream constructor.
			FileOutputStream f = new FileOutputStream("Prog10");
			
			//storing the property
			p.store(f, "This is a properties");
			
			//printing the statement
			System.out.println("Data is stored");
		}

		catch (Exception e) {
			
			// prints the throwable Exception object as well as with other Information
			// like the line number where Exception occurs and class name where the
		    // exception occurred.*/
			e.printStackTrace();
		}

	}

}
