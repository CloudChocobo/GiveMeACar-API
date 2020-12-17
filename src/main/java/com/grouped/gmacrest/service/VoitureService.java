package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Adresse;
import com.grouped.gmacrest.model.Voiture;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface VoitureService {
    List<Voiture> listVoitures();
    Optional<Voiture> getVoiture(Long id);
    Voiture insertVoiture(Voiture voiture);
    Voiture updateVoiture(Long id, Voiture voiture);
    void deleteVoiture(Long id);

    List<Voiture> findByAgenceId(long id);
}


