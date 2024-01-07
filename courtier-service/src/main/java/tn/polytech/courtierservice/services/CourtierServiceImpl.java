package tn.polytech.courtierservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.polytech.courtierservice.entities.Courtier;
import tn.polytech.courtierservice.entities.Location;
import tn.polytech.courtierservice.interfaces.ICourtierService;
import tn.polytech.courtierservice.repositories.ICourtierRepository;
import tn.polytech.courtierservice.repositories.ILocationRepository;

@Service
public class CourtierServiceImpl implements ICourtierService {

    private final ICourtierRepository courtierRepository;
    private final ILocationRepository locationRepository;

    @Autowired
    public CourtierServiceImpl(ICourtierRepository courtierRepository, ILocationRepository locationRepository) {
        this.courtierRepository = courtierRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Location updateLocation(Long cin, double longitude, double latitude) {
        Courtier courtier = courtierRepository.findById(cin).orElse(null);

        if (courtier != null) {
            Location location = courtier.getLocation();

            if (location == null) {
                location = new Location();
                location.setCourtier(courtier);
                courtier.setLocation(location);
            }

            location.setLongitude(longitude);
            location.setLatitude(latitude);

            courtierRepository.save(courtier);
            return locationRepository.save(location);
        }

        return null;
    }
}