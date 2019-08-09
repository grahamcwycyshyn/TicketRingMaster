package co.grandcircus.TicketRingMaster.entity;

import javax.persistence.Entity;

@Entity
public class Venues {
	
	private City city;
	private State state;
	private Address address;
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Venues [city=" + city + ", state=" + state + ", address=" + address + "]";
	}
	
	
}
