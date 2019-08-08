package co.grandcircus.TicketRingMaster.entity;

import javax.persistence.Entity;

@Entity
public class Embedded {
	
	private Venues venues;

	public Venues getVenues() {
		return venues;
	}

	public void setVenues(Venues venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Embedded [venues=" + venues + "]";
	}
	
	
}
