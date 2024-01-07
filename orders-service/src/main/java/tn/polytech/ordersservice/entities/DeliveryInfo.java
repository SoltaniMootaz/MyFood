package tn.polytech.ordersservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class DeliveryInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryInfoId;

    private int deliveryTime;
    private Long deliveryAddress; // Assuming this is the address ID

    @OneToOne(mappedBy = "deliveryInfo")
    private Orders order;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public DeliveryInfo() {
    }

    // Parameterized constructor
    public DeliveryInfo(int deliveryTime, Long deliveryAddress, Orders order) {
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
        this.order = order;
    }

}
