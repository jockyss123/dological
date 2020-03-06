
package Reverse_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_array {
	public static void main(String[] args) {
		String[]str= {"1","2"};
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println(Arrays.toString(str));
	}
	
}
