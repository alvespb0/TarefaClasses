package Tarefa;

public class PC {

    public String getCorGabinete() {
        return corGabinete;
    }

    public void setCorGabinete(String corGabinete) {
        this.corGabinete = corGabinete;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public String getModeloPlacaVid() {
        return modeloPlacaVid;
    }

    public void setModeloPlacaVid(String modeloPlacaVid) {
        this.modeloPlacaVid = modeloPlacaVid;
    }

    public int getQntRam() {
        return qntRam;
    }

    public void setQntRam(int qntRam) {
        this.qntRam = qntRam;
    }

    public int getVoltsBateria() {
        return voltsBateria;
    }

    public void setVoltsBateria(int voltsBateria) {
        this.voltsBateria = voltsBateria;
    }

    String corGabinete;
    String modeloProcessador;
    String modeloPlacaVid;
    int qntRam;
    int voltsBateria;

    void imprimedadosComputador() {
        System.out.println("----Computador----");
        System.out.println("cor do gabinete: " + corGabinete);
        System.out.println("modelo do processador: " + modeloProcessador);
        System.out.println("modelo da placa de video: " + modeloPlacaVid);
        System.out.println("quantidade de memoria ram: " + qntRam+"Ram");
        System.out.println("Fonte de Alimentação: " + voltsBateria+"Watts");
    }

}
