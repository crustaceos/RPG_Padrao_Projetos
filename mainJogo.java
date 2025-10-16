public class mainJogo {

public static void main(String[] args) {
    
    estrategiaBatalha estrategia = new estrategiaBatalha(new espadaLonga());

    System.out.println(estrategia.acaoTurno("Primeiro Turno: "));

    estrategia.setArma(new arcoElfico());

    System.out.println(estrategia.acaoTurno("Segundo Turno: "));


}

    
}
