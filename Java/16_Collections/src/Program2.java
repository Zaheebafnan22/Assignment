/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map 
*/

import java.util.HashMap;

public class Program2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "HTML");
        hm.put(2, "CSS");
        hm.put(3, "JS");
        hm.put(4, "SQL");
        hm.put(5, "JAVA");
        hm.put(6, "PYTHON");
        hm.put(7, "PHP");
        hm.put(8, "REACT");
        hm.put(9, "NODE");
        hm.put(10, "ANGULAR");
        
		//printing the statement
		System.out.println(hm);
		System.out.println();
		
		System.out.println("Getting the elemet at index : ");
		
		//printing the statement by getting the element of the index
		System.out.println(hm.get(6));
		System.out.println();
		
		//creating a copy of hash map
		System.out.println("Clone of hashmap");
		
		//printing the statement
		System.out.println(hm.clone());
		System.out.println();
		
		//Hash map contains key
		System.out.println("Contains key of hashmap");
		
		//printing the statement
		System.out.println(hm.containsKey(3));
		System.out.println();
		
		//creating a contains value of hash map
		System.out.println("Contains value of hashmap");
		
		//printing the statement
		System.out.println(hm.containsValue("JAVA"));
		System.out.println();
		
		System.out.println("Checking if the set is empty ");
		
		//printing the statement checking is the set is empty
		System.out.println(hm.isEmpty());
		System.out.println();
		
		System.out.println("Checking the size of the hash set : ");
		
		//printing the statement checking the size of the hash map
		System.out.println(hm.size());
		System.out.println();
		
        System.out.println("Checking the size of the hash set : ");
		
		//printing the statement in console of all the keys
		System.out.println(hm.keySet());
		System.out.println();
		
		//removing the element by using the remove value
		hm.remove(10);
		System.out.println("Removing an element at index 11 : ");
				
		//printing the statement
		System.out.println(hm);
		System.out.println();
		
		//creating a another new object of hash map
		HashMap<Integer, String> hm2 = new HashMap<>(hm);
		System.out.println("Anothe hash map : ");
		System.out.println(hm2);

	}

}
