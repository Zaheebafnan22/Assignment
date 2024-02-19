
public class Parent1 {
	
	//creating instance variable
	int rollNo;
	String name;
	String branch;
	
	//creating default constructor
	Parent1(){
		System.out.println("Student Details");
	}
	
	//creating one argument constructor and getting the value
	Parent1(int rollNo){
		
		//storing the rollno into the instance variable rollno
		this.rollNo = rollNo;
		
		//printing the statement of the rollno
		System.out.println("Roll No : " +this.rollNo);
	}
	
	//creating two argument constructor and getting the values
	Parent1(String name, String branch){
		
		//storing the name into the instance variable name
		this.name = name;
		
		//storing the branch into the instance variable branch
		this.branch = branch;
		
		//printing the statement of the name
		System.out.println("Name : " +this.name);
		
		//printing the statement of the branch
		System.out.println("Branch : " +this.branch);
	}
}
