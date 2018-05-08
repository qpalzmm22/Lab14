package edu.handong.csee.java.lab14.prob2;	// makes it a package

import java.util.*;	// import to use Scanner and exceptions

public class In_exception { //a class to find type mismatch exception and denominator being 0 exception
	private int x;	// a variable to store numerator value
	private int y;	// a variable to store denominator value
	
	public In_exception() {	// a default constructor that does nothing
	}
	
	public void twoNumberDivider() {	// a method that prints any exceptions thrown
		Scanner keyboard = new Scanner(System.in);	// instantiate Scanner to use nextInt()
		try {	// try to find exceptions
			System.out.print("x: ");	// ask user for numerator
			this.x = keyboard.nextInt();	// stores it at x
			System.out.print("y: ");	// ask user for denominator
			this.y = keyboard.nextInt();	// stores it at y
			System.out.println(this.x/this.y);	// print the result of the x/y
		}
		catch(ArithmeticException e) {	// if ArithmeticException was thrown(denominator is 0)
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());	// print the following and the reason of the exception
		}
		catch(InputMismatchException e) {	// if InputMismatchException was thrown(either input is not 32bit signed integer) 
			System.out.println("java.util.InputMismatchExeption");	// print the following
		}
		catch(Exception e) {	// if other any other exception was thrown
			System.out.println("Other error"+ e.getMessage());	// print the following
		}
		finally {	// after all the exception handling
			keyboard.close(); // close the keyword for safety
		}
	}
	public static void main(String args[]) {	//main method to test the twoNumberDivider
		In_exception exceptionDetector= new In_exception();	// instantiate In_exception to use twoNumberDivier
		exceptionDetector.twoNumberDivider(); // execute the method, twoNumberDivier
	}
}
