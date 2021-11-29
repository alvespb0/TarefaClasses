package Tarefa;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Micro
 */
public class Fogao {

    public int getNumBocas() {
        return numBocas;
    }

    public String getFornoAcoplado() {
        return fornoAcoplado;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanhoVertical() {
        return tamanhoVertical;
    }

    public double getTamanhoHorizontal() {
        return tamanhoHorizontal;
    }

    public void setNumBocas(int numBocas) {
        this.numBocas = numBocas;
    }

    public void setFornoAcoplado(String fornoAcoplado) {
        this.fornoAcoplado = fornoAcoplado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanhoVertical(double tamanhoVertical) {
        this.tamanhoVertical = tamanhoVertical;
    }

    public void setTamanhoHorizontal(double tamanhoHorizontal) {
        this.tamanhoHorizontal = tamanhoHorizontal;
    }
    int numBocas;
    String fornoAcoplado;
    String cor;
    double tamanhoVertical;
    double tamanhoHorizontal;
    void imprimedadosFogao(){
        System.out.println("----Fogao----");
        System.out.println("numero de bocas: "+numBocas);
        System.out.println("Forno acoplado? "+fornoAcoplado);
        System.out.println("cor: "+cor);
        System.out.println("Tamanho vertical: "+tamanhoVertical+"cm");
        System.out.println("Tamanho horizontal: "+tamanhoHorizontal+"cm");
        
    }
}
