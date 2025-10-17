package Armas;

public class cajadoArcano extends Arma {

    public cajadoArcano() {
        super("Cajado Arcano",8, "Bola de Fogo", 25, 12);
    }

    @Override
    public Arma atacar(Arma arma) {
        System.out.println("O cajado arcano lança uma bola de fogo Causa queimadura no inimigo.");
        return arma;
    }

    @Override
    public String aplicarEfeito() {
        
        return "Efeito especial ativado: Bola de Fogo (Causa queimadura (dano de 10 por 2 turnos)";

    }
}
