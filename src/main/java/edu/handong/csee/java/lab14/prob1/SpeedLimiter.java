package edu.handong.csee.java.lab14.prob1; // makes it a package

import java.util.*;	// import to use Scanner

public class SpeedLimiter{	// this class implements speed limiter, and test it in main channel
	private int speedLimit;	// a variable to store the speed limit
	private int xSpeed;	// speed of a vehicle
	
	public SpeedLimiter(int speedLimit, int xSpeed) {	// a constructor for 
		this.speedLimit = speedLimit;	// sets speedLimit by first parameter
		this.xSpeed = xSpeed;	// sets xSpeed by second parameter
	}
	
	public void warnSpeedLimit() {	// a method to check if xSpeed is greater than speedLimit
		try{	// try to find Exception 
			if(xSpeed > speedLimit) { // if speed is faster than the speedLimit
				throw new Exception("Speed Limit " + (this.speedLimit) + "km exceeded!");	// throws the exception
			}
			System.out.println("You are a law abiding citizen!");	// Tell the user xSpeed is lower than speedLimit
		}
		catch(Exception e) {	// if Exception was thrown
				System.out.println(e.getMessage());	//	print the exception message
				System.out.println("You are being fined.");	// print that the user is ont following the law
			}
		System.out.println("Your current speed: "+ xSpeed );	// print the xSpeed
	}


	public static void main(String[] args) {	// Main method to test the class
		System.out.print("Set the speed limit, officer: ");	// Ask for the speed limit
		Scanner keyboard = new Scanner(System.in);	//  Scanner to use nextInt()
		int speedLimit = keyboard.nextInt();	// receive input from user and save it on speedLimit
		int randomSpeed = (int)(Math.random() * 100) + 1;	// store random number range of [1, 100) at randomSpeed
		SpeedLimiter speed = new SpeedLimiter(speedLimit, randomSpeed);	// instantiate SpeedLimiter with speedLimit and randomSpeed
		speed.warnSpeedLimit();	// warn if the randomSpeed is greater than speedLimit
		
		keyboard.close();	// close keyboard for safety
	}

}
