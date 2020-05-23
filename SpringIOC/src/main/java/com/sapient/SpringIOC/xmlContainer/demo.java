package com.sapient.SpringIOC.xmlContainer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sapient.SpringIOC.EmpMap;

public class demo {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("spring.xml");
		Scanner scn = new Scanner(System.in);
		EmpMap map = (EmpMap) appcontext.getBean("map");
		map.insertInMap();
		
		System.out.println("Enter id to search Employee: ");
		int id = scn.nextInt();
		
		map.search_Id(id);
	}

}
