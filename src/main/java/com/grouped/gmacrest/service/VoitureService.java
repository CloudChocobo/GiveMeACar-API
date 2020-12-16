package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Adresse;
import com.grouped.gmacrest.model.Voiture;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface VoitureService {
    public List<Voiture> listVoitures();
    public Optional<Voiture> getVoiture(Long id);
    public Voiture insertVoiture(Voiture voiture);
    public Voiture updateVoiture(Long id, Voiture voiture);
    public void deleteVoiture(Long id);

    public List<Voiture> findByAgenceId(long id);
}


