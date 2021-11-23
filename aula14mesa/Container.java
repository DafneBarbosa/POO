package aula14mesa;

public class Container implements Comparable<Container>{

    private int numero;
    private String descricao;
    private String paisOrigem;
    private boolean marcaPerigoso;

    public Container(int numero, String descricao, String paisOrigem, boolean marcaPerigoso) {
        this.numero = numero;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.marcaPerigoso = marcaPerigoso;
    }

    @Override
    public int compareTo(Container o) {
        if(o.numero == this.numero){
            return 0;
        } else if(this.numero < o.numero){
            return -1;
        } else {
            return 1;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public boolean isMarcaPerigoso() {
        return marcaPerigoso;
    }
}
