package co.grandcircus.TicketRingMaster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.TicketRingMaster.entity.EmbeddedResponse;
import co.grandcircus.TicketRingMaster.entity.Event;
import co.grandcircus.TicketRingMaster.entity.SimpleEvent;


@Component
public class APIService {
	
private String API_KEY = "G6Yuy7pZjAXxohAIGjvLGcfPwWVAjxmq";
private RestTemplate restTemplate = new RestTemplate();
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<SimpleEvent> getEvent(String event, String city, String date) {
//		String url = "https://app.ticketmaster.com/discovery/v2/events?keyword=" + event + "&city=" + city + "&localstartDateTime=" + localstartDateTime + "&apiKey=" + API_KEY;
		
		String url = "";//UriComponentsBuilder.fromHttpUrl("https://app.ticketmaster.com/discovery/v2/events")
		if(date == null || date.isEmpty())	{
			 url = UriComponentsBuilder.fromHttpUrl("https://app.ticketmaster.com/discovery/v2/events")
					.queryParam("apikey", API_KEY)
					.queryParam("keyword", event)
					.queryParam("city", city)
					//.queryParam("startDateTime", date + "T00:20:00Z")
					.toUriString();
		} else {
			 url = UriComponentsBuilder.fromHttpUrl("https://app.ticketmaster.com/discovery/v2/events")
				.queryParam("apikey", API_KEY)
				.queryParam("keyword", event)
				.queryParam("city", city)
				.queryParam("startDateTime", date + "T00:20:00Z")
				.toUriString();
		}
		System.out.println(url);
		EmbeddedResponse response = restTemplate.getForObject(url, EmbeddedResponse.class);
		List<Event> apiEvents = response.getBigEmbedded().getEvents();
		System.out.println(apiEvents.get(0).getUrl());
		List<SimpleEvent> events = new ArrayList<>();
		for (Event apiEvent : apiEvents) {
			events.add(new SimpleEvent(apiEvent));
		}
		return events;
		
	}
	
//	public List<Venues> getVenues(){
//		
//		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
//		
//		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);
//		
//		return response.getInventors();
//	}
//	
//	public List<Innovator> getSuperNerds(){
//		String url ="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
//		
//		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);
//		
//		return response.getInnovators();
//	}

}
