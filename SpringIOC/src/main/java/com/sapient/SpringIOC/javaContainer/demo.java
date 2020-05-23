package com.sapient.SpringIOC.javaContainer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sapient.SpringIOC.EmpMap;

public class demo {

	public static void main(String[] args) {
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(jcontainer.class);
		EmpMap map = appcontext.getBean(com.sapient.SpringIOC.EmpMap.class);

		Scanner scn = new Scanner(System.in);
		map.insertInMap();
		
		System.out.println("Enter id to search Employee: ");
		int id = scn.nextInt();
		
		map.search_Id(id);
	}

}
