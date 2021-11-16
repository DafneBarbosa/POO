package aula05;

public class Banco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(0001,"Dafne");
        System.out.println("Divida = "+cliente1.getDivida());
        cliente1.amentarDivida(100.34);
        cliente1.pagarDivida(50.12);
    }
}
