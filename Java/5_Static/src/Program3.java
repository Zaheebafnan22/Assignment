//3.Print static variables in Instance methods
public class Program3 {

	public static void main(String[] args) {
		
		//creating an object
		Program3 myInstance = new Program3();
		
		//calling a method
		myInstance.instanceMethod();

	}
	
	//creating static variable
	private static int staticVariable = 10;
	
	//creating instance method and printing static variable
	public void instanceMethod() {
		
		//printing the statement
		System.out.println("Static variable value : "+staticVariable);
	}

}
