package tn.polytech.kitchenservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.kitchenservice.entities.Ticket;
import tn.polytech.kitchenservice.interfaces.IKitchenService;
import tn.polytech.kitchenservice.repositories.TicketRepository;

@Service
public class KitchenServiceImpl implements IKitchenService {

    private final TicketRepository ticketRepository;

    @Autowired
    public KitchenServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        // Additional logic if needed before saving
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket acceptTicket(Long ticketId) {
        Ticket existingTicket = ticketRepository.findById(ticketId).orElse(null);

        if (existingTicket != null) {
            existingTicket.setState("accepted");
            // Additional logic if needed before saving
            return ticketRepository.save(existingTicket);
        }

        return null; // or throw an exception indicating ticket not found
    }

    @Override
    public Ticket readyForPickUp(Long ticketId) {
        Ticket existingTicket = ticketRepository.findById(ticketId).orElse(null);

        if (existingTicket != null) {
            existingTicket.setState("ready");
            // Additional logic if needed before saving
            return ticketRepository.save(existingTicket);
        }

        return null; // or throw an exception indicating ticket not found
    }
}