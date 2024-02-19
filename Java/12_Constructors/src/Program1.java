//1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to 
//call all the constructors of that class from a main class

public class Program1 {
	
	public static void main(String[] args) {
		
		//creating the object for default constructor
		Parent1 p1 = new Parent1();
		
		//creating the object for one argument constructor
		Parent1 p2 = new Parent1(11);
		
		//creating the object for the two argument constructors
		Parent1 p3 = new Parent1("Zaheeb","CSE");
		
	}
}
