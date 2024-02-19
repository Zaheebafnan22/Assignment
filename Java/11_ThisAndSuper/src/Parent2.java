
public class Parent2 {

	//creating a method 1
	void myMethod1() {
		
		//printing the statmenet
		System.out.println("This is a method 1 of parent class");
	}
	
	//creating the method 2
	void myMethod2() {
		
		//calling the method 1 using this keyword
		this.myMethod1();
	}
}
