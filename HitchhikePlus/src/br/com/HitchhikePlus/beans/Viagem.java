package br.com.HitchhikePlus.beans;

import org.w3c.dom.ls.LSOutput;

public class Viagem {

    private String horarioDaViagem;
    private double duracaoViagem;
    private String andamento;

    public Viagem() {
    }

    public Viagem(String horarioDaViagem, double duracaoViagem, String andamento) {
        this.horarioDaViagem = horarioDaViagem;
        this.duracaoViagem = duracaoViagem;
        this.andamento = andamento;
    }

    public String getHorarioDaViagem() {
        return horarioDaViagem;
    }

    public void setHorarioDaViagem(String horarioDaViagem) {
        this.horarioDaViagem = horarioDaViagem;
    }

    public double getDuracaoViagem() {
        return duracaoViagem;
    }


    public void setDuracaoViagem(double duracaoViagem) {
        this.duracaoViagem = duracaoViagem;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    public void agendarViajem() {
    }

    public void oferecerViagem() {
    }

    public void solicitarViagem() {
    }
}
