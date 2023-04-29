package week1.day2;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=13;
		boolean flag=true;
		for (int i=2; i<=num/2; i++) {
			if (num%i==0) {
				flag = false;
				break;
			}
			}
			if(flag)
				System.out.println("Prime Number");
			else {
				System.out.println("Not a Prime Number");
			
		}
	}

}