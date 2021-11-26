package checkpoint2;

import java.util.ArrayList;
import java.util.Collections;

//Criando a classe empresa
public class Empresa {

    private String nome, cnpj;
    //criando Array Lists para armazenar os titulos e os assinantes
    private ArrayList<Titulo> listaTitulos = new ArrayList<>();
    private ArrayList<Assinante> listaAssinantes = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //Metodos para cadastrar assinantes e titulos
    public void cadastrarAssinante(Assinante assinante){
        listaAssinantes.add(assinante);
    }
    public void cadastrarTitulo(Titulo titulo){
        listaTitulos.add(titulo);
    }

    //Metodo para listar todos os assinantes, o numero de titulos assinados e os nomes dos titulos assinados
    public void listarAssinantes(){
        System.out.println("\nLista de assinantes:");
        for (Assinante assinante: listaAssinantes) {
            System.out.print("Nome: "+assinante.getNome()+"  -  Numero Titulos: "+assinante.getPlano().getNumeroTitulos()+"  -  Titulos: ");
            assinante.getPlano().exibirTitulos();
            System.out.println();
        }
    }

    //Metodo para listar todos os titulos cadastrados, por ordem de numero
    public void listarTitulos() {
        Collections.sort(listaTitulos);
        System.out.println("\nLista de titulos disponiveis:");
        for (Titulo titulo : listaTitulos){
            System.out.println("Numero: " + titulo.getNumero() + "  /  Nome: " + titulo.getNome());
        }
    }


}
