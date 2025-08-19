package in.sp.beans;

public class Student {
	
	private String name;
	private int rollNo;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Roll No. :" + rollNo);
		System.out.println("Address :" + address);
	}
	
}
