package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Agence;
import com.grouped.gmacrest.service.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class AgenceController {
    @Autowired
    AgenceService agenceService;

    @GetMapping("/agences")
    public List<Agence> getAgences() {
        return agenceService.listAgences("");
    }
    public ResponseEntity<List<Agence>> getAgences(@RequestParam(value="search", defaultValue="") String search) {
        List<Agence> listAgence;
        try {
            listAgence = agenceService.listAgences(search);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listAgence);
    }

    @GetMapping("/agences/{id}")
    ResponseEntity<Agence> getAgenceById(@PathVariable(value="id") long id) {
        Optional<Agence> agence = agenceService.getAgence(id);
        if (agence.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(agence.get());
    }

    @PostMapping("/agences")
    public Agence postAgence(@RequestBody Agence agence){
        return agenceService.insertAgence(agence);
    }
}
