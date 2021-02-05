package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Adresse;
import com.grouped.gmacrest.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdresseServiceImpl implements AdresseService {

    @Autowired
    private AdresseRepository repository;

    @Override
    public List<Adresse> listAdresses(String search) {
        if (! "".equals(search))
            return repository.findByVilleContaining(search);
        else
            return repository.findAll();

    }
    @Override
    public Optional<Adresse> getAdresse(Long id) {
        return repository.findById(id);
    }
    @Override
    public Adresse insertAdresse(Adresse adresse) {
        return repository.save(adresse);
    }
    @Override
    public Adresse updateAdresse(Long id, Adresse adresse) {
        Optional<Adresse> optionalAdresse = this.getAdresse(id);
        if(optionalAdresse.isPresent()) {
            return repository.save(adresse);
        }
        return null;
    }
    @Override
    public void deleteAdresse(Long id) {
        Optional<Adresse> adresse = this.getAdresse(id);
        adresse.ifPresent(value -> repository.delete(value));
    }
}