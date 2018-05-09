package edu.handong.csee.java.lab14.prob4;	// makes it a package

import java.util.*;	// import Scanner
	
public class Boundary {	// a class that implements an array of size 5 and has a function that recieves a number
	private static int[] arr = new int[5]; // an static array with size 5 
	private static int index = 0;	// an index counter to differentiate the location for num every time it's executed 

	public void recieveInt(int num) {	// a method that recieves num in arr
		arr[index] = num;	// index-th arr becomes num
		System.out.println("arr[" + index + "] <- " + num);	//print the result
		index++;	// increase index
	}

	public static void main(String[] args) {	// main method to test Boundary class
		int num;	// a variable to receive number for the array
		Boundary bound = new Boundary();	// instantiate to use recieveInt()
		Scanner keyboard = new Scanner(System.in);	// instaticate to use nextInt()
		
		try {	// try to throw an exception
			for(;;) {	// infinite loop until exception is found
				System.out.print("Enter an interger: ");	// ask user for int for array
				num = keyboard.nextInt();	// recieve a number for array
				bound.recieveInt(num); // put num in array
			}
		}
		catch(ArrayIndexOutOfBoundsException e){	// if ArrayIndexOutOfBoundsException was found
			System.out.println("Invalid array index acess!");	// print the following
		}
		keyboard.close();	// close keyboard for safety
		
	}

}
