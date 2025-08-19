package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address AddObj() {
		Address add = new Address();
		add.setHouseNo(101);
		add.setCity("Banglore");
		add.setPincode(360008);
		return add;
	}
	@Bean
	public Subjects SubObj() {
		Subjects sub = new Subjects();
		
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");
		
		sub.setSubjects(subjects_list);
		
		return sub;
	}
	
	@Bean
	public Student StdObj() {
		Student std = new Student();
		std.setName("Kalyug");
		std.setRollNo(303);
//		std.setAddress(AddObj()) //manually DI
		//std.setSubjects(SubObj());
		return std;
		
		}
	
}
