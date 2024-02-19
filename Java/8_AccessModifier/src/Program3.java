/*3. Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package. 
Also, Access the PROTECTED fields and methods from child class located in a different package
Access the PROTECTED fields and methods from any class in different package*/

public class Program3 {

	public static void main(String[] args) {
		
		//creating a object 
		Program3method obj = new Program3method();
		
		//calling a name and assign the name for protected
		obj.name="Zaheeb Afnan";
		
		//calling a protected method
		obj.protectedMethod();

	}

}
