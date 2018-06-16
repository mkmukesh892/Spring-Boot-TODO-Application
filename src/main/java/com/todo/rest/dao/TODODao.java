package com.todo.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.rest.model.ToDo;

public interface TODODao extends JpaRepository<ToDo, Integer> {

}
