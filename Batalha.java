import Armas.*;
import Estrategias.*;
import Personagens.*;

public class Batalha {

    public static void main(String[] args) {

        estrategiaArma novaArma = new estrategiaArma(new espadaLonga());
        estrategiaPersonagem novoPersonagem = new estrategiaPersonagem(new guerreiro());

        System.out.println("===== INÍCIO DA BATALHA =====");
        System.out.println(novaArma.acaoTurno("Primeiro Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de Arma ---");
        novaArma.setArma(new arcoElfico());

        System.out.println(novaArma.acaoTurno("Segundo Turno: "));
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n--- Troca de personagem ---");
        novoPersonagem.setPersonagem(new arqueiro());

        System.out.println("Terceiro Turno: ");
        novoPersonagem.acaoTurno(novaArma.arma);

        System.out.println("\n===== FIM DA BATALHA =====");
    }
}
