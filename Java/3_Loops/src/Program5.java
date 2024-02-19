//5. Write a program to print largest number among three numbers.
//13. Program for multiple if else statement(Largest number in 10,20 and 30)

public class Program5 {

	public static void main(String[] args) {

		//creating a value for a, b and c to perform the largest number among three number
		int a = 10;
		int b = 20;
		int c = 30;

		//if the value of a is greatest it will print a
		if(a>b && a>c) {
			System.out.println(a +" is greatest");
		}
		
		//if the value of b is greatest it will print b
		else if(b>a && b>c) {
			System.out.println(b +" is greatest");
		}
		
		//if the value of c is greatest it will print c
		else if(c>a && c>b) {
			System.out.println(c +" is greatest");
		}

	}

}
