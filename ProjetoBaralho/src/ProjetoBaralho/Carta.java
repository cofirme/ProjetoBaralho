package ProjetoBaralho;
//Classe Carta que irá unir os Valores com os Naipes

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    //função para mostrar os dados gerados
    @Override
    public String toString() {
        return getValor()+" - "+getNaipe();
    }

}
