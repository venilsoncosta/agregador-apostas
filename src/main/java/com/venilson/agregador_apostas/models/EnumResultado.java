package com.venilson.agregador_apostas.models;

public enum EnumResultado {
    VENCIDA("Aposta vencida"),
    PERDIDA("Aposta perdida"),
    DEVOLVIDA("Aposta devolvida");

    private final String descricao;

    EnumResultado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
