package com.grouped.gmacrest.repository;

import com.grouped.gmacrest.model.Client;
import com.grouped.gmacrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

}
