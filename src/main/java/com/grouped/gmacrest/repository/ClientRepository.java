package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    public List<Client> findByNomContaining(String nom) ;

}
