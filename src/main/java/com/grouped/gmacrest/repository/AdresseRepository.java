package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    public List<Adresse> findByVilleContaining(String ville) ;
}
