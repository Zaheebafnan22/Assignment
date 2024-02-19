//4. Write a program with multiple catch blocks
//5. Write a program to throw exception with your own message

public class Program3 {

	public static void main(String[] args) {
		
		//creating try and multiple catch block
		try {
			
			//creating an array
			int[] a = {1, 2, 3, 4, 5};
			
			//Arithmetic Exception
			a[6] = 10 / 0;
			
			// ArrayIndexOutOfBounds Exception
			System.out.println(a[10]);
		}
		
		catch (ArithmeticException e) {
			
			//printing the statement
			System.out.println("Arithmetic Exception occurs");
			
			//calling the method
			e.getStackTrace();
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			//printing the statement
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			
			//calling the method
			e.getStackTrace();
		} 
		
		catch (Exception e) {
			
			//printing the statement
			System.out.println("Exception occurs");
			
			//calling the method
			e.getStackTrace();
		}
		

	}

}
