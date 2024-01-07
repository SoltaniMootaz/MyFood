package tn.polytech.kitchenservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.kitchenservice.entities.LineItems;

public interface LineItemsRepository extends JpaRepository<LineItems, Long> {
    // Add custom query methods if needed
}