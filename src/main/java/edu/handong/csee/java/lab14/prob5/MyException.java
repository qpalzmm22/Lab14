package edu.handong.csee.java.lab14.prob5; // makes it a package

public class MyException extends Exception{	// this class inherits Exception
	private String message;	// this variable stores message for exception
	public MyException() {	// default constructor
		super();	// use default constructor of Exception
	}
	public MyException(String message) {	// a constructor with String
		super(message);	// uses constructor with String of Exception
		this.message = message;	// sets the message by given String
	}
	
	public MyException(Throwable cause) {	// a constructor with Throwable
		super(cause);	// uses constructor with Throwable of Exception
	}
	public String toString() {	// this method gives the exception messsage 
		return message;	// returns exception message
	}
}
