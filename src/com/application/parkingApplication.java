package com.application;

import java.util.ArrayList;
import java.util.List;

import com.application.model.EntranceGate;
import com.application.model.ExitGate;
import com.application.model.ParkingSpot;
import com.application.model.ParkingSpotManagerFactory;
import com.application.model.Ticket;
import com.application.model.Vechile;
import com.application.model.VechileType;

public class parkingApplication {
	
	public static void main(String args[]) {
	       // Initialize parking spots
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                spots.add(new ParkingSpot(i, 10));
            else
                spots.add(new ParkingSpot(i, 20));
        }

        // Create ParkingSpotManagerFactory
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        // Create EntranceGate and ExitGate objects
        EntranceGate entranceGate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        // Example usage
        Vechile vehicle = new Vechile(123, VechileType.TwoWheeler);
        ParkingSpot spot = entranceGate.findParkingSpot(vehicle, spots);
        Ticket ticket = entranceGate.generateTicket(vehicle, spot,10);

        // Vehicle leaves
        exitGate.removeVechile(ticket.getParkingSpot().getVechile());
	}

}
