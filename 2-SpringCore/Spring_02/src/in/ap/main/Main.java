package in.ap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ap.beans.Student;
import in.ap.resources.SpringConfig;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student) context.getBean("stdId1");
		std.display();
		
		System.out.println("================================");
		
		Student std1 = (Student) context.getBean("stdId2");
		std1.display();
	}
}
