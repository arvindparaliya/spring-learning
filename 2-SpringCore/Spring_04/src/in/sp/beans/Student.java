package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Raj")
	private String name;
	@Value("101")
	private int rollno;
	@Value("ran@gmail.com")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display(){
		System.out.println("Name :" + name);
		System.out.println("Roll No. :" + rollno);
		System.out.println("Email :" + email);
	}
	
	
}
