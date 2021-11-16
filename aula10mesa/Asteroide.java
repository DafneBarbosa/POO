package aula10mesa;

import java.util.Objects;

public class Asteroide extends Objeto{

    private int danos;

    public Asteroide(int x, int y, char direcao, int danos){
        super(x,y,direcao);
        this.danos = danos;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "Posicao x = " + super.getPosX() +
                ", Posicao y = " + super.getPosY() +
                ", Direcao = " + super.getDirecao() +
                ", danos = " + this.danos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return danos == asteroide.danos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(danos);
    }
}
