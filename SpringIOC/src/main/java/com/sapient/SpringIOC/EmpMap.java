package com.sapient.SpringIOC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpMap {
	private Map<Integer, Employee>m;
	
	public EmpMap(){
		m = new HashMap<Integer, Employee>();
	}
	
	public void insertInMap() {
		Scanner scn = new Scanner(System.in);
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("spring.xml"); 
		
		System.out.println("Employee Data: id, name, city");
		for(int i = 0; i<5; i++) {
			int id = scn.nextInt();
			String name = scn.next();
			String city = scn.next();
			
			Employee emp = (Employee) appcontext.getBean("emp");
			emp.setId(id);
			emp.setName(name);
			emp.setCity(city);
			
			m.put(id, emp);
		}
	}

	public void search_Id(int id) {
		if(m.containsKey(id)==true) {
			System.out.println(m.get(id));
		}else {
			System.out.println("No data");
		}
	}
}

