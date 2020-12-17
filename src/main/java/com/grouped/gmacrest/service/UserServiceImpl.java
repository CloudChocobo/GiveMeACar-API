package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.User;
import com.grouped.gmacrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> listUsers() {
        return repository.findAll();
    }
    @Override
    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }
    @Override
    public User insertUser(User user) {
        return repository.save(user);
    }
    @Override
    public User updateUser(Long id, User user) {
        Optional<User> optionalUser = this.getUser(id);
        if(optionalUser.isPresent()) {
            return repository.save(user);
        }
        return null;
    }
    @Override
    public void deleteUser(Long id) {
        Optional<User> user = this.getUser(id);
        user.ifPresent(value -> repository.delete(value));
    }
}