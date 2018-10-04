package com.yaa.test;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) 
			fact=fact*i;
		return fact;
	}

	public static int FirstFactorial(int num) {

		// code goes here
		/*
		 * Note: In Java the return type of a function and the parameter types being
		 * passed are defined, so this return call must match the return type of the
		 * function. You are free to modify the return type.
		 */
		if (num == 1)
			return 1;

		return num * FirstFactorial(num - 1);

	}
	
	public static String FirstReverse(String str) { 
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(9));
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
	}

}
