package com.sapient.week1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CheckEvenTest{
	private CheckEven app;
	
	@Before
	public void setup(){
		app = new CheckEven();
	}
	
	@Test
	public void test_case_1(){
		boolean res = app.check(24);
		assertTrue(res == true);
	}
	
	@Test
	public void test_case_2(){
		boolean res = app.check(15);
		assertTrue(res == false);
	}
	
	@Test
	public void test_case_3(){
		boolean res = app.check(0);
		assertTrue(res == true);
	}
	
}