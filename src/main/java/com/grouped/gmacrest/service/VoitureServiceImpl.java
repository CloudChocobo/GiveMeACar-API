package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Voiture;
import com.grouped.gmacrest.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VoitureServiceImpl implements VoitureService {

    @Autowired
    private VoitureRepository repository;

    @Override
    public List<Voiture> listVoitures() {
        return repository.findAll();
    }

    @Override
    public Optional<Voiture> getVoiture(Long id) {
        return repository.findById(id);
    }
    @Override
    public Voiture insertVoiture(Voiture voiture) {
        return repository.save(voiture);
    }
    @Override
    public Voiture updateVoiture(Long id, Voiture voiture) {
        Optional<Voiture> optionalVoiture = this.getVoiture(id);
        if(optionalVoiture.isPresent()) {
            return repository.save(voiture);
        }
        return null;
    }
    @Override
    public void deleteVoiture(Long id) {
        Optional<Voiture> voiture = this.getVoiture(id);
        voiture.ifPresent(value -> repository.delete(value));
    }

    @Override
    public List<Voiture> findByAgenceId(long id) {
        return repository.findByAgenceId(id);
    }
}