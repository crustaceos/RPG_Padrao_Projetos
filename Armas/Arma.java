package Armas;

import Interfaces.iAcao;

public abstract class Arma implements iAcao {

    public String nome;
    public double dano;
    public String efeitoEspecial;
    public double custoMana;
    public double requisito;

    public Arma(String nome, double dano, String efeitoEspecial, double custoMana, double requisito) {
        this.nome = nome;
        this.dano = dano;
        this.efeitoEspecial = efeitoEspecial;
        this.custoMana = custoMana;
        this.requisito = requisito;
    }

    //Para eu printar os atributos da arma:
    public String descricaoArma() {

        return 
        "Arma: " + nome +
        " | Dano: " + dano + 
               " | Efeito: " + efeitoEspecial + 
               " | Custo Mana: " + custoMana + 
               " | Requisito: " + requisito;

    }

    public abstract String aplicarEfeito();
}
