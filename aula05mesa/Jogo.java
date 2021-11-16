package aula05mesa;

public class Jogo {
    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Dafne","Daf");
        jogador1.exibirJogador();

        jogador1.aumentarPontuacao();
        jogador1.bonus(430);
        jogador1.subirNivel();

        jogador1.exibirJogador();
    }
}
