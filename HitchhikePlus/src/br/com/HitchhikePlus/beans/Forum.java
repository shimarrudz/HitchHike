package br.com.HitchhikePlus.beans;

public class Forum {

    private String assunto;
    private String duvida;
    private String resposta;

    public Forum() {
    }

    public Forum(String assunto, String duvida, String resposta) {
        this.assunto = assunto;
        this.duvida = duvida;
        this.resposta = resposta;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDuvida() {
        return duvida;
    }

    public void setDuvida(String duvida) {
        this.duvida = duvida;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String enviarDuvidasRH() {

        return "Esse método recebe o email cadastrado da empresa e envia suas dúvidas para a mesma caso tenha algum problema com a plataforma";
    }

    public String mostrarResposta() {
        return "Esse método envia nossa resposta ao forum";
    }

    public String mostrarDuvidasFrequentes() {
        return "Esse método para mostrar as duvidas mais frequentes de nossos usuarios frequentes lá no frontend";
    }
}
