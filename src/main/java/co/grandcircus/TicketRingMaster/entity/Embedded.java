package co.grandcircus.TicketRingMaster.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Embedded {
	
	private List<Venues> venues;

	public List<Venues> getVenues() {
		return venues;
	}

	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Embedded [venues=" + venues + "]";
	}
	
	
}
