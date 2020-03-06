package FIND_DUPLICATE_ARRAY;

public class FINDDUPLICATE {

	public static void main(String[] args) {
	int [] arr=new int[] {1,2,3,45,1,2,3};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
				System.out.println(arr[j]);
		}
	}
	}

}
