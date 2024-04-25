package com.soundStreaming.modelos;

import java.net.SocketOption;

public class Favoritas {

    public void inclui ( Audios audios){
        if (audios.getClassificacao() >= 9) {
            System.out.println( audios.getTitulo() + " Mais ouvido do momento" );
        } else {
            System.out.println(audios.getTitulo() + " Proxima tendencia");
        }
    }
}
