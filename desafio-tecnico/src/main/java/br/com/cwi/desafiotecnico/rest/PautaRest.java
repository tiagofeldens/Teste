package br.com.cwi.desafiotecnico.rest;

import br.com.cwi.desafiotecnico.banco.PautaBanco;
import br.com.cwi.desafiotecnico.dominio.Sessao;
import br.com.cwi.desafiotecnico.dominio.Voto;
import br.com.cwi.desafiotecnico.dominio.Pauta;
import br.com.cwi.desafiotecnico.gerenciador.PautaGerenciador;
import br.com.cwi.desafiotecnico.gerenciador.SessaoGerenciador;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")

public class PautaRest {

    public PautaGerenciador pautaGerenciador;
    public SessaoGerenciador sessaoGerenciador;

    public PautaRest() {
        PautaBanco pautaBanco = new PautaBanco();
        sessaoGerenciador = new SessaoGerenciador(pautaBanco);
        pautaGerenciador = new PautaGerenciador(pautaBanco);
    }

    @PostMapping
    public Pauta criar(@RequestBody Pauta novaPauta) {
        return pautaGerenciador.criarPauta(novaPauta);
    }

    @PostMapping("/{idPauta}/votar")
    public void votar(@PathVariable("idPauta") int id, @RequestBody Voto novoVoto) {
        sessaoGerenciador.votar(id, novoVoto);
    }

    @PostMapping("/{idPauta}/criarSessao")
    public Sessao criarSessão (@PathVariable("idPauta") int id, @RequestBody Sessao novaSessao) {
        return sessaoGerenciador.criarSessao(id, novaSessao);
    }

    @GetMapping("{idPauta}/contarVotos")
    public String contarVotos(@PathVariable("idPauta") int id) {
        return sessaoGerenciador.contarVotos(id);
    }


}

