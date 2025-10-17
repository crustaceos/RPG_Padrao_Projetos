package Personagens;
import Armas.*;

public class guerreiro extends Personagem {

    public guerreiro() {
        super(15, 8, 5, 120, 50, "pele dura", new String[]{"Espadas","Machados"});
    }

    @Override
    public Arma atacar(Arma arma) {
        return arma;
    }
}
