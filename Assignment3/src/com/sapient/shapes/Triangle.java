package com.sapient.shapes;

public class Triangle {
	
	
	public static void calculateArea(int sides) {
		double ans = (Math.sqrt(3)/(4.0)) * sides * sides;
		System.out.printf("The area of the Triangle is %.4f", ans).println();
	}

}
