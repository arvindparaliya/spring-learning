package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int rollNo;
	
	@Autowired
	private Address address; 
	@Autowired
	private Subjects subjects;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println("Name :"+ name);
		System.out.println("Roll No :" + rollNo);
		System.out.println("Address :"+ address);
		System.out.println("Subjects :" + subjects);
	}
}
