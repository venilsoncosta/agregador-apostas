package com.venilson.agregador_apostas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_apostas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String timeDaCasa;

    private Integer golsTimeDaCasa;

    
    private String timeVisitante;

    private Integer golsTimeVisitante;

    private String campeonato;

    private Double odd;

    private Double valorApostado;

    private String resultadoAposta;
}
