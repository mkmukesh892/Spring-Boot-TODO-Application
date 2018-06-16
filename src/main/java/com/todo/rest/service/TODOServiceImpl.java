package com.todo.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.rest.dao.TODODao;
import com.todo.rest.model.ToDo;
@Service("todoService")
public class TODOServiceImpl implements TODOService {
	@Autowired
	private TODODao todoDao;
	@Override
	public void addTask(ToDo todo) {
		todoDao.save(todo);

	}

	@Override
	public List<ToDo> getAllTask() {
		return todoDao.findAll();
	}

	@Override
	public void editTask(ToDo todo) {
	todoDao.save(todo);
	}

	@Override
	public void deleteTask(Integer id) {
		todoDao.deleteById(id);

	}

	@Override
	public ToDo findOne(Integer id) {
		// TODO Auto-generated method stub
		return todoDao.getOne(id);
	}

}
