package week3.assign;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited Amount is Rs.12,000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
