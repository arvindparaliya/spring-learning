package in.ap.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ap.beans.Student;
import in.ap.mappers.StudentRowMapper;
import in.ap.resources.SpringConfigFile;

public class App {
	public static void main(String[] args)

	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		
		//=======================SELECT OPERATIONS 1===========================//
		
//		int roll_no = 101;
//		
//		String select_sql_query = "SELECT * FROM student WHERE std_roll =?";
//		List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper(), roll_no);
//		
//		for(Student std : std_list) 
//		{
//			System.out.println("Roll No. :" + std.getStd_roll());
//			System.out.println("Name :" + std.getName());
//			System.out.println("Marks :" + std.getMarks());
//			System.out.println("==========================================");
//			
//		}
		
		//=======================SELECT OPERATIONS 2===========================//
		
//		String select_sql_query = "SELECT * FROM student";
//		List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//		
//		for(Student std : std_list) 
//		{
//			System.out.println("Roll No. :" + std.getStd_roll());
//			System.out.println("Name :" + std.getName());
//			System.out.println("Marks :" + std.getMarks());
//			System.out.println("==========================================");
//			
//		}
		
		//=======================SELECT OPERATIONS 3===========================//
		int rollno = 101;
		
		String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
		
		Student std = JdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), rollno);
		
		for(Student std: std_list) 
		{
			
			System.out.println("Roll No. :" + std.getStd_roll());
			System.out.println("Name :" + std.getName());
			System.out.println("Marks :" + std.getMarks());
			System.out.println("==========================================");
			
		}
		
	
		
		
		//======================DELETE OPERTATION============================//
//		int std_roll = 102;
//		
//		String delete_sql_query = "DELETE FROM student WHERE std_roll = ?";
//		
//		int count = jdbcTemplate.update(delete_sql_query, std_roll);
//		if(count > 0) 
//		{
//			System.out.println("user delete successfully");
//		}
//		else
//		{
//			System.out.println("Faield due to some error!");
//		}
		
		//======================UPDATION OPERTATION============================//
//		int std_roll = 101;
//		String std_name = "Krishna";
//		String update_sql_query = "UPDATE student SET std_name =? WHERE std_roll =?";
//		
//		int count = jdbcTemplate.update(update_sql_query, std_name, std_roll);
//		
//		if(count > 0) 
//		{
//			System.out.println("Updated successfully!");
//		}
//		else 
//		{
//			System.out.println("Failed updation!");
//		}
		
		//======================INSERTION OPERATION===========================//
		
//		int rollno = 102;
//		String name = "Shyam";
//		float marks = 93.2f;
//
//		String insert_sql_query = "INSERT INTO student VALUES (?, ?, ?)";
//
//		int count = jdbcTemplate.update(insert_sql_query, rollno, name, marks);
//
//		if (count > 0) {
//			System.out.println("Insertion Successful!");
//		} 
//		else {
//			System.out.println("Insertion Failed!");
//		}
	}
}
