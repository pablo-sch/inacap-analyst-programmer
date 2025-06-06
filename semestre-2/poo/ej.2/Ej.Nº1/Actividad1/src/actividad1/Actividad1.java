/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 9 números (entre 1 y el 100)");
        
        //la primera posición indica el ancho de la matriz, la otra el alto.
        int numeros[][] = new int[3][3];
        
        int i = 0;
        int j = 0;
        int contadorGeneral = 1;
        while (i < 3) {
            while (j < 3) {
                int numero = 0;
                do {
                    System.out.println("Ingresa el número " + contadorGeneral);
                    numero = lector.nextInt();
                } while (numero < 1 || numero > 100);
                numeros[i][j] = numero;
                contadorGeneral++;
                j++;
            }
            i++;
            j=0;
        }
        
        
        System.out.println("Ingrese el valor máximo a mostrar: ");
        int maximo = lector.nextInt();
        
        System.out.print("|");
        for(int l=0;l<3;l++){
            for(int k=0;k<3;k++){
                if(numeros[l][k] < maximo){
                    System.out.print(numeros[l][k]+"|");
                }
            }
        }
        System.out.println("");
    }
    
}
















