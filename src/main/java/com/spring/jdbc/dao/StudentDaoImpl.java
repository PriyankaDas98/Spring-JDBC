package com.spring.jdbc.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public int insert(Student student) {
		String query = "insert into Student(id, name, address) values(?,?,?)";
		int row = jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
		
		return row;
	}

	public int update(Student student) {
		String query = "update Student set address = 'Asnasol' where id = 1";
		int r = jdbcTemplate.update(query, student.getAddress());
		return r;
	}

	public int delete(Student student) {
		String query="delete from Student where id='"+student.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	
	}


	public Student getStudent(int studentId) {
		String query = "select * from Student where id = ?";
//		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query, new RowMapperImpl(), studentId);
		return student;
	}


	public List<Student> getAllStudents() {
		
		String query = "select * from Student";
		List<Student> student = jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

}
