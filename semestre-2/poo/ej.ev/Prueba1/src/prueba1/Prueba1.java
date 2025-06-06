/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author 15331285-0
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("---------------------------------");
            System.out.println("|        Menú Principal      |");
            System.out.println("---------------------------------");
            System.out.println("|   1.- Vectores		|");
            System.out.println("|   2.- Matrices		|");
            System.out.println("|   3.- Antecedentes	|");
            System.out.println("|   4.- Salir		|");
            System.out.println("---------------------------------");
            System.out.println("|          Opción: [   ]          |");
            System.out.println("---------------------------------");
            
            opcion = lector.nextInt();
            if(opcion == 1){
                //vectores
                
                //creación del vector A e ingreso de sus 10 valores en el rango
                int A[] = new int[10];
                for(int i=0;i<10;i++){
                    int valor = -1;
                    do {
                        System.out.println("Ingrese valor "+(i+1)+"° para el vector A");
                        valor = lector.nextInt();
                        if(valor < 1 || valor > 100){
                            System.out.println("Valor fuera de rango. Reintente");
                        }
                    } while (valor < 1 || valor > 100);
                    A[i] = valor;
                }
                //mostrar vector A
                System.out.print("     ");
                for(int i=0;i<10;i++){
                    System.out.print(i+" ");
                }
                System.out.println("");
                System.out.print("A = |");
                for(int i=0;i<10;i++){
                    System.out.print(A[i]+"|");
                }
                System.out.println("");
                
                //creación del vector B e ingreso de sus 10 valores en el rango
                int B[] = new int[10];
                for(int i=0;i<10;i++){
                    int valor = -1;
                    do {
                        System.out.println("Ingrese valor "+(i+1)+"° para el vector B");
                        valor = lector.nextInt();
                        if(valor < 101 || valor > 150){
                            System.out.println("Valor fuera de rango. Reintente");
                        }
                    } while (valor < 101 || valor > 150);
                    B[i] = valor;
                }
                //mostrar vector B
                System.out.print("     ");
                for(int i=0;i<10;i++){
                    System.out.print(i+" ");
                }
                System.out.println("");
                System.out.print("B = |");
                for(int i=0;i<10;i++){
                    System.out.print(B[i]+"|");
                }
                System.out.println("");
                
                
                int repetidos[] = new int[10];
                for(int i=0;i<10;i++){
                    int valorEnA = A[i];
                    int repetido = 0;
                    String posicionesRepetido = "";
                    for(int j=0;j<10;j++){
                        if(A[j] == valorEnA){
                            repetido++;
                            posicionesRepetido += j+" y ";
                        }
                    }
                    if(repetido > 1){
                        
                        posicionesRepetido = posicionesRepetido.substring(0, posicionesRepetido.length() - 3);
                        
                        int vecesEncontrado = 0;
                        for(int k=0;k<10;k++){
                            if(repetidos[k] == valorEnA){
                                vecesEncontrado++;
                            }
                        }
                        if(vecesEncontrado == 0){
                            repetidos[i] = valorEnA;
                            System.out.println("En el vector 'A' el número "+valorEnA+" fue ingresado "+repetido+" veces y se encuentra en la posición "+posicionesRepetido);
                        }
                    }
                }
                
                int repetidosB[] = new int[10];
                for(int i=0;i<10;i++){
                    int valorEnB = B[i];
                    int repetidoB = 0;
                    String posicionesRepetidoB = "";
                    for(int j=0;j<10;j++){
                        if(B[j] == valorEnB){
                            repetidoB++;
                            posicionesRepetidoB += j+" y ";
                        }
                    }
                    if(repetidoB > 1){
                        
                        posicionesRepetidoB = posicionesRepetidoB.substring(0, posicionesRepetidoB.length() - 3);
                        
                        int vecesEncontradoB = 0;
                        for(int k=0;k<10;k++){
                            if(repetidosB[k] == valorEnB){
                                vecesEncontradoB++;
                            }
                        }
                        if(vecesEncontradoB == 0){
                            repetidosB[i] = valorEnB;
                            System.out.println("En el vector 'B' el número "+valorEnB+" fue ingresado "+repetidoB+" veces y se encuentra en la posición "+posicionesRepetidoB);
                        }
                    }
                }
                
                //ordenar vector A
                for(int i=0;i<10;i++){
                    //buscamos el número mayor
                    int mayor = -1;
                    //posición mayor es la posición del número mayor
                    int posicionMayor = -1;
                    //ahora recorremos las columnas de esa fila buscando el mayor
                    for (int j = 0; j < A.length - i; j++) {
                        if (A[j] > mayor) {
                            mayor = A[j];
                            posicionMayor = j;
                        }
                    }
                    int temporal = A[A.length-i-1];
                    A[A.length-i-1] = mayor;
                    A[posicionMayor] = temporal;
                }
                
                //mostrar vector A
                System.out.print("     ");
                for(int i=0;i<10;i++){
                    System.out.print(i+" ");
                }
                System.out.println("");
                System.out.print("A = |");
                for(int i=0;i<10;i++){
                    System.out.print(A[i]+"|");
                }
                System.out.println("");
                
                //ordenar vector B
                for(int i=0;i<10;i++){
                    //buscamos el número mayor
                    int mayor = -1;
                    //posición mayor es la posición del número mayor
                    int posicionMayor = -1;
                    //ahora recorremos las columnas de esa fila buscando el mayor
                    for (int j = 0; j < B.length - i; j++) {
                        if (B[j] > mayor) {
                            mayor = B[j];
                            posicionMayor = j;
                        }
                    }
                    int temporal = B[B.length-i-1];
                    B[B.length-i-1] = mayor;
                    B[posicionMayor] = temporal;
                }
                //mostrar vector B
                System.out.print("     ");
                for(int i=0;i<10;i++){
                    System.out.print(i+" ");
                }
                System.out.println("");
                System.out.print("B = |");
                for(int i=0;i<10;i++){
                    System.out.print(B[i]+"|");
                }
                System.out.println("");
                
            }
            else if(opcion == 2){
                //matrices
                int AAA[][] = new int[5][5];
                int BBB[][] = new int[5][5];
                
                int contadorGeneral = 1;
                //ingreso de los valores a las matrices según rango
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        int valor = -1;
                        do {
                            System.out.println("Ingrese valor "+contadorGeneral+"° para la matriz A");
                            valor = lector.nextInt();
                            if(valor < 1 || valor > 100){
                                System.out.println("Valor fuera de rango. Reintente");
                            }
                        } while (valor < 1 || valor > 100);
                        AAA[i][j] = valor;
                        contadorGeneral++;
                    }
                }
                
                contadorGeneral = 1;
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        int valor = -1;
                        do {
                            System.out.println("Ingrese valor "+(contadorGeneral)+"° para la matriz B");
                            valor = lector.nextInt();
                            if(valor < 1 || valor > 100){
                                System.out.println("Valor fuera de rango. Reintente");
                            }
                        } while (valor < 1 || valor > 100);
                        BBB[i][j] = valor;
                        contadorGeneral++;
                    }
                }
                
                //mostrar la multiplicación y dejar los resultados en una matriz CCC
                int CCC[][] = new int[5][5];
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        CCC[i][j] = AAA[i][j]*BBB[i][j];
                        System.out.println(CCC[i][j]+"");
                    }
                }
                
                //sumar diagonales de ambas matrices
                int sumaDiagonalA = 0;
                int sumaDiagonalB = 0;
                int sumaDiagonalInversaA = 0;
                int sumaDiagonalInversaB = 0;
                
                //recorremos la matriz A
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        if(i == j){
                            sumaDiagonalA += AAA[i][j];
                        }
                        if(i == (4-j)){
                            sumaDiagonalInversaA += AAA[i][j];
                        }
                    }
                }
                
                //recorremos la matriz B
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        if(i == j){
                            sumaDiagonalB += BBB[i][j];
                        }
                        if(i == (4-j)){
                            sumaDiagonalInversaB += BBB[i][j];
                        }
                    }
                }
                
                //imprimimos las sumas
                System.out.println("La suma de la primera diagonal de AAA es: "+sumaDiagonalA+" y la segunda: "+sumaDiagonalInversaA);
                System.out.println("La suma de la primera diagonal de BBB es: "+sumaDiagonalB+" y la segunda: "+sumaDiagonalInversaB);
                
            }
            else if(opcion == 3){
                //antecedentes
                /*
                //opción ultra-flojo
                System.out.println("-------------------------------------------------------------------");
                System.out.println("|            Proyecto de POO Desarrollado por:           |");
                System.out.println("|              Marcelo Andrés Ríos Mayorga                  |");
                System.out.println("|                               Sección 701                                  |");
                System.out.println("|                              XX / XX / XXXX                               |");
                System.out.println("-------------------------------------------------------------------");
                
                //opción flojo
                System.out.println("-------------------------------------------------------------------");
                System.out.println("|            Proyecto de POO Desarrollado por:           |");
                System.out.println("|              Marcelo Andrés Ríos Mayorga                  |");
                System.out.println("|                               Sección 701                                  |");
                System.out.println("|                              11 / 09 / 2018                               |");
                System.out.println("-------------------------------------------------------------------");
                */
                
                //opción decente
                System.out.println("-------------------------------------------------------------------");
                System.out.println("|            Proyecto de POO Desarrollado por:           |");
                System.out.println("|              Cristhian Andrés Moya Bascur                  |");
                System.out.println("|                               Sección NINGUNA                                  |");
                System.out.println("|                              25 / 09 / 2018                               |");
                System.out.println("-------------------------------------------------------------------");
            }
            
            else if(opcion == 4){
                
            }          
            else{
                System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        
        
        
    }
    
}


























