//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()


public class Program8 {

	public static void main(String[] args) {
		
		//creating a strings
		String s1 = "Java Programming";
		String s2 = "java programming";
		
		//it ignore the case
		boolean s3 = s1.equalsIgnoreCase(s2);
		
		//printing the statement
		System.out.println(s3);
		
		//it start with java
		boolean s4 = s1.startsWith("Java");
		
		//printing the statement
		System.out.println(s4);
		
		//it ends with programming
		boolean s5 = s1.endsWith("Programming");
		
		//printing the statement
		System.out.println(s5);
		
		//it compare the first string with the second string it returns 0 if both are equal
		int s6 = s1.compareTo(s2);
		
		//printing the statement
		System.out.println(s6);
		

	}

}
