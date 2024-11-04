package ProjetoTrempoCerto;

public class Linha {
    private String nomeDaLinha;
    private String statusDaLinha;
    private String[] estacoesDaLinha;

    public Linha(){
        this.statusDaLinha = "Operação Normal";
    }
    public Linha(String nomeDaLinha, String statusDaLinha, String[] estacoesDaLinha){
        this.nomeDaLinha = nomeDaLinha;
        this.statusDaLinha = statusDaLinha;
        this.estacoesDaLinha = estacoesDaLinha;
    }

    public String getNomeDaLinha() {
        return nomeDaLinha;
    }

    public void setNomeDaLinha(String nomeDaLinha) {
        this.nomeDaLinha = nomeDaLinha;
    }

    public String getStatusDaLinha() {
        return statusDaLinha;
    }

    public void setStatusDaLinha(String statusDaLinha) {
        this.statusDaLinha = statusDaLinha;
    }

    public String[] getEstacoesDaLinha() {
        return estacoesDaLinha;
    }

    public void setEstacoesDaLinha(String[] estacoesDaLinha) {
        this.estacoesDaLinha = estacoesDaLinha;
    }


}
