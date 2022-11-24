package br.com.HitchhikePlus.beans;

public class Avaliacao  extends Viagem{

    //Avaliacao dos passageiros para o motorista
    private String avaliacaoViagem;
    private String avaliacaoVeiculo;
    private String avaliacaoMotorista;

    //Avaliacao do motorista para os passageiros
    private String avaliacaoPassageiro;

    private String comentario;

    public Avaliacao() {
    }

    public Avaliacao(String horarioDaViagem, double duracaoViagem, String andamento, String avaliacaoViagem, String avaliacaoVeiculo, String avaliacaoMotorista, String avaliacaoPassageiro, String comentario) {
        super(horarioDaViagem, duracaoViagem, andamento);
        this.avaliacaoViagem = avaliacaoViagem;
        this.avaliacaoVeiculo = avaliacaoVeiculo;
        this.avaliacaoMotorista = avaliacaoMotorista;
        this.avaliacaoPassageiro = avaliacaoPassageiro;
        this.comentario = comentario;
    }

    public String getAvaliacaoViagem() {
        return avaliacaoViagem;
    }

    public void setAvaliacaoViagem(String avaliacaoViagem) {
        this.avaliacaoViagem = avaliacaoViagem;
    }

    public String getAvaliacaoVeiculo() {
        return avaliacaoVeiculo;
    }

    public void setAvaliacaoVeiculo(String avaliacaoVeiculo) {
        this.avaliacaoVeiculo = avaliacaoVeiculo;
    }

    public String getAvaliacaoMotorista() {
        return avaliacaoMotorista;
    }

    public void setAvaliacaoMotorista(String avaliacaoMotorista) {
        this.avaliacaoMotorista = avaliacaoMotorista;
    }

    public String getAvaliacaoPassageiro() {
        return avaliacaoPassageiro;
    }

    public void setAvaliacaoPassageiro(String avaliacaoPassageiro) {
        this.avaliacaoPassageiro = avaliacaoPassageiro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String gerarAvaliacao(){
        return "Aqui irá ser feito o envio da avaliação que os passageiros fizerem";
    }
}
