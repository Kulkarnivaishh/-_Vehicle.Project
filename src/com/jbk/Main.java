package com.jbk;

public class Main {
	private static String name;
	private static boolean isManual;

	public static void main(String[] args) {
SUV fortuner=new SUV("fortuner",false);
fortuner.move(40 , 0);
		
fortuner.accelerate(20);
//fortuner.accelerate(-60);

System.out.println("CurrentGear :" +fortuner.getCurrentgear());
System.out.println("CurrentSpeed  :" +fortuner.getCurrentSpeed());


}
}
