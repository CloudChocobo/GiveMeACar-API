package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface ClientService {
    List<Client> listClients(String search);
    Optional<Client> getClient(Long id);
    Client insertClient(Client client);
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);
}
