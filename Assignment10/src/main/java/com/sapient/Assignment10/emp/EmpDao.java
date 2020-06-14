package com.sapient.Assignment10.emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmpDao {

	private static List<Employee> emp = new ArrayList<>();

	static {
		emp.add(new Employee(1, "Adam", "Delhi"));
		emp.add(new Employee(2, "Eve", "Mumbai"));
		emp.add(new Employee(3, "Julie", "Bangalore"));
	}

	public String insertData(Employee e) {
		emp.add(e);
		return "Record Inserted.";
	}

	public String deleteData(int id) {
		Iterator<Employee> iterator = emp.iterator();

		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getId() == id) {
				iterator.remove();
				return "Record Deleted.";
			}
		}
		return "Record Not Found.";
	}

	public List<Employee> getAll() {
		return emp;
	}

	public Employee findById(int id) {
		for (Employee e : emp) {
			if (e.getId() == id)
				return e;
		}
		return null;
	}

	public Employee findByName(String name) {
		for (Employee e : emp) {
			if (e.getName().trim().equals(name.trim()))
				return e;
		}
		return null;
	}

	public String modifyData(Employee ne,int id) {
		for (Employee e : emp) {
			if (e.getId() == id) {
				e.setName(ne.getName());
				e.setCity(ne.getCity());

				return "Data modified.";
			}
		}
		return "Data does not exist.";
	}

}
