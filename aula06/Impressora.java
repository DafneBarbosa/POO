package aula06;

import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String conexao, LocalDate data){
        this.modelo = modelo;
        this.tipoConexao = conexao;
        this.dataFabricacao = data;
        this.folhasDisponiveis = 0;
    }

    public void mostraImpressora(){
        System.out.println("\nModelo: "+this.modelo
            +"\nConexao: "+this.tipoConexao
            +"\nData Fabricacao: "+this.dataFabricacao+"\n");
    }

    public void addPapel(int folhas){
        this.folhasDisponiveis += folhas;
    }

    private boolean temPapel(){
        return folhasDisponiveis >= 1;
    }

    public void imprimir(String texto){
        System.out.println(temPapel() ? "Imprimido: "+texto : "Sem papel");
        this.folhasDisponiveis --;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public int getFolhasDisponiveis(){
        return this.folhasDisponiveis;
    }
}
