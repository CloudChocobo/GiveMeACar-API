package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Adresse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface AdresseService {
    List<Adresse> listAdresses(String search);
    Optional<Adresse> getAdresse(Long id);
    Adresse insertAdresse(Adresse adresse);
    Adresse updateAdresse(Long id, Adresse adresse);
    void deleteAdresse(Long id);
}


