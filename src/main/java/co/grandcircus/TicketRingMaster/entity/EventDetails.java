package co.grandcircus.TicketRingMaster.entity;

public class EventDetails {

	private String id;
	private String name;
	private Embedded embedded;
	private String locate;
	private Dates dates;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Embedded getEmbedded() {
		return embedded;
	}
	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}
	public String getLocate() {
		return locate;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}
	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}
	
	@Override
	public String toString() {
		return "EventDetails [id=" + id + ", name=" + name + ", embedded=" + embedded + ", locate=" + locate
				+ ", dates=" + dates + "]";
	}
	
	
}
