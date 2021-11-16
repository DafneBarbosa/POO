package aula10mesa;

public class Principal {
    public static void main(String[] args) {

        Nave nave = new Nave(20,10,'N',30.2);
        System.out.println(nave);
        nave.irA(4,37,'S');
        System.out.println(nave.equals(nave));

        Nave naveInimiga = new Nave(25,6,'L',26.2);
        System.out.println(naveInimiga);
        System.out.println(nave.equals(naveInimiga));
        naveInimiga.girar('N');
        naveInimiga.restaVida(2);
        System.out.println(naveInimiga);

        Asteroide asteroide = new Asteroide(2,27,'O',20);
        System.out.println(asteroide);
        System.out.println(asteroide.hashCode());
    }
}
