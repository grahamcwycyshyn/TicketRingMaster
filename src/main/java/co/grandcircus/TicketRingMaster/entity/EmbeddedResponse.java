package co.grandcircus.TicketRingMaster.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class EmbeddedResponse {

	@JsonProperty("_embedded")
	private  BigEmbedded embedded;
	
	public BigEmbedded getBigEmbedded() {
		return embedded;
	}
	
	public void setBigEmbedded(BigEmbedded embedded) {
		this.embedded = embedded;
	}
	
	}
