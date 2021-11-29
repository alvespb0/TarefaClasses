/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa;

/**
 *
 * @author Micro
 */
public class Principal {
    public static void main(String[] args) {
        Fogao Fogao = new Fogao();
        Fogao.setCor("Preto");
        Fogao.setFornoAcoplado("Nao");
        Fogao.setNumBocas(5);
        Fogao.setTamanhoHorizontal(80);
        Fogao.setTamanhoVertical(60);
        Fogao.imprimedadosFogao();
        PC PC = new PC();
        PC.setCorGabinete("Preto");
        PC.setModeloPlacaVid("GTX 1050 TI");
        PC.setModeloProcessador("I5 9 GEN");
        PC.setQntRam(8);
        PC.setVoltsBateria(550);
        PC.imprimedadosComputador();
    }
    
}
