package tn.polytech.ordersservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantite;
    private Long idMenu;

    @ManyToOne
    private Orders order;

    // Default constructor
    public OrderLineItems() {
    }

    // Parameterized constructor
    public OrderLineItems(int quantite, Long idMenu, Orders order) {
        this.quantite = quantite;
        this.idMenu = idMenu;
        this.order = order;
    }

}
