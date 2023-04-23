package week1.day1;

public class Chrome {
	public void getName() {
		String browserName= "This is my Browser";
		System.out.println(browserName);
	}
	
	public void printName() {
		String browserChrome="Google Chrome";
		System.out.println(browserChrome);

	}

	public static void main(String[] args) {
		
		Chrome web=new Chrome();
		web.getName();
		web.printName();
		
	}
}
