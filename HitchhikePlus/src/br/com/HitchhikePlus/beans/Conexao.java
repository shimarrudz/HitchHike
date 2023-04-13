package br.com.HitchhikePlus.beans;

import javax.swing.*;

public class Conexao {

    private boolean amizade;

    public Conexao() {
    }

    public Conexao(boolean amizade) {
        this.amizade = amizade;
    }

    public boolean isAmizade() {
        return amizade;
    }

    public void setAmizade(boolean amizade) {
        this.amizade = amizade;
    }

    public Boolean criarConexao(Usuario usuario1, Usuario usuario2) {

        String confirmacao = JOptionPane.showInputDialog("Deseja criar conexão com " + usuario2.getNome() + "?");

        if(confirmacao.equals("Sim") || confirmacao.equals("sim") || confirmacao.equals("s")){
            JOptionPane.showMessageDialog(null, "Conexão criada com sucesso.");
            setAmizade(true);
        }else{
            setAmizade(false);
            System.out.println("Conexão cancelada");
        }
        return isAmizade();
    }

    public String solicitarAmizade(){
        return "Faz o pedido de amizade para um determinado usuário";
    }

    public String desfazerConexao() {
        return "Irá desfazer o lço de amizade entre 2 usuários";
    }
}
