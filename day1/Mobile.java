package week1.day1;

public class Mobile {

	public void sendsms() {
		System.out.println("Hello, Where are you?");
		// TODO Auto-generated method stub
	}
	
	
	protected void allowvoicecall() {
		System.out.println("I'm here at Beach");
		// TODO Auto-generated method stub
	}
	
	private void TakeVideo() {
		System.out.println("Show me the View");
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendsms();
		mob.allowvoicecall();
		mob.TakeVideo();
	}
	
}
