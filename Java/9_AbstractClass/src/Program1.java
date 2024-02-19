/*1. Create an abstract class with abstract and non-abstract methods
 * 2. Create a sub class for an abstract class. Create an object in the child class for the 
abstract class and access the non-abstract methods
3. Create an instance for the child class in child class and call abstract methods
4. Create an instance for the child class in child class and call non-abstract methods
 */

public class Program1 {

	public static void main(String[] args) {
		
		//creating an object
		Animal a = new Lion();
		
		//calling a non-abstract method
		a.eat();

		//creating an object
		Lion l = new Lion();
		
		//calling abstract method
		l.sound();
		
		//calling non-abstract method
		l.eat();
	}

}
