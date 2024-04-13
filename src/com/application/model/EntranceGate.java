package com.application.model;

import java.util.List;

public class EntranceGate {
	
	ParkingSpotManagerFactory factory;
	
	public EntranceGate(ParkingSpotManagerFactory factory){
		this.factory=factory;
	}
	
	public ParkingSpot findParkingSpot(Vechile vechile,List<ParkingSpot> spots) {
		ParkingSpotManager manager = factory.getParkingSpotManager(vechile, spots);
		return manager.findParkingSpce();
	}
	
	public Ticket generateTicket(Vechile v,ParkingSpot spot,int entryTime) {
		 
		return null;
	}

}
