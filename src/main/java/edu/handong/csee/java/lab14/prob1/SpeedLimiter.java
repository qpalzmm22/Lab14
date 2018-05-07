package edu.handong.csee.java.lab14.prob1;

import java.util.*;

public class SpeedLimiter{
	private int speedLimit;
	private int xSpeed;
	
	public SpeedLimiter(int speedLimit, int xSpeed) {
		this.speedLimit = speedLimit;
		this.xSpeed = xSpeed;
	}
	
	public void warnSpeedLimit() {
		
		try{
			if(xSpeed > speedLimit) {
				throw new Exception("Speed Limit " + (this.speedLimit) + "km exceeded!");
			}
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("You are being fined.");
			}
		System.out.println("Your current speed: "+ xSpeed );
	}


	public static void main(String[] args) {
		System.out.print("Set the speed limit, officer: ");
		Scanner keyboard = new Scanner(System.in);
		int speedLimit = keyboard.nextInt();
		int randomSpeed = (int)(Math.random() * 100) + 1;
		SpeedLimiter speed = new SpeedLimiter(speedLimit, randomSpeed);
		speed.warnSpeedLimit();
		
		keyboard.close();
	}

}
