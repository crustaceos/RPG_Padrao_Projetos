package Armas;
public class espadaLonga extends Arma{

    //ao criar a classe da arma, ele dá como ofensor a falta dos atributos (dano, mana etc)
    //eu seleciono a classe "espadaLonga" e ele vai dar um "fix" pra mim que é implementar o que esta faltando
    //no "super" que ele me dá, eu tiro todos os parâmetros passados dentro do public espadaLonga()
    //e ao invés de no super eu deixar o nome do atributo, eu coloco diretamente o valor que eu quero atribuir à ele

    //também dá como ofensor, a falta do método implementado em "Arma" que é "atacar"
    
    //Exemplo de como vem direto a implementação dos atributos pelo super na classe:

    //public espadaLonga(double dano, String efeitoEspecial, doule custoMana, double requisito) {
        //super(dano, efeitoEspecial, custoMana, requisito);
    //}



    //Como deve ficar a implementação dos atributos para a classe:


    public espadaLonga() {
        super(15, "Corte Profundo", 0, 10);
    }

    @Override
    public Arma atacar(Arma arma) {
        return this;
    }

    @Override
    public String aplicarEfeito() {
        return "Efeito especial ativado: Sangramento (30% chance, 5 de dano por 3 turnos)";
    }

    
}
