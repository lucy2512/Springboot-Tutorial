package com.parthib.springboot3.learnjpaandhibernate.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course>findByName(String name);
	List<Course>findByAuthor(String author);
}
