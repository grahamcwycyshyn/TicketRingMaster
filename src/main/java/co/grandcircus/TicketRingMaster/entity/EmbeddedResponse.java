package co.grandcircus.TicketRingMaster.entity;

import java.util.List;

public class EmbeddedResponse {

	private List<Event> events;
	
	public List<Event> getEvent() {
		return events;
	}
	
	public void setEvent(List<Event> events) {
		this.events = events;
	}
	
	}
