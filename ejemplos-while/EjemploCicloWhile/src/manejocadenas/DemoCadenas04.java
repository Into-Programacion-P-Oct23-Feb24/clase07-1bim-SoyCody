/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas04 {
    public static void main(String[] args) {
        String pais = "Ecuador";
        String ciudad = "Loja";
        String fechaIndependencia = "18 de noviembre";
        String cadenaAcumuladora;
        
        cadenaAcumuladora = String.format("%s\n%s\n%s\n",
                
                pais,
                ciudad,
                fechaIndependencia);
        
        
        
        
        /*
        cadenaAcumuladora = String.format("%s%s\n%s\n%s\n",
                cadenaAcumuladora,
                pais,
                ciudad,
                fechaIndependencia);
        */
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
