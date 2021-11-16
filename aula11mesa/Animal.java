package aula11mesa;

public abstract class Animal {
    private String nome;
    private int idade;
    protected String especie;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emiteSom();

    public abstract String talento();

    @Override
    public String toString() {
        return "Animal{" +
                "especie: " + especie +
                ", nome: " + nome +
                ", idade: " + idade +
                ", som: " + emiteSom() +
                ", talento: " + talento() +
                '}';
    }

}
