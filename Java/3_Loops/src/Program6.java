//6. Write a program to print even number between 10 and 100 using while
public class Program6 {

	public static void main(String[] args) {
		
		//creating the value of i to perform the even number using while
		//initializing
		int i = 10;
		
		//checking condition
		while(i<=100) {
			
			//checking condition if the number is even or odd
			if(i%2 == 0) {
				
				//printing the even number
				System.out.println(i +" is a even number");
			}
			
			//incrementing
			i++;
		}

	}

}
