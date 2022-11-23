package br.com.HitchhikePlus.beans;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Criptografia extends Usuario{
	
    private String senhaEncriptada;
    
    public Criptografia() {
    }
    
    public Criptografia(String senhaEncriptada) {
    	senhaEncriptada = this.senhaEncriptada;
    	
    }

	public String getSenhaEncriptada() {
        return senhaEncriptada;
    }

    public void setSenhaEncriptada(String senhaEncriptada) {
        this.senhaEncriptada = senhaEncriptada;
    }

    public static String encriptacao(String senha) {
        String retorno = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            retorno = hash.toString(16);
        }
        catch (Exception e){}

        return retorno;
    }

    public void decriptacao() {
        System.out.println("Método para decriptar a senha");
    }
}


