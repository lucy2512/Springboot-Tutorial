package com.parthib.springboot3.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.parthib.springboot3.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springjdbctemp;
	
	private static String INSERT_QUERY =
			"""
				insert into course (id,name,author)
				values(?,?,?);
			""";
	private static String DELETE_QUERY =
			"""
				delete from course where id = ?;
			""";
	private static String SELECT_QUERY =
			"""
				select * from course where id = ?;
			""";
	
	public void insert(Course course) {
		springjdbctemp.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		springjdbctemp.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		//ResultSet => Bean => RowMapper
		return springjdbctemp.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
	}
}
