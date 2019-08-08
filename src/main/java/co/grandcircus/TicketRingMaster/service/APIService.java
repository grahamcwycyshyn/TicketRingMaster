package co.grandcircus.TicketRingMaster.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class APIService {
	
private RestTemplate restTemplate = new RestTemplate();
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
//	public List<Inventor> getNerds(){
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
