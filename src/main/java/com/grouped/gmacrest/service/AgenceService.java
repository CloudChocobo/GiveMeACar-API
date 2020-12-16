package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Agence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface AgenceService {
    public List<Agence> listAgences(String search);
    public Optional<Agence> getAgence(Long id);
    public Agence insertAgence(Agence agence);
    public Agence updateAgence(Long id, Agence agence);
    public void deleteAgence(Long id);
}


