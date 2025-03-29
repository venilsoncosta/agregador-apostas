package com.venilson.agregador_apostas.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

    @NotBlank
    private String timeDaCasa;

    @NotNull
    private int golsTimeDaCasa;

    @NotBlank
    private String timeVisitante;

    @NotNull
    private int golsTimeVisitante;

    private String campeonato;

    @Positive
    @NotNull
    private double odd;

    @NotNull
    @Positive
    private double valorApostado;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private EnumResultado resultado;

    private EnumTipoAposta tipoAposta;

    private LocalDateTime dataHoraAposta;
}
