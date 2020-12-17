package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Role;
import com.grouped.gmacrest.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> listRoles() {
        return repository.findAll();
    }
    @Override
    public Optional<Role> getRole(Long id) {
        return repository.findById(id);
    }
    @Override
    public Role insertRole(Role role) {
        return repository.save(role);
    }
    @Override
    public Role updateRole(Long id, Role role) {
        Optional<Role> optionalRole = this.getRole(id);
        if(optionalRole.isPresent()) {
            return repository.save(role);
        }
        return null;
    }
    @Override
    public void deleteRole(Long id) {
        Optional<Role> role = this.getRole(id);
        role.ifPresent(value -> repository.delete(value));
    }
}