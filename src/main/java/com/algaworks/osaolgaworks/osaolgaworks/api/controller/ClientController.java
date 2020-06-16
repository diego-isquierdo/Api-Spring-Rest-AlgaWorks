package com.algaworks.osaolgaworks.osaolgaworks.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/clientes")
    public String listar(){
        return "test";
    }
}
