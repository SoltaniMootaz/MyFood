package tn.polytech.restaurantservice.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.polytech.restaurantservice.entities.Menu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByNomContaining(String keyword);
}