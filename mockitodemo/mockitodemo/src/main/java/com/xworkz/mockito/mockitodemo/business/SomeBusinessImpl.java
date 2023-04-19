package com.xworkz.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataServices dataServices;

	public SomeBusinessImpl(DataServices dataServices) {
		super();
		this.dataServices = dataServices;
	}

	public int findGreatesFromAllData() {

		int[] data = dataServices.retriveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}
		return greatestValue;
	}

}

interface DataServices {

	int[] retriveAllData();
}