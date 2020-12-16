package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
    public List<Agence> findByNomContaining(String nom) ;
}
