package com.parthib.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {

	private int Id;
	private String name;
	
	@Size(min=10,message="Enter at least 10 characters")
	private String description;
	
	private LocalDate deadline;
	private boolean done;
	
	public Todo(int id, String name, String description, LocalDate deadline, boolean done) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.done = done;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public boolean getdone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [Id=" + Id + ", name=" + name + ", description=" + description + ", deadline=" + deadline
				+ ", done=" + done + "]";
	}
	
	
	
	
}
