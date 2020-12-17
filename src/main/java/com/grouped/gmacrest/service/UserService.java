package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface UserService {
    List<User> listUsers();

    Optional<User> getUser(Long id);

    User insertUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}