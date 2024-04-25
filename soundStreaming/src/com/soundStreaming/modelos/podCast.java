package com.soundStreaming.modelos;

public class podCast extends Audios {
    private String podCaster;
    private String descricao;

    public String getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(String podCaster) {
        this.podCaster = podCaster;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
