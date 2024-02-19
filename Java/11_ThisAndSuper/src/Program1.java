//1. Print the fields/instance members of the current class using this and without using object
//3. Call constructor of the current class using this()
//4. Call argument constructor of current class using this()

public class Program1 {
	
	//creating instance variable
	int num;
    String name;
    
    //creating a constructor
    Program1(){
    	
    	//calling the variables and storing the values
    	this(11,"Zaheeb");
    }
    
    //creating a method and receiving the values
    Program1(int num, String name){
    	
    	//getting the values and storing in the instance variables
    	this.num = num;
    	this.name = name;
    	
    	//printing the statement
    	System.out.println(num + " " + name);
    }
    

	public static void main(String[] args) {
		
		//creating an object for t1 
		Program1 t1 = new Program1();
		
		//creating an object for t2 and sending the values
		Program1 t2 = new Program1(12, "Afnan");

	}

}
