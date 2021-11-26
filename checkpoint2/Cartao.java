package checkpoint2;

//Criando a classe Cartao, para fazer pagamentos
public class Cartao {

    private String titular, cpf, numero;
    private int mesValidade, anoValidade, cvv;

    public Cartao(String titular, String cpf, String numero, int mesValidade, int anoValidade, int cvv) {
        this.titular = titular;
        this.cpf = cpf;
        this.numero = numero;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
        this.cvv = cvv;
    }

    public String getNumero() {
        return numero;
    }
}
