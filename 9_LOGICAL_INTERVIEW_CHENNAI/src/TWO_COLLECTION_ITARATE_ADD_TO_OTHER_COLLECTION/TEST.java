package TWO_COLLECTION_ITARATE_ADD_TO_OTHER_COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class TEST {
public static void main(String[] args) {
	List<String>l1=new ArrayList<String>();
	l1.add("a");
	List<String>l2=new ArrayList<String>();
	l1.add("a");
	
	l1.add("b");
	l1.add("c");
	//iarotr by using enhance for each
	for(String s:l1) {
		System.out.println(s);
		l2.addAll(l1);
	}
	//by using stream api
	l1.stream().forEach(s->{System.out.println(s);});
	
}
}
