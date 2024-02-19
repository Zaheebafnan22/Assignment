//2.Write a function to calculate the average value of an array of integers

public class Program2 {

	public static void main(String[] args) {

		//creating an array 
		int[] arr = {10,20, 30, 40 ,50};
		
		//calling the method or function and store it in to the result
		double result = calculateAverage(arr);
		
		//print the statement
		System.out.println("Sum of array element : "+result);

	}
	
	public static double calculateAverage(int[] arr) {
		
		//if the array is empty
		if(arr.length == 0) {
			
			//it will return 
			return 0.0;
		}
		
		int sum = 0;
		
		//perfrom the array and add each element to the sum
		for(int value : arr) {
			
			//adding the element
			sum += value;
		}
		
		//return the value
		return (double)sum/arr.length;
	}
	
	

}
