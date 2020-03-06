package ITARATE_HASHMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	
	public static void main(String[] args) {
		//create a map
		Map<Integer, String>hs=new HashMap<Integer, String>();
		//another collection add map value
		List<String> l1=new ArrayList();
		//map 2
		Map<Integer, String>map2=new HashMap<Integer, String>();
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs.put(4, "d");
		hs.put(5, "e");
		//add map to set bcz for itaration
		Set<Integer> s1= hs.keySet();
		for(int i :s1) {
			System.out.println(i +"  "+hs.get(i));
			//add value to list collection
			l1.add(hs.get(i));
			//add hs to map2
			map2.put(i,hs.get(i));
		}
		s1.stream().forEach(i->{
			System.out.println(i +"  "+hs.get(i));
			l1.add(hs.get(i));
			map2.put(i, hs.get(i));
		});
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext()) {
			int i=i1.next();
			System.out.println(i +"  "+hs.get(i));
		}
		System.out.println(l1);
	}

}
