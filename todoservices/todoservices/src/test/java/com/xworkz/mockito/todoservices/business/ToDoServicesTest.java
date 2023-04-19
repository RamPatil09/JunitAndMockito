package com.xworkz.mockito.todoservices.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ToDoServicesTest {

	@Mock
	private ToDoServices serviceMock;

	@InjectMocks
	private ToDoBusiness business;

	@Spy
	private List<String> arrayListSpy;

	@Test
	public void deleteToDoUsing_BDD() {

		// Given
		List<String> combinedList = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate",
				"Use Spring MVC");

		when(serviceMock.getToDos("dummy")).thenReturn(combinedList);

		arrayListSpy.add("Mockito1");
		arrayListSpy.add("Mockito2");

		// when
		business.deleteToDoNotRelated("dummy");

		// Then
		verify(arrayListSpy).add("Mockito1");
		verify(arrayListSpy).add("Mockito2");
		verify(serviceMock, times(1)).deleteToDos("Use Spring MVC");
		verify(serviceMock, never()).deleteToDos("Use Hibernate Java");
		verify(serviceMock, never()).deleteToDos("Use Hibernate");

		assertEquals(2, arrayListSpy.size());

		System.out.println("test is working...");

	}
}
