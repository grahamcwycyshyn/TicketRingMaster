package co.grandcircus.TicketRingMaster.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
	
	private String name;
	private String city;
	private Dates dates;
	private Boolean favorite;
	@JsonProperty("_embedded")
	private Embedded embedded;
	private String url;
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	
	
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}
	
	public Boolean getFavorite() {
		return favorite;
	}
	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	
	
	public Embedded getEmbedded() {
		return embedded;
	}
	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}
//	@Override
//	public String toString() {
//		return "Event [id=" + id + ", name=" + name + ", locate=" + city + ", dates=" + dates + ", favorite="
//				+ favorite + ", embedded=" + embedded + "]";
//	
//	}
}
