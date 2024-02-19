/*5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class.
 *  Call the method.
*/

//implement keyword to inherit from the interface
public class Program4 implements Programs4, Programes4{

	public static void main(String[] args) {
		
		//creating an object
		Program4 inf = new Program4();
				
		//calling a method
		inf.myMethod();

	}

	//creating a implemented method
	@Override
	public void myMethod() {
		
		//printing the statement
		System.out.println("Same method in both the interface");
		
	}

}
