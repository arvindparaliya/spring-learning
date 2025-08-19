package in.ap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ap.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String config_file = "/in/ap/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
		
		Student std = (Student) context.getBean("stdId1");
		std.display();
		
		System.out.println("===============================");
		
		Student std1 = (Student) context.getBean("stdId2");
		std1.display();
	}
}
