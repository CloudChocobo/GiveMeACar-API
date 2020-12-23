package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Adresse;
import com.grouped.gmacrest.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class AdresseController {
    @Autowired
    AdresseService adresseService;

    @GetMapping("/adresses")
    public List<Adresse> getAdresses() {
        return adresseService.listAdresses("");
    }

    public ResponseEntity<List<Adresse>> getAdresses(@RequestParam(value = "search", defaultValue = "") String search) {
        List<Adresse> listAdresse;
        try {
            listAdresse = adresseService.listAdresses(search);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listAdresse);
    }

    @GetMapping("/adresses/{id}")
    ResponseEntity<Adresse> getAdresseById(@PathVariable(value = "id") long id) {
        Optional<Adresse> adresse = adresseService.getAdresse(id);
        if (adresse.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(adresse.get());
    }

    @PostMapping("/adresses")
    public Adresse postAdresse(@RequestBody Adresse adresse) {
        return adresseService.insertAdresse(adresse);
    }

    @DeleteMapping("/adresses/{id}")
    public void deleteUser(@PathVariable(value = "id") long id) {
        adresseService.deleteAdresse(id);
    }



}