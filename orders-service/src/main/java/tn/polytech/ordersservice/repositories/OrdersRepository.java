package tn.polytech.ordersservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.ordersservice.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    // Add custom query methods if needed
}