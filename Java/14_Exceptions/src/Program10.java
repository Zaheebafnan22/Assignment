//13. Write a program to generate NoSuchFieldException
public class Program10 {

	//creating a class
    static class MyClass {
    	
    	//creating a field
        public int myField;
    }

    public static void main(String[] args) {
    	
    	//creating try catch block to handle the exception
        try {
        	
            // Attempt to access a non-existing field
            MyClass.class.getDeclaredField("nonExistingField");
        } 
        
        catch (NoSuchFieldException e) {
        	
            //printing the statement and Handle the exception
            System.out.println("NoSuchFieldException caught!");
            
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }

}
