package com.application.model;

public class Ticket {
	
	private Integer ticketId;
	private Integer entryTime;
	private ParkingSpot parkingSpot;
	private Vechile vechile;
	
	public Ticket(Integer entryTime, ParkingSpot parkingSpot, Vechile vechile) {
		this.entryTime = entryTime;
		this.parkingSpot = parkingSpot;
		this.vechile = vechile;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public Integer getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Integer entryTime) {
		this.entryTime = entryTime;
	}
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
	
	

}
