package com.sapient.junitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddEmployeeTest {
	
	AddEmployee ob ;
	Employee emp,tmp;
	
	@Before
	public void setup() {
		ob = new AddEmployee();
		tmp = new Employee(11,"Sapient","Mumbai");
		ob.addEmployee(tmp);
		
	}
	
	@After
	public void teardown() {
		emp = null;
	}
	
	
	@Test(expected = IllegalArgumentException.class)	//id is invalid
	public void addEmployee_IdInvalid() {
		emp = new Employee(-89,"Donna","Bangalore");
		ob.addEmployee(emp);
	}
	
	
	@Test(expected = NullPointerException.class)		//employee is null
	public void addEmployee_NullCase() {
		ob.addEmployee(emp);
	}
	
	
	@Test(expected = NullPointerException.class) 		//name is null
	public void addEmployee_NameNull() {
		emp = new Employee(15,null,"Bangalore");
		ob.addEmployee(emp);
	}
	
	
	@Test(expected = NullPointerException.class)		//name is empty
	public void addEmployee_NameEmpty() {
		emp = new Employee(15,"","Bangalore");
		ob.addEmployee(emp);
	}
	
	
	@Test(expected = NullPointerException.class)		//city is null
	public void addEmployee_CityNull() {
		emp = new Employee(15,"Eric",null);
		ob.addEmployee(emp);
	}
	
	@Test(expected = NullPointerException.class)		//city is empty
	public void addEmployee_CityEmpty() {
		emp = new Employee(15,"Eric","");
		ob.addEmployee(emp);
	}
	
	@Test
	public void addEmployee_shouldAdd() {				//add employee in list
		emp = new Employee(23, "Eclipse", "Bangalore");
		ob.addEmployee(emp);
		assertEquals(2, ob.list.size());
	}
	
	
	@Test
	public void getEmployee_shouldGiveId() {			//Employee present in list
		emp = ob.getEmployee(11);
		assertEquals(tmp, emp);

	}

	@Test
	public void getEmployee_NullCase() {				//Employee not in list
		emp = ob.getEmployee(58);
		assertNull(emp);
	}

}
