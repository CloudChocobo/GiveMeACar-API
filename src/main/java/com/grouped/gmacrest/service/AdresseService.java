package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Adresse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface AdresseService {
    public List<Adresse> listAdresses(String search);
    public Optional<Adresse> getAdresse(Long id);
    public Adresse insertAdresse(Adresse adresse);
    public Adresse updateAdresse(Long id, Adresse adresse);
    public void deleteAdresse(Long id);
}


