/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

/**
 *
 * @author ferna
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 10;
        int y = 6;
        
        int suma = x + y;
        int resta = x - y;
        int multi = x * y;
        float divi = (float) x / y;
        float modulo = (float) x % y;
        
        System.out.println("X: {" + x + "}");
        System.out.println("Y: {" + y + "}");
        System.out.println("Suma: {" + suma + "}");
        System.out.println("Resta: {" + resta + "}");
        System.out.println("Multiplicación: {" + multi + "}");
        System.out.println("División: {" + divi + "}");
        System.out.println("Módulo: {" + modulo + "}");
    }
    
}
