//12. Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		//creating a scanner class to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character (M/F) : ");
		
		//getting the input from the user
	    char gender = scan.next().charAt(0);
	    
	    //Check the gender
	    switch (gender) {
	    
	    // if the user click the capital M
        case 'M':
        	
        	//print the statement
            System.out.println("Gender is Male");
            
            //break to exit
            break;
            
        // if the user click the capital F
        case 'F':
        	
        	//print the statement
            System.out.println("Gender is Female");
            
            //break to exit
            break;
        
        // if the user click the wrong character
	    default:
	    	//print the statement
	    	System.out.println("Give the correct Character or f and m in capital");
	    	
	    	//break to exit
	    	break;
	    }
		
	}

}
