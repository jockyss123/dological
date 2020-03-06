package STRING_RELATED_ALL_LOGICAL;

public class COUNT_HowMany_WORD {
	public static void main(String[] args) {
		String str = "hi i am a         boy";
		// used regex
		System.out.println(str.split("\\s+").length);
		int count = 1;
		// travers way
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && i < str.length() + 1 && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
