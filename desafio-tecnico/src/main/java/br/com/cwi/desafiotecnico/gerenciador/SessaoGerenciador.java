package br.com.cwi.desafiotecnico.gerenciador;

import br.com.cwi.desafiotecnico.banco.PautaBanco;
import br.com.cwi.desafiotecnico.banco.SessaoBanco;
import br.com.cwi.desafiotecnico.dominio.Pauta;
import br.com.cwi.desafiotecnico.dominio.Sessao;
import br.com.cwi.desafiotecnico.dominio.TipoVoto;
import br.com.cwi.desafiotecnico.dominio.Voto;


import java.time.LocalDateTime;


public class SessaoGerenciador {
    SessaoBanco banco = new SessaoBanco();
    PautaBanco pautaBanco;

    public SessaoGerenciador(PautaBanco pautaBanco) {
        this.pautaBanco = pautaBanco;
    }

    public Sessao criarSessao(int idPauta, Sessao sessao) {
        int duracao = 1;
        if (sessao.getTempo() > 0) {
            duracao = sessao.getTempo();
        }
        LocalDateTime duracaoSessao = LocalDateTime.now().plusMinutes(duracao);
        sessao.setHorarioFinal(duracaoSessao);
        Pauta pauta = pautaBanco.procurarPauta(idPauta);
        pauta.setSessao(sessao);
        return banco.criarSessao(sessao);
    }

    public void votar(int idPauta, Voto voto) {
        Pauta pauta = pautaBanco.procurarPauta(idPauta);

        for (int id : pauta.getSessao().votantes) {
            if (id == voto.getIdAssociado()) {
                throw new RuntimeException("Associado já votou nesta pauta.");
            }
        }

        if (LocalDateTime.now().isBefore(pauta.getSessao().getHorarioFinal())) {
            pauta.getSessao().votantes.add(voto.getIdAssociado());
            pauta.getSessao().votos.add(voto);
        } else {
            throw new RuntimeException("Tempo de votação da pauta encerrado.");
        }


    }

    public String contarVotos(int idPauta) {
        Pauta pauta = pautaBanco.procurarPauta(idPauta);
        int contadorSim = 0;
        int contadorNao = 0;
        for (Voto voto : pauta.getSessao().votos) {
            if (voto.getVoto() == TipoVoto.SIM) {
                contadorSim++;
            } else {
                contadorNao++;
            }
        }
        pauta.setResultado("A pauta teve " + contadorSim + " votos Sim e " + contadorNao + " votos Não." );
    return pauta.getResultado();
    }


}

