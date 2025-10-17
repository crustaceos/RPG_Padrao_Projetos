package Estrategias;
import Armas.Arma;
import Personagens.*;

public class estrategiaPersonagem {
    
    public Personagem personagem;

    public void setPersonagem(Personagem personagem){

        this.personagem = personagem;

    }

    public estrategiaPersonagem(Personagem personagem){

        this.setPersonagem(personagem);

    }

    public Arma acaoTurno(Arma arma){

        return this.personagem.atacar(arma);

    }

}
