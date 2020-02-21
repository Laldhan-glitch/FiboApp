package com.lal.fibonacciapp;

import java.util.List;
import java.util.Scanner;

public class FibonacciUserInterface {
	private int inputNumber;

	int input() {
		System.out.println("Please enter the valid number for generating fibonacci series");
		Scanner scanner = new Scanner(System.in);
		inputNumber = scanner.nextInt();
		scanner.close();
		return inputNumber;
	}
	
	void dispaly(List<Integer> fibonacciSeriesList) {
		for (Integer num: fibonacciSeriesList) {
			System.out.println(num);
		}
	}

}
