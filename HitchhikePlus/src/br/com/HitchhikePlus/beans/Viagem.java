package br.com.HitchhikePlus.beans;

import org.w3c.dom.ls.LSOutput;

public class Viagem {

    private String horarioViagem;
    private double duracaoViagem;
    private String andamento;

    public Viagem() {
    }

    public Viagem(String horarioDaViagem, double duracaoViagem, String andamento) {
        this.horarioViagem = horarioDaViagem;
        this.duracaoViagem = duracaoViagem;
        this.andamento = andamento;
    }

    public String getHorarioDaViagem() {
        return horarioViagem;
    }

    public void setHorarioDaViagem(String horarioDaViagem) {
        this.horarioViagem = horarioDaViagem;
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
