package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentname() {
		
		System.out.println("Student name is Hari Vaidyanathan");

	}
	public void studentdept() {
		
		System.out.println("studentdept is CSE");

	}
	public void StudentID() {
		
		System.out.println("Student ID IS 1");

	}
	

	public static void main(String[] args) {
		
		Student newstu = new Student();
		
		newstu.collegecode();
		newstu.collegename();
		newstu.collegerank();
		newstu.deptname();
		newstu.StudentID();
		newstu.studentname();
		newstu.studentdept();
	}

}
