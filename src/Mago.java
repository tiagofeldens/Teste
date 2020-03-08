public class Mago {

    String nome;
    int vida;
    int ataque;
    int defesa;
    int mana;
    Magia magia;

    public Mago(String nome, int vida, int ataque, int defesa, int mana, Magia magia) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        this.magia = magia;
    }
}