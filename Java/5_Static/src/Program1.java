//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
//6. Print all the static, instance variables in main method
//7. Call static methods and instance methods in main method

public class Program1 {

	public static void main(String[] args) {
		
		//static can be accessed within the same class
		//instance can be accessed using the object of the class
		
		//calling static variable
		staticVar1 = 10;
		staticVar2 = "Hello";
		
		//printing the statement
		System.out.println(staticVar1);
		System.out.println(staticVar2);
		
		//creating the object
		Program1 obj = new Program1();
		
		//calling the instance variable
		obj.instanceVar1 = 20;
		obj.instanceVar2 = "Java";
		
		//printing the statement
		System.out.println(obj.instanceVar1);
		System.out.println(obj.instanceVar2);
		
		//calling the static method
		staticMethod1();
		staticMethod2();
		
		//calling the instance method
		obj.instanceMethod1();
		obj.instanceMethod2();

	}
	
	//creating a static variable
	private static int staticVar1;
	private static String staticVar2;

	//creating a instance variable
	private int instanceVar1;
	private String instanceVar2;
	
	//creating a static method
	public static void staticMethod1() {
		System.out.println("This is a static method 1");
	}
	
	public static void staticMethod2() {
		System.out.println("This is a static method 2");
	}
	
	//creating a instance method
	public void instanceMethod1() {
		System.out.println("This is a instance method 1");
	}
	
	public void instanceMethod2() {
		System.out.println("This is a instance method 2");
	}
}
