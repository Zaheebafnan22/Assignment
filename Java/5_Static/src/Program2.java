//2. Print instance variables in static methods

public class Program2 {

	public static void main(String[] args) {
		
		//creating an object
		Program2 myInstance = new Program2();
		
		//calling instance variable
		myInstance.myVariable = 45;
		
		//calling static method
		staticMethod(myInstance);
		
	}
	
	//creating instance variable
    private int myVariable;
	
    //creating static methods and printing instance variables
	public static void staticMethod(Program2 instance) {
		
		//printing the statement
		System.out.println("Instance Variable value : "+instance.myVariable);
	}
	
	

}
