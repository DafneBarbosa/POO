package aula11mesa;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
        this.especie = "cachorro";
    }

    @Override
    public String emiteSom() {
        return "late";
    }

    @Override
    public String talento() {
        return "corre";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
