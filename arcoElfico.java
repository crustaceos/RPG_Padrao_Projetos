public class arcoElfico extends Arma{

    public arcoElfico() {
        super(12, "chuva de flechas", 15, 8);
        
    }

    @Override
    public String atacar(String turno) {
        
        return turno + "Ataque de arco élfico";

    }

    
    
}
