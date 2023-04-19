package com.xworkz.mockito.todoservices.business;

import java.util.List;

public interface ToDoServices {

	public List<String> getToDos(String user);

	public void deleteToDos(String doString);
}
