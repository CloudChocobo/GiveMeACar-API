package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Role;
import com.grouped.gmacrest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roleService.listRoles();
    }
    @GetMapping("/roles/{id}")
    ResponseEntity<Role> getRoleById(@PathVariable(value="id") long id) {
        Optional<Role> role = roleService.getRole(id);
        if (role.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(role.get());
    }

    @PostMapping("/roles")
    public Role postRole(@RequestBody Role role){
        return roleService.insertRole(role);
    }
}
