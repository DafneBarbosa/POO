package checkpoint2;

//Criando classe Plano
public abstract class Plano {

    private int codigo, numeroTitulos;
    private double valor;
    private Titulo[] titulos = new Titulo[this.numeroTitulos];

    public Plano() {};

    //Metodo para cobrar o valor do plano
    public double cobrarValor(){
        return this.valor;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(int numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulos(Titulo[] titulos) {
        this.titulos = titulos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Metodo para exibir os titulos assinados do plano
    public void exibirTitulos(){
        for (Titulo titulo: titulos) {
            System.out.print(titulo.getNome()+"   ");
        }
    }
}
