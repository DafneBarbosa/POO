package aula10mesa;

public class Objeto {

    private int posX;
    private int posY;
    private char direcao;

    public Objeto(int posX, int posY, char direcao){
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        this.posX = x;
        this.posY = y;
        this.direcao = direcao;
        System.out.println("Posicao: X = "+x+"; Y = "+y+"; direcao = "+direcao);
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public char getDirecao() {
        return direcao;
    }
}
