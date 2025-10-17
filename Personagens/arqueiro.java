package Personagens;

import Armas.*;

public class arqueiro extends Personagem {

    public arqueiro() {
        super(8, 15, 7, 90, 80, "Esquiva", new String[]{"Arcos", "Adagas"});
    }

    @Override
    public Arma atacar(Arma arma) {
        boolean podeUsarArma = false;

        for (String tipo : this.podeUsar) {
            String nomeArma = arma.getClass().getSimpleName().toLowerCase();

            if ((tipo.equalsIgnoreCase("Arcos") && nomeArma.contains("arco")) ||
                (tipo.equalsIgnoreCase("Adagas") && nomeArma.contains("adaga"))) {
                podeUsarArma = true;
                break;
            }
        }

        if (podeUsarArma) {
            System.out.println("O arqueiro ataca com " + arma.getClass().getSimpleName() +
                               " causando " + arma.dano + " de dano (" + arma.efeitoEspecial + ")");
            return arma;
        } else {
            System.out.println("O arqueiro não pode usar " + arma.getClass().getSimpleName());
            return null;
        }
    }
}
