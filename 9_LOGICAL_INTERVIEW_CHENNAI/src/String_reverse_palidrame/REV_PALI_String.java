package String_reverse_palidrame;

import java.util.Scanner;

public class REV_PALI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string");
		String str=scn.next();
		String temp=str;
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(temp.equals(rev)) {
			System.out.println(str);
		}
		else {
			System.out.println("not pali"+str);
		}
		

	}

}
