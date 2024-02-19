//1. How to create a class, object, method and its signature

//creating a class
public class Program1 {

	public static void main(String[] args) {
		// Creating a object
		Program1 obj = new Program1();
		
		//calling a method
		obj.isMethod();
	}
	
	//creating a method and its signature
	void isMethod() {
		String a = "Hello Java";
		System.out.println(a);
	}

}
