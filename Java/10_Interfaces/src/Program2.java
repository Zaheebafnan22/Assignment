//2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

//implement keyword to inherit from the interface
public class Program2 implements Programs2{

	public static void main(String[] args) {
		
		//creating an object
		Program2 inf = new Program2();
		
		//calling a method
		inf.myMethod1();
		inf.myMethod2();

	}

	//creating a implemented method
	@Override
	public void myMethod1() {
		
		//printing the statement
		System.out.println("First Method");
		
	}

	//creating a implemented method
	@Override
	public void myMethod2() {
		
		//printing the statement
		System.out.println("Second Method");
		
	}

}
