package com.lal.fibonacciapp;

import java.util.List;

public class FibonacciApp {
	public static void main(String[] args) {
		FibonacciUserInterface fibonacciUserInterface = new FibonacciUserInterface();
		int inputNumber = fibonacciUserInterface.input();
//		System.out.println(inputNumber);

		GenerateFibonacciSeries generateFibonacciSeries = new GenerateFibonacciSeries();
		List<Integer> fibonacciNumberSeries = generateFibonacciSeries.generate(inputNumber);
		fibonacciUserInterface.dispaly(fibonacciNumberSeries);
	}
}
