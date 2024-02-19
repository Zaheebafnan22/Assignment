//16. Write a program to generate NumberFormatException

public class Program13 {

	public static void main(String[] args) {

		//creating the string and storing the value
        String str = "123ABC";
        
        //creating try catch block to handle the exception
        try {
        	
            // Converting string with inappropriate format
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
            
            //printing the statement
            System.out.println(x);
            System.out.println(y);
        } 
        
        /* NumberFormatException :
        This exception is raised when a method could not convert a string into a numeric format. */
        catch (NumberFormatException e) {
        
        	//printing the statement
        	System.out.println("NumberFormatException caught!");
            
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
