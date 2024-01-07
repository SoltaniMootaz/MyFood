package tn.polytech.kitchenservice.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String state;
    private Long restaurantId;
    private int preparingTime;
    private int pickedUpTime;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Ticket() {
    }

    // Parameterized constructor
    public Ticket(String state, Long restaurantId, int preparingTime, int pickedUpTime) {
        this.state = state;
        this.restaurantId = restaurantId;
        this.preparingTime = preparingTime;
        this.pickedUpTime = pickedUpTime;
    }
}