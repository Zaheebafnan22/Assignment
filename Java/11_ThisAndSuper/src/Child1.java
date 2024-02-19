
//extending the parent class in chile class
public class Child1 extends Parent1{
	
	//creating a instance variable
	String name="Afnan";
	
	//creating a constructor
	Child1(){
		
		//calling constructor of a parent class
		super();
		
		//printing a statement
		System.out.println("This is child class constructor");
	}
	
	//creating a method
	void myMethod() {
		
		//printing a statement of the parent class using super
		System.out.println("My name is "+super.name);
	}
}
