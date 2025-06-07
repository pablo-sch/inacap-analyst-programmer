using System;

namespace _01_TiposDatos
{
    class Program
    {
        static void Main(string[] args)
        {
            // TIPOS DE DATOS
            int x = 10;
            double d = 2.5;
            bool sw = true;
            string texto = "alsdkaslk";
            
            // USO DE ENTRADA, LECTURA Y SALIDA DE DATOS
            // Semejante a System.out.println("Hola Mundo") que utilizábamos en Java
            Console.WriteLine("Ingrese su nombre: ");
            // Semejante al objeto de la clase Scanner, con el método sc.nextLine()
            string nombre = Console.ReadLine();
            Console.WriteLine("Ingrese su apellido: ");
            string apellido = Console.ReadLine();
            Console.WriteLine("Cuál es su edad??");
            // Para transformar un tipo de dato a otro, en este caso usaremos... Int32.Parse()
            // Esto sería el equivalente a Integer.parseInt() de Java..
            int edad = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa tu peso: ");
            // Transformación de datos de un string a un tipo double
            double peso = Double.Parse(Console.ReadLine());

            //Console.WriteLine("Hola " + nombre + " " + apellido + ". Tu edad es " + edad);
            // Estas 2 líneas son iguales, sin embargo es mucho más cómodo usar la segunda opción
            Console.WriteLine("Hola {0} {1}. Tu edad es {2} y pesas {3}; o sea, estás muy gordito",
                                nombre, apellido, edad, peso);
        }
    }
}
