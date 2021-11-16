package aula10;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numAssociado, String nome, String atividade, double valorMensal, double custoPiscina){
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
    }

    @Override
    public double custoMensal() {
        if(this.habilitado){
            return super.custoMensal() + this.custoPiscina;
        } else {
            return super.custoMensal();
        }
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "AssociadoHabilitado{" +
                "numAssociado = " + numAssociado +
                ", nome = " + nome +
                ", valorMensal = " + valorMensal +
                ", atividade = " + atividade +
                ", custoPiscina = " + custoPiscina +
                ", habilitado = " + habilitado +
                '}';
    }
}
