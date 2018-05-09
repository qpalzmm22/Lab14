package edu.handong.csee.java.lab14.prob6;	// makes it a package

public class CustomID extends Exception{	// this class inherits Exception class
	private String[] races = {"Vulcans", "Romulan", "Klingons"};	// kinds of races
	
	public void checkName(String name) throws Exception{	// this method throws exception when found
		if(name.length() < 5)	// when length of the name is less than 5
			throw new Exception("Your name is short! Try again!");	// throw following exception
	}
	
	public void checkAge(int age) throws Exception{	// this method throws exception when found
		if(age < 18)	// when age is less than 18
			throw new Exception("You are too young! Try again!");	//throw following exception
	}
	
	public void checkRace(String race) throws Exception{	// this method throws exception when found
		boolean validRace = false;	// a variable to check if the race is valid
		for(String r : races) {	// for all the races in the races
			if(r.equalsIgnoreCase(race))	// if the races contain race
				validRace = true;	// it's valid race
		}
		if(!validRace)	// if it's not valid race
			throw new Exception(race + "! Try again.");	// throw exception
	}
}
