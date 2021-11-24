package aula15mesa;

import java.util.ArrayList;
import java.util.Collections;

public class Navetur {

    private ArrayList<Iate> listaIates = new ArrayList<>();
    private ArrayList<Veleiro> listaVeleiros = new ArrayList<>();

    public void addIate(Iate iate){ listaIates.add(iate);
    }
    public void addVeleiro(Veleiro veleiro){
        listaVeleiros.add(veleiro);
    }

    public void ordenarIates(){
        Collections.sort(listaIates);
        System.out.println("Iates ordenados do menos ao mais luxuoso:");
        for (Iate iate : listaIates) {
            System.out.println("  Número de cabines: " + iate.getCabines() + "\n  Ano de fabricação: " + iate.getAnoFabricacao());
        }
    }

    public double calcularAluguel(Embarcacao embarcacao){
        if (embarcacao.getAnoFabricacao() > 2020) {
            return (embarcacao.getPrecoBase() + embarcacao.getValorAdicional());
        } else {
            return embarcacao.getPrecoBase();
        }
    }

}
