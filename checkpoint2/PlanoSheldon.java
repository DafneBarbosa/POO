package checkpoint2;

//Criando classe Sheldon que herda da classe Plano
public class PlanoSheldon extends Plano{

    //No construtor da classe devem ser informados os titulos assinados no plano
    public PlanoSheldon(Titulo titulo1, Titulo titulo2, Titulo titulo3, Titulo titulo4) {
        this.setValor(90);
        this.setNumeroTitulos(4);
        Titulo[] titulos = {titulo1, titulo2, titulo3, titulo4};
        this.setTitulos(titulos);
        this.setCodigo(3);
    }
}
