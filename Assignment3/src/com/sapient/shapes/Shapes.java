package com.sapient.shapes;

import java.util.Scanner;

public class Shapes{
	private int numberOfSides;
	
	
	public void calculateShapeArea(int shape,int sideValue) {	
		numberOfSides = shape;
		
		if(numberOfSides==1) {
			Circle.calculateArea(sideValue);
			
		}else if(numberOfSides==3) {
			Triangle.calculateArea(sideValue);
			
		}else if(numberOfSides==4) {
			Square.calculateArea(sideValue);
			
		}else {
			System.out.println("No shapes present");
		}
	}	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number of sides of shape : ");
		int shape = scn.nextInt();
		System.out.println("Enter side value : ");
		int side = scn.nextInt();
		
		Shapes polygon = new Shapes();
		polygon.calculateShapeArea(shape, side);
		
	}
}
