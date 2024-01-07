package tn.polytech.kitchenservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.kitchenservice.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Add custom query methods if needed
}