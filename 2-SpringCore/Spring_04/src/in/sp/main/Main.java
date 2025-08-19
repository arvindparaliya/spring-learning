package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String config_path = "in/ap/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
		
	}
}
