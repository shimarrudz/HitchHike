package br.com.HitchhikePlus.beans;

import javax.swing.*;
import java.util.ArrayList;

public class Chat {

    public String abrirConversa(){
        Conexao conexao = new Conexao();

        ArrayList<String> amigos = new ArrayList<>();


        amigos.add(JOptionPane.showInputDialog("Adicione um Amigo:"));
        amigos.add(JOptionPane.showInputDialog("Adicione outro Amigo:"));
        amigos.add(JOptionPane.showInputDialog("Adicione o ultimo Amigo:"));

        System.out.println(amigos);
        return "";
    }
}
