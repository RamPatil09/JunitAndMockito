package com.xworkz.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockImplTest {

	@Test
	void findGreatesFromAllData_basicScenario() {

		DataServices dataServices = mock(DataServices.class);
		when(dataServices.retriveAllData()).thenReturn(new int[] { 25, 15, 10 });
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServices);
		assertEquals(25, businessImpl.findGreatesFromAllData());
	}
	
	@Test
	void findGreatesFromAllData_oneData() {

		DataServices dataServices = mock(DataServices.class);
		when(dataServices.retriveAllData()).thenReturn(new int[] { 35});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServices);
		assertEquals(35, businessImpl.findGreatesFromAllData());
	}
}
