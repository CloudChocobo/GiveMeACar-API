package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Location;
import com.grouped.gmacrest.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository repository;

    @Override
    public List<Location> listLocations() {
            return repository.findAll();
    }
    @Override
    public Optional<Location> getLocation(Long id) {
        return repository.findById(id);
    }
    @Override
    public Location insertLocation(Location location) {
        return repository.save(location);
    }
    @Override
    public Location updateLocation(Long id, Location location) {
        Optional<Location> optionalLocation = this.getLocation(id);
        if(optionalLocation.isPresent()) {
            return repository.save(location);
        }
        return null;
    }
    @Override
    public void deleteLocation(Long id) {
        Optional<Location> location = this.getLocation(id);
        location.ifPresent(value -> repository.delete(value));
    }
}
