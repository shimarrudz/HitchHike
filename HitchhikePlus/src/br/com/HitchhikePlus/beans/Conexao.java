package br.com.HitchhikePlus.beans;

public class Conexao extends Usuario {

    private boolean amizade;

    public Conexao() {
    }

    public Conexao(String nome, String emailPessoal, String cpf, String telefone, char genero, String dataNascimento, String bairro, String cidade, String estado, String endereco, String complementos, int cep, String senha, boolean amizade) {
        super(nome, emailPessoal, cpf, telefone, genero, dataNascimento, bairro, cidade, estado, endereco, complementos, cep, senha);
        this.amizade = amizade;
    }

    public boolean isAmizade() {
        return amizade;
    }

    public void setAmizade(boolean amizade) {
        this.amizade = amizade;
    }

    public String criarConexao() {
        return "Irá criar o laço de amizade entre 2 usuários";
    }

    public String solicitarAmizade(){
        return "Faz o pedido de amizade para um determinado usuário";
    }

    public String desfazerConexao() {
        return "Irá desfazer o lço de amizade entre 2 usuários";
    }
}
