package com.example.algamoney.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/olaMundo")
public class HelloWorldResource {

    @GetMapping
    public ResponseEntity<String> listar() {return ResponseEntity.status(HttpStatus.CREATED).body("Ola Mundo");}

}


