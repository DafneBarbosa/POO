package aula03;

import java.util.Scanner;

public class MesaTrabalho {

    public static void main(String[] args) {

        /* Implemente um programa que nos permita exibir os primeiros "n" números primos
pelo console, onde "n" é um valor numérico inserido pelo usuário. Por exemplo:
Com n = 7, o que o programa deve retornar é ""Os primeiros 7 números primos são:
2, 3, 5, 7, 11, 13, 17".*/

        System.out.println("Digite a quantidade de numeros primos desejada: ");
        Scanner entrada = new Scanner(System.in);
        int quantidade = entrada.nextInt();

        int contador = 0;
        int numero = 2;

        while(contador < quantidade) {
            int controle = 0;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) controle++;
            }

            if (controle == 0){
                System.out.println(numero);
                contador++;
            }

            numero++;
        }





        /* int[] primos = new int[quantidade];
        primos[0] = 2;

        int numero = 3;
        for(int i=1;i<primos.length;i++){
            int controle = 0;
            for(int j=2;j<numero;j++){
                if(numero%j==0) {
                    controle++;
                };
            }
            if(controle==0) primos[i] = numero;
            numero ++;
        }

        for(int i=0;i<primos.length;i++){
            System.out.println(primos[i]);
        } */






    }
}
