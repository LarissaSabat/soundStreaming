package com.soundStreaming.principal;


import com.soundStreaming.modelos.Favoritas;
import com.soundStreaming.modelos.audioBook;
import com.soundStreaming.modelos.musica;
import com.soundStreaming.modelos.podCast;

public class Principal {
    public static void main (String [] args) {
        musica Emicida = new musica();
        Emicida.setTitulo("Alma Gemea");
        Emicida.setArtista("Emicida");

        for (int i = 0; i < 8000; i++) {
            Emicida.reproducao();
        }
        for (int i = 0; i < 1000; i++) {
            Emicida.curte();
        }

        podCast PodLove = new podCast();
        PodLove.setTitulo("FilmesLover");
        PodLove.setPodCaster("Fulaninho");
        PodLove.setDescricao("Filmes do ano");

        for (int i = 0; i < 3000; i++) {
            PodLove.reproducao();
        }
        for (int i = 0; i < 500; i++) {
            PodLove.curte();
        }

        audioBook Hobbit = new audioBook();
        Hobbit.setTitulo("Capitulo 5");
        Hobbit.setAutorLivro("Tolkien");

        for (int i = 0; i < 1000; i++) {
            Hobbit.reproducao();
        }
        for (int i = 0; i < 250; i++) {
            Hobbit.curte();
        }

        Favoritas favoritas = new Favoritas();
        favoritas.inclui(PodLove);
        favoritas.inclui(Emicida);
    }
}
