package com;

public class Student {

	private int studentId;

	public Student() {

		System.out.println("Object created");

	}

	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "]";
	}

}
