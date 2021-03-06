package aula03;

import java.util.Scanner;

public class MesaTrabalho2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome jogador 1: ");
        String nome1 = entrada.nextLine();
        System.out.println("Nome jogador 2: ");
        String nome2 = entrada.nextLine();

        int pontos1 = 0;
        int pontos2 = 0;
        int opcao1 = 1;
        int opcao2 = 1;

        while(opcao1!=4 && opcao2 !=4) {
            System.out.println("Opcao jogador 1 (1 = pedra, 2 = papel, 3 = tesoura ou 4-parar jogo: ");
            opcao1 = entrada.nextInt();
            System.out.println("Opcao jogador 2 (1 = pedra, 2 = papel, 3 = tesoura ou 4-parar jogo: ");
            opcao2 = entrada.nextInt();

            if (whichWin(opcao1, opcao2) == 1) pontos1++;
            if (whichWin(opcao1, opcao2) == 2) pontos2++;

            System.out.println("Pontos1 = " + pontos1 + "\nPontos2 = " + pontos2);
        }

        if(opcao1>=4||opcao2>=4){
            if(pontos1>pontos2) System.out.println("O jogo terminou! O(A) jogador(a) "+nome1+" venceu com "+pontos1+" pontos.");
            if(pontos2>pontos1) System.out.println("O jogo terminou! O(A) jogador(a) "+nome2+" venceu com "+pontos2+" pontos.");
            if(pontos1==pontos2) System.out.println("O jogo terminou em EMPATE!");
        }
    }

    public static int whichWin(int op1,int op2){
        if(op1 == 1){
            if(op2 == 2) return 2;
            if(op2 == 3) return 1;
        }
        if(op1 == 2){
            if(op2 == 1) return 1;
            if(op2 == 3) return 2;
        }
        if(op1 == 3){
            if(op2 == 1) return 2;
            if(op2 == 2) return 1;
        }
        return 0;
    }
}
