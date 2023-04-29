package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=34343;
		int output=0, rem;
		int num=input;
		
		for(;num>0;num=num/10) {
			rem = num%10;
			output=output*10+rem;
		}
		if (input==output) {
			System.out.println(input + " is a Palindrome Number");
		}
			else {
			System.out.println(input + " is not a Palindrome Number");
			}
		
}
}
