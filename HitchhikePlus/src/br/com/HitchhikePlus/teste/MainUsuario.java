package br.com.HitchhikePlus.teste;

import br.com.HitchhikePlus.beans.Usuario;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        int nUsuarios = 21411; //numeros de usuarios a cadastrar
        for (int i = 0; i < nUsuarios; i++) {
            usuario.cadastrar(usuario);
        }
    }
}
