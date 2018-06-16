package com.todo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.rest.model.ToDo;
import com.todo.rest.service.TODOService;

@RestController
public class TODOController {
@Autowired
private TODOService todoService;
@RequestMapping(value = "/saveTODO", method = RequestMethod.POST)
public void createNewTODO(@RequestBody ToDo todo) {
		todoService.addTask(todo);
	}
@RequestMapping(value="/todos", method=RequestMethod.GET)
public List<ToDo> listAllTodo(){
	return todoService.getAllTask();
}
@RequestMapping(value="/editTODO", method=RequestMethod.POST)
public void updateTODO(@RequestParam int id, @RequestBody ToDo todo) {
	ToDo todoItem=todoService.findOne(id);
	todoItem.merge(todo);
	todoService.editTask(todoItem);
}
@RequestMapping(value="/deleteTODO", method=RequestMethod.DELETE)
public void deleteTODO(@RequestParam int id) {
	todoService.deleteTask(id);
}
}
