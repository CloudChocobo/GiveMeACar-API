package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.User;
import com.grouped.gmacrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.listUsers();
    }

    @GetMapping("/users/{id}")
    ResponseEntity<User> getUserById(@PathVariable(value="id") long id) {
        Optional<User> user = userService.getUser(id);
        if (user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user.get());
    }

    @PostMapping("/users")
    public User postUser(@RequestBody User user){
        return userService.insertUser(user);
    }
}
