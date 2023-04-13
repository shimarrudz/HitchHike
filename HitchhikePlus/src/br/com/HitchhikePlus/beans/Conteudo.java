package br.com.HitchhikePlus.beans;

public class Conteudo {

    private String mapa;
    private String forum;
    private String homePage;

    public Conteudo() {
    }

    public Conteudo(String mapa, String forum, String homePage) {
        this.mapa = mapa;
        this.forum = forum;
        this.homePage = homePage;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String inserirConteudo() {
        return "Insere o conteudo do site";
    }
}
