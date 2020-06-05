package com.sapient.Model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMap {
	private Map<Integer,Student> map ;

	public StudentMap() {
		map = new HashMap<Integer,Student>();
	}
	
	public void insertIntoMap() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student s1 = (Student)context.getBean("sone");
		Student s2 = (Student)context.getBean("stwo");
		Student s3 = (Student)context.getBean("sthree");

		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
	}
	
	public Student searchById(int id) {
		
		Student res = (map.containsKey(id))? map.get(id) : null;
		return res;
	}
	
}
