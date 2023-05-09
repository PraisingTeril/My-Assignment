package week3.assign;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("ID : " + ID);
	}
	public void getStudentInfo(int ID, String name) {
		System.out.println("ID : " + ID +","+ " Name : " + name);
	}
	public void getStudentInfo(String email, long phnum) {
		System.out.println("Email ID : " + email +","+ " Phone Number : " + phnum);
	}
	
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(241627);
		stud.getStudentInfo(241627, "Praising Teril");
		stud.getStudentInfo("praisingteril@gmail.com", 8754325511l);
	}
}
