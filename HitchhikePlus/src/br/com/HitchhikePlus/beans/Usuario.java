package br.com.HitchhikePlus.beans;

import javax.swing.*;
import java.util.ArrayList;

public class Usuario {

	private String nome;
	private String emailPessoal;
	private String cpf;
	private String telefone;
	private String genero;
	private String dataNascimento;
	private String bairro;
	private String cidade;
	private String estado;
	private String endereco;
	private String complementos;
	private int cep;
	private String senha;
	
	public Usuario() {}
	
	public Usuario(String nome, String emailPessoal, String cpf, String telefone, String genero, String dataNascimento,
			String bairro, String cidade, String estado, String endereco, String complementos, int cep, String senha) {
		super();
		this.nome = nome;
		this.emailPessoal = emailPessoal;
		this.cpf = cpf;
		this.telefone = telefone;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		this.complementos = complementos;
		this.cep = cep;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmailPessoal() {
		return emailPessoal;
	}

	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplementos() {
		return complementos;
	}

	public void setComplementos(String complementos) {
		this.complementos = complementos;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void cadastrar(Usuario usuario) {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		//Fazer com todos os atributos
		usuario.setNome(JOptionPane.showInputDialog("Cadastre seu nome"));

		//Fazer com todos os atributos
		usuario.nome = getNome();
		usuario.senha = Criptografia.encriptacao(getSenha());

		usuarios.add(usuario);

		System.out.println(usuarios);
	}
}
