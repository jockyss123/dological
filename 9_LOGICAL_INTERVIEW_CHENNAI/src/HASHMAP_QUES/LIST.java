package HASHMAP_QUES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LIST {
	public static void main(String[] args) {
		Map<Integer,String>hm=new HashMap<Integer, String>();
		hm.put(101, "sagar");
		hm.put(102, "rar");
		hm.put(103, "gar");
		hm.put(104, "agar");
		List<Object>l3=new ArrayList<Object>();
		//itarate
		Set<Integer>s1=hm.keySet();
		for(int i:s1) {
			System.out.println("key "+i+" value"+hm.get(i));
			l3.add(i + hm.get(i));
			
		}
		System.out.println(l3);
		
		/*List<Integer>l1=new ArrayList<Integer>(hm.keySet());
		System.out.println(l1);
		List<String>l2=new ArrayList<String>(hm.values());
		System.out.println(l2);*/
	
	}

}
