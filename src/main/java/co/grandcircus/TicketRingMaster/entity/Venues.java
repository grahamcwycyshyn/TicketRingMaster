package co.grandcircus.TicketRingMaster.entity;

import javax.persistence.Entity;

@Entity
public class Venues {
	
	private String city;
	private String state;
	private String address;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Venues [city=" + city + ", state=" + state + ", address=" + address + "]";
	}
	
	
}
