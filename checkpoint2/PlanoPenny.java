package checkpoint2;

//Criando classe Penny que herda da classe Plano
public class PlanoPenny extends Plano{

    //No construtor da classe devem ser informados os titulos assinados no plano
    public PlanoPenny(Titulo titulo1, Titulo titulo2) {
        this.setValor(50);
        this.setNumeroTitulos(2);
        Titulo[] titulos = {titulo1, titulo2};
        this.setTitulos(titulos);
        this.setCodigo(1);
    }

}
