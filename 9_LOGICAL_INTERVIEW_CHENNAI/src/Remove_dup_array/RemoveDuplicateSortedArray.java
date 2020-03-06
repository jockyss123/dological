package Remove_dup_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;import java.util.stream.Collectors;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		//sorted array created
//		int[]a= {1,2,2,3,4,4,6,6};
//		//stored the above array into temp array
//		int[]temp=new int[a.length];
//		//travers array
//		int j=0;
//		for(int i=0;i<a.length-1;i++) {
//			//condition array+1 value stored into temp
//			if(a[i]!=a[i+1]) {
//				temp[j]=a[i];
//				j++;
//			}
//		}
//		//last index value stored into temp[]
//		temp[j]=a[a.length-1];
//		//print
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i]+" ");
//		}
//	}
		int []a= {1,2,3,1,2,3,4,5};
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.println(no);
		}
	}
}  
	
		


