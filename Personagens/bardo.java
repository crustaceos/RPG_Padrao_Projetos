package Personagens;

import Armas.*;

public class bardo extends Personagem {

    public bardo() {
        super("Bardo",5, 20, 50, 90, 100, "-3 de vida por turno", new String[]{"Instrumentos", "Adagas"});
    }

    @Override
    public Arma atacar(Arma arma) {

        boolean podeUsarArma = false;

        for (String tipo : this.podeUsar) {
            
            String nomeArma = arma.getClass().getSimpleName().toLowerCase();

            
            if ((tipo.equalsIgnoreCase("Instrumentos") && nomeArma.contains("instrumento")) ||
                (tipo.equalsIgnoreCase("Adagas") && nomeArma.contains("adaga"))) {

                podeUsarArma = true;
                
                break;
            }
        }

        if (podeUsarArma) {
            System.out.println("O bardo ataca com " + arma.getClass().getSimpleName() +
                               " causando " + arma.dano + " de dano (" + arma.efeitoEspecial + ")");
            return arma;

        } else {
            System.out.println("O bardo não pode usar " + arma.getClass().getSimpleName());
            return null;
        }
    }
}