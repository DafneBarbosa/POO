package aula02;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        int controle = 0;

        for(int i=2;i<numero;i++){
            if(numero%i==0) controle++;
        }
        if(controle==0) System.out.println("Eh primo");
        else System.out.println("Nao eh primo");


        Scanner entrada2 = new Scanner(System.in);
        int numero1 = entrada2.nextInt();
        int numero2 = entrada2.nextInt();
        int numero3 = entrada2.nextInt();

        int maior = ehMaior(numero1,numero2,numero3);
        System.out.println("O maior numero eh: "+maior);

    }

    static int ehMaior(int n1, int n2, int n3){
        if(n1>n2 && n1>n3) return n1;
        else if(n2>n3 && n2>n1) return n2;
        else return n3;
    }
}
