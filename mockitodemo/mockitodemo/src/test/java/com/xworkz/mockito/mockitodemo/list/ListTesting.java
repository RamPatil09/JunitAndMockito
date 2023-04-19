package com.xworkz.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTesting {

	@Test
	void simpleTest() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(3);
		assertEquals(3, mockList.size());
	}

	@Test
	void multipleReturn() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(1).thenReturn(2);
		assertEquals(1, mockList.size());
		assertEquals(2, mockList.size());
	}

	@Test
	void parameter() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("Something");
		assertEquals("Something", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}

	@Test
	void genericParameter() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("SomeOtherString");
		assertEquals("SomeOtherString", mockList.get(0));
		assertEquals("SomeOtherString", mockList.get(1));
	}
}
