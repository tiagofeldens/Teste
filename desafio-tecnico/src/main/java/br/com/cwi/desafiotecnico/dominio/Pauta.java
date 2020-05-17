package br.com.cwi.desafiotecnico.dominio;


public class Pauta {

    private int id;
    private String pauta;
    private Sessao sessao;
    private String resultado;


    public Pauta(String pauta) {
        this.pauta = pauta;
    }

    public Pauta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pauta{" +
                "pauta='" + pauta + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}

