//6. Write a program to create your own exception

public class Program4 {

	public static void main(String[] args) {
		
		//creating try and catch block to handle the exception
		try {
			
            //sending marks to the method
            exam(39);
        } 
		
		catch (Exception e) {
			
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }

	}
	
	//creating a method
    static void exam(int marks) throws Prog4 {
    	
        //checking the condition
        if (marks < 40) {
        	
            //creating prog4  is our own custom exception
            throw new Prog4("Failed in exam");
        } 
        
        else {
        	
        	//printing the statement
            System.out.println("Passed in exam");
        }
    }

}
