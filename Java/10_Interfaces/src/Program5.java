/*6. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and 
 * call the method.
*/

//implement keyword to inherit from the interface
public class Program5 implements Programs5{

	public static void main(String[] args) {
		
		//creating an object
		Program5 inf = new Program5();
						
		//calling a method
		inf.myMethod();

	}

}
