package tn.polytech.ordersservice.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String state; // Values: created, accepted, canceled, ready
    private Long consumerId;
    private Long restaurantId;

    @OneToOne
    @JoinColumn(name = "delivery_info_id") // Adjust the column name based on your database schema
    private DeliveryInfo deliveryInfo;


    // Default constructor
    public Orders() {
    }

    // Parameterized constructor
    public Orders(String state, Long consumerId, Long restaurantId) {
        this.state = state;
        this.consumerId = consumerId;
        this.restaurantId = restaurantId;
    }

}

