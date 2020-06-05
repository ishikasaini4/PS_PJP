package com.sapient.controllers;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapient.Model.Student;
import com.sapient.Model.StudentMap;

@Controller
//@ImportResource("classpath:spring.xml")
public class StudentController {
	
	public StudentController() {
		
	}
	
	@GetMapping(value="/input")
    public String showInputPage(ModelMap model){
        return "input";
    }
	
	@PostMapping(value="/input")
    public String showDisplayPage(ModelMap model, @RequestParam String id){
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		StudentMap stMap = (StudentMap)factory.getBean("Map");
		Student res = (Student)factory.getBean("student");
		
		int idi = Integer.parseInt(id);
		
		stMap.insertIntoMap();
		res = stMap.searchById(idi);
		
		if(res!=null) {
			model.put("name", res.getName());
			model.put("id", res.getId());
		}else {
			model.put("name", "NO DATA FOUND!");
			model.put("id", idi);
		}

        return "display";
    }

	
	
}
