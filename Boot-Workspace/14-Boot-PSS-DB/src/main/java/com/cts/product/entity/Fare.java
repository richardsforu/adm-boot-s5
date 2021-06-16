package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fare {

	@Id
	@GeneratedValue
	private int fareId;
	private double ticketFare;
	private String currency;

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public double getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Fare [fareId=" + fareId + ", ticketFare=" + ticketFare + ", currency=" + currency + "]";
	}

}
