package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("My name");
	}

	public void studentDept() {
		System.out.println("My department");
	}

	public void studentId() {
		System.out.println("My ID");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
}
