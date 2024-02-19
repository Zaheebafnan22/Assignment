//7. Write a program to print 1 to 10 using the do-while loop statement.
public class Program7 {

	public static void main(String[] args) {

		//creating the value of i to perform the do-while loop
		//initializing 
		int i = 1;
		
		//In do while it will print the value once either the condition is true or false then it will start checking the condition
		do {
			
			//printing the values
			System.out.print(i+ " ");
			
			//incrementing
			i++;
		}
		
		//checking the condition
		while(i<=10);

	}

}
