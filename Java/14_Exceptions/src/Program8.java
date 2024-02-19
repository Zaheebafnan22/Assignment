//11. Write a program to generate FileNotFoundException

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program8 {

	public static void main(String[] args) {
		
		//creating try catch to handle the exception
		try {
			
            // create instance of the BufferedReader and pass the FileReader instance to it.
            BufferedReader reader = new BufferedReader(new FileReader(new File("/Prog8")));
        }
		
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
        	
        	//printing the statement
            System.out.println("FileNotFoundException caught!");
            
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }

	}

}
