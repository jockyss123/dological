package ITARATE_HASHMAP;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	
	
	
	
	
	
	Map<Integer, String>fruits=new HashMap<Integer, String>();
	fruits.put(1, "Apple");
	fruits.put(5, "Banana");
	fruits.put(6, "Grapes");
	fruits.put(2, "orange");
	fruits.put(3, "Watermelon");
	fruits.put(4, "pinaple");
	
	Map<Integer, String>map=new HashMap<Integer, String>();
	map.put(200, "dj");
	map.put(201, "gun");
	map.putAll(fruits);
	System.out.println(map);
	List<Integer>list=new ArrayList<Integer>();
	
		/*
		 * //get all map collection data System.out.println(fruits); //itarate bcz get
		 * data one by one //using keyset Set<Integer>s1=fruits.keySet(); //using
		 * enhanced for loop for(int i:s1){ System.out.println(i+" "+fruits.get(i)); }
		 */
	for(Map.Entry<Integer, String> entity:map.entrySet())
		System.out.println("value  "+entity.getValue()
		+"key "+entity.getKey());
	
	//using stream
	Set<Integer>s2=map.keySet();
	s2.stream().forEach(i->{System.out.println("only key "+i+"  get value "+map.get(i));
	list.add(i);});
	
	//using itarator
	Set<Integer>s21=map.keySet();
	Iterator<Integer>itr=s21.iterator();
	while(itr.hasNext()) {
	int i=	itr.next();
		System.out.println(i+" "+map.get(i));
		list.add(i);
	}

		
	
	    
}
}
