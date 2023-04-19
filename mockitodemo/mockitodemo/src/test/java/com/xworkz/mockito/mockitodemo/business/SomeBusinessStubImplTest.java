package com.xworkz.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.xworkz.mockito.mockitodemo.business.SomeBusinessImpl;

class SomeBusinessStubImplTest {

	@Test
	void findGreatesFromAllData_basicScenario() {
		DataServices dataServiceStub1 = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub1);
		int value = businessImpl.findGreatesFromAllData();
		assertEquals(25, value);
	}

	@Test
	void findGreatesFromAllData_onlyOneData() {
		DataServices dataServiceStub2 = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub2);
		int value = businessImpl.findGreatesFromAllData();
		assertEquals(35, value);
	}

	@Test
	void findGreatesFromAllData_withEightData() {
		DataServices dataServiceStub3 = new DataServiceStub3();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub3);
		int value = businessImpl.findGreatesFromAllData();
		assertEquals(4221, value);
	}
}

class DataServiceStub1 implements DataServices {

	@Override
	public int[] retriveAllData() {
		return new int[] { 25, 15, 5 };
	}

}

class DataServiceStub2 implements DataServices {

	@Override
	public int[] retriveAllData() {
		return new int[] { 35 };
	}
}

class DataServiceStub3 implements DataServices {

	@Override
	public int[] retriveAllData() {
		return new int[] { 35, 99, 43, 21, 5, 53, 224, 4221 };
	}
}
