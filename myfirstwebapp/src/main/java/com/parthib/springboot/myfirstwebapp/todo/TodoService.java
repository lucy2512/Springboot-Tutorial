package com.parthib.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	private static int todoscount = 0;
	
	static {
		todos.add(new Todo(++todoscount,"Parthib","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoscount,"Lucy","Learn Azure",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoscount,"Deb","Learn JAVA",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoscount,"Rajdeep","Learn DevOps",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoscount,"Sugata","Learn Django",LocalDate.now().plusYears(1),false));
	}
	
	public List<Todo> findByUser(String name){
		return todos;
	}
	
	public void addTodo(String username,String description, LocalDate date, boolean done) {
		Todo todo = new Todo(++todoscount,username,description,date,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		//Functional Programming (Lambda function)
		Predicate<? super Todo> predeicate = todos -> todos.getId() == id;
		todos.removeIf(predeicate);
	}
}
