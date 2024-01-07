package tn.polytech.restaurantservice.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.restaurantservice.entities.Adresse;
import tn.polytech.restaurantservice.entities.Menu;
import tn.polytech.restaurantservice.interfaces.IRestaurantService;
import tn.polytech.restaurantservice.repositories.AdresseRepository;
import tn.polytech.restaurantservice.repositories.MenuRepository;

import java.util.List;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

    private final AdresseRepository adresseRepository;
    private final MenuRepository menuRepository;

    @Autowired
    public RestaurantServiceImpl(AdresseRepository adresseRepository, MenuRepository menuRepository) {
        this.adresseRepository = adresseRepository;
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Adresse> findAvailableRestaurants(String ville) {
        return adresseRepository.findByVille(ville);
    }

    @Override
    public List<Menu> findRestaurantMenu(String keyword) {
        return menuRepository.findByNomContaining(keyword);
    }
}