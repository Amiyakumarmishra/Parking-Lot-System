package com.application.model;

import java.util.List;

public class ParkingSpotManagerFactory {
	
	ParkingSpotManager getParkingSpotManager(Vechile v,List<ParkingSpot> spots) {
		
		if(v.getVechileType()==VechileType.TwoWheeler) {
			return new TwoWheelerSpotManager(spots);
		}else {
			return new FourWheelerSpotManager(spots);
		}
		
	}
}
