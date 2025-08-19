package in.ap.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private int rollNo;
	
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
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
