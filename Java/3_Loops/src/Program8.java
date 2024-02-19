//8. Write a program to find Armstrong number or not

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		//creating a scanner class to get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		//getting the input from the user
		int num = scan.nextInt();
		
		//checking the condition by calling a method
		if(isArmstrong(num)) {
			
			//print the statement if true
			System.out.println(num + " is a armstrong number");
		}
		else {
			
			//print the statement if false
			System.out.println(num + " is not a armstrong number");
		}
		
	}
	
	//creating a method
	static boolean isArmstrong(int num) {
		
		//creating r, result and temp to perform the armstrong 
        int r;
        int result = 0;
        
        //assigning num to temp 
        int temp = num;
        
        //loop executes when the condition is true
        while (num != 0) {
        	
        	//storing the num mod 10 in r
            r = num % 10;
            
            //multiplying the number as many times that user inserted as a input adding the number with result 
            
            result += (r * r * r);
            
            //dividing the number by 10 it will split the number
            num = num / 10;
            
            //153 = 1*3 + 5*3 + 3*3 = 153
        }
        
        //returns if temp and result are equal
        return temp == result;
    }
	

}
