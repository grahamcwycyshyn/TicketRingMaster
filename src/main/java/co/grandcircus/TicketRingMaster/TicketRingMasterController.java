package co.grandcircus.TicketRingMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.TicketRingMaster.dao.EventDao;
import co.grandcircus.TicketRingMaster.entity.Event;

public class TicketRingMasterController {

	@Autowired
	private EventDao dao; // TODO GET /events
	@GetMapping("/events")
	public List<Event> listProducts(
			@RequestParam(value = "keyword", required = false) String keyword) {
		if (keyword==null || keyword.isEmpty()) {
		return dao.findAll();
		} else {
			return dao.findByNameContainsIgnoreCase(keyword);
		}
	}
}
