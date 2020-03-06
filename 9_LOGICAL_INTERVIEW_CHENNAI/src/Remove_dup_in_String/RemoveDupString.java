package Remove_dup_in_String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupString {

	public static void main(String[] args) {
		String str="hjhdjdhdhf";
		String[] stg=str.split("");
		StringBuffer sf=new StringBuffer();
		Set<String>set=new LinkedHashSet<String>();
		
		//loop for string split to charceter and 
		/*
		 * for(int i=0;i<str.length();i++) { Character c=str.charAt(i);
		 * if(!set.contains(c)) { set.add(c); sf.append(c); } }
		 */
		for(String ch:stg) {
			set.add(ch);
		}
		for(String st:set) {
			sf.append(st);
		}
		System.out.println(sf.toString());
	}

}
