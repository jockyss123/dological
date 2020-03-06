package LINKEDLIST_ALL_METHOD_OPERATIONS;
// Java code to illustrate boolean addAll() 
import java.util.*; 
import java.util.LinkedList; 
import java.util.ArrayList; 

public class LinkedListDemo { 
public static void main(String args[]) { 

	// Creating an empty LinkedList 
	LinkedList<Integer> list = new LinkedList<>(); 

	// Use add() method to add elements in the list 
	list.add(10); 
	list.add(2); 
	list.add(3); 
	list.add(4); 
	list.add(5); 
		
	// A collection is created 
	List<Integer> list1 = new ArrayList<>(); 
	/*collect.add("A"); 
	collect.add("Computer"); 
	collect.add("Portal"); 
	collect.add("for"); 
	collect.add("Geeks"); */
    list1.add(1); 
	list1.add(1); 
	list1.add(2); 
	list1.add(2); 
	list1.add(3);

	// Displaying the list 
	System.out.println("The LinkedList is: " + list); 
	//iterating list1
	for(Integer i:list1) {
		System.out.println("itarating list "+i);
		
	}
	
			
	// Appending the collection to the list 
	list.addAll(list1); 
	// Clearing the list using clear() and displaying 
		System.out.println("The new linked list is: " + list); 
	//find common duplicate in both two list
  list1.retainAll(list);
  System.out.println("common duplictae in list "+list1);
/*find unique element in list
  list.removeAll(list1);
  System.out.println("common element in list "+list);*/
	//in list check this element is present or not
  System.out.println("the list contains this element or not "+list.contains(100));
  System.out.println("the list contains this element or not "+list.contains(4));
  
  //element method used to print head of the list value
  System.out.println("not remove  only retrive head value of list "+list.element());

//his method returns the element at the specified position in this list.
System.out.println("specified postion of list "+list.get(2));

//listitarator starting specified postion
System.out.println("itare specified postion "+list1.listIterator(1).toString());

//offer method add element as the last

} //
} 
