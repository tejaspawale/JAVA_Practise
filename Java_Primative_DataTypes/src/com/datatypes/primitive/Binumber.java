package com.datatypes.primitive;

public class Binumber {
	private int number1;
	private int number2;

	public Binumber(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	
	}
	
	public int add() {
		return this.number1 + this.number2;
	}
	
	public int multiply() {
		return this.number1 + this.number2;
	}
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public void doubleValue() {
		this.number1 *=2;
		this.number2*=2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binumber numbers = new Binumber(2,3);
		System.out.println(numbers.add() + "Addition of two numbers");
		System.out.println(numbers.multiply() + "Addition of two numbers");
		numbers.doubleValue();
		
		System.out.println(numbers.getNumber1() + "getter value of number1");
		System.out.println(numbers.getNumber2() + "getter value of number2");
		
		
		
	}

}
