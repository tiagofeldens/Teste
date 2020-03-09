public class Barbaro {

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Barbaro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    int atacar(Feiticeiro atacado, Arma armaUtilizada) {
        int dano = armaUtilizada.poderDeAtaque * ataque - atacado.defesa;
        atacado.vida = atacado.vida - dano;
        return dano;
    }

    int atacar(Mago atacado, Arma armaUtilizada) {
        int dano = armaUtilizada.poderDeAtaque * ataque- atacado.defesa;
        atacado.vida = atacado.vida - dano;
        return dano;
    }
}