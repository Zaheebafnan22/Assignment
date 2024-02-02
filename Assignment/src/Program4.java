//4. Define variables for different Data Types int, Boolean, char, float, double and print on the Console

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Integer take the input in number
		System.out.println("Enter a integer : ");
		int a = scan.nextInt();
		System.out.println(a);
		
		//Boolean take the input in true or false
		System.out.println("Enter a boolean : ");
		boolean b = scan.nextBoolean();
		System.out.println(b);
		
		//Character can take the input as a word but print only first letter
		System.out.println("Enter a character : ");
		char c = scan.next().charAt(0);
		System.out.println(c);
		
		//Float take the input in number at last it takes the decimal
		System.out.println("Enter a float : ");
		float d = scan.nextFloat();
		System.out.println(d);
		
		//Double take the input in number at last it takes the decimal 
		System.out.println("Enter a double : ");
		double e = scan.nextDouble();
		System.out.println(e);
		
		//Printed to line break
		System.out.println();
		
		//Printed all the variables
		System.out.println("Integer: "+a +", Boolean: "+b +", Character: "+c +", Float: "+d +", Double: "+e);
		

		

	}

}
