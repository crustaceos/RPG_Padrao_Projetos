package Armas;
public class arcoElfico extends Arma{

    public arcoElfico() {
        super(12, "chuva de flechas", 15, 8);
        
    }

    @Override
    public Arma atacar(Arma arma) {
        
        return arma;

    }

    
    
}
