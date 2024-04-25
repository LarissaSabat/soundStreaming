package com.soundStreaming.modelos;

public class Audios {
    private String titulo;
    private int anoDeLancamento;
    private int totalDeCurtidas;
    private int totalReproducoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }

    public void reproducao() {
        this.totalReproducoes++;
    }
}
