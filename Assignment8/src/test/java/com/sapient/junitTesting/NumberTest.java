package com.sapient.junitTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {
	Number num;
	
	@Before
	public void setup() {
		num = new Number();
	}
	
	
	// Tests for Prime Number
	@Test
	public void checkPrime_True() {
		int result = num.checkPrime(19);
		assertEquals(1, result);
	}
	
	@Test
	public void checkPrime_False() {
		int result = num.checkPrime(30);
		assertEquals(0, result);
	}
	
	@Test
	public void checkPrime_One() {
		int result = num.checkPrime(1);
		assertEquals(0, result);
	}
	
	@Test
	public void checkPrime_Zero() {
		int result = num.checkPrime(0);
		assertEquals(0, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkPrime_Negative() {
		num.checkPrime(-19);
	}
	
	
	//Tests for ArmStrong Number
	@Test
	public void checkArmstrong_True() {
		boolean result = num.checkArmstrong(1634);
		assertTrue(result);
	}
	
	@Test
	public void checkArmstrong_False() {
		boolean result = num.checkArmstrong(55);
		assertFalse(result);
	}
	
	@Test
	public void checkArmstrong_Zero() {
		boolean result = num.checkArmstrong(0);
		assertTrue(result);
	}
	
	@Test
	public void checkArmstrong_One() {
		boolean result = num.checkArmstrong(1);
		assertTrue(result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkArmstrong_Negative() {
		num.checkArmstrong(-1634);
	}
	
	
	//Tests for Pallindrome Number
	@Test
	public void checkPallindrome_True() {
		boolean result = num.checkPallindrome(13431);
		assertTrue(result);
	}
	
	@Test
	public void checkPallindrome_False() {
		boolean result = num.checkPallindrome(6783);
		assertFalse(result);
	}
	
	@Test
	public void checkPallindrome_Zero() {
		boolean result = num.checkPallindrome(0);
		assertTrue(result);
	}
	
	@Test
	public void checkPallindrome_One() {
		boolean result = num.checkPallindrome(1);
		assertTrue(result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkPallindrome_Negative() {
		num.checkPallindrome(-13431);
	}
}
