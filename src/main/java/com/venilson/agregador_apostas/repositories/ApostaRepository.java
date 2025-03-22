package com.venilson.agregador_apostas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venilson.agregador_apostas.models.Aposta;

public interface ApostaRepository extends JpaRepository<Aposta, Long> {
    
}
