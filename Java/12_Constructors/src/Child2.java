
public class Child2 extends Parent2{
	
	//creating instance variable
	String college;
	String city;
	
	//creating a default constructor
	Child2(){
		
		//using super keyword calling the parent class
		super();
	}
	
	//creating a one argument constructor and getting value
	Child2(int rollNo){
		
		//using super keyword calling the parent class roll no 
		super(rollNo);
	}
	
	//creating a multiple argument constructor and getting values
	Child2(String name, String branch, String college, String city){
		
		//using super keyword calling the parent class name and branch
		super(name, branch);
		
		//getting the college value and by using this keyword assigning the same class instance variable college
		this.college = college;
		
		//getting the city value and by using this keyword assigning the same class instance variable city
		this.city = city;
		
		//printing the statement of the college
		System.out.println("College : " + this.college );
		
		//printing the statement of the city
		System.out.println("City : " + this.city);
	}
}
