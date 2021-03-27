package ProjetoBaralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//agrupa metodos e atributos das cartas
public class Baralho {
    private final List<Carta> cartas = new ArrayList<Carta>();

    //cria as cartas unindo os valores e naipes
    public void montar(){
        for(Valor valor: Valor.values())
            for(Naipe naipe: Naipe.values())
                cartas.add(new Carta(naipe,valor));
    }

    //embaralha as cartas criadas usando função Collections
    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    //mostra o baralho
    public void exibir(){
        for (Carta carta : cartas) System.out.println(carta.toString());
    }

}
