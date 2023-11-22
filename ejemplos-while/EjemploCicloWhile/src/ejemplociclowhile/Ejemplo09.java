/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 12;
        int contador = 1;
        int operacion;
        int tabla;
        
        System.out.println("Ingrese el número de tabla a generar"); 
        tabla = entrada.nextInt(); // 3
        
        String cadena = ""; // cadena acumulador
        System.out.printf("%sTabla de multiplicar\n", cadena);
        
        while (contador <= limite_tabla){ // 1<=12 v
            operacion = tabla * contador; // operacion = 3*1 = 3
            
            System.out.printf("%s%d*%d = %d\n", // ""3*1=3\n === > 3*1=3
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
        
    }
}
