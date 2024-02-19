
public class Parent3 {
	
	//creating instance variable
	int rollNo;
	String name;
	String brand;
	String college;
	String city;
	
	{
		//printing the statement
		System.out.println("Student Details");
	}
	
	//creating the default access modifier
	Parent3(){
		
		//using this keyword storing the value for the roll no
		this(11);
	}
	
	//creating the public access modifier
	public Parent3(int rollNo) {
		
		//using this keyword storing the value for the name
		this("Afnan");
		
		//getting the rollno value and by using this keyword assigning the same class instance variable rollno
		this.rollNo = rollNo;
		
		//printing the statement and value for the roll no
		System.out.println("Roll No : " + rollNo);
	}
	
	//creating the private access modifier
	private Parent3(String name) {
		
		//using this keyword storing the values for the college and city
		this("Anna University", "Chennai");
		
		//getting the name value and by using this keyword assigning the same class instance variable name
		this.name = name;
		
		//printing the statement and value for the name
		System.out.println("Name : " + name);
	}
	
	//creating the protected access modifier
	protected Parent3(String college, String city) {
		
		//getting the college value and by using this keyword assigning the same class instance variable college
		this.college = college;
		
		//getting the city value and by using this keyword assigning the same class instance variable city
		this.city = city;
		
		//printing the statement and value for the college
		System.out.println("College : " + college);
		
		//printing the statement and value for the city
		System.out.println("City : " + city);
	}
	
}
