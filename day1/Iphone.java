package week1.day1;

public class Iphone {
	
	public void makecall() {
		String mobileModel= "Iphone 11";
		float mobileWeight= 0.243f;
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		

	}

	public void sendMsg() {

		boolean isFullyCharged=true;
		int mobilecost=40000;
		System.out.println(isFullyCharged);
		System.out.println(mobilecost);
	}
	public static void main(String[] args) {

		Iphone myMob=new Iphone();
		System.out.println("This is My Mobile");
		myMob.makecall();
		myMob.sendMsg();
	}

}
