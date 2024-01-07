package tn.polytech.courtierservice.interfaces;

import tn.polytech.courtierservice.entities.Location;

public interface ICourtierService {
    Location updateLocation(Long cin, double longitude, double latitude);
}
