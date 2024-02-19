//11. Splitting strings with split()

public class Program11 {

	public static void main(String[] args) {
		
		//creating a string
		String s1 = "Java is a Programming";
		
		//creating the string arr and storing the space in it to split
		String[] s2 = s1.split(" ");
		
		//performing the condition if the space is present then break
		for(String i : s2) {
			
			//printing the statement
			System.out.println(i);
		}

	}

}
