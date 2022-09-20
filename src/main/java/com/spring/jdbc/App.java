package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext context = new ClassPathXmlApplicationContext(
//    		   "com/spring/jdbc/config.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
//       JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
       
       //insert query
//       String query = "insert into Student(id, name, address) values(?,?,?)";
       
       //fire query
//       int update = template.update(query, 101, "Taniya Das", "Delhi");
//       System.out.println("Number of row(s) inserted is "+ update);
       StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//       Student student = new Student();
//       student.setId(102);
//       student.setName("Raj Sen");
//       student.setAddress("Hyderabad");
//       int row = studentDao.insert(student);
//       System.out.println("Number of row(s) inserted is "+ row);
       
//       Student student = studentDao.getStudent(101);
//       System.out.println(student);
       List<Student> student = studentDao.getAllStudents();
       for(Student s: student) {
    	   System.out.println(s);
       }
     
    }
}
