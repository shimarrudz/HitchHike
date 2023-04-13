package br.com.HitchhikePlus.beans;

import javax.swing.*;
import java.util.ArrayList;

public class Usuario {

	private String nome;
	private String emailPessoal;
	private String cpf;
	private String telefone;
	private char genero;
	private String dataNascimento;
	private String bairro;
	private String cidade;
	private String estado;
	private String endereco;
	private String complementos;
	private int cep;
	private String senha;
	
	public Usuario() {}
	
	public Usuario(String nome, String emailPessoal, String cpf, String telefone, char genero, String dataNascimento,
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
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

	public String toString() {
		return nome + "\n" + emailPessoal + "\n" + cpf + "\n" + telefone + "\n" + genero + "\n" + dataNascimento + "\n" + bairro + "\n" + cidade + "\n" + estado + "\n" + endereco + "\n" + complementos + "\n" + cep + "\n" + senha;
	}

	public ArrayList cadastrar(Usuario usuario) {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		usuario.setNome(JOptionPane.showInputDialog("Cadastre seu nome: "));
		usuario.setEmailPessoal(JOptionPane.showInputDialog("Cadastre seu E-mail pessoal: "));
		usuario.setCpf(JOptionPane.showInputDialog("Cadastre seu CPF: "));
		usuario.setTelefone(JOptionPane.showInputDialog("Cadastre seu Telefone: "));
		usuario.setGenero(JOptionPane.showInputDialog("Cadastre seu Genero: ").charAt(4));
		usuario.setDataNascimento(JOptionPane.showInputDialog("Cadastre sua data de nascimento: "));
		usuario.setBairro(JOptionPane.showInputDialog("Cadastre seu Bairro: "));
		usuario.setCidade(JOptionPane.showInputDialog("Cadastre sua cidade: "));
		usuario.setEstado(JOptionPane.showInputDialog("Cadastre seu Estado: "));
		usuario.setEndereco(JOptionPane.showInputDialog("Cadastre seu Endereço: "));
		usuario.setComplementos(JOptionPane.showInputDialog("Cadastre seu Complementos: "));
		usuario.setCep(Integer.parseInt(JOptionPane.showInputDialog("Cadastre seu CEP: ")));
		usuario.setSenha(JOptionPane.showInputDialog("Cadastre sua senha: "));

		usuario.nome = getNome();
		usuario.emailPessoal = getEmailPessoal();
		usuario.cpf = getCpf();
		usuario.telefone = getTelefone();
		usuario.genero = getGenero();
		usuario.dataNascimento = getDataNascimento();
		usuario.bairro = getBairro();
		usuario.cidade = getCidade();
		usuario.estado = getEstado();
		usuario.endereco = getEndereco();
		usuario.complementos = getComplementos();
		usuario.cep = getCep();
		usuario.senha = Criptografia.encriptacao(getSenha());

		usuarios.add(usuario);

		System.out.println(usuarios);
		return usuarios;
	}
}
