package tn.polytech.restaurantservice.interfaces;

import tn.polytech.restaurantservice.entities.Adresse;
import tn.polytech.restaurantservice.entities.Menu;

import java.util.List;

public interface IRestaurantService {

    List<Adresse> findAvailableRestaurants(String ville);

    List<Menu> findRestaurantMenu(String keyword);
}