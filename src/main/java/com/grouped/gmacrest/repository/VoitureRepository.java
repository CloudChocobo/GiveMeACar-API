package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Adresse;
import com.grouped.gmacrest.model.Agence;
import com.grouped.gmacrest.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    public List<Voiture> findByAgenceId(Long id) ;
}
