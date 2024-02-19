//6. Matching a String Against a Regular Expression With matches()

public class Program6 {

	public static void main(String[] args) {
		
		//creating a string
		String s1 = "Matching a string";
		
		//if the word is matching the string
		boolean s2 = s1.matches("(.*)string(.*)");
		
		//printing the statement
		System.out.println(s2);
				

	}

}
