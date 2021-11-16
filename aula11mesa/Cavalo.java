package aula11mesa;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
        this.especie = "cavalo";
    }

    @Override
    public String emiteSom() {
        return "reliiiiiiiincha";
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
