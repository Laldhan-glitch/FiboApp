package com.lal.fibonacciapp;

public class FibonacciApp {
	public static void main(String[] args) {
		FibonacciUserInterface userInput = new FibonacciUserInterface();
		int inputNumber=userInput.input();
		System.out.println(inputNumber);
	}
}
