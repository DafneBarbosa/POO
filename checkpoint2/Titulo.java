package checkpoint2;

//Criando a classe Titulos que implementa a interface Comparable, para podermos utilizar o metodo compareTo
public class Titulo implements Comparable<Titulo>{

    private String nome, editora, categoria;
    private int numero;

    public Titulo(String nome, String editora, String categoria, int numero) {
        this.nome = nome;
        this.editora = editora;
        this.categoria = categoria;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    //Sobrescrevendo o metodo compareTo, para comparar os titulos pelo seu numero
    @Override
    public int compareTo(Titulo o) {
        return Integer.compare(this.numero, o.numero);
    }
}
