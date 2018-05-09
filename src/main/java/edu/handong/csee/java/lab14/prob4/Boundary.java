package edu.handong.csee.java.lab14.prob4;

import java.util.*;

public class Boundary {
	private static int[] arr = new int[5];
	private static int index = 0;

	public void recieveInt(int num) {
		arr[index] = num;
		System.out.println("arr[" + index + "] <- " + num);
		index++;
	}

	public static void main(String[] args) {
		int num;
		Boundary bound = new Boundary();
		Scanner keyboard = new Scanner(System.in);
		
		try {
			for(;;) {
				System.out.print("Enter an interger: ");
				num = keyboard.nextInt();
				bound.recieveInt(num);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid array index acess!");
		}
		keyboard.close();
		
	}

}
