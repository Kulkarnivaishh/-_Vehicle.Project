package com.jbk;

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private String type;
	private int gears;
	private boolean isManual;
	private int currentgear;
	public Car(String name, int wheels, int doors, int gears, boolean isManual,String type) {
		super(name);
		this.type=type;
		this.gears=gears;
		this.doors=doors;
		this.isManual=isManual;
		this.wheels=wheels;
		currentgear=1;//by default
	}
public void ChangeGear(int newGear) {
	this.currentgear=newGear;
	System.out.println("change Gear method called: changed to" + this.currentgear + "gear");
}
public void changespeed(int newSpeed,int newDirection) {
	move(newSpeed,newDirection);
	System.out.println(" change speed method called: speed - > "+ newSpeed +" direction ->" + newDirection);
}
public int getWheels() {
	return wheels;
}
public void setWheels(int wheels) {
	this.wheels = wheels;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getGears() {
	return gears;
}
public void setGears(int gears) {
	this.gears = gears;
}
public boolean isManual() {
	return isManual;
}
public void setManual(boolean isManual) {
	this.isManual = isManual;
}
public int getCurrentgear() {
	return currentgear;
}
public void setCurrentgear(int currentgear) {
	this.currentgear = currentgear;

}
}
