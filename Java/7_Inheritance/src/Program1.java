/*1. A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B. 
Create three methods in each class, 2 methods are specific to each class and third 
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main 
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
process only for data members*/


public class Program1 {

	public static void main(String[] args) {
		
		//creating an object for A
		A objA = new A();
		
		//creating an object for B
		B objB = new B();
		
		//creating an object for C
		C objC = new C();
		
		//calling a method of A
		objA.methodA1();
		objA.methodA2();
		objA.overrideMethod();
		
		//calling a method of B
		objB.methodB1();
		objB.methodB2();
		objB.overrideMethod();
		
		//calling a method of c
		objC.methodC1();
		objC.methodC2();
		objC.overrideMethod();
		System.out.println();
		
		//calling overridden method with super class reference
		System.out.println("Created overriden method");
		
		//creating an object
		//upcasting
		A superB = new B();
		
		//calling a method
		superB.overrideMethod();
		
		//creating an object
		//upcasting
		A superC = new C();
		
		//calling a method
		superC.overrideMethod();

	}

}
