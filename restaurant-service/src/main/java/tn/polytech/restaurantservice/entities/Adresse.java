package tn.polytech.restaurantservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    private String nom;
    private String rue;
    private String cite;
    private String ville;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Adresse() {
    }

    // Parameterized constructor
    public Adresse(String nom, String rue, String cite, String ville) {
        this.nom = nom;
        this.rue = rue;
        this.cite = cite;
        this.ville = ville;
    }
}