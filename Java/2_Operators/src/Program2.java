//2. Write a method for increment and decrement operators(++, --)

public class Program2 {

	public static void main(String[] args) {
		
		//creating a value for a to perform increment and decrement operators
		int  a = 10;
		
		//calling method for preIncrement
		preIncrement(a);
		
		//calling method for postIncrement
		postIncrement(a);
		
		//calling method for preDecrement
		preDecrement(a);
		
		//calling method for postDecrement
		postDecrement(a);

	}
	
	//creating preIncrement method
	static void preIncrement(int a ) {
		int b = ++a;
		System.out.println("PreIncrement : "+b );
		
	}
	
	//creating postIncrement method
	static void postIncrement(int a) {
		int b = a++;
		System.out.println("PostIncrement : "+b);
		}
	
	//creating preDecrement method
	static void preDecrement(int a ) {
		int b = --a;
		System.out.println("PreDecrement : "+b );
	}
	
	//creating postDecrement method
	static void postDecrement(int a) {
		int b = a++;
		System.out.println("PostDecrement : "+b);
		}
	
	
	

}
