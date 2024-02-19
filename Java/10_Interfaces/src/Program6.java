//7. Create an interface and inherit it from the other interface.

//implement keyword to inherit from the interface
public class Program6 implements Programes6{

	public static void main(String[] args) {
		
		//creating an object
		Program6 inf = new Program6();
				
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
