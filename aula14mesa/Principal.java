package aula14mesa;

public class Principal {
    public static void main(String[] args) {

        Container container1 = new Container(43,"peixes","EUA",false);
        Container container2 = new Container(2,"eletronicos","China",true);
        Container container3 = new Container(38,"??","Desconhecido",true);
        Container container4 = new Container(17,"medicamentos","Desconhecido",true);

        SistemaPorto porto = new SistemaPorto();

        porto.addContainer(container1);
        porto.addContainer(container2);
        porto.addContainer(container3);
        porto.addContainer(container4);

        porto.mostraContainers();

        System.out.println(porto.calculaPerigosos());

    }
}
