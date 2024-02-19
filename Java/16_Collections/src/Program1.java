/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {

	//array list is used to store the elements
	//there is no size limit in array list we can add and remove the data as many as the requirement
	public static void main(String[] args) {
		
		//creating the array list object
		ArrayList<String> al = new ArrayList<>();
		
		//adding an element in the arrayList
		al.add("java");
		al.add("is");
		al.add("a");
		al.add("back");
		al.add("end");
		al.add("program");
		al.add("sql");
		al.add("is");
		al.add("a");
		al.add("database");
		al.add("Hello");
		
		//printing the statement
		System.out.println(al);
		System.out.println();
		
		
		//creating the iterator object
		Iterator<String> itr = al.iterator();
		System.out.println("Iterating through the array list");
		
		//creating while loop to perform the task 
		while(itr.hasNext()) {
			
			//it splits the array and print in one by one
			System.out.println(itr.next()+ " ");
		}
		System.out.println();
		
		
		//adding a new array element in the list
		al.add(0, "Hi");
		System.out.println("Added an element at index 0 : ");
		
		//printing the statement
		System.out.println(al);
		System.out.println();
		
		//removing the element by using the remove value
		al.remove(11);
		System.out.println("Removing an element at index 11 : ");
		
		//printing the statement
		System.out.println(al);
		System.out.println();
		
		//updating an element by using the set value
		al.set(0, "Hello");
		System.out.println("Updating an element at index 0 : ");
		
		//printing the statement
		System.out.println(al);
		System.out.println();
		
		System.out.println("Finding the element at index : ");
		
		//printing the statement by getting the index value of the element in the arrayList
		System.out.println(al.indexOf("java"));
		System.out.println();
		
		System.out.println("Getting the elemet at index : ");
		
		//printing the statement by getting the element of the index
		System.out.println(al.get(6));
		System.out.println();
		
		System.out.println("Checking the size of the array : ");
		
		//printing the statement checking the size of the arrayList
		System.out.println(al.size());
		System.out.println();
		
		System.out.println("Checking the array is present in the list : ");
		
		//printing the statement by checking the element is present or not
		System.out.println(al.contains("sql"));
		System.out.println();
		
		System.out.println("Removing all the element from the arrayList");
		
		//removing all the element from the array
		al.clear();
		
		//printing the statement
		System.out.println(al);

	}

}
