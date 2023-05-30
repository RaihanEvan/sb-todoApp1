package com.raihan.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	public TodoController(TodoService ts) {
		super();
		this.ts = ts;
	}
	private TodoService ts;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap mp) {
		List<Todo> todos = ts.findByUsername("raihan");
		mp.addAttribute("todos",todos);
		return "listTodos";
	}


	

}
