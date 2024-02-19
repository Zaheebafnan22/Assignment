//1. Write two methods with the same name but different number of parameters of same type and call the methods from main method
//2. Write two methods with the same name but different number of parameters of different data type and call the methods from 
//main method
//3. Write two methods with the same name and same number of parameters of same type and call from main method
//Ans: It cannot be the same name, same order and same date type. It will be a compiler error
//4. Write two methods with the same name and same number of parameters of different type and call from main method
//5. Write two methods with the same name, number of parameters and data type but different return Type
//And: The compiler does not consider the return type in the method overloading
public class Program1 {

	public static void main(String[] args) {
		
		//creating an object
		Program1 p = new Program1();
		
		//calling the method 1
		p.method1(10);
		p.method1(10, 20);
		
		//calling the method 2
		p.method2(11);
		p.method2(11, "Zaheeb");
		
		//calling the method 3
		p.method3(12);
		p.method3("Afnan");
		

	}
	
	//creating a instance variable
	int num1;
	int num2;
	int rollNo;
	String name;
	
	//creating the method with a same name but different number of parameters of the same type
	void method1(int num1) {
		
		//getting the num1 value and by using this keyword assigning the same class instance variable num1
		this.num1 = num1;
		
		//printing the statement and value for the num1
		System.out.println("First Number : " + num1);
	}
	
	//creating the method with a same name but different number of parameters of the same type
	void method1(int num1, int num2) {
		
		//getting the num1 value and by using this keyword assigning the same class instance variable num2
		this.num1 = num1;
		
		//getting the num1 value and by using this keyword assigning the same class instance variable num2
		this.num2 = num2;
		
		//printing the statement and value of adding num1 and num2
		System.out.println("Sum of num1 and num2 : " +(num1+num2));
	}
	
	//creating the method with a same name and same number of parameters but different type
	void method2(int rollNo) {
		
		//getting the rollno value and by using this keyword assigning the same class instance variable rollno
		this.rollNo = rollNo;
		
		//printing the statement and value for the rollno
		System.out.println("Roll No : " + rollNo);
	}
	
	
	//creating the method with a same name and same number of parameters but different type
	void method2(int rollNo, String name) {
		
		//getting the rollno value and by using this keyword assigning the same class instance variable rollno
		this.rollNo = rollNo;
		
		//getting the name value and by using this keyword assigning the same class instance variable name
		this.name = name;
		
		//printing the statement and value for the name and the roll no
		System.out.println("The student roll no is " + rollNo + " and name is " + name);
	}
	
	//creating the methods with the same name and same number of parameters of different type
	void method3(int rollNo) {
		
		//getting the rollno value and by using this keyword assigning the same class instance variable rollno
		this.rollNo = rollNo;
		
		//printing the statement and value for the rollno
		System.out.println("Roll No : " + rollNo);
	}
	
	//creating the methods with the same name and same number of parameters of different type
	void method3(String name) {
		
		//getting the name value and by using this keyword assigning the same class instance variable name
		this.name = name;
		
		//printing the statement and value for the name
		System.out.println("Name : " + name);
	}

}
