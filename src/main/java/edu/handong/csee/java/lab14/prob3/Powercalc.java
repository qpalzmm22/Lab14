package edu.handong.csee.java.lab14.prob3;	//makes it a package

import java.util.*;	// import to use Scanner class

public class Powercalc {	// checks for two exceptions and throws it when found
	public long power(int n, int p) throws Exception{	// calculate n^p and throws any exceptions while doing it
		if(n < 0 || p < 0) {	// if n or p is less than 0
			throw new Exception("n or p should not be negative.");	// throw an exception
		}
		if(n == 0 && p == 0) {	// if n and p are both 0
			throw new Exception("n and p should not be zero.");	// throw an exception
		}
		return (long)Math.pow(n, p);	// calculate n^p and return it with long type
	}
	public static void main(String[] args) {	// main method to test Powercalc
		int n, p;	// variables for base and exponent 
		Powercalc exceptionTester = new Powercalc(); // instantiate to use power()
		Scanner keyboard = new Scanner(System.in);	// instantiate to use hasNextInt() and nextInt()
		while(keyboard.hasNextInt()) {	// while the input is int
			n = keyboard.nextInt();	// saves first value as base
			p = keyboard.nextInt();	// saves second value as exponent
			
			try {	// try to throw and exceptions
				System.out.println(exceptionTester.power(n,p));	// print the result of n^p 
			}
			catch(Exception e){	// if any exceptions are thrown
				System.out.println(e);	// print that exception
			}
		}
	}

}
