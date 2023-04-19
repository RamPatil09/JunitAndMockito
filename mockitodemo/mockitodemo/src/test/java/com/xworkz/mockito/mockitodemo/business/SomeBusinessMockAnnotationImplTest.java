package com.xworkz.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationImplTest {

	@Mock
	private DataServices dataServices;

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findGreatesFromAllData_basicScenario() {
		when(dataServices.retriveAllData()).thenReturn(new int[] { 25, 15, 10 });
		assertEquals(25, businessImpl.findGreatesFromAllData());
	}

	@Test
	void findGreatesFromAllData_oneData() {
		when(dataServices.retriveAllData()).thenReturn(new int[] { 35 });
		assertEquals(35, businessImpl.findGreatesFromAllData());
	}

	@Test
	void findGreatesFromAllData_FiveData() {
		when(dataServices.retriveAllData()).thenReturn(new int[] { 35 , 99, 89, 75, 48});
		assertEquals(99, businessImpl.findGreatesFromAllData());
	}
}
