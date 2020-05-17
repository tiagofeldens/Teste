package br.com.cwi.desafiotecnico.gerenciador;

import br.com.cwi.desafiotecnico.banco.PautaBanco;
import br.com.cwi.desafiotecnico.dominio.Pauta;

public class PautaGerenciador {

    public PautaBanco banco;

    public PautaGerenciador(PautaBanco banco) {
        this.banco = banco;
    }

    public Pauta criarPauta(Pauta pauta) {
        banco.criarPauta(pauta);
        return pauta;
    }
}
