package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface LocationService {
    List<Location> listLocations();
    Optional<Location> getLocation(Long id);
    Location insertLocation(Location location);
    Location updateLocation(Long id, Location location);
    void deleteLocation(Long id);
}
