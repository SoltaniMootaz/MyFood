package tn.polytech.courtierservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.polytech.courtierservice.entities.Location;
import tn.polytech.courtierservice.services.CourtierServiceImpl;

@RestController
@RequestMapping("/courtier")
public class CourtierController {

    private final CourtierServiceImpl courtierService;

    @Autowired
    public CourtierController(CourtierServiceImpl courtierService) {
        this.courtierService = courtierService;
    }

    @PostMapping("/updateLocation/{cin}")
    public Location updateLocation(
            @PathVariable Long cin,
            @RequestParam double longitude,
            @RequestParam double latitude) {
        return courtierService.updateLocation(cin, longitude, latitude);
    }
}