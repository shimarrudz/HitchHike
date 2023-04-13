package br.com.HitchhikePlus.beans;

public class ApiColaboracao {

    private String enderecoEmpresa;
    private String enderecoMotorista;
    private int raio;
    private String trajeto;
    private String enderecoPassageiro;

    public ApiColaboracao() {}

    public ApiColaboracao(String enderecoEmpresa, String enderecoMotorista, int raio, String trajeto, String enderecoPassageiro) {
        this.enderecoEmpresa = enderecoEmpresa;
        this.enderecoMotorista = enderecoMotorista;
        this.raio = raio;
        this.trajeto = trajeto;
        this.enderecoPassageiro = enderecoPassageiro;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getEnderecoMotorista() {
        return enderecoMotorista;
    }

    public void setEnderecoMotorista(String enderecoMotorista) {
        this.enderecoMotorista = enderecoMotorista;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }

    public String getEnderecoPassageiro() {
        return enderecoPassageiro;
    }

    public void setEnderecoPassageiro(String enderecoPassageiro) {
        this.enderecoPassageiro = enderecoPassageiro;
    }
}
