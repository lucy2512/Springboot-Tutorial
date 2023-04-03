package com.springboot2.learnspringboot2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				
			new Course(1,"Learn AWS","Parthib"),
			new Course(2,"Learn DevOps","Lucy"),
			new Course(2,"Learn Azure","Lucy2512")
		);
	}
}
