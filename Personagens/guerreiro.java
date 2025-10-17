package Personagens;

import Armas.*;

public class guerreiro extends Personagem {

    public guerreiro() {
        super(15, 8, 5, 120, 50, "Pele Dura", new String[]{"Espadas", "Machados"});
    }

    @Override
    public Arma atacar(Arma arma) {
        //Flag em false, que vai mudar caso o personagem possa usar a arma em questão
        boolean podeUsarArma = false;

        for (String tipo : this.podeUsar) {
            //Para captar a string do nome da arma corretamente
            String nomeArma = arma.getClass().getSimpleName().toLowerCase();

            //If para ver, independente da forma que tiver escrito (Sem ser case sensitive) se dentro dos atributos da arma, existe espada ou machado, depois torna a flag como true
            if ((tipo.equalsIgnoreCase("Espadas") && nomeArma.contains("espada")) ||
                (tipo.equalsIgnoreCase("Machados") && nomeArma.contains("machado"))) {

                podeUsarArma = true;
                
                break;
            }
        }

        if (podeUsarArma) {
            System.out.println("O guerreiro ataca com " + arma.getClass().getSimpleName() +
                               " causando " + arma.dano + " de dano (" + arma.efeitoEspecial + ")");
            return arma;

        } else {
            System.out.println("O guerreiro não pode usar " + arma.getClass().getSimpleName());
            return null;
        }
    }
}
