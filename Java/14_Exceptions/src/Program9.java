//12. Write a program to generate IOException

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program9 {

	public static void main(String[] args) {

		File file = new File("prog9");
		FileInputStream f = null;
		try {
			f = new FileInputStream(file);
			f.read();
			f.close();
		}
		
		// FileNotFoundException is a subclass of IOException.
		//IOExceptions are thrown when there is any input / output file operation issues
		catch (IOException e) {
			
			/*
			 * printStackTrace() prints the throwable Exception object as well as with other
			 * Information like the line number where Exception occurs and class name where
			 * the exception occurred.
			 */
			e.printStackTrace();
		}

	}

}
