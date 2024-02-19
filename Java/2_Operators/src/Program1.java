//1. Write a function for arithmetic operators(+,-,*,/)

public class Program1 {

	public static void main(String[] args) {
		
		//creating a value for a and b to perform arithmetic operation
		int a = 10;
        int b = 5;
        
        //calling methods for addition
        addition(a, b);
        
        //calling methods for subtraction
        subtraction(a, b);
        
        //calling methods for multiplication
        multiplication(a, b);
        
        //calling methods for division
        division(a, b);

	}
	
	//creating Addition Method
	static void addition(int a, int b) {
		int add = a+b;
		System.out.println("Addition of a + b : "+add);
	}
	
	//creating Subtraction Method
	static void subtraction(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction of a - b : "+sub);
	}
	
	//creating Multiplication Method
	static void multiplication(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication of a * b : "+mul);
	}

	//creating Division Method
	static void division(int a, int b) {
		int div = a/b;
		System.out.println("Division of a / b : "+div);
	}
	
}
