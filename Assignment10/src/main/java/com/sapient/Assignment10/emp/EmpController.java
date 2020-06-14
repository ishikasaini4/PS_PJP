package com.sapient.Assignment10.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	private EmpDao daoOb;

	//get all employees
	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees() {
		return daoOb.getAll();
	}

	//get an employee by id
	@GetMapping("/employees/id/{id}")
	public EntityModel<Employee> retrieveEmployeeById(@PathVariable int id) {

		Employee e = daoOb.findById(id);
		EntityModel<Employee> model = EntityModel.of(e);
		return model;
	}

	//get an employee by name
	@GetMapping("/employees/name/{name}")
	public EntityModel<Employee> retrieveEmployeeByName(@PathVariable String name) {

		Employee e = daoOb.findByName(name);
		EntityModel<Employee> model = EntityModel.of(e);
		return model;
	}
	
	//insert an employee
	@PostMapping("/employees")
	public String insertEmployee(@RequestBody Employee e) {
		return daoOb.insertData(e);
	}
	
	//modify an employee
	@PutMapping("/employees/{id}")
	public String modifyEmployee(@PathVariable int id, @RequestBody Employee e) {
		return daoOb.modifyData(e,id);
	}
	
	//delete an employee
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		String res = daoOb.deleteData(id);
		return res;
	}
}
