package tn.polytech.kitchenservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.polytech.kitchenservice.entities.Ticket;
import tn.polytech.kitchenservice.services.KitchenServiceImpl;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {

    private final KitchenServiceImpl kitchenService;

    @Autowired
    public KitchenController(KitchenServiceImpl kitchenService) {
        this.kitchenService = kitchenService;
    }

    @PostMapping("/createTicket")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return kitchenService.createTicket(ticket);
    }

    @PostMapping("/acceptTicket/{ticketId}")
    public Ticket acceptTicket(@PathVariable Long ticketId) {
        return kitchenService.acceptTicket(ticketId);
    }

    @PostMapping("/readyForPickUp/{ticketId}")
    public Ticket readyForPickUp(@PathVariable Long ticketId) {
        return kitchenService.readyForPickUp(ticketId);
    }
}