package character_ocuurence;

import java.util.HashMap;

public class FindDuplicatcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cspsp";
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			hm.put(ch, 1);
			//conditions
			if(hm.get(ch)!=null) {
				hm.put(ch, hm.get(ch)+1);
			}
		}
		System.out.println(hm);

	}

}
