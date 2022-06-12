package com.jbdc;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentPhoneNumber;
	private String address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNumber="
				+ studentPhoneNumber + ", address=" + address + "]";
	}
	

}
