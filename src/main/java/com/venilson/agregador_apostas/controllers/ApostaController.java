package com.venilson.agregador_apostas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venilson.agregador_apostas.models.Aposta;
import com.venilson.agregador_apostas.services.ApostaService;

import java.util.List;

@RestController
@RequestMapping("/apostas")
public class ApostaController {
    
    @Autowired
    private ApostaService apostaService;

    @PostMapping
    public ResponseEntity<Aposta> salvar(@RequestBody Aposta aposta) {
        Aposta apostaSalva = apostaService.salvar(aposta);
        return ResponseEntity.ok(apostaSalva);
    }

    @GetMapping
    public ResponseEntity<List<Aposta>> listar() {
        List<Aposta> apostas = apostaService.listar();
        return ResponseEntity.ok(apostas);
    }
}