package edu.handong.csee.java.lab14.prob6;	// makes it a package

import java.util.*;	// import java

public class Main {	// this class tests the CustomID
	public static void main(String[] args) {	// main method to check if according exceptions are thrown
		boolean validName = false,	// a variable to check if it's valid name
				validAge = false, 	// a variable to check if it's valid age
				validRace = false;	// a variable to check if it's valid race
		
		CustomID racePlayer = new CustomID();	// instantiate CusomID to use setName(), setAge(), setRace()
		Scanner keyboard = new Scanner(System.in);	// instantiate Scanner to use nextInt(), nextLine() 
		
		while((!validName || !validAge) || !validRace) {	// while name, age, or race is not valid
			if(!validName){	// if name is invalid
				try {	// try to find exception
					System.out.print("Enter your name: "); // ask user for name
					String name = keyboard.nextLine();	// receives name and stores it
					racePlayer.checkName(name);	//	check if the name passes the exception test
					System.out.println("Name is valid");	// print that the name passed the test
					System.out.println("Name: " + name);	// print the name 
					validName = true;						// change the state of validName to true so this sections is not called anymore
				}
				catch(Exception e) {						// if any exception was thrown
					System.out.println(e.getMessage());		// print the exception message
					continue;								// start the loop fresh
				}
			}
			if(!validAge){
				try {
					System.out.print("Enter your age: ");	// ask user for age
					int age = keyboard.nextInt();	// receives age and stores it
					racePlayer.checkAge(age);	//	check if the age passes the exception test
					System.out.println("Age is valid");	// print that the age passed the test
					System.out.println("Age: "+ age);	// print the age 
					validAge = true;					// change the state of validAge to true so this sections is not called anymore
				}
				catch(Exception e) {					// if any exception was thrown
					System.out.println(e.getMessage());	// print the exception message
					continue;							// start the loop fresh
				}
			}
			if(!validRace){
				try {
					System.out.print("Enter your race: "); 	// ask user for race
					String race = keyboard.nextLine();	// receives race and stores it
					racePlayer.checkRace(race);	//	check if the race passes the exception test
					System.out.println("Race is valid");	// print that the race passed the test
					System.out.println("race: " + race);	// print the race 
					validRace = true;						// change the state of validRace to true so this sections is not called anymore
				}
				catch(Exception e) {						// if any exception was thrown
					System.out.println(e.getMessage());		// print the exception message
				}
			}
		}
		keyboard.close(); // clsoe keyboard for safety
	}
}
