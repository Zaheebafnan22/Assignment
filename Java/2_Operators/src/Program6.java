//7. Print the smaller and larger number

public class Program6 {

	public static void main(String[] args) {
		
		//creating the value for a and b to perform the smaller and larger number
		int a = 10;
		int b = 20;
		
		//checking the condition for the smaller number
		int min = (a<b)?a:b;
		
		//checking the condition for the larger number
		int max = (a>b)?a:b;

		//printing the smaller number
		System.out.println("The smaller number is : "+min);
		
		//printing the larger number
		System.out.println("The larger number is : "+max);
	}

}
