package Personagens;

import Armas.*;

public class mago extends Personagem {

    public mago() {
        super("Mago",5, 7, 18, 70, 150, "Regeneração de Mana (+10 mana por turno)", new String[]{"Cajados", "Adagas"});
    }

    @Override
    public Arma atacar(Arma arma) {
        boolean podeUsarArma = false;

        for (String tipo : this.podeUsar) {
            String nomeArma = arma.getClass().getSimpleName().toLowerCase();

            if ((tipo.equalsIgnoreCase("Cajados") && nomeArma.contains("cajado")) ||
                (tipo.equalsIgnoreCase("Adagas") && nomeArma.contains("adaga"))) {
                podeUsarArma = true;
                break;
            }
        }

        if (podeUsarArma) {
            System.out.println("O mago ataca com " + arma.getClass().getSimpleName() +
                               " causando " + arma.dano + " de dano (" + arma.efeitoEspecial + ")");
            return arma;
        } else {
            System.out.println("O mago não pode usar " + arma.getClass().getSimpleName());
            return null;
        }
    }
}
