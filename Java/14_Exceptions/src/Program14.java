//17. Write a program to generate StringIndexOutOfBoundsException

public class Program14 {

	public static void main(String[] args) {
		
		//creating the string and storing the value
		String str = "Arman mallik";
		
		//creating try catch block to handle the exception
        try {
        	
            // Trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1);
            
            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11);    
            
            //printing the statement
            System.out.println(charAtNegativeIndex);
            System.out.println(charAtLengthIndex);
        } 
        
        /* StringIndexOutOfBoundsException :
        It is thrown by String class methods to indicate that an index is
        either negative or greater than the size of the string */
        catch (StringIndexOutOfBoundsException e) {
        	
        	//printing the statement
            System.out.println("StringIndexOutOfBoundsException caught");
            
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }

	}

}
