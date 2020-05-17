package br.com.cwi.desafiotecnico.dominio;

import br.com.cwi.desafiotecnico.dominio.Pauta;
import br.com.cwi.desafiotecnico.dominio.Voto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int id;
    private int idPauta;
    private int tempo;
    private LocalDateTime horarioFinal;

    public Sessao(int tempo) {
        this.tempo = tempo;
    }

    public Sessao() {
    }

    public final List<Voto> votos = new ArrayList<>();
    public final List<Integer> votantes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public LocalDateTime getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalDateTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public int getIdPauta() {
        return idPauta;
    }

    public void setIdPauta(int idPauta) {
        this.idPauta = idPauta;
    }
}
