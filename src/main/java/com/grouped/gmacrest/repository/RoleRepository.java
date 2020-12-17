package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Agence;
import com.grouped.gmacrest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    public List<Role> findByNomContaining(String nom) ;
}
