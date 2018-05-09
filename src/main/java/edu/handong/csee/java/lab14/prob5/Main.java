package edu.handong.csee.java.lab14.prob5; // makes it a package

import java.util.*;	// import Scanner

public class Main {	// class to catch and throw exception
	public static void myTest(String str) throws MyException{	// a method to throw MyException 
		if(str.equalsIgnoreCase("null"))	//if the given string is null
			throw new MyException("String val is null");	// throw a MyException
		else	// if not
			System.out.println("String val is: "+ str); 	// print the value
	}
	public static void main(String[] args) {	// main method to test
		// TODO Auto-generated method stub
		try {	// try to find any thrown exception
			Scanner keyboard = new Scanner(System.in);	// instantiate Scanner to user nextLine
			String str = keyboard.nextLine(); //stores the string at str 	
			Main.myTest(str);	// test if str passes the MyException test
		}
		catch(MyException e) {	// if MyException was thrown
			System.out.println("Inside catch block: "+ e);	//print the following with e.tostring()
		}
	}

}
