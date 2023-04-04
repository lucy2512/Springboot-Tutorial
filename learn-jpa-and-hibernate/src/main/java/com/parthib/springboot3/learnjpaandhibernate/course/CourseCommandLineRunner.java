package com.parthib.springboot3.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.parthib.springboot3.learnjpaandhibernate.course.Course;
import com.parthib.springboot3.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.parthib.springboot3.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn Maths with JPA", "Lucy"));
//		repository.insert(new Course(2, "Learn Computer", "Parthib"));
//		repository.insert(new Course(3, "Learn DJ", "Rajdeep"));
//		repository.delete(2);
//
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(3));
//	}
	
	
	//Spring Data JPA method
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn Maths with Spring Data JPA", "Lucy"));
		repository.save(new Course(2, "Learn Computer", "Parthib"));
		repository.save(new Course(3, "Learn DJ", "Rajdeep"));
		repository.save(new Course(4, "Learn JAVA", "Deb"));
		repository.save(new Course(5, "Learn Django", "Sugata"));
		repository.save(new Course(6, "Learn Pharmacy", "Avik"));
		repository.deleteById(2l);

		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.count());
		System.out.println(repository.findAll());
		System.out.println(repository.findByName("Learn Django"));
		System.out.println(repository.findByAuthor("Deb"));
	}
	

}
