package br.com.cwi.desafiotecnico.dominio;

import br.com.cwi.desafiotecnico.dominio.TipoVoto;

public class Voto {

    private TipoVoto voto;
    private int idAssociado;


    public Voto(TipoVoto voto) {
        this.voto = voto;
    }

    public Voto() {
    }

    public TipoVoto getVoto() {
        return voto;
    }

    public void setVoto(TipoVoto voto) {
        this.voto = voto;
    }

    public int getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(int idAssociado) {
        this.idAssociado = idAssociado;
    }
}
