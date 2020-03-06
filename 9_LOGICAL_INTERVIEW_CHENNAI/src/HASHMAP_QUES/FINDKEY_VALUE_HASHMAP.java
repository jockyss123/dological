package HASHMAP_QUES;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FINDKEY_VALUE_HASHMAP {
public static void main(String[] args) {
	HashMap<Integer, String>hs=new HashMap<Integer, String>();
	hs.put(101, "ASHOK");
	hs.put(102, "BALA");
	hs.put(103, "CSP");
	hs.put(104, "KUNA");
	hs.put(10, "SUVA");
	hs.put(106,"KUNA");
	System.out.println("TOTAL MAP STORE KEY AND VALUE "+hs);
	//ITARATE(using keyset)
	Set<Integer>s1=hs.keySet();
	for(int i:s1) {
		System.out.println("key "+i+" value "+hs.get(i));
	}
	//geting particular value according to key___used .get()
	System.out.println("find 104 key value only "+hs.get(104));
	//if given key is not present or given value is not then give null
	System.out.println("find 104 key value only "+hs.get(1));
	
	//used containskey() if key is present or not
	System.out.println("key is present or not "+hs.containsKey(10));//true else false
	
	//used containsvalue() present or not
	System.out.println("value is present or not "+hs.containsValue("KUNA"));//true else false
	
	//all hashmap key value enter into set by using entryset()
	System.out.println("put all map into set"+hs.entrySet());
	
	//replace value as per key
	
	System.out.println(hs);
	System.out.println("replace old value as per key  "+hs.replace(102, "BALA", "INDIA"));
	System.out.println(hs);
	
	//update value used the compute(k,(k,v)->v.concat("update"));
	System.out.println("update value of key 102 "+hs.compute(102,(key, val)->val.concat("  pratap")));
	
	//get duplicate values in map using map.value()in set
	Set<String>unique_value=new HashSet<String>(hs.values());
	System.out.println("unique value"+unique_value);
	
	//sorting key value using TREEMAP
	Map<Integer, String> treeMap = new TreeMap<Integer, String>(hs);
    System.out.println(treeMap);

}
}
