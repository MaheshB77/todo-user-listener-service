package com.todo.userlistener.models;

public class Todo {

	private String todoId;
	private String todoTitle;
	private String todoStatus;
	
	public Todo() {
		super();
	}
	public Todo(String todoTitle, String todoStatus) {
		super();
		this.todoTitle = todoTitle;
		this.todoStatus = todoStatus;
	}
	public Todo(String todoId, String todoTitle, String todoStatus) {
		super();
		this.todoId = todoId;
		this.todoTitle = todoTitle;
		this.todoStatus = todoStatus;
	}
	public String getTodoId() {
		return todoId;
	}
	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoStatus() {
		return todoStatus;
	}
	public void setTodoStatus(String todoStatus) {
		this.todoStatus = todoStatus;
	}
	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", todoTitle=" + todoTitle + ", todoStatus=" + todoStatus + "]";
	}
	
}
