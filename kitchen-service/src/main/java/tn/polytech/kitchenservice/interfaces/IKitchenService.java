package tn.polytech.kitchenservice.interfaces;


import tn.polytech.kitchenservice.entities.Ticket;

public interface IKitchenService {

    Ticket createTicket(Ticket ticket);

    Ticket acceptTicket(Long ticketId);

    Ticket readyForPickUp(Long ticketId);
}