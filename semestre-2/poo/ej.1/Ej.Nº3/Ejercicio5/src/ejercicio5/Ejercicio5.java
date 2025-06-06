/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String respuesta,sexo;
        double cantidad, porcHombres = 0, promEdad, edad, porcentaje;
        promEdad = 0;
        cantidad = 0;
        do{
            System.out.println("¿Existen personas para analizar? [S/N]");
            respuesta = lector.next();
        }while(!respuesta.equals("S") && !respuesta.equals("N"));
        
        while(respuesta.equals("S")){
            cantidad = cantidad + 1;
            System.out.println("Ingrese su edad:");
            edad = lector.nextDouble();
            promEdad = promEdad +edad;
            do{
                System.out.println("Ingresar sexo [M/F]");
                sexo = lector.next();
            }while(!sexo.equals("M") && !sexo.equals("F"));
            if(sexo.equals("M")){
                porcHombres = porcHombres + 1;
            }
            do{
                System.out.println("¿Existen personas para analizar? [S/N]");
                respuesta = lector.next();
            }while(!respuesta.equals("S") && !respuesta.equals("N"));
        }
        porcentaje = (porcHombres * 100)/cantidad;
        System.out.println("Total de personas evaluadas: "+cantidad);
        System.out.println("Edad promedio: " + (promEdad/cantidad) );
        System.out.println("Promedio de Hombres: "+ porcentaje+"%");
        System.out.println("Promedio de Mujeres: " + (100 - porcentaje) +"%");

        
    }
    
}
