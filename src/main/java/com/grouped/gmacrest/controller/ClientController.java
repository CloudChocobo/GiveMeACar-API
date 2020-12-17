package com.grouped.gmacrest.controller;

import com.grouped.gmacrest.model.Agence;
import com.grouped.gmacrest.model.Client;
import com.grouped.gmacrest.service.AgenceService;
import com.grouped.gmacrest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController

public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.listClients("");
    }
    public ResponseEntity<List<Client>> getClients(@RequestParam(value="search", defaultValue="") String search) {
        List<Client> listClient;
        try {
            listClient = clientService.listClients(search);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listClient);
    }

    @GetMapping("/clients/{id}")
    ResponseEntity<Client> getClientById(@PathVariable(value="id") long id) {
        Optional<Client> client = clientService.getClient(id);
        if (client.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(client.get());
    }

    @PostMapping("/clients")
    public Client postClient(@RequestBody Client client){
        return clientService.insertClient(client);
    }
}

