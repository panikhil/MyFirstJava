package com.rakuten.basics;

public class VehiclesApp {

	public static void main(String[] args) {
		Vehicle v = new Car(); //since vehicle is an abstract class we are 
		// creating v reference that is pointing to the object of its extended class Car
		Driver d = new Driver();
		
		d.testDrive(v);

	}

}