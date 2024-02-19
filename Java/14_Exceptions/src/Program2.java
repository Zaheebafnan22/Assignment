//3. Write a method which throws exception, Call that method in main class without try block

public class Program2 {

	public static void main(String[] args) {
		
		//calling a method
		throwException();

	}
	
	//creating a method
	static void throwException() {
		
		//throw keyword is used to handle custom exception
		throw new RuntimeException("Handling Exception");
	}

}
