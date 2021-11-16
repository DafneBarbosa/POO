package aula11;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{


    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
    }

    @Override
    public String imprimir() {
        if(temPapel() && !precisaTinta()){
            setFolhasDisponiveis(getFolhasDisponiveis()-1);
            setPorcTinta(getPorcTinta()-0.01);
            return "Imprimindo";
        } else if(temPapel() && precisaTinta()){
            return "Verifique tinta";
        } else if(!temPapel() && !precisaTinta()){
            return "Verifique papel";
        } else {
            return "Verifique tinta e papel";
        }
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
