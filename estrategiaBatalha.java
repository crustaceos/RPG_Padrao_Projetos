public class estrategiaBatalha {

    public Arma arma;

    public void setArma(Arma arma){

        this.arma = arma;

    }

    public estrategiaBatalha (Arma arma){

        this.setArma(arma);

    }

    public String acaoTurno(String turno){

        return this.arma.atacar(turno);

    }
    
}
