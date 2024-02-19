//1. Write a function to add integer values of an array

public class Program1 {

	public static void main(String[] args) {
		
		//creating an array 
		int[] arr = {10,20, 30, 40 ,50};
		
		//calling the method or function and store it in to the result
		int result = sumArray(arr);
		
		//print the statement
		System.out.println("Sum of array element : "+result);
	}
		
	    //creating a method
		public static int sumArray(int[] arr) {
			
			//creating the sum to perform the addition
			int sum = 0;
			
			//perfrom the array and add each element to the sum
			for(int value : arr) {
				
				//adding the element
				sum += value;
			}
			
			//return sum
			return sum;
		}

	

}
