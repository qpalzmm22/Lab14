package edu.handong.csee.java.lab14.prob2;

import java.util.*;

public class In_exception {
	private int x;
	private int y;
	
	public In_exception() {
	}
	
	public void twoNumberDivider() {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.print("x: ");
			this.x = keyboard.nextInt();
			System.out.print("y: ");
			this.y = keyboard.nextInt();
			System.out.println(this.x/this.y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchExeption");
		}
		catch(Exception e) {
			System.out.println("Other error"+ e.getMessage());
		}
		finally {
			keyboard.close();
		}
	}
	public static void main(String args[]) {
		In_exception exceptionDetector= new In_exception();
		exceptionDetector.twoNumberDivider(); 
	}
}
