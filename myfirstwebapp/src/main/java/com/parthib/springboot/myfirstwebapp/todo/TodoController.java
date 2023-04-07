package com.parthib.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name") 
public class TodoController {

	private TodoService todoservice = new TodoService();
	
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}


	@RequestMapping("list-todo")
	public String getTodos(String name,ModelMap model) {
		List<Todo> todos = todoservice.findByUser(name);
		model.addAttribute("todos", todos);
		return "Todo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "AddTodo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.POST)
	public String addNewTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "AddTodo";
		}
		String username = (String)model.get("name");
		todoservice.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(5), false);
		return "redirect:list-todo";
	}
	
	@RequestMapping(value="delete-todo")
	public String deleteTodoById(@RequestParam int id) {
		todoservice.deleteById(id);
		return "redirect:list-todo";
	}
	
}
