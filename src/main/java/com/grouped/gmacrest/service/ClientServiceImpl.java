package com.grouped.gmacrest.service;

import com.grouped.gmacrest.model.Client;
import com.grouped.gmacrest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public List<Client> listClients(String search) {
        if (! "".equals(search))
            return repository.findByNomContaining(search);
        else
            return repository.findAll();
    }
    @Override
    public Optional<Client> getClient(Long id) {
        return repository.findById(id);
    }
    @Override
    public Client insertClient(Client client) {
        return repository.save(client);
    }
    @Override
    public Client updateClient(Long id, Client client) {
        Optional<Client> optionalClient = this.getClient(id);
        if(optionalClient.isPresent()) {
            return repository.save(client);
        }
        return null;
    }
    @Override
    public void deleteClient(Long id) {
        Optional<Client> client = this.getClient(id);
        client.ifPresent(value -> repository.delete(value));
    }
}