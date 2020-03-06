package STRING_RELATED_ALL_LOGICAL;

public class GETTING_EACH_WORD {
	public static void main(String[] args) {
		String str=" i am a good boy ";
		for(String val:str.split(" ")) {
			System.out.println(val);
			//System.out.println(str);
		}
		
		System.out.println(str);
	}

}
