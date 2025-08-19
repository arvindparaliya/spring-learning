package in.ap.resources;

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
		add.setCity("Ahemdabad");
		add.setPincode(331594);
		
		return add;
	}
	
	@Bean
	public Student showStd() {
		
		Student std = new Student();
		
		std.setName("Rameshwaram");
		std.setRollNo(502);
		//std.setAddress(showAdd()); ==>No need to use when we use @Autowired
		
		return std;
	}}

