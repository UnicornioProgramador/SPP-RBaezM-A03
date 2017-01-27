/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP.RBAEZM.a03;
import java.util.*;
/**
 *
 * @author victo
 */
public class PPRBAEZMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Programa para calcular hipotenusa
        double CO, CA, HP;
        CO = solicitarCO();
        CA = solicitarCA();
        HP = calcularHP(CO, CA);
        respuesta(HP);
    }
    
    public static double solicitarCO(){
        double CO;
        System.out.println("Ingrese el valor del CO");
        Scanner entradaCO = new Scanner(System.in);
        CO = entradaCO.nextDouble();
        return CO;
    }
    
    public static double solicitarCA(){
        double CA;
        System.out.println("Ingrese el valor del cateto #02");
        Scanner entradaCA = new Scanner(System.in);
        CA = entradaCA.nextDouble();
        return CA;
    }
    public static double calcularHP(double CO, double CA){
        double HP, cuadrados;
        cuadrados = (Math.pow(CO, 2) + Math.pow(CA, 2));
        HP = Math.sqrt(cuadrados);
        return HP;
    }
    
    public static void respuesta(double HP){
        System.out.println("HP = " + HP);
    }
}