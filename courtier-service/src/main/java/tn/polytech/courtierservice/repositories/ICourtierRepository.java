package tn.polytech.courtierservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.courtierservice.entities.Courtier;

public interface ICourtierRepository extends JpaRepository<Courtier, Long> {
    // Add custom query methods if needed
}