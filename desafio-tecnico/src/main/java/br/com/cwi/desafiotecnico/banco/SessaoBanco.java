package br.com.cwi.desafiotecnico.banco;

import br.com.cwi.desafiotecnico.dominio.Sessao;

import java.util.ArrayList;
import java.util.List;

public class SessaoBanco {

    int contador = 1;
    final List<Sessao> sessoes = new ArrayList<>();

    public Sessao criarSessao(Sessao sessao) {
        sessao.setId(contador++);
        sessoes.add(sessao);
        return sessao;

    }


}
