package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception{
	private String[] races = {"Vulcans", "Romulan", "Klingons"};
	
	public void setName(String name) throws Exception{
		if(name.length() < 5)
			throw new Exception("Your name is short! Try again!");
	}
	
	public void setAge(int age) throws Exception{
		if(age < 18)
			throw new Exception("You are too young! Try again!");
	}
	
	public void setRace(String race) throws Exception{
		boolean validRace = false;
		for(String r : races) {
			if(r.equalsIgnoreCase(race))
				validRace = true;
		}
		if(!validRace)
			throw new Exception(race + "! Try again.");
	}
}
