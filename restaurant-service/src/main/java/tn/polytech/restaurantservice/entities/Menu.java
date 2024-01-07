package tn.polytech.restaurantservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private double prix;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Menu() {
    }

    // Parameterized constructor
    public Menu(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
}