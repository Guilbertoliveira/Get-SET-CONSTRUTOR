/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author PC
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Caneta c1 = new Caneta("BIC", 0.5f, true, "azul"); //com isso utilizamos o construtor no lugar do objeto padrao e conseguimos passar valores ja definidos nesse caso 4 campos
      
      c1.status();
      
     
      
    }
    
}
