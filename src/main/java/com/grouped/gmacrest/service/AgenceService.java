package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Agence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface AgenceService {
    List<Agence> listAgences(String search);
    Optional<Agence> getAgence(Long id);
    Agence insertAgence(Agence agence);
    Agence updateAgence(Long id, Agence agence);
    void deleteAgence(Long id);
}


