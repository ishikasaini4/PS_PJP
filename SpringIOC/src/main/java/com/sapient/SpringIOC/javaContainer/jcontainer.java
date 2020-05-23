package com.sapient.SpringIOC.javaContainer;

import org.springframework.context.annotation.*;

import com.sapient.SpringIOC.EmpMap;
import com.sapient.SpringIOC.Employee;

@Configuration
public class jcontainer {
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public EmpMap getMap() {
		return new EmpMap();
	}
}
