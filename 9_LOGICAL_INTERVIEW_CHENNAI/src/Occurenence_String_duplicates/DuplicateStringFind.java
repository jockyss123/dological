package Occurenence_String_duplicates;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateStringFind {

	public static void main(String[] args) {
		String string="i am a rider am i";
		String[]array=string.split(" ");
		HashMap<String,Integer>hm=new HashMap<String, Integer>();
		for(String tempstr:array) {
			//add string to map
			hm.put(tempstr, 1);
			//write a condition for duplicates
			if(hm.get(tempstr)!=null) {
				hm.put(tempstr, hm.get(tempstr)+1);
			}
			else {
				hm.put(tempstr, 1);
			}
		}
		System.out.println(hm);
		}
	}
	
	


