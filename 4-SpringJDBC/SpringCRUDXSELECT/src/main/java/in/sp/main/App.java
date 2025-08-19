package in.sp.main;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
import in.sp.mappers.StudentRowMapper;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        //---------- SELECT OPERATION ----------//
//        String sql = "SELECT * FROM student";
//        List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
        
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM student");

        for (Map<String, Object> row : result) {
            System.out.println(row);
        }


//        for (Student s : students) {
//            System.out.println("Roll No : " + s.getRollno());
//            System.out.println("Name    : " + s.getName());
//            System.out.println("Marks   : " + s.getMarks());
//            System.out.println("-----------------------------");
//        }
    }
}

