/*8. Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some class
 *  and print the values of the interface fields and call the interface methods
 */

//implement keyword to inherit from the interface
public class Program7 implements Programs7{

	public static void main(String[] args) {
		
		//creating an object
		Program4 inf = new Program4();
		
		//printing the statement
		System.out.println(val);
		
		//calling a method
		inf.myMethod();

	}

	//creating a implemented method
		@Override
		public void myMethod() {
			
			//printing the statement
			System.out.println("This is a method");
			
		}

}
