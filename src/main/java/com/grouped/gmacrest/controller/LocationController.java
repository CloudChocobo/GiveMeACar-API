package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Location;
import com.grouped.gmacrest.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController

public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getLocation() {
        return locationService.listLocations();
    }

    @GetMapping("/locations/{id}")
    ResponseEntity<Location> getLocationById(@PathVariable(value="id") long id) {
        Optional<Location> location = locationService.getLocation(id);
        if (location.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(location.get());
    }

    @PostMapping("/locations")
    public Location postLocation(@RequestBody Location location){
        return locationService.insertLocation(location);
    }
}