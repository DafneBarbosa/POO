package aula10;

public class Principal {
    public static void main(String[] args) {

        Associado associado = new Associado("1234", "Dafne", 80, "natacao");
        System.out.println(associado.toString());
        System.out.println("Custo mensal = "+associado.custoMensal());

        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("453","Felipe","tenis",100,30);
        associadoHabilitado.setHabilitado(true);
        System.out.println(associadoHabilitado.toString());
        System.out.println("Custo mensal = "+associadoHabilitado.custoMensal());


    }
}
