
package calificacion;

import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double nota, media = 0, masBaja = 8;
        int cantidad = 1;
        while(cantidad <= 40){
            System.out.println("Analizando al alumno # "+cantidad);
            System.out.println("Ingrese Calificación:");
            nota = lector.nextDouble();
            if(masBaja > nota){
                masBaja = nota;
            }
            media = media + nota;
            cantidad++;
        }
        media = media /40;
        System.out.println("La nota más baja es: "+masBaja);
        System.out.println("La media de notas es: "+media);
    }
    
}
