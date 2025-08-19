package in.ap.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ap.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student stdId1() {
		
		Student std = new Student();
		
		std.setName("aman");
		std.setRollno(101);
		std.setEmail("aman@gmail.com");
		
		return std;	
	}
	
	@Bean("stdId2")
	public Student createStdBeans() {
		
		Student std1 = new Student();
		
		std1.setName("Ram");
		std1.setRollno(102);
		std1.setEmail("ram@gmail.com");
		
		return std1;	
	}
}
