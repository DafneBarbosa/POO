package aula11mesa;

public class Principal {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo("Tango", 12);
        System.out.println(cavalo.toString());

        Cachorro cachorro = new Cachorro("Bombom", 18);
        System.out.println(cachorro.toString());

        Preguica preguica = new Preguica("Soneca", 5);
        System.out.println(preguica.toString());

    }
}
