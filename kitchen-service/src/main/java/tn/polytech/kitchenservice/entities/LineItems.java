package tn.polytech.kitchenservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class LineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private Long idMenu;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public LineItems() {
    }

    // Parameterized constructor
    public LineItems(int quantity, Long idMenu, Ticket ticket) {
        this.quantity = quantity;
        this.idMenu = idMenu;
        this.ticket = ticket;
    }
}