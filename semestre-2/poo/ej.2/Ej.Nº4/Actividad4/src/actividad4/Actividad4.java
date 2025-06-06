/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese filas de la matriz:");
        int n = lector.nextInt();
        System.out.println("Ingrese columnas de la matriz:");
        int m = lector.nextInt();

        int matriz[][] = new int[n][m];
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < m) {
                int valor = 0;
                do {
                    System.out.println("Ingrese valor a la matriz:");
                    valor = lector.nextInt();
                } while (valor < 0);
                matriz[i][j] = valor;
                j++;
            }
            i++;
        }
        //en este punto ya está llena la matriz

        //y ahora falta ordenar por filas
        i = 0;
        while (i < n) {
            //para cada fila ordenamos en ella

            //contador cuenta cuántos números ya hemos ordenado
            int contador = 1;
            while ((m - contador) >= 1) {
                //buscamos el número mayor
                int mayor = -1;
                //posición mayor es la posición del número mayor
                int posicionMayor = -1;
                //ahora recorremos las columnas de esa fila buscando el mayor
                for (int j = 0; j <= m - contador; j++) {
                    if (matriz[i][j] > mayor) {
                        mayor = matriz[i][j];
                        posicionMayor = j;
                    }
                }
                int temporal = matriz[i][m - contador];
                matriz[i][m - contador] = mayor;
                matriz[i][posicionMayor] = temporal;
                contador++;
            }
            
            i++;
        }

        //ahora que las filas están ordenadas, mostramos
        for(int l=0;l<n;l++){
            System.out.print("|");
            for(int k=0;k<m;k++){
                System.out.print(matriz[l][k]+"|");
            }
            System.out.println("");
        }
    }

}
