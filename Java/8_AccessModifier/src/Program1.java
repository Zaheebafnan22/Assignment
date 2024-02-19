/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class*/

public class Program1 {

	public static void main(String[] args) {
		
		// creating a object
		Program1 obj = new Program1();
		
		//calling the private name
		System.out.println(obj.name);
		
		//calling the private age
		System.out.println(obj.age);
		
		//calling the private method
		obj.pMethod();

	}
	
	//creating the private name
	private String name = "Zaheeb Afnan";
	
	//creating the private age
	private int age = 21;
	
	//creating the private method
	private void pMethod() {
		System.out.println("My Name is "+name+ " and my age is "+age);
	}
	
	//sub class do not inherit the private member of the its parent class

}
