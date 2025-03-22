package com.venilson.agregador_apostas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venilson.agregador_apostas.models.Aposta;
import com.venilson.agregador_apostas.repositories.ApostaRepository;

import java.util.List;

@Service
public class ApostaService {

    @Autowired
    private ApostaRepository apostaRepository;

    public Aposta salvar(Aposta aposta) {
        return apostaRepository.save(aposta);
    }

    public List<Aposta> listar() {
        return apostaRepository.findAll();
    }
}
