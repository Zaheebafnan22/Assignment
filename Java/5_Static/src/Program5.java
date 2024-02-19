//5. Call static methods in instance methods

public class Program5 {

	public static void main(String[] args) {
		
		// creating an object
		Program5 myInstance = new Program5();
		
		//calling a instance method
		myInstance.instanceMethod();

	}
	
	//creating a static variable
	private static int staticVariable = 50;
	
	//crating a instance method
	public void instanceMethod() {
		
		//calling the static method
		int result = multiplyByTwo(staticVariable);
		
		//printing the statement
		System.out.println("Results after calling static method : " + result);
	}
	
	//creating a static method
	public static int multiplyByTwo(int value) {
		
		//returning the value
		return value*2;
	}

}
