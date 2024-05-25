package com.ashokit.service;

import in.ashokit.Iengine;

public class Car 
   {
	Iengine Eng;
	public Car(Iengine Eng) {
		this.Eng = Eng;
		
	}
	public void runCar() {
		boolean method =Eng.startengine();
		
		
		if (method) {
			System.out.println("engine started....");
			
		}
		else {
			System.out.println("engine not started....");
		}
	}

}
