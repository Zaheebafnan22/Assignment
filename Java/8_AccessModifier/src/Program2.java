//2. Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package

public class Program2 {

	public static void main(String[] args) {
		
		// creating an object
		Program2method obj = new Program2method();
		
		//calling a name from obj and assign the name
		obj.name="Zaheeb Afnan";
		
		//calling a age from obj and assign the age
		obj.age=21;
		
		//calling a default method
		obj.defaultMethod();

	}

}
