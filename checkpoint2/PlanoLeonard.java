package checkpoint2;

//Criando classe Leonard que herda da classe Plano
public class PlanoLeonard extends Plano{

    //No construtor da classe devem ser informados os titulos assinados no plano
    public PlanoLeonard(Titulo titulo1, Titulo titulo2, Titulo titulo3) {
        this.setValor(70);
        this.setNumeroTitulos(3);
        Titulo[] titulos = {titulo1, titulo2, titulo3};
        this.setTitulos(titulos);
        this.setCodigo(2);
    }
}
