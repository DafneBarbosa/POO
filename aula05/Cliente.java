package aula05;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numero, String nome){
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }

    public void amentarDivida(double valor){
        this.divida += valor;
        System.out.println("Divida = "+this.divida);
    }

    public void pagarDivida(double valor){
        if(this.divida==0){
            System.out.println("Voce nao tem dividas");
        } else {
            this.divida -= valor;
            System.out.println("Divida = " + Math.round(this.divida*100.0)/100.0);
        }
    }

    public String getNome() {
        return nome;
    }
    public double getDivida() {
        return divida;
    }
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
