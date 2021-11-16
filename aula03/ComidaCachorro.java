package aula03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ComidaCachorro {

    public static void main(String[] args) {

    /* Precisamos fazer um programa que nos ajude a simular a situação: primeiro
perguntará o nome e a quantidade de comida que o cachorro come e por meio de
uma função chamada quantosPacotes, retorne o nome e quantos pacotes ele
usará por dia. Dada a quantidade necessária, a função quantosPacotes pedirá um
a um os pesos de cada pacote, até atingir aquela quantidade dada como parâmetro
da função.
Exemplo: Rintintin come 4 kg diários. Pacotes: 1.2 0.7 1.1 1.3
Resultado: Rintintin precisa de 4 pacotes. */

    System.out.println("Digite o nome do seu cachorro: ");
    Scanner entrada = new Scanner(System.in);
    String nome = entrada.nextLine();

    System.out.println("Digite a quantidade de comida que ele come em kg: ");
    float quantidade = entrada.nextFloat();

    System.out.println("\n --- Nome cachorro: "+nome+"\nQuantidade comida: "+quantidade+" kg\n");

    quantosPacotes(quantidade);

    }

    public static void quantosPacotes(float qtd){
        ArrayList<Float> pacotes = new ArrayList();
        int i = 1;
        Scanner entrada2 = new Scanner(System.in);
        float pacote = 0;
        float soma = 0;
        while(soma<qtd){
            System.out.println("Digite a quantidade do pacote "+i+": ");
            pacote = entrada2.nextFloat();
            pacotes.add(pacote);
            soma += pacote;
        }
        System.out.println("\n --- Pacotes: "+pacotes
                +"\nNumero pacotes: "+pacotes.size()
                +"\nTotal pacotes: "+soma+" kg");
    }
}
