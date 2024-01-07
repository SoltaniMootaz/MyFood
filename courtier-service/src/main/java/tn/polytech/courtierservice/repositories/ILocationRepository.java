package tn.polytech.courtierservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.courtierservice.entities.Location;

public interface ILocationRepository extends JpaRepository<Location, Long> {
    // Add custom query methods if needed
}