package checkpoint2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando nossa Empresa bazinga e passando os dados necessarios
        Empresa bazinga = new Empresa("Bazinga Comic Store", "657623547");

        //Instanciando Endereco e Cartao e passando os dados necessarios
        Endereco endereco1 = new Endereco("Rua XXX", "Porto Alegre", "RS", "ap 405", "43598-01");
        Cartao cartao1 = new Cartao("Dafne", "456.765.873-55", "7342834482", 3, 2024, 555);

        //Instanciando 4 Titulos e passando os dados necessarios
        Titulo titulo1 = new Titulo("Evangelion", "JBC", "manga", 3);
        Titulo titulo2 = new Titulo("Naruto", "JBC", "manga", 1);
        Titulo titulo3 = new Titulo("Love Rina", "JBC", "manga", 2);
        Titulo titulo4 = new Titulo("Inuyasha", "JBC", "manga", 4);

        //Instanciando dois Planos diferentes e passando os dados necessarios
        Plano plano2 = new PlanoSheldon(titulo1, titulo2, titulo3, titulo4);

        //Pedindo dados do assinante1:
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome1 = entrada.nextLine();

        Assinante assinante1;
        int numPlano = 4;
        while(numPlano!=1||numPlano!=2||numPlano!=3) {
            System.out.println("Planos disponiveis:\n  1 - Penny - 2 titulos por mes\n  2 - Leonard - 3 titulos por mes\n  3 - Sheldon - 4 titulos por mes\nEscolha seu plano: ");
            numPlano = entrada.nextInt();

            if (numPlano==1) {
                Plano plano1 = new PlanoPenny(titulo1, titulo3);
                cadastrarAssinante(nome1,plano1,cartao1,endereco1,bazinga);
                break;
            }else if (numPlano==2) {
                Plano plano1 = new PlanoLeonard(titulo2, titulo3, titulo4);
                cadastrarAssinante(nome1, plano1, cartao1, endereco1,bazinga);
                break;
            }else if (numPlano==3) {
                Plano plano1 = new PlanoSheldon(titulo1, titulo2, titulo3, titulo4);
                cadastrarAssinante(nome1,plano1,cartao1,endereco1,bazinga);
                break;
            } else{
                System.out.println("Por favor escolha um dos planos disponiveis (1, 2 ou 3)");
            }
        }

        //Instanciando Assinante 2
        Assinante assinante2 = new Assinante("Nayla", "nayla@hotmail.com", "358734", "783734268", plano2, cartao1, endereco1);

        //Vinculando assinante 2 a embresa
        bazinga.cadastrarAssinante(assinante2);

        //Vinculando titulos a empresa
        bazinga.cadastrarTitulo(titulo1);
        bazinga.cadastrarTitulo(titulo2);
        bazinga.cadastrarTitulo(titulo3);
        bazinga.cadastrarTitulo(titulo4);

        //Listando assinantes e titulos
        bazinga.listarAssinantes();
        bazinga.listarTitulos();

        //Chamando o metodo pagarAssinatura() dos assinantes
        assinante2.pagarAssinatura();

        //Cancelando a assinatura do assinante1 e tendo pagar novamente sua assinatura
        assinante2.cancelarAssinatura();
        assinante2.pagarAssinatura();

    }

    //Funcao para instanciar, cadastrar e vincular assinantes
    public static void cadastrarAssinante(String nome1, Plano plano1, Cartao cartao1, Endereco endereco1, Empresa empresa){
        Assinante assinante1 = new Assinante(nome1, "xxxxxx@hotmail.com", "1234", "634827464", plano1, cartao1, endereco1);
        empresa.cadastrarAssinante(assinante1);
        assinante1.pagarAssinatura();
    }
}
