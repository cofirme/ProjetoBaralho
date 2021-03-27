package ProjetoBaralho;

//gerencia a execução do jogo de baralho
public class GerenciarJogo {

    //instacia o baralho
    public static void main(String[] args) {
        Baralho baralho;
        baralho = new Baralho();
        baralho.montar();
        System.out.println("\nBaralho: \n");
        baralho.exibir();
        baralho.embaralhar();
        System.out.println("\nCartas Embaralhadas: \n");
        baralho.exibir();
        }
}