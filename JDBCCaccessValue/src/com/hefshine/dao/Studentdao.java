package com.hefshine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hefshine.beans.Student;

@Component(value = "sd")
public class Studentdao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String getStudentName(int rollNumber) {

		String sql = "SELECT fname FROM student_info WHERE id = " + rollNumber;

		return jdbcTemplate.queryForObject(sql, String.class);
	}
	

	
	
	
	//--------------------------select All data-----------------
	public Student getById(int rollNumber) {
		String query="select * from student_info where id="+rollNumber;
		return jdbcTemplate.queryForObject(query, new StudentMapper());
	}
	
	
	private class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int row) throws SQLException {
			Student student=new Student();
			student.setRollNumber(rs.getInt("rollNumber"));
			student.setFirstName(rs.getString("fName"));
			student.setLastName(rs.getString("lName"));
			return student;
		}

		
		}
		
	}


