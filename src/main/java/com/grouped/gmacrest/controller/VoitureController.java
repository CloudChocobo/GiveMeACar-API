package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Voiture;
import com.grouped.gmacrest.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class VoitureController {
    @Autowired
    VoitureService voitureService;

    @GetMapping("/voitures")
    public List<Voiture> getVoitures() {
        return voitureService.listVoitures();
    }

    @GetMapping("/voitures/{id}")
    ResponseEntity<Voiture> getVoitureById(@PathVariable(value="id") long id) {
        Optional<Voiture> voiture = voitureService.getVoiture(id);
        if (voiture.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(voiture.get());
    }

    @GetMapping("/agences/{id}/voitures")
    public List<Voiture> getVoitureByAgenceId(@PathVariable(value="id") long id) {
        return voitureService.findByAgenceId(id);
    }

    @PostMapping("/voitures")
    public Voiture postVoiture(@RequestBody Voiture voiture){
        return voitureService.insertVoiture(voiture);
    }

    @DeleteMapping("/voitures/{id}")
    public void deleteVoiture(@PathVariable(value="id") long id){
        voitureService.deleteVoiture(id);
    }

    @PutMapping("/voitures/{id}")
    public Voiture update(@PathVariable(value="id") long id, Voiture voiture) {
        ResponseEntity<Voiture> optionalVoiture = this.getVoitureById(id);
        if(optionalVoiture.hasBody()) {
            System.out.println(optionalVoiture);
        }
        return null;
    }


}
