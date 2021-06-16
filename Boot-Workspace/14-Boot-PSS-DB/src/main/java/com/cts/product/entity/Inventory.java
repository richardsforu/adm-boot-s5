package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Inventory {

	@Id
	@GeneratedValue
	private int inventoryId;
	private double availableSeats;

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public double getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(double availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", availableSeats=" + availableSeats + "]";
	}
	
	

}
