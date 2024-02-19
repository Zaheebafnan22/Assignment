/*9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
10. Create an interface with private, public and protected fields.
11. Create an interface with static final variable
 */

//implement keyword to inherit from the interface
public class Program8 implements Programs8{

	public static void main(String[] args) {
		
		//creating an object
		Program8 inf = new Program8();
		
		//printing the statement
		System.out.println(inf.num1 + " " + inf.num2 + " " + inf.num3);

	}

}
