package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Size is 13.5 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop comp=new Desktop();
		comp.computerModel();
		comp.desktopSize();
	}

}
