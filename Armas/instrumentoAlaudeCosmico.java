package Armas;

public class instrumentoAlaudeCosmico extends Arma {

    public instrumentoAlaudeCosmico() {
        super("Alaúde Cosmico",35, "Astralidade", 30, 8);
    }

    @Override
    public Arma atacar(Arma arma) {
        return this;
    }

    @Override
    public String aplicarEfeito() {

        return "Efeito especial ativado: Astralidade (Chance de 15% de fazer os inimigos se transformarem em fanstamas aliados após a morte)";
        
    }
}
