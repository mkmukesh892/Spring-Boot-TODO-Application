package com.todo.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TODO")
public class ToDo {
	@Id
	@Column(name="taskid")
	private int taskId;
	@Column(name="taskname")
	private String taskName;
	@Column(name="isdone")
	private boolean isDone;
	@Column(name="createdat")
	private String createdAt;
	@Column(name="doneat")
	private String doneAt;
	public ToDo() {
		
	}
	public ToDo(int taskId, String taskName, boolean isDone, String createdAt, String doneAt) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.isDone = isDone;
		this.createdAt = createdAt;
		this.doneAt = doneAt;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getDoneAt() {
		return doneAt;
	}
	public void setDoneAt(String doneAt) {
		this.doneAt = doneAt;
	}
	
	public void merge(ToDo todo) {
		setTaskName(todo.getTaskName());
		setDone(todo.isDone());
		setCreatedAt(todo.getCreatedAt());
		setDoneAt(todo.getDoneAt());
	}
}
