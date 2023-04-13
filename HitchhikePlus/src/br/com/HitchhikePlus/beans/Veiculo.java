package br.com.HitchhikePlus.beans;

public class Veiculo extends Usuario {

    private String modelo;
    private String placa;
    private String marca;
    private int numeroAssentos;
    private double qtdeCombustivel;
    private String cor;

    public Veiculo () {}

    public Veiculo(String nome, String emailPessoal, String cpf, String telefone, char genero, String dataNascimento, String bairro, String cidade, String estado, String endereco, String complementos, int cep, String senha, String modelo, String placa, String marca, int numeroPassageiros, double qtdeCombustivel, String cor) {
        super(nome, emailPessoal, cpf, telefone, genero, dataNascimento, bairro, cidade, estado, endereco, complementos, cep, senha);
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.numeroAssentos = numeroPassageiros;
        this.qtdeCombustivel = qtdeCombustivel;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    public double getQtdeCombustivel() {
        return qtdeCombustivel;
    }

    public void setQtdeCombustivel(double qtdeCombustivel) {
        this.qtdeCombustivel = qtdeCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String cadastrarVeiculo() {
        return "Adicionando carro.";
    }
}
