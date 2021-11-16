package aula05mesa;

//POO - Aula5 - MESA 4: Alexandre Bastos, Dafne Barbosa, Dayana Miranda, Felipe Arruda, Gabriela Schneider, Lelia Salles, Pedro Menezes e Wesley Bueno.
public class UsuarioJogo {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nick){
        this.nome = nome;
        this.nickname = nick;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void exibirJogador(){
        System.out.println("\nNome: "+this.nome+"\nNickname: "+this.nickname+"\nPontuacao: "+this.pontuacao+"\nNivel: "+this.nivel+"\n");
    }

    public void aumentarPontuacao(){
        this.pontuacao += 100;
        System.out.println("Sua pontuacao = "+this.pontuacao);
        if(this.pontuacao>=(this.nivel*500)) subirNivel();
    }

    public void subirNivel(){
        this.nivel ++;
        System.out.println("Seu nivel = "+this.nivel);
    }

    public void bonus(int valor){
        this.pontuacao += valor;
        System.out.println("Sua pontuacao = "+this.pontuacao);
        if(this.pontuacao>=(this.nivel*500)) subirNivel();
    }

    public String getNome() {
        return nome;
    }
    public String getNickname() {
        return nickname;
    }
    public int getNivel() {
        return nivel;
    }
    public int getPontuacao() {
        return pontuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
