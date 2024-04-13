package com.application.model;

public class ExitGate {
	
	ParkingSpotManagerFactory factory;
	
	public ExitGate(ParkingSpotManagerFactory factory){
		this.factory=factory;
	}
	
	public void removeVechile(Vechile v){
		ParkingSpotManager manager = factory.getParkingSpotManager(v, null);
		manager.removeVechile(v);
	}
}
