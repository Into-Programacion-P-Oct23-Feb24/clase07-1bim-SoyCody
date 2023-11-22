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
public class Ejemplo12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String apellido;
        int edad;
        String cadena_final;
        int limite = 3;
        int contador = 1;
        
        cadena_final = String.format("%s\n", "Datos ingresados");
        
        while (contador <= limite){
            System.out.println("Ingrese el nombre del usuario");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese el apellido del usuario");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese la edad del usuario");
            edad = entrada.nextInt();
            
            cadena_final = String.format("%s%s - %s - %d\n", 
                    cadena_final, 
                    nombre,
                    apellido,
                    edad);
            
            entrada.nextLine(); // limpio el buffer; 
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena_final);
        
    }
}
