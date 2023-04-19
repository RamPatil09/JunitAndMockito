package com.xworkz.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	private MyMath math = new MyMath();

	@Test
	void calculateSum_sevenArray() {
		assertEquals(28, math.calculateSum(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
	}

	@Test
	void calculateSum_threeArray() {
		assertEquals(6, math.calculateSum(new int[] { 1, 2, 3}));
	}

}
