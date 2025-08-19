package in.sp.main;

import java.util.List;  
import org.springframework.jdbc.core.RowMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        //------------------SELECT OPERATION---------------------//
        String select_sql_query = "SELECT * FROM student";
        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());

        for (Student std : std_list) {
            System.out.println("Roll no : " + std.getRollno());
            System.out.println("Name    : " + std.getName());
            System.out.println("Marks   : " + std.getMarks());
            System.out.println("--------------------------------");
        }
    


        //------------------INSERTION OPERATION-------------------//
        
//      int roll_no = 103;
// 	  String std_name = "Durgesh";
//  	  float std_marks = 99.9f;
//        
//        String insert_sql_query = "INSERT INTO student VALUES (?, ?, ?)";
//        int count = jdbcTemplate.update(insert_sql_query, roll_no, std_name, std_marks);
//        
//       if(count >0) {
//       	System.out.println("Insetion Successful!!");
//       }else {
//       	System.out.println("Failed!");
//       }
//        
        
        //---------------UPDATE OPERTAION----------------------//
        
//        float marks = 91.2f;
//        int rollNo = 102;
//        
//        String update_sql_query = "UPDATE student SET std_marks=? WHERE roll_no=?";
//        int count = jdbcTemplate.update(update_sql_query, marks , rollNo);
//        
//        if (count > 0) {
//        	System.out.println("Update Successfully!");
//        }else {
//        	System.out.println("Failed!");
//        }
        
        //-----------------DELETE OPERATION ----------------------//
        
//        int roll = 101;
//        
//        String delete_sql_query = "DELETE FROM student WHERE roll_no= ?";
//        int count = jdbcTemplate.update(delete_sql_query, roll);
//        
//        if (count >0) {
//        	System.out.println("DELETE Successfull!");
//        	
//        }else {
//        	System.out.println("failed! TRY Again.");
//        }
     
    }
}
