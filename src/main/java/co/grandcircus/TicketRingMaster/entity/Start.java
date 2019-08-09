package co.grandcircus.TicketRingMaster.entity;

public class Start {

	private String localDate;
	private String localTime;
	
	
	public String getLocalDate() {
		return localDate;
	}
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	public String getLocalTime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	
	@Override
	public String toString() {
		return "StartDetails [localDate=" + localDate + ", localTime=" + localTime + "]";
	}
	
}
