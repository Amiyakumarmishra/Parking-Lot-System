package com.application.model;

public class ParkingSpot {
	
	int id;
	Vechile vechile;
	boolean isEmpty;
	int price;
	
	public ParkingSpot(int id,int price){
		this.id=id;
		this.vechile=null;
		this.price=price;
		this.isEmpty=true;
	}
	
	
	public Vechile getVechile() {
		return vechile;
	}


	public void setVechile(Vechile vechile) {
		this.vechile = vechile;
	}


	public boolean isEmpty() {
		return isEmpty;
	}


	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	void addVechile(Vechile v) {
		this.vechile=vechile;
		this.isEmpty=false;
	}
	
	void removeVechile() {
		this.isEmpty=true;
		this.vechile=null;
	}
	

}
