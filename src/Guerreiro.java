public class Guerreiro {

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    int atacar(Barbaro atacado, Arma armaUtilizada) {
        int dano = armaUtilizada.poderDeAtaque * ataque - atacado.defesa;

        if (atacado.vida == 0 || this.vida == 0) {
            dano = 0;
        }
        atacado.vida = atacado.vida - dano;
        return dano;
    }

    int atacar(Mago atacado, Arma armaUtilizada) {
        int dano = armaUtilizada.poderDeAtaque * ataque - atacado.defesa;
        atacado.vida = atacado.vida - dano;
        return dano;
    }
}