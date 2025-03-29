package com.venilson.agregador_apostas.models;

public enum EnumTipoAposta {
    RESULTADO_FINAL("Resultado Final"),
    PRIMEIRO_TEMPO("Primeiro Tempo"),
    SEGUNDO_TEMPO("Segundo Tempo"),
    OVER_UNDER("Over/Under"),
    HANDICAP("Handicap");

    private final String descricao;

    EnumTipoAposta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
