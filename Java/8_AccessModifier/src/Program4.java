/*4. Create a class with PUBLIC fields and methods. 
Access the public methods and fields from any class in the same package or different 
package.*/

public class Program4 {

	public static void main(String[] args) {
		
		//created an object
		Program4method obj = new Program4method();
		
		//calling a name and assign the name for method
		obj.name="Zaheeb Afnan";
		
		//calling a public method
		obj.publicMethod();

	}

}
