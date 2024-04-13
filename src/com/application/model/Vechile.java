package com.application.model;

public class Vechile {
	
	private Integer vechileId;
	private VechileType vechileType;
	
	public Integer getVechileId() {
		return vechileId;
	}
	public void setVechileId(Integer vechileId) {
		this.vechileId = vechileId;
	}
	public Vechile(Integer vechileId, VechileType vechileType) {
		this.vechileId = vechileId;
		this.vechileType = vechileType;
	}
	public VechileType getVechileType() {
		return vechileType;
	}
	public void setVechileType(VechileType vechileType) {
		this.vechileType = vechileType;
	}
	
	

}
