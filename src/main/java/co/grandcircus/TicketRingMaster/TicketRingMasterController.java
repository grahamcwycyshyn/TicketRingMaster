package co.grandcircus.TicketRingMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
//	@GetMapping("/test")
//	public List<SimpleEvent> test() {
//		List<SimpleEvent> list =  apiService.getEvent("name", "city", "localstartDateTime");
//		System.out.println(list.get(0).getName());
//		return list;
//	}
	
	@RequestMapping("/")
	public ModelAndView listEvents(@RequestParam(value="keyword", required=false) String keyword, @RequestParam(value="city", required=false) String city, @RequestParam(value="date", required=false) String date) {
		ModelAndView mav = new ModelAndView("index");
		if (keyword==null || keyword.isEmpty() && (city == null || city.isEmpty()) && (date == null || date.isEmpty())) {
			List<SimpleEvent> list = apiService.getEvent("", "", "");
			mav.addObject("list", list);
			return mav;
		} else if(city == null || city.isEmpty()&& (date == null || date.isEmpty())){
			List<SimpleEvent> list = apiService.getEvent(keyword, "", "");
			mav.addObject("list", list);
			return mav;
		} else if(date == null || date.isEmpty())	{
			List<SimpleEvent> list = apiService.getEvent("", city, "");
			mav.addObject("list", list);
			return mav;
		} else {
			List<SimpleEvent> list = apiService.getEvent("", "", date);
			mav.addObject("list", list);
			return mav;
		}
	}
}
