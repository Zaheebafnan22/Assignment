//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
public class Program5 {

	public static void main(String[] args) {
		
		Program5 obj = new Program5();
		
		//printing a global variable
		System.out.println("Global variable : "+obj.a);
		obj.localVariable();
		

	}
	
	//Creating a global variable
	int a = 50;
	
	void localVariable() {
		
		//creating a local variable
		int a = 40;
		
		//printing a local variable
		System.out.println("Local variable : "+a);
	}

}
