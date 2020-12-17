package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface RoleService {
    public List<Role> listRoles();
    public Optional<Role> getRole(Long id);
    public Role insertRole(Role role);
    public Role updateRole(Long id, Role role);
    public void deleteRole(Long id);
}
