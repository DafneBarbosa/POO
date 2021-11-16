package aula10;

public class Associado {

    protected String numAssociado;
    protected String nome;
    protected double valorMensal;
    protected String atividade;

    public Associado(String numAssociado, String nome, double valorMensal, String atividade){
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public double custoMensal(){
        return this.valorMensal;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "numAssociado = " + numAssociado +
                ", nome = " + nome +
                ", valorMensal = " + valorMensal +
                ", atividade = " + atividade +
                '}';
    }
}
