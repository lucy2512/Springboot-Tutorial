package com.example.springboot.learnspringboot;

public class Course {

	private long Id;
	private String CourseName;
	private String Author;
	
	public Course(long id, String courseName, String author) {
		super();
		Id = id;
		CourseName = courseName;
		Author = author;
	}

	public long getId() {
		return Id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public String getAuthor() {
		return Author;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", CourseName=" + CourseName + ", Author=" + Author + "]";
	}
	
	
	
	
}
