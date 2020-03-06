package Palidrame_NO;

public class Palidrame {

	public static void main(String[] args) {
		int number = 1111;
		int temp = number;
		int rev = 0, rem;
		while(temp!=0) {
			rem=number%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if (number==rev) {
			System.out.println(number+"palidrame");
		}
		else {
			System.out.println(number+"no");
		}

	}
}
