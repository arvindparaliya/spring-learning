package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;


@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address showAdd() {
		
		Address add = new Address(101, "Rajko", 363544);
		return add;
	}
	
	@Bean
	public Student showStd() {
		
		Student std = new Student("Bhautik", 502, showAdd());
		return std;
	}
}
