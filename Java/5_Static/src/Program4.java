//4. Call instance methods in static methods

public class Program4 {

	public static void main(String[] args) {
		
		// calling a method
		staticMethod();

	}
	
	//creating a instance variable
	private int instanceVariable;
	
	//creating a instance method
	public void instanceMethod(int value) {
		
		//value outside the method = value inside the method
		this.instanceVariable = value;
	}
	
	public static void staticMethod() {
		
		//creating a object
		Program4 myInstance = new Program4();
		
		//sending the value to instance method
		myInstance.instanceMethod(42);
		
		//printing the statement
		System.out.println("Instance Variable Value : " +myInstance.instanceVariable);
	}

}
