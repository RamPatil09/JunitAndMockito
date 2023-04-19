package com.xworkz.mockito.todoservices.business;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {

	private ToDoServices doServices;

	public ToDoBusiness(ToDoServices doServices) {
		super();
		this.doServices = doServices;
	}

	public List<String> getToDoHibernates(String user) {

		List<String> hibernateList = new ArrayList<>();
		List<String> combinedList = doServices.getToDos(user);

		for (String todo : combinedList) {
			if (todo.contains("Hibernate")) {
				hibernateList.add(todo);
			}

		}
		return hibernateList;
	}

	public void deleteToDoNotRelated(String user) {
		List<String> combinedList = doServices.getToDos(user);

		for (String todo : combinedList) {
			if (!todo.contains("Hiberate")) {
				doServices.deleteToDos(todo);
			}
		}
	}
}
