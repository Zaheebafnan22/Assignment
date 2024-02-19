//5. Programs on Logical AND,OR operator and Logical NOT

public class Program4 {

	public static void main(String[] args) {
		
		//creating a value for a, b and c to perform logical And, OR and NOT operation
		int a = 10;
		int b = 20;
		int c = 30;
		
		//Logical AND -  both the condition need to be true otherwise false
		System.out.println(a>b && a>c);
		System.out.println(b>a && b>c);
		System.out.println(c>a && c>b);
		System.out.println();
		
		//Logical OR - either one condition need to be true otherwise false
		System.out.println(a>b || a>c);
		System.out.println(b>a || a<c);
		System.out.println(c>b || a>b);
		System.out.println();
		
		//Logical NOT - If the condition is false it will show true(opposite sign)
		System.out.println(!(a>b));
		System.out.println(!(b>a));
	}

}
