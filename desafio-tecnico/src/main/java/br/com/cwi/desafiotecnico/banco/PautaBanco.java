package br.com.cwi.desafiotecnico.banco;

import br.com.cwi.desafiotecnico.dominio.Pauta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PautaBanco {

    int contador = 1;
    final List<Pauta> pautas = new ArrayList<>();

    public Pauta criarPauta (Pauta pauta){
        pauta.setId(contador++);
        pautas.add(pauta);
        return pauta;
    }

    public Pauta procurarPauta (int id) {
        for (Pauta pauta : pautas) {
            if (pauta.getId() == id) {
                return pauta;
            }
        }
        return null;
    }


}