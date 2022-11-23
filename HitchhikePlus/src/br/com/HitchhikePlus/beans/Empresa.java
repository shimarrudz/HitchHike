package br.com.HitchhikePlus.beans;

public class Empresa extends Usuario {
	
	private String nomeEmpresa;
	private String empresaFilial;
	private String emailCorporativo;
	private String cdVerificacao;

	public Empresa() {}

	public Empresa(String nome, String emailPessoal, String cpf, String telefone, String genero, String dataNascimento, String bairro, String cidade, String estado, String endereco, String complementos, int cep, String senha, String nomeEmpresa, String empresaFilial, String emailCorporativo, String cdVerificacao) {
		super(nome, emailPessoal, cpf, telefone, genero, dataNascimento, bairro, cidade, estado, endereco, complementos, cep, senha);
		this.nomeEmpresa = nomeEmpresa;
		this.empresaFilial = empresaFilial;
		this.emailCorporativo = emailCorporativo;
		this.cdVerificacao = cdVerificacao;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEmpresaFilial() {
		return empresaFilial;
	}

	public void setEmpresaFilial(String empresaFilial) {
		this.empresaFilial = empresaFilial;
	}

	public String getEmailCorporativo() {
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public String getCdVerificacao() {
		return cdVerificacao;
	}

	public void setCdVerificacao(String cdVerificacao) {
		this.cdVerificacao = cdVerificacao;
	}
}
