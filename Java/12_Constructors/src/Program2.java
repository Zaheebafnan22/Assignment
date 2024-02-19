//2. Call the constructors(both default and argument constructors) of super class from a child class
public class Program2 {
	
	public static void main(String[] args) {
		
		//creating the object for default constructor
	    Child2 c1 = new Child2();
				
		//creating the object for one argument constructor
	    Child2 c2 = new Child2(11);
				
		//creating the object for the two argument constructors
	    Child2 c3 = new Child2("Afnan","CSE","Anna University","Chennai");
	}
}
