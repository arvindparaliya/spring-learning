package in.ap.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ap.beans.Address;
import in.ap.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address showAdd() {
		
		Address add = new Address();
		
		add.setHouseNo(101);
		add.setCity("Mumbai");
		add.setPincode(360050);
		
		return add;
	}
	
	@Bean
	public Student showStd() {
		
		Student std = new Student();
		
		std.setName("Ram Krushna");
		std.setRollNo(99258);
		//std.setAddress(showAdd()); manually Inject DI
		//When we use @Autowired at that time we don't need to inject manually it automatic inject into object
		
		return std;
		
	}
	
}
