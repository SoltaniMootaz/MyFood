package tn.polytech.courtierservice.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Courtier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cin;

    private String nom;
    private String telephone;
    private boolean disponible;

    @OneToOne(mappedBy = "courtier", cascade = CascadeType.ALL)
    private Location location;

    // Default constructor
    public Courtier() {
    }

    // Parameterized constructor
    public Courtier(String nom, String telephone, boolean disponible) {
        this.nom = nom;
        this.telephone = telephone;
        this.disponible = disponible;
    }
}