/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilizar;

import java.util.Scanner;


/**
 *
 * @author crmoya
 */
public class Contabilizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //el Scanner es un objeto que sirve para leer
        //en este caso números desde el teclado System.in
        Scanner lector = new Scanner(System.in);
        
        int numero = 0;
        int cantpositivos = 0;
        int cantnegativos = 0;
        int cantneutros = 0;
        int i = 1;
        while(i <= 20){
            System.out.println("Ingrese un número: ");
            numero = lector.nextInt();
            if(numero == 0){
                cantneutros = cantneutros + 1;
            }
            else{
                if(numero > 0){
                    cantpositivos++;
                }
                else{
                    cantnegativos++;
                }
            }
            i++;
        }
        System.out.println("Ingresaste "+cantneutros+" neutros.");
        System.out.println("Ingresaste "+cantnegativos+" negativos.");
        System.out.println("Ingresaste "+cantpositivos+" positivos.");
    }
    
}
