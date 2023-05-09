package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name : PRAISING TERIL");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept : B.Sc IT");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID : 241067");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}
