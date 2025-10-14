public abstract class Arma implements iAcao {
    
    //Foi criado o construtor para permitir o instânciamento dos atributos nas classes das armas criadas por mim (espada longa etc)

    public double dano;
    public String efeitoEspecial;
    public double custoMana;
    public double requisito;

    public Arma(double dano, String efeitoEspecial, double custoMana, double requisito) {
        this.dano = dano;
        this.efeitoEspecial = efeitoEspecial;
        this.custoMana = custoMana;
        this.requisito = requisito;
    }

}
