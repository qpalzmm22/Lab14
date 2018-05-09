package edu.handong.csee.java.lab14.prob3;

import java.util.*;

public class Powercalc {
	public long power(int n, int p) throws Exception{
		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		}
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		return (long)Math.pow(n, p);
	}
	public static void main(String[] args) {
		int n, p;
		Powercalc exceptionTester = new Powercalc();
		Scanner keyboard = new Scanner(System.in);
		while(keyboard.hasNextInt()) {
			n = keyboard.nextInt();
			p = keyboard.nextInt();
			
			try {
				System.out.println(exceptionTester.power(n,p)); 
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
