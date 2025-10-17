package Estrategias;
import Armas.*;

public class estrategiaArma{

    public Arma arma;

    public void setArma(Arma arma){

        this.arma = arma;

    }

    public estrategiaArma (Arma arma){

        this.setArma(arma);

    }

    public String acaoTurno(String turno){

        return turno + " " + arma.descricaoArma();
        
    }
    
}
