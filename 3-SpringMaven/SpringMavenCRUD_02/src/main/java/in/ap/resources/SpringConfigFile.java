package in.ap.resources;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

    @Bean
    public DataSource myDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3316/spring_jdbc_db"); 
        dataSource.setUsername("root"); 
        dataSource.setPassword("arvind");

        return dataSource;
    }

    @Bean
    public JdbcTemplate myJdbcTemplate(DataSource dataSource) {
    	
        return new JdbcTemplate(dataSource);
    }
}
