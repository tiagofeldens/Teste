import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class App {
    public static void main(String[] args) {

        Arma machado = new Arma("machado", 3);
        Arma espada = new Arma("espada", 4);
        Magia bolaDeFogo = new Magia("bolaDeFogo", 2, 4);
        Magia cogumeloSonifero = new Magia("cogumeloSonifero", 2, 4);
        PoderDivino armaEspiritual = new PoderDivino("armaEspiritual", 2, 2);
        PoderDivino rajadaDeFe = new PoderDivino("rajadaDeFe", 3, 5);
        Guerreiro ramza = new Guerreiro("ramza", 100, 7, 4);
        Barbaro ragnar = new Barbaro("ragnar", 100, 8, 3);
        Mago floki = new Mago("floki", 100, 5, 2, 50);
        Feiticeiro bjorn = new Feiticeiro("bjorn", 100, 6, 2, 45);
        Druida rollo = new Druida("rollo", 100, 3, 1, 40);
        Clerigo athelstein = new Clerigo("athelstein", 100, 3, 1, 35);


        int dano = ramza.atacar(ragnar, machado);
        System.out.println(ramza.nome + " atacou " + ragnar.nome + " com o " + machado.nome + " causando dano de " + dano);
        if (ragnar.vida == 0) {
            System.out.println("Ragnar morreu!");
        dano = ramza.atacar(floki, espada);
        System.out.println(ramza.nome + " atacou " + floki.nome + " com a " + espada.nome + " causando dano de " + dano);
        dano = ragnar.atacar(floki, machado);
        System.out.println(ragnar.nome + " atacou " + floki.nome + " com o " + machado.nome + " causando dano de " + dano);
        dano = ragnar.atacar(bjorn, espada);
        System.out.println(ragnar.nome + " atacou " + bjorn.nome + " com a " + espada.nome + " causando dano de " + dano);
        dano = floki.atacar(rollo, cogumeloSonifero);
        System.out.println(floki.nome + " atacou " + rollo.nome + " com o " + cogumeloSonifero.nome + " causano dano de " + dano);
        dano = floki.atacar(bjorn, bolaDeFogo);
        System.out.println(floki.nome + " atacou " + bjorn.nome + " com a " + bolaDeFogo.nome + " causano dano de " + dano);
        dano = bjorn.atacar(rollo, cogumeloSonifero);
        System.out.println(bjorn.nome + " atacou " + rollo.nome + " com o " + cogumeloSonifero.nome + " causano dano de " + dano);
        dano = bjorn.atacar(athelstein, bolaDeFogo);
        System.out.println(bjorn.nome + " atacou " + athelstein.nome + " com o " + bolaDeFogo.nome + " causano dano de " + dano);
        dano = rollo.atacar(athelstein, armaEspiritual);
        System.out.println(rollo.nome + " atacou " + athelstein.nome + " com o " + armaEspiritual.nome + " causano dano de " + dano);
        dano = rollo.atacar(ramza, rajadaDeFe);
        System.out.println(rollo.nome + " atacou " + ramza.nome + " com o " + rajadaDeFe.nome + " causano dano de " + dano);
        dano = athelstein.atacar(ragnar, armaEspiritual);
        System.out.println(athelstein.nome + " atacou " + ragnar.nome + " com o " + armaEspiritual.nome + " causano dano de " + dano);
        dano = athelstein.atacar(ramza, rajadaDeFe);
        System.out.println(athelstein.nome + " atacou " + ramza.nome + " com o " + rajadaDeFe.nome + " causano dano de " + dano);

        System.out.println("Final de combate");
        System.out.println(ramza.nome + " ficou com " + ramza.vida  + " de vida ");
        System.out.println(ragnar.nome + " ficou com " + ragnar.vida + " de vida ");
        System.out.println(floki.nome + " ficou com " + floki.vida + " de vida e com " + floki.mana + " de mana");
        System.out.println(bjorn.nome + " ficou com " + bjorn.vida + " de vida e com " + bjorn.mana + " de mana");
        System.out.println(rollo.nome + " ficou com " + rollo.vida + " de vida e com " + rollo.fe + " de fe");
        System.out.println(athelstein.nome + " ficou com " + athelstein.vida + " de vida e com " + athelstein.fe + " de fe");

    }
}
