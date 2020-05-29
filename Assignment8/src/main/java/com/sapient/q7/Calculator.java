package com.sapient.q7;

public class Calculator extends Inputs{
	
	public void Add() {
		setRes(num1+num2);
	}
	
	public void Subtract() {
		setRes(num1-num2);
	}
	
	public void Multiply() {
		setRes(num1*num2);
	}
	
	public void Divide() {
		setRes(num1/num2);
	}
	
	public void Modulus() {
		setRes(num1%num2);
	}
}
