package tn.polytech.restaurantservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.restaurantservice.entities.Adresse;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {

    List<Adresse> findByVille(String ville);
}