package aula15mesa;

public class Main {

    public static void main(String[] args) {

        Navetur sistemaNavetur = new Navetur();

        Capitao capitao = new Capitao("Jack Sparrow", "Silva", "200202000200");

        Iate iate1 = new Iate(200000.50, 500.50, 2021, 50.50, capitao, 6);
        Iate iate2 = new Iate(1000, 10, 1830, 15, capitao, 2);
        Iate iate3 = new Iate(100000.47, 232.13, 2022, 40, capitao, 4);
        Veleiro veleiro1 = new Veleiro(25000, 150, 2022, 10, capitao, 6);
        Veleiro veleiro2 = new Veleiro(4000, 10, 2015, 8, capitao, 2);

        System.out.println("O veleiro1 é grande: " + veleiro1.eGrande());
        System.out.println("O veleiro2 é grande: " + veleiro2.eGrande());

        System.out.println();

        sistemaNavetur.addIate(iate1);
        sistemaNavetur.addIate(iate2);
        sistemaNavetur.addIate(iate3);
        sistemaNavetur.addVeleiro(veleiro1);
        sistemaNavetur.addVeleiro(veleiro2);

        sistemaNavetur.ordenarIates();

        System.out.println("\nAlguel embarcacoes:");
        System.out.println("  Aluguel veleiro1: "+sistemaNavetur.calcularAluguel(veleiro1));
        System.out.println("  Aluguel veleiro2: "+sistemaNavetur.calcularAluguel(veleiro2));
        System.out.println("  Aluguel iate1: "+sistemaNavetur.calcularAluguel(iate1));
        System.out.println("  Aluguel iate2: "+sistemaNavetur.calcularAluguel(iate2));
        System.out.println("  Aluguel iate3: "+sistemaNavetur.calcularAluguel(iate3));

    }

}
