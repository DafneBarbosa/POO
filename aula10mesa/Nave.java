package aula10mesa;

import java.util.Objects;

public class Nave extends Objeto {

    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade){
        super(x, y, direcao);
        this.velocidade = velocidade;
        this.vida = 10;
    }

    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "Posicao x = " + super.getPosX() +
                ", Posicao y = " + super.getPosY() +
                ", Direcao = " + super.getDirecao() +
                ", velocidade = " + velocidade +
                ", vida = " + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidade, velocidade) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, vida);
    }
}
