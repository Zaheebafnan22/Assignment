//1. Create an interface with only one method and implement it in a class. Call the method implemented
//3. Use Interface instances to call the implemented method in the implemented class

//implement keyword to inherit from the interface
public class Program1 implements Programs1{

	public static void main(String[] args) {
		
		//creating an object
		Program1 inf = new Program1();
		
		//calling a method
		inf.myInterface();

	}

	//creating a implemented method
	@Override
	public void myInterface() {
		
		//printing the statement
		System.out.println("This is a interface");
		
	}

}
