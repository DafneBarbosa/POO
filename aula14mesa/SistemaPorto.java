package aula14mesa;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaPorto {

    private ArrayList<Container> listaContainers = new ArrayList<>();

    public void addContainer(Container c){
        listaContainers.add(c);
    }

    public void mostraContainers(){
        Collections.sort(listaContainers);
        for (Container c: listaContainers) {
            System.out.println("Numero: "+c.getNumero()+"  Pais: "+c.getPaisOrigem());
        }
    }

    public int calculaPerigosos(){
        int contador = 0;
        for (Container c: listaContainers) {
            if(c.isMarcaPerigoso() && c.getPaisOrigem()=="Desconhecido"){
                contador++;
            }
        }
        return contador;
    }


}
