package STRING_RELATED_ALL_LOGICAL;

public class COUNT_HOW_MANY_CHACETER_IN_STRING {
	public static void main(String[] args) {
		String str="abc def ghijk";
		int count=0;
		//count characrter except space
		 for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        } 
		System.out.println(count);
	}

}
