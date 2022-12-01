package br.com.HitchhikePlus.teste;

import br.com.HitchhikePlus.beans.Conexao;
import br.com.HitchhikePlus.beans.Criptografia;
import br.com.HitchhikePlus.beans.Usuario;

import javax.swing.*;

public class MainConexao {
    public static void main(String[] args) {

        String recebeNome = JOptionPane.showInputDialog("Cadastre o seu nome: ");
        String recebeEmailPessoal = JOptionPane.showInputDialog("Cadastre o seu E-Mail pessoal: ");
        String recebeCpf = JOptionPane.showInputDialog("Cadastre o seu CPF: ");
        String recebeTelefone = JOptionPane.showInputDialog("Cadastre o seu telefone: ");
        char recebeGenero = JOptionPane.showInputDialog("Cadastre o seu gênero: ").charAt(4);
        String recebeDataNascimento = JOptionPane.showInputDialog("Cadastre a sua data de nascimento: ");
        String recebeBairo = JOptionPane.showInputDialog("Cadastre o seu bairro: ");
        String recebeCidade = JOptionPane.showInputDialog("Cadastre a sua cidade: ");
        String recebeEstado = JOptionPane.showInputDialog("Cadastre o seu estado: ");
        String recebeEndereco = JOptionPane.showInputDialog("Cadastre o seu endereço: ");
        String recebeComplementos = JOptionPane.showInputDialog("Cadastre os seus complementos: ");
        int recebeCep = Integer.parseInt(JOptionPane.showInputDialog("Cadastre o seu CEP: "));
        String recebeSenha = JOptionPane.showInputDialog("Cadastre a sua senha: ");

        Usuario usuario = new Usuario(recebeNome, recebeEmailPessoal, recebeCpf, recebeTelefone, recebeGenero,
                recebeDataNascimento, recebeBairo, recebeCidade, recebeEstado, recebeEndereco, recebeComplementos,
                recebeCep, recebeSenha);

        String recebeNomeDois = JOptionPane.showInputDialog("Cadastre o seu nome: ");
        String recebeEmailPessoalDois = JOptionPane.showInputDialog("Cadastre o seu E-Mail pessoal: ");
        String recebeCpfDois = JOptionPane.showInputDialog("Cadastre o seu CPF: ");
        String recebeTelefoneDois = JOptionPane.showInputDialog("Cadastre o seu telefone: ");
        char recebeGeneroDois = JOptionPane.showInputDialog("Cadastre o seu gênero: ").charAt(4);
        String recebeDataNascimentoDois = JOptionPane.showInputDialog("Cadastre a sua data de nascimento: ");
        String recebeBairoDois = JOptionPane.showInputDialog("Cadastre o seu bairro: ");
        String recebeCidadeDois = JOptionPane.showInputDialog("Cadastre a sua cidade: ");
        String recebeEstadoDois = JOptionPane.showInputDialog("Cadastre o seu estado: ");
        String recebeEnderecoDois = JOptionPane.showInputDialog("Cadastre o seu endereço: ");
        String recebeComplementosDois = JOptionPane.showInputDialog("Cadastre os seus complementos: ");
        int recebeCepDois = Integer.parseInt(JOptionPane.showInputDialog("Cadastre o seu CEP: "));
        String recebeSenhaDois = JOptionPane.showInputDialog("Cadastre a sua senha: ");

        Usuario usuarioDois = new Usuario(recebeNomeDois, recebeEmailPessoalDois, recebeCpfDois, recebeTelefoneDois, recebeGeneroDois,
                recebeDataNascimentoDois, recebeBairoDois, recebeCidadeDois, recebeEstadoDois, recebeEnderecoDois, recebeComplementosDois,
                recebeCepDois, recebeSenhaDois);
        
        Conexao conexao = new Conexao();

        Boolean conexaoEntreDoisUsers = conexao.criarConexao(usuario, usuarioDois);
        System.out.println(conexaoEntreDoisUsers);
    }
}
