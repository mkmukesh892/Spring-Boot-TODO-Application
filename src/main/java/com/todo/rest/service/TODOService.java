package com.todo.rest.service;

import java.util.List;

import com.todo.rest.model.ToDo;

public interface TODOService {
public void addTask(ToDo todo);
public List<ToDo> getAllTask();
public void editTask(ToDo todo);
public void deleteTask(Integer id);
public ToDo findOne(Integer id);

}
