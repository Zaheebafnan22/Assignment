//4. Write a program to print the odd and even numbers.
public class Program4 {

	public static void main(String[] args) {
		
		//creating the value of num to perform odd or even number
		int num = 20;
		
		//creating a for loop to check the condition
		//initializing, checking the condition, incrementing
		for(int i=1; i<=num ;i++) {
			
			//creating if statement to check the condition
			if(i%2 == 0) {
				
				//printing the even number
				System.out.println(i + " is a even number");
			}
			
			else {
				
				//printing the odd number
				System.out.println(i + " is a odd number");
			}
		}
	}

}
