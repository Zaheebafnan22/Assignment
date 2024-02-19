//4. Create two interfaces with one method each. Implement these two interfaces in one class. 

//implement keyword to inherit from the interface
public class Program3 implements Programs3, Programes3{

	public static void main(String[] args) {
		
		//creating an object
		Program3 inf = new Program3();
				
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
