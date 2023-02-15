package com.arespejel.pruebatecnica.controllers;

import com.arespejel.pruebatecnica.services.MedosService;
import com.arespejel.pruebatecnica.services.MetodosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/s2")
public class SeccionDosController {

    @Autowired
    private MedosService service;


    @GetMapping(path = "/{numero}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> extraerNumero(@PathVariable Integer numero){
        return ResponseEntity.status(HttpStatus.OK).body(service.extract(numero));
    }
}
