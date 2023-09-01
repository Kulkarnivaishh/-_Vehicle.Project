package com.jbk;

public class Vehicle {
	private String name;
	private int CurrentSpeed;
	private int CurrentDirection;
	
	public Vehicle(String name) {
		this.name = name;
		this.CurrentSpeed = 0;
		this.CurrentDirection = 0;
	}
	public void stear(int direction) {
		this.CurrentDirection += direction;
		System.out.println("Stear method called: steering at" + CurrentDirection + "degress.");
	}
	public void move (int speed,int direction) {
		CurrentSpeed=speed;
		CurrentDirection=direction;
		System.out.println("move method called : moving at " + CurrentSpeed+ " is direction" +CurrentDirection);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentSpeed() {
		return CurrentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		CurrentSpeed = currentSpeed;
	}
	public int getCurrentDirection() {
		return CurrentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		CurrentDirection = currentDirection;
	}
	
	
	public void stop() {
		this.CurrentSpeed=0;
		System.out.println("Vehicle is stopped");
		
	}
}
