package co.grandcircus.TicketRingMaster.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimpleEvent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	String city;
	String date;
	
	public SimpleEvent() {}
	
	public SimpleEvent(Event apiEvent) {
		name = apiEvent.getName();
		city = apiEvent.getEmbedded().getVenues().get(0).getCity().getName();
		date = apiEvent.getDates().getStart().getLocalDate();
	}
}
