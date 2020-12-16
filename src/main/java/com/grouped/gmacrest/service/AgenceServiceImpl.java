package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Agence;
import com.grouped.gmacrest.repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AgenceServiceImpl implements AgenceService {

    @Autowired
    private AgenceRepository repository;

    @Override
    public List<Agence> listAgences(String search) {
        if (! "".equals(search))
            return repository.findByNomContaining(search);
        else
            return repository.findAll();

    }
    @Override
    public Optional<Agence> getAgence(Long id) {
        return repository.findById(id);
    }
    @Override
    public Agence insertAgence(Agence agence) {
        return repository.save(agence);
    }
    @Override
    public Agence updateAgence(Long id, Agence agence) {
        Optional<Agence> optionalAgence = this.getAgence(id);
        if(optionalAgence.isPresent()) {
            return repository.save(agence);
        }
        return null;
    }
    @Override
    public void deleteAgence(Long id) {
        Optional<Agence> agence = this.getAgence(id);
        agence.ifPresent(value -> repository.delete(value));
    }
}