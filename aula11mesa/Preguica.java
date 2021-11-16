package aula11mesa;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
        this.especie = "preguica";
    }

    @Override
    public String emiteSom() {
        return "zzzzzzzzzzz";
    }

    @Override
    public String talento() {
        return "sobe em arvores";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
