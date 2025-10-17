package Personagens;

import Interfaces.iAcao;
import Armas.Arma;

public abstract class Personagem implements iAcao {

    //Passando array de strings para saber quais armas o personagem pode usar
    public String nome;
    public double forca;
    public double destreza;
    public double inteligencia;
    public double vida;
    public double mana;
    public String habilidadePassiva;
    public String podeUsar[];

    public Personagem(String nome, double forca, double destreza, double inteligencia, double vida, double mana,
                      String habilidadePassiva, String podeUsar[]) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.vida = vida;
        this.mana = mana;
        this.habilidadePassiva = habilidadePassiva;
        this.podeUsar = podeUsar;
    }

     public String descricaoPersonagem() {

    return 
    "Personagem: " + nome +
    " | Força: " + forca +
           " | Destreza: " + destreza +
           " | Inteligência: " + inteligencia +
           " | Vida: " + vida +
           " | Mana: " + mana +
           " | Habilidade: " + habilidadePassiva +
           " | Pode usar: " + String.join(", ", podeUsar);

}


    public abstract Arma atacar(Arma arma);
}
