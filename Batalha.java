import Armas.*;
import Estrategias.*;
import Personagens.*;

public class Batalha {

    public static void main(String[] args) {

        estrategiaArma novaArma = new estrategiaArma(new espadaLonga());
        estrategiaPersonagem novoPersonagem = new estrategiaPersonagem(new guerreiro());

        System.out.println("===== INÍCIO DA BATALHA =====");
        System.out.println(novaArma.acaoTurno("Primeiro Turno: "));
        novoPersonagem.atributosPersonagem();
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de Arma ---");
        novaArma.setArma(new arcoElfico());
        System.out.println(novaArma.acaoTurno(""));

        System.out.println(novaArma.acaoTurno("\nSegundo Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de personagem ---");
        novoPersonagem.setPersonagem(new arqueiro());
        System.out.println(novoPersonagem.atributosPersonagem());

        System.out.println(novaArma.acaoTurno("\nTerceiro Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);
        System.out.println(novaArma.ativarEfeito(""));


        System.out.println("\n--- Troca de personagem ---");
        novoPersonagem.setPersonagem(new mago());
        System.out.println(novoPersonagem.atributosPersonagem());

        System.out.println(novaArma.acaoTurno("\nQuarto Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de Arma ---");
        novaArma.setArma(new cajadoArcano());
        System.out.println(novaArma.acaoTurno(""));

        System.out.println(novaArma.acaoTurno("\nQuinto Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de personagem ---");
        novoPersonagem.setPersonagem(new bardo());
        System.out.println(novoPersonagem.atributosPersonagem());

        System.out.println("\n--- Troca de Arma ---");
        novaArma.setArma(new instrumentoAlaudeCosmico());
        System.out.println(novaArma.acaoTurno(""));

        System.out.println(novaArma.acaoTurno("\nSexto Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);
        System.out.println(novaArma.ativarEfeito(""));


        System.out.println("\n===== FIM DA BATALHA =====");
    }
}
