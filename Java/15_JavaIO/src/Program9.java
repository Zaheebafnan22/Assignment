//9. Write a program to read data from properties file.
//10. Write a program to read data from excel


import java.io.FileInputStream;
import java.util.Properties;

public class Program9 {

	public static void main(String[] args) {

		//creating a property object
		Properties p = readPeopertiesFile("Prog9");
		
		//printing the statement and calling the values from the prog9 file
		System.out.println("Name: " + p.getProperty("Name"));
		System.out.println("E.no: " + p.getProperty("E.no"));
		System.out.println("College: " + p.getProperty("College"));

	}

	public static Properties readPeopertiesFile(String fileName) {

		//creating a variable for property
		Properties p = null;
		
		// TODO Auto-generated method stub
		// creating try block and catch block
		try {

			// creating an object
			// FileInputStream is a subclass of InputStream
			// file path passed as parameter to the FileInputStream constructor.
		    FileInputStream f = new FileInputStream(fileName);
			
		    //creating a object
		    p = new Properties();
		    
		    //loading a data 
			p.load(f);

			// closing the File input stream
			f.close();
		}

		catch (Exception e) {

			// prints the throwable Exception object as well as with other Information
			// like the line number where Exception occurs and class name where the
			// exception occurred.*/
			e.getStackTrace();
		}
		
		//return the value of p
		return p;
	}

}
