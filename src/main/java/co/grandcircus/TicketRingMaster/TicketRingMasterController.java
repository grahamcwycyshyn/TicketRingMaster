package co.grandcircus.TicketRingMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.grandcircus.TicketRingMaster.entity.SimpleEvent;
import co.grandcircus.TicketRingMaster.service.APIService;

@RestController
public class TicketRingMasterController {

//	@Autowired
//	private EventDao dao; 
	
	@Autowired
	private APIService apiService;
	
	// TODO GET /events
	// GET /events?city=
//	@GetMapping("/events")
//	public List<Event> listProducts(
//			@RequestParam(value = "keyword", required = false) String keyword, @RequestParam(value="city", required=false) String city) {
//		if (keyword==null || keyword.isEmpty() && city==null || city.isEmpty()) {
//		return dao.findAll();
//		} else if (city==null || city.isEmpty()) {
//			return dao.findByNameContainsIgnoreCase(keyword);
//		} else {
//			return dao.findByCityContainsIgnoreCase(city);
//		}
//	}
	
	@GetMapping("/test")
	public List<SimpleEvent> test() {
		List<SimpleEvent> list =  apiService.getEvent("longhorns", "houston", "localstartDateTime");
		System.out.println(list);
		return list;
	}
}
