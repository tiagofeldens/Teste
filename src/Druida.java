public class Druida {

    String nome;
    int vida;
    int ataque;
    int defesa;
    int fe;

    public Druida(String nome, int vida, int ataque, int defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    int atacar(Clerigo atacado, PoderDivino poderDivinoUtilizado) {
        int dano = poderDivinoUtilizado.intensidade * ataque - atacado.defesa;
        atacado.vida = atacado.vida - dano;
        this.fe = fe - poderDivinoUtilizado.custoDeFe;
        return dano;
    }

    int atacar(Guerreiro atacado, PoderDivino poderDivinoUtilizado) {
        int dano = poderDivinoUtilizado.intensidade * ataque - atacado.defesa;
        atacado.vida = atacado.vida - dano;
        this.fe = fe - poderDivinoUtilizado.custoDeFe;
        return dano;
    }
}