/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet
*/

import java.util.HashSet;
import java.util.Iterator;

public class Program3 {
	
	//hash set is used to create a collection that use a hash table to store

	public static void main(String[] args) {
		
		//creating an object for hash set
		HashSet<String> hs = new HashSet<>();
		
		//adding an element in the hash set
		hs.add("java");
		hs.add("is");
		hs.add("a");
		hs.add("back");
		hs.add("end");
		hs.add("program");
		hs.add("sql");
		hs.add("is");
		hs.add("a");
		hs.add("database");
		hs.add("Hello");
		
		//printing the statement
		System.out.println(hs);
		
		//it does not allow a duplicate value
		hs.add("sql");
		//printing the statement
		System.out.println(hs);
		
		//creating an iterator object for hash set
		Iterator<String> itr = hs.iterator();
		System.out.println("Iterating through the array list");
		
		//creating while loop to perform the task 
		while(itr.hasNext()) {
			
			//it splits the element and print in one by one
			System.out.println(itr.next()+ " ");
		}
		System.out.println();
		
		//creating a copy of hash set
		System.out.println("Clone of hashset");
		
		//printing the statement
		System.out.println(hs.clone());
		System.out.println();
		
		//removing the element by using the remove value
		hs.remove("Hello");
		System.out.println("Removing an element at index 11 : ");
				
		//printing the statement
		System.out.println(hs);
		System.out.println();
				
		System.out.println("Checking if the set is empty ");
		
		//printing the statement checking is the set is empty
		System.out.println(hs.isEmpty());
		System.out.println();
		
		System.out.println("Checking the size of the hash set : ");
		
		//printing the statement checking the size of the hash set
		System.out.println(hs.size());
		System.out.println();
		
		System.out.println("Checking the element is present in the hash set : ");
		
		//printing the statement by checking the element is present or not in the hash set
		System.out.println(hs.contains("sql"));
		System.out.println();
		
		System.out.println("Removing all the element from the hash set");
		
		//removing all the element from the hash set
		hs.clear();
		
		//printing the statement
		System.out.println(hs);


	}

}
