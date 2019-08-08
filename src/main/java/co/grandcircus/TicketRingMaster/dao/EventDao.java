package co.grandcircus.TicketRingMaster.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.grandcircus.TicketRingMaster.entity.Event;

@Repository
@Transactional
public interface EventDao extends JpaRepository<Event, Long> {

	
}
