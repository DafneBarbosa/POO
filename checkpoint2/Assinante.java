package checkpoint2;

//Criando a classe Assinante
public class Assinante {

    private String nome, email, senha, cpf;
    private boolean assinatura;
    private Plano plano;
    private Cartao cartao;
    private Endereco endereco;

    //Quando crio um assinante ele automaticamente ja inicializa o atributo assinatura como true
    public Assinante(String nome, String email, String senha, String cpf, Plano plano, Cartao cartao, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.plano = plano;
        this.cartao = cartao;
        this.endereco = endereco;
        this.assinatura = true;
    }

    //Metodo para pagar Assinatura - se a assinatura estiver valida, pede para o Plano qual o valor a ser cobrado. E pede para o Cartao o numero do cartao a ser utilizado no pagamento.
    public void pagarAssinatura(){
        if(this.assinatura==true) {
            System.out.println("\n"+this.nome+", voce pagou: R$" + this.plano.cobrarValor() + "  -  Com seu cartao: " + this.cartao.getNumero());
        } else {
            System.out.println("\n"+this.nome+", sua assinatura esta inativa! Nao foi possivel fazer pagamento");
        }
    }

    //Metodo para cancelar a assinatura
    public void cancelarAssinatura(){
        System.out.println("\n"+this.nome+", voce cancelou sua assinatura com sucesso");
        this.assinatura = false;
    }

    public String getNome() {
        return nome;
    }

    public Plano getPlano() {
        return plano;
    }
}
