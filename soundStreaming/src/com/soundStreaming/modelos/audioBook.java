package com.soundStreaming.modelos;

public class audioBook extends Audios {
    private String autorLivro;
    private int numeroDePaginas;

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 250) {
            return 10;
        } else {
            return 7;
        }
    }
}
