public class App {
    public static void main(String[] args) {

        Arma machado = new Arma("machado", 3);
        Arma espada = new Arma("espada", 4);
        Magia bolaDeFogo = new Magia("bolaDeFogo", 2, 4);
        Magia cogumeloSonifero = new Magia("cogumeloSonifero", 2, 4);
        PoderDivino armaEspiritual = new PoderDivino("armaEspiritual", 2, 2);
        PoderDivino rajadaDeFe = new PoderDivino("rajadaDeFe", 3, 5);
        Guerreiro ramza = new Guerreiro("ramza", 100, 7, 4, machado);
        Barbaro ragnar = new Barbaro("ragnar", 100, 8, 3, espada);
        Mago floki = new Mago("floki", 100, 5, 2, 50, bolaDeFogo);
        Feiticeiro bjorn = new Feiticeiro("bjorn", 100, 6, 2, 45, cogumeloSonifero);
        Druida rollo = new Druida("rollo", 100, 3, 1, 40, rajadaDeFe);
        Clerigo athelstein = new Clerigo("athelstein", 100, 3, 1, 35, armaEspiritual);


    }
}