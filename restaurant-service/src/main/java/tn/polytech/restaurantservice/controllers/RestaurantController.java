package tn.polytech.restaurantservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.polytech.restaurantservice.entities.Adresse;
import tn.polytech.restaurantservice.entities.Menu;
import tn.polytech.restaurantservice.services.RestaurantServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantServiceImpl restaurantService;

    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/findAvailableRestaurants/{ville}")
    public List<Adresse> findAvailableRestaurants(@PathVariable String ville) {
        return restaurantService.findAvailableRestaurants(ville);
    }

    @GetMapping("/findRestaurantMenu")
    public List<Menu> findRestaurantMenu(@RequestParam String keyword) {
        return restaurantService.findRestaurantMenu(keyword);
    }
}