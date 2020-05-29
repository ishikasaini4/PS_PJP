package com.sapient.junitTesting;

import java.util.ArrayList;

public class AddEmployee {
	ArrayList<Employee> list;

	public AddEmployee() {
		list = new ArrayList<Employee>();
	}

	private boolean Emp_NullOrEmpty(Employee emp) {
		if (emp == null || emp.getName() == "" || emp.getName() == null 
			|| emp.getCity() == "" || emp.getCity() == null)
			return true;
		return false;
	}
	
	private boolean InvalidId(int id) {
		return (id<0)? true:false;
	}
	
	public void addEmployee(Employee emp) {
		
		if (InvalidId(emp.getId())==true)
			throw new IllegalArgumentException();
			
		else if(Emp_NullOrEmpty(emp) == true)
			throw new NullPointerException();
		
		list.add(emp);
	}

	

	public Employee getEmployee(int id) {
		Employee res = null;

		for (Employee e : list) {
			if (e.getId() == id) {
				res = e;
				break;
			}
		}
		return res;
	}
}
