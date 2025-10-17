package Personagens;

import Interfaces.iAcao;


public abstract class Personagem implements iAcao {

    public double forca;
    public double destreza;
    public double inteligencia;
    public double vida;
    public double mana;
    public String habilidadePassiva;
    public String podeUsar[];


    public Personagem(double forca, double destreza, double inteligencia, double vida, double mana, String habilidadePassiva, String podeUsar[]) {
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.vida = vida;
        this.mana = mana;
        this.habilidadePassiva = habilidadePassiva;
        this.podeUsar = podeUsar;
    }
    
}
