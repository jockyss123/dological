package LISTCOLLECTION_find_common_Duplicates;

import java.util.ArrayList;
import java.util.List;

public class TEST {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		List<Integer>l2=new ArrayList<Integer>();
		l2.add(110);
		l2.add(112);
		l2.add(101);
		//get duplicate common for two collection
		//l1.retainAll(l2);
		//System.out.println(l1);
		//get unique list collection details
		l1.removeAll(l2);
		System.out.println(l1);

	}

}
