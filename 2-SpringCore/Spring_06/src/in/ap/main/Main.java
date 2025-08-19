package in.ap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ap.beans.Student;
import in.ap.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		String config_file = "/in/ap/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
			
		
	}
}
