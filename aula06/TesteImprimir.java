package aula06;

import java.time.LocalDate;
import java.util.Date;

public class TesteImprimir {
    public static void main(String[] args) {

        Impressora impressora1 = new Impressora("HP1022","USB", LocalDate.of(2017,05,27));
        impressora1.mostraImpressora();
        impressora1.addPapel(10);
        impressora1.imprimir("Ola");
        System.out.println("Folhas Disponiveis: "+impressora1.getFolhasDisponiveis());
    }
}
