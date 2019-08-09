package co.grandcircus.TicketRingMaster.entity;

//@Entity
public class SimpleEvent {
	String name;
	String city;
	String date;
	
	public SimpleEvent() {}
	
	public SimpleEvent(Event apiEvent) {
		name = apiEvent.getName();
		city = apiEvent.getEmbedded().getVenues().get(0).getCity();
		date = apiEvent.getDates().getStart().getLocalDate();
	}
}
