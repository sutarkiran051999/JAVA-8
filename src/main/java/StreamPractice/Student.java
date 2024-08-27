package StreamPractice;

import java.util.List;

public class Student {

	private String studentName;
	private int rollNo;
	private String mobNum;
	private List<Address> address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, int rollNo, String mobNum, List<Address> address) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.mobNum = mobNum;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", mobNum=" + mobNum + ", address="
				+ address + "]";
	}
	
	
	
	
}
