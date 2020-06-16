package com.algaworks.osaolgaworks.osaolgaworks.api.controller;

import com.algaworks.osaolgaworks.osaolgaworks.domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {
    @GetMapping("/clientes")
    public List<Client> listar(){
        Client client1 = new Client();
        client1.setId(1L);
        client1.setName("Diego");
        client1.setEmail("diego@isquierdo.com");

        Client client2 = new Client();
        client2.setId(2L);
        client2.setName("João");
        client2.setName("joao@joao.com");

        Client client3 = new Client();
        client3.setId(3L);
        client3.setName("Maria");
        client2.setName("maria@maria.com");

        return Arrays.asList(client1, client2, client3);
    }
}
