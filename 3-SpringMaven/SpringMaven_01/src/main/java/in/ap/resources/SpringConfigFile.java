package in.ap.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ap.beans.Address;
import in.ap.beans.Student;

@Configuration
public class SpringConfigFile
{	
	@Bean
	public Address showAdd() 
	{
		Address add = new Address();
		add.setHouseNo(331);
		add.setCity("Kolkata");
		add.setPincode(331594);
		
		return add;
	}
	
	@Bean
	public Student showStd()
	{
		Student std = new Student();
		std.setName("Alpesh kumar");
		std.setRollNo(101);
		std.setAddress(showAdd());
		
		return std;
	}
}
