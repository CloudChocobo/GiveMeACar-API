package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface RoleService {
    List<Role> listRoles();
    Optional<Role> getRole(Long id);
    Role insertRole(Role role);
    Role updateRole(Long id, Role role);
    void deleteRole(Long id);

}
