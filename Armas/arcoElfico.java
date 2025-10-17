package Armas;

public class arcoElfico extends Arma {

    public arcoElfico() {
        super("Arco Elfico",12, "Chuva de Flechas", 15, 8);
    }

    @Override
    public Arma atacar(Arma arma) {
        return this;
    }

    @Override
    public String aplicarEfeito() {
        return "Efeito especial ativado: Ataque em área (atinge todos os inimigos)";
    }
}
