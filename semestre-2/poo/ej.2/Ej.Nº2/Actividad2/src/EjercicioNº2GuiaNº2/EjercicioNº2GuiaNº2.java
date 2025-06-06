
package EjercicioNº2GuiaNº2;

import java.util.Scanner;

public class EjercicioNº2GuiaNº2 {

    public static void main(String[] args) {

        
        Scanner lector = new Scanner(System.in);
        int guardar=0;
        System.out.println("¿Qué cantidad de números quiere ingresar?");
        guardar = lector.nextInt();
        int numeros[] = new int[guardar];
        System.out.println("Ingrese "+guardar+ " números entre 1 y 100.");
        int i = 0;
        while (i < guardar) {
            int numero = 0;
            do {
                System.out.println("Ingresa el número " + (i + 1));
                numero = lector.nextInt();
            } while (numero < 1 || numero > 100);
            numeros[i] = numero;
            i++;
        }
        //ya está lleno el vector con los números que ingresó el usuario
        int verificar = 0;
        do {
            System.out.println("¿Qué número deseas verificar?(-1 SALE)");
            verificar = lector.nextInt();
            //verificamos las repeticiones
            int repeticiones = 0;
            for (int j = 0; j < numeros.length; j++) {
                int numEnArreglo = numeros[j];
                if (numEnArreglo == verificar) {
                    repeticiones++;
                }
            }
            //mostrar las repeticiones
            System.out.println("El número " + verificar + " está " + repeticiones + " veces ingresado.");
        } while (verificar != -1);

    }

}
