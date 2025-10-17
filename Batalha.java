import Armas.*;
import Estrategias.*;
import Personagens.*;

public class Batalha {

public static void main(String[] args) {
    
    estrategiaArma novaArma = new estrategiaArma(new espadaLonga());

    estrategiaPersonagem novoPersonagem = new estrategiaPersonagem(new guerreiro());

    System.out.println(novoPersonagem.acaoTurno(novaArma));

    System.out.println(novaArma.acaoTurno("Primeiro Turno: "));

    novaArma.setArma(new arcoElfico());

    System.out.println(novaArma.acaoTurno("Segundo Turno: "));


}

    
}
