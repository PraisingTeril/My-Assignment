package week3.assign;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Selenium();
		auto.Java();
		auto.ruby();
		auto.python();
	}
	

}
