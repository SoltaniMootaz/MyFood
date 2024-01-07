package tn.polytech.courtierservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double longitude;
    private double latitude;

    @OneToOne
    @JoinColumn(name = "courtier_cin") // Adjust the column name based on your database schema
    private Courtier courtier;

    // Default constructor
    public Location() {
    }

    // Parameterized constructor
    public Location(double longitude, double latitude, Courtier courtier) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.courtier = courtier;
    }
}