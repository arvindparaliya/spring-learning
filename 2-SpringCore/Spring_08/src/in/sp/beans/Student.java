package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private int rollNo;
	
	@Autowired
	private Address address;
	
	public Student(String name, int rollNo, Address address) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
		
		public void display() {
			
			System.out.println("Name :" + name);
			System.out.println("Roll No. :" + rollNo);
			System.out.println("Address :" + address);
		}
}
