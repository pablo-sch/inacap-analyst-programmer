using System;

namespace _02_Operaciones
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingresa tu edad: ");
            int edad = Int32.Parse(Console.ReadLine());

            if (edad < 18)
            {
                Console.WriteLine("Menor de edad. No puedes obtener un permiso de circulación");
            }
            else
            {
                Console.WriteLine("Mayoría de edad certificada");
            }

            int opcion;
            do
            {
                Console.WriteLine("Menú!");
                Console.WriteLine("1. Recibir un saludo.");
                Console.WriteLine("2. Recibir un despido.");
                Console.WriteLine("3. Recibir una bofetada.");
                Console.WriteLine("0. Salir.");
                opcion = Int32.Parse(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        Console.WriteLine("HOLA. Ratón con cola!");
                        break;
                    case 2:
                        Console.WriteLine("CHAO pescao");
                        break;
                    case 3:
                        Console.WriteLine("Ouch!");
                        break;
                }
            } while (opcion != 0);
            
        }
    }
}
