package edu.handong.csee.java.lab14.prob6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean validName = false,
				validAge = false, 
				validRace = false;
		
		CustomID racePlayer = new CustomID();
		Scanner keyboard = new Scanner(System.in);
		
		while((!validName || !validAge) || !validRace) {
			if(!validName){
				try {
					System.out.print("Enter your name: ");
					String name = keyboard.nextLine();
					racePlayer.setName(name);
					System.out.println("Name is valid");
					System.out.println("Name: " + name);
					validName = true;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
			if(!validAge){
				try {
					System.out.print("Enter your age: ");
					int age = keyboard.nextInt();
					racePlayer.setAge(age);
					System.out.println("Age is valid");
					System.out.println("Age: "+ age);
					validAge = true;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
			if(!validRace){
				try {
					System.out.print("Enter your race: "); 
					String race = keyboard.next();
					racePlayer.setRace(race);
					System.out.println("Race is valid");
					System.out.println("race: " + race);
					validRace = true;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
