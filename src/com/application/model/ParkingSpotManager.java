package com.application.model;

import java.util.List;

public abstract class ParkingSpotManager {
	
	ParkingSpotManager(List<ParkingSpot> list){
		this.list=list;
	}
	
	List<ParkingSpot> list;
	
	abstract ParkingSpot findParkingSpce();
	
	void addParkVechile(Vechile v) {
		ParkingSpot parkingSpot = this.findParkingSpce();
		parkingSpot.addVechile(v);
	}
	
	void removeVechile(Vechile v) {
		for(ParkingSpot parkingSpot:list) {
			if(parkingSpot.vechile!=null && parkingSpot.vechile.equals(v)) {
				parkingSpot.removeVechile();
			}
		}
	}
}
